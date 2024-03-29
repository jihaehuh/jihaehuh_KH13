package com.kh.spring14.dto;

import lombok.Data;

@Data
public class MenuDto {
	private int menuNo;
	private String menuNameKor, menuNameEng;
	private String menuType;
	private int menuPrice;
}
