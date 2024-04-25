package com.kh.spring19.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dao.BookDao;
import com.kh.spring19.dto.BookDto;
import com.kh.spring19.vo.BookDataVO;

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookRestContoller {

	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/")
	public List<BookDto> list() {
		return bookDao.selectList();
	}
	
	@GetMapping("/page/{page}/size/{size}")
	public BookDataVO list(@PathVariable int page, @PathVariable int size){
		List<BookDto> list = bookDao.selectListByPaging(page, size);
		int count = bookDao.count(); //Dao에서 불러오기
		
//		boolean last=가져올 마지막 행번호 >= count;
		int endRow = page * size; //계산
		boolean last= endRow >= count; //불러오기
		
		return BookDataVO.builder()
				.list(list) //화면에 표시할 개수
				.count(count) //총 데이터 개수
				.last(last) //마지막 여부
				.build();
	}
	
}
