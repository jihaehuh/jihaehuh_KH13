package com.kh.spring19.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dao.MenuDao;
import com.kh.spring19.dto.MenuDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name="메뉴 정보 관리 도구")

@CrossOrigin
@RestController
@RequestMapping("/menuApp")
public class MenuRestController {
	@Autowired
	private MenuDao menuDao;
	
	//등록
	@Operation(
			description = "메뉴 정보 등록",
			responses =  {
					@ApiResponse(responseCode="200",description = "메뉴 등록 완료",
							content =@Content(
									mediaType="application/json",
									schema=@Schema(implementation = MenuDto.class)
									)
							),
					@ApiResponse(responseCode = "500",description="서버 오류",
							content = @Content(
									mediaType = "text/plain",
									schema = @Schema(implementation = String.class),
									examples = @ExampleObject("server error")
									)
							),
					}
			)
@PostMapping("/")
	public ResponseEntity<MenuDto> insert(
			@Parameter(description = "생성할 메뉴 정보에 대한 입력값", required = true, schema = @Schema(implementation = MenuDto.class))
			@RequestBody MenuDto menuDto) {
			int sequence =menuDao.sequence();
			menuDto.setMenuNo(sequence);
			menuDao.insert(menuDto);
			return ResponseEntity.ok().body(menuDao.selectOne(sequence));
	}
	//목록
	@Operation(
			description = "메뉴 정보 조회",
			responses =  {
					@ApiResponse(responseCode="200",description = "조회 완료",
							content =@Content(
									mediaType="application/json",
									schema=@Schema(implementation = MenuDto.class)
									)
							),
					@ApiResponse(responseCode = "500",description="서버 오류",
							content = @Content(
									mediaType = "text/plain",
									schema = @Schema(implementation = String.class),
									examples = @ExampleObject("server error")
									)
							),
					}
			)
	@GetMapping("/")
	public ResponseEntity<List<MenuDto>> list() {
		List<MenuDto> list = menuDao.selectList();
		return ResponseEntity.ok().body(list);
	}
	
	//상세
	@Operation(
			description = "메뉴 상세 정보 조회",
			responses = {
					@ApiResponse(responseCode = "200", description = "조회 완료",
							content = @Content(
									mediaType = "application/json",
									schema = @Schema(implementation = MenuDto.class)
									)
							),
					@ApiResponse(responseCode = "404", description = "학생 정보 없음",
					content = @Content(
							mediaType = "text/plain",
							schema = @Schema(implementation = String.class),
							examples = @ExampleObject("not found")
							)
					),
					@ApiResponse(responseCode = "500", description = "서버 오류",
					content = @Content(
							mediaType = "text/plain",
							schema = @Schema(implementation = String.class),
							examples = @ExampleObject("server error")
							)
					),					
			}
		)
	@GetMapping("/{menuNo}")
	public ResponseEntity<MenuDto> find (@PathVariable int menuNo){
		MenuDto menuDto = menuDao.selectOne(menuNo);
		if(menuDto == null) return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(menuDto);
	}
	
	//수정
	@Operation(
			description = "메뉴 상세 정보 변경",
			responses = {
					@ApiResponse(responseCode = "200", description = "변경 완료",
							content = @Content(
									mediaType = "application/json",
									schema = @Schema(implementation = MenuDto.class)
									)
							),
					@ApiResponse(responseCode = "404", description = "메뉴 정보 없음",
					content = @Content(
							mediaType = "text/plain",
							schema = @Schema(implementation = String.class),
							examples = @ExampleObject("not found")
							)
					),
					@ApiResponse(responseCode = "500", description = "서버 오류",
					content = @Content(
							mediaType = "text/plain",
							schema = @Schema(implementation = String.class),
							examples = @ExampleObject("server error")
							)
					),					
			}
		)
	
	@PatchMapping("/")
	public ResponseEntity<MenuDto> edit(@RequestBody MenuDto menuDto) {
		boolean result = menuDao.edit(menuDto);
		if(result == false) return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(menuDao.selectOne(menuDto.getMenuNo()));
	}
	
	//삭제
	@Operation(
			description = "메뉴 정보 삭제",
			responses = {
					@ApiResponse(responseCode = "200", description = "삭제 완료",
							content = @Content(
									mediaType = "text/plain",
									schema = @Schema(implementation = String.class),//왜 menuDto.class 를 안쓰는가? -줄 정보가 없어서 굳이 안써도된다
									examples = @ExampleObject("ok")
									)
							),
					@ApiResponse(responseCode = "404", description = "메뉴 정보 없음",
					content = @Content(
							mediaType = "text/plain",
							schema = @Schema(implementation = String.class),
							examples = @ExampleObject("not found")
							)
					),
					@ApiResponse(responseCode = "500", description = "서버 오류",
					content = @Content(
							mediaType = "text/plain",
							schema = @Schema(implementation = String.class),
							examples = @ExampleObject("server error")
							)
					),					
			}
		)
	
	@DeleteMapping("/{menuNo}")
	public ResponseEntity<?> delete (@PathVariable int menuNo){  //? 를 쓰는이유는 뭐라도 써줘야해서 (사실 String, object 다써도 되는데 그러면 body() 로 받아줘야해서 안쓰는게 좋다
		boolean result = menuDao.delete(menuNo);
		if(result == false) return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}
	
}
