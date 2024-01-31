-- 게시판 테이블과 시퀀스
drop sequence board_seq;
create sequence board_seq;

drop table board;
create table board(
board_no number primary key,
board_title varchar2(300) not null,
board_content varchar2(4000) not null,
board_writer references member(member_id) on delete set null,
board_wtime date default sysdate not null,
board_etime date,
board_readcount number default 0 not null,
check(board_readcount >= 0)
);
insert into board values (2,'테스트제목','내용없음','testuser2',sysdate,null,0);
insert into board values (1,'테스트제목','내용없음','testuser1',sysdate,null,0);
insert into board values (1,'테스트제목','내용없음','testuser3',sysdate,null,0);
commit;

-- 1000개의 샘플 데이터 생성
INSERT INTO board (board_no, board_title, board_content, board_wtime, board_readcount)
SELECT
    board_seq.NEXTVAL,
    '샘플 제목 ' || level,
    '샘플 내용 ' || level,
    SYSDATE - ROUND(DBMS_RANDOM.VALUE(1, 365)), -- 작성일은 최대 1년 전부터 현재까지 랜덤
    ROUND(DBMS_RANDOM.VALUE(0, 100)) -- 조회수는 0부터 100까지 랜덤
FROM
    dual
CONNECT BY
    level <= 1000;
   
update board set board_writer = 'testuser3'where instr(board_title,'샘플')>0;
commit;

select count(*) from board;

-------------------------------------
--Top N Query
--데이터베이스에서 데이터를 일정 구간 불러오기 위한 구문

--select * from board where 1페이지에 해당하는 글 order by board_no desc;
--select * from board where 1번째 ~10번째 order by board_no desc;
--select * from board where 10*n-9번째~10*n번째 order by board_no desc;

--select*from board order by board_no desc;
--rownum을 조회하면 조회 결과에 순서가 붙어 화면에 출력된다.
select rownum, board.*from board;
--rownum 에다가 정렬을 붙이면 뒤죽박죽 이상하게 나옴 
--왜??
select rownum, board.*from board order by BOARD_no desc;
select * from board where 1페이지에 해당하는 글 order by board_no desc;


--구문을 분리하여 진행(선 정렬 후 넘버링)
select*from board order by board_readcount desc; --1
--select rownum, 1번 from 1번; 

select rownum, TMP.* from (
select*from board order by board_readcount desc
)TMP where rownum between 1 and 10; 


--이렇게 하면 테이블이 텅빈게 나옴 ...이유? rownum은 1번 부터시작이기때문에 안나옴
select rownum, TMP.* from (
select*from board order by board_readcount desc
)TMP where rownum between 11 and 20;

--이제 완전히 공식 처럼 쓸 수있는 구문이 되었다
--rownum의 별칭을 우리가 정해서 rn 으로 부를 수 있다
select * from(
	select rownum rn, TMP.* from (
	select*from board order by board_readcount desc
	)TMP
) where rn between 11 and 20;

/*공식
 * select * from(
 * select rownum rn, TMP.* from (
 * 	원하는 방식으로 정렬하는 조회구문(테이블 구문)
 * )TMP
 * ) where rn between 시작행번호 and 끝행번호;
 */
 
