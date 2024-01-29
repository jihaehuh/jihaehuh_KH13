package com.kh.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.StudentDto;



@Service
public class BoardMapper implements RowMapper<BoardDto> {

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto dto = new BoardDto();
		dto.setBoardNo(rs.getInt("board_no"));
		dto.setBoardTitle(rs.getString("board_title"));
		dto.setBoardContent(rs.getString("board_content"));
		dto.setBoardWriter(rs.getString("member_id"));
		dto.setBoardWtime(rs.getDate("board_wtime"));
		dto.setBoardEtime(rs.getDate("board_Etime"));
		dto.setBoardReadcount(rs.getInt("board_Readcount"));
		
		return dto;
		
	}

}
