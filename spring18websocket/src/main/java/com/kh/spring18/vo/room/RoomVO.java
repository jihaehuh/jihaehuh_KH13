package com.kh.spring18.vo.room;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//채팅방 1개
//@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class RoomVO {
	private Set<UserVO> users = new CopyOnWriteArraySet<>();

	//방에 대한 여러 가지 기능들을 메소드로 구현
		//- 입장, 퇴장, 검색, 메세지전송, ...
}
