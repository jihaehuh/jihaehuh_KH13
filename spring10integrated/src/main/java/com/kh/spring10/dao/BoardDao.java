package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.mapper.BoardMapper;

@Repository
public class BoardDao {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private BoardMapper mapper;
	
	public void insert(BoardDto dto) {
	    String sql = "INSERT INTO board("
	            + "board_title, board_content,"
	            + "board_writer, board_readcount"
	            + ")"
	            + "VALUES (?, ?, ?, ?)";
	    Object[] data = {
	            dto.getBoardTitle(), dto.getBoardContent(),
	            dto.getBoardWriter(), dto.getBoardReadcount()
	    };
	    jdbcTemplate.update(sql, data);
	}
		//목록(조회, Read)
		public List<BoardDto> selectList() {
			String sql = "select * from board order by board_no asc";
			//Object[] data = {};
			return jdbcTemplate.query(sql, mapper);
		}
		//검색(조회, Read)
		public List<BoardDto> selectList(String column, String keyword) {
			String sql = "select * from board where instr("+column+", ?) > 0 "
											+ "order by "+column+" asc, board_no asc";
			Object[] data = {keyword};
			return jdbcTemplate.query(sql, mapper, data);
		}

		//상세(조회, Read)
		public BoardDto selectOne(int boardNo) {
		    String sql = "select * from board where board_no = ?";
		    Object[] data = {boardNo};
		    List<BoardDto> list = jdbcTemplate.query(sql, mapper, data);
		    return list.isEmpty() ? null : list.get(0);
		}
}
