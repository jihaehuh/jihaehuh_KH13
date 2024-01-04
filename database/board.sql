--게시판 테이블 생성 문제
create table board(
board_no number primary key,
board_title varchar2(300) not null,
board_content varchar2(4000) not null,
board_writer varchar2 (20) check (regexp_like (board_writer, '^[a-z0-9]{8,20}$')),
board_readcount number check (board_readcount >= 0),
);
--drop table board;

insert into board (board_no, board_title, board_content, board_writer, board_readcount)
values(1,'한글','가나다라마바사아자차카타파하하하하하','jihaehuh00',7);
insert into board (board_no, board_title, board_content, board_writer, board_readcount)
values(2,'세종대왕','한글이 좋아 영어 싫어 영타 힘들어졸려러러러러러러러러러러러ㅓ러러럴',null,11);

SELECT*FROM board;
