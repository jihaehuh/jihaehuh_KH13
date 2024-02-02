package com.kh.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring10.dto.ItemDto;

@Service
public class ItemMapper implements RowMapper<ItemDto>{

	@Override
	public ItemDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ItemDto itemDto = new ItemDto();
		itemDto.setItemNo(rs.getInt("item_no"));
		itemDto.setItemName(rs.getString("item_name"));
		itemDto.setItemCharge(rs.getInt("item_charge"));
		itemDto.setItemPrice(rs.getInt("item_price"));
		return itemDto;
	}

}
