/*
<게시판 테이블 생성 문제>
다음 조건을 만족하는 테이블을 생성하고 샘플 데이터를 등록하시오

게시판 테이블(table board)
- 게시글 번호(board_no)
    - 필수 항목이며 중복이 불가한 숫자
- 게시글 제목(board_title) 
    - 한글 100자 이내로 설정 가능하며 필수 항목
- 게시글 내용(board_content)
    - 가능한 최대의 문자열 크기로 설정하며 필수 항목
- 게시글 작성자(board_writer)
    - 게시글 작성한 사람의 아이디(영문숫자8~20자)
    - 작성자가 탈퇴한 경우 null로 설정됨
- 게시글 조회수(board_readcount)
    - 0 이상의 숫자로 설정되는 항목
 */
drop table board;
create table board(
board_no number primary key,
board_title varchar2(300) not null,
board_content varchar2(4000) not null,
board_writer varchar2(20) 
	check(regexp_like(board_writer, '^[a-zA-Z0-9]{8,20}$')),
board_readcount number default 0 not null 
	check(board_readcount >= 0)
);

insert into board(
	board_no, board_title, board_content, board_writer, board_readcount
)
values(1, '스프링웹개발자 과정 모집', '내용 없음', 'khacademy', 0);

insert into board(board_no, board_title, board_content, board_writer)
values(2, '스프링웹개발자 과정 모집2', '내용 없음', 'khacademy');

select * from board;
