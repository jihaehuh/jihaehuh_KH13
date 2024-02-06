package com.kh.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kh.spring10.dto.BuyDto;

public class BuyMapper implements RowMapper<BuyDto> {

	
	@Override
	public BuyDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BuyDto buyDto = new BuyDto();
		buyDto.setBuySerial(rs.getInt("buy_serial"));
		buyDto.setMemberId(rs.getString("memebr_id"));
		buyDto.setItemNo(rs.getInt("item_no"));
		buyDto.setItemName(rs.getString("item_name"));
		buyDto.setBuyTime(rs.getDate("buy_time"));
		buyDto.setBuyQty(rs.getInt("buy_qty"));
		buyDto.setBuyTotal(rs.getInt("buy_total"));
		return buyDto;
	}
	
}
