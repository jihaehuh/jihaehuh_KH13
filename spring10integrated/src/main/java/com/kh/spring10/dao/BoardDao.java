package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.mapper.BoardListMapper;
import com.kh.spring10.mapper.BoardMapper;

@Repository
public class BoardDao {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private BoardMapper boardMpper;
	@Autowired
	private BoardListMapper boardListMapper;
	
	public void insert(BoardDto dto) {
	    String sql = "insert ino board("
	            + "board_no, board_title, board_content,"
	            + "board_writer, board_wtime,"
	            + "board_etime, board_readcount"
	            + ")"
	            + "VALUES (?,?, ?, ?, ?, ? )";
	    Object[] data = {
	            dto.getBoardTitle(), dto.getBoardContent(),
	            dto.getBoardWriter(), dto.getBoardWtime(),
	            dto.getBoardEtime(), dto.getBoardReadcount()
	    };
	    jdbcTemplate.update(sql, data);
	}
	
	//목록
		public List<BoardDto> selectList() {
//			String sql = "select * from board order by board_no desc";
//			return jdbcTemplate.query(sql, boardMapper);

			String sql = "select "
								+ "board_no, board_title, board_writer, "
								+ "board_wtime, board_etime, board_readcount "
							+ "from board order by board_no desc";
			return jdbcTemplate.query(sql, boardListMapper);
		}
		//검색
		public List<BoardDto> selectList(String column, String keyword) {
//			String sql = "select * from board "
//							+ "where instr("+column+", ?) > 0 "
//							+ "order by board_no desc";
//			Object[] data = {keyword};
//			return jdbcTemplate.query(sql, boardMapper, data);

			String sql = "select "
								+ "board_no, board_title, board_writer, "
								+ "board_wtime, board_etime, board_readcount "
							+ "from board "
							+ "where instr("+column+", ?) > 0 "
							+ "order by board_no desc";
			Object[] data = {keyword};
			return jdbcTemplate.query(sql, boardListMapper, data);
		}

		//상세(조회, Read)
		public BoardDto selectOne(int boardNo) {
		    String sql = "select * from board where board_no = ?";
		    Object[] data = {boardNo};
		    List<BoardDto> list = jdbcTemplate.query(sql,  boardMpper, data);
		    return list.isEmpty() ? null : list.get(0);
		}
		//삭제, Delete)
		public boolean delete(String boardWriter) {
			String sql = "delete board where board_writer = ?";
			Object[] data = {boardWriter};
			return jdbcTemplate.update(sql, data) > 0;
		}
		//회원이 자신의 정보를 변경(수정, Update)
		public boolean updateBoard(BoardDto boardDto) {
			String sql = "update board set "
								+ "board_title=?, board_content=?"
					            + ")"
							+ "where board_no = ?";
			Object[] data = {
				boardDto.getBoardTitle(), boardDto.getBoardContent(),	
			};
			return jdbcTemplate.update(sql, data) > 0;
		}
		
		
		
}
