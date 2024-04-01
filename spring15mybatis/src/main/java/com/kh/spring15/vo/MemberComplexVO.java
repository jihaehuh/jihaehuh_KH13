package com.kh.spring15.vo;

import java.util.List;

import lombok.Data;

@Data
public class MemberComplexVO {

	private String memberId;
	private String memberNick;
	private String memberContact;
	private Integer minPoint, maxPoint;
	private String memberJoin;
	private String minLoginDate, maxLoginDate;
	private List<String>  memberLevelList;
	private List<String> orderList;
	private Integer beginRow, endRow;
	
}
