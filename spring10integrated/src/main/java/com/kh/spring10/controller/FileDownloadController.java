package com.kh.spring10.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.HttpHeadersReturnValueHandler;

import com.kh.spring10.dao.AttachDao;
import com.kh.spring10.dto.AttachDto;

@Controller
@RequestMapping("/download")
public class FileDownloadController {
	@Autowired
	private AttachDao attachDao;
	
	//여태까지 모든 컨트롤러에선 사용자가 볼 화면을 반환했다
	//이 매핑은 그렇지 않다는 것을 표시해야한다(@ResponseBody)
	//사용자에게는 화면이 아닌 파일이 담긴 응답 객체를 반환
	//ByteArrayResource 가 파일의 내용을 말함
	//ResponseEntity 가 사용자에게 보내질 응답 객체를 말함
	//파일 테이블의 기본키 (attachNo)를 전달 받아 해당하는 파일을 사용자에게 반환
	@RequestMapping //주소 부여를 안할 수있지만 하나 만 사용가능
	@ResponseBody
	public ResponseEntity<ByteArrayResource> download(
		@RequestParam int attachNo) throws IOException{
		
		//1. attachNo 로 파일 정보 (AttachDto)를 불러온다
		AttachDto attachDto = attachDao.selectOne(attachNo);
		
		//2. attachDto 가 없으면 404처리
		if(attachDto == null) {
			//return ResponseEntity.status(404).build();
			return ResponseEntity.notFound().build();
		}
		
		//3. 실제 파일을 불러온다 (appach common io, apach commons fileupload를 사용)
		File dir = new File(System.getProperty("user.home"), "upload");
		File target = new File(dir, String.valueOf(attachDto.getAttachNo()));

		byte[] data = FileUtils.readFileToByteArray(target);//파일을 읽어라
		ByteArrayResource resource = new ByteArrayResource(data);//포장!
		
		//4. attachDto 에 있는 정보와 실제 파일(3번) 정보를 조합하여 사용자에게 반환 
		//- 추가 적인 정보를 제공해서 파일 다운로드 처리가 일어나도록 구현
		//- 추가적인 정보는 header에 설정
		//return ResponseEntity.status(200).body(내용);
		//return ResponseEntity.ok()
//				.header("Content-Encoding", "UTF-8")
//				.header("Content-Type", attachDto.getAttachType())
//				.header("Content-Type", "application/octet-stream") //무조건 다운로드 가능
//				.header("Content-Length", String.valueOf(attachDto.getAttachSize()))
//				.header("Content-Disposition", "attachment; filename=\""+attachDto.getAttachName()+"\"")
//				.body(resource);
		//내용에 data를 쓸수 없음 - 이유: 우리는 바이트 어레이리소스에서 데이터를 포장해와서 쓰기
		
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_ENCODING, StandardCharsets.UTF_8.name())
//				.header(HttpHeaders.CONTENT_TYPE, attachDto.getAttachType())
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.contentLength(attachDto.getAttachSize())
				.header(HttpHeaders.CONTENT_DISPOSITION,
						ContentDisposition.attachment()//파일을 접근해서 다운받아라
								.filename(attachDto.getAttachName(),StandardCharsets.UTF_8)
								.build().toString()
						) 
				.body(resource);
	}//이렇게하면 한글이름이어도 다운이 가능해진다
	
}
