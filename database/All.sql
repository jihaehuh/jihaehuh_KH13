--account 테이블 생성 구문
create table account(
owner varchar2(21),
base_rate number(5,2),
plus_rate number(5,2),
monthly number,
period number(3)
);

drop table account;

--player 테이블 생성 구문
create table player(
name varchar2(21),
event varchar2(60),
type char(6),
gold number(3),
silver number(3),
bronze number(3)
);

drop table player;

--soccer 테이블 생성 구문
create table soccer(
rank number(2),
name varchar2(21),
win number(2),
draw number(2),
lose number(2)
);
drop table soccer;

/*
	테이블 제약조건(table constraint)
	- 테이블에 추가되는 데이터에 대한 조건을 설정할 수 있다
	- 종류는 null, 중복, 값의범위or조건 등이 있다
	- null을 허용하지 않으려면 컬럼 옆에 not null 키워드를 추가한다
	- 중복을 허용하지 않으려면 컬럼 옆에 unique 키워드를 추가한다
	- 허용되는 값을 지정하려면 컬럼 옆에 check 키워드를 추가한다
 */

create table menu(
menu_name varchar2(60) not null unique 
	check(regexp_like(menu_name, '^[가-힣]+$')),
menu_type varchar2(9) not null check(menu_type in ('디저트','음료')),
menu_price number not null check(menu_price >= 0),
--menu_event char(1) not null check(menu_event = 'Y' or menu_event = 'N')
menu_event char(1) not null check(menu_event in ('Y', 'N'))
);
drop table menu;

insert into menu(menu_name, menu_type, menu_price, menu_event)
values('아메리카노', '디저트', 3000, 'N');
select * from menu;


-- 학원 강좌 정보 테이블
create table lecture(
lecture_name varchar2(60) not null unique,
lecture_time number not null 
	check(lecture_time >= 0 and mod(lecture_time, 30) = 0),
lecture_price number not null check(lecture_price >= 0),
lecture_type varchar2(12) not null 
	check(lecture_type in ('오프라인', '온라인', '혼합'))
);
drop table lecture;
insert into lecture(lecture_name, lecture_time, lecture_price, lecture_type)
values('자바 마스터과정', 90, 1000000, '온라인');
insert into lecture(lecture_name, lecture_time, lecture_price, lecture_type)
values('파이썬 기초', 60, 600000, '온라인');
insert into lecture(lecture_name, lecture_time, lecture_price, lecture_type)
values('웹 개발자 단기완성', 120, 1200000, '오프라인');
select * from lecture;


-- 휴대폰 판매 정보 테이블
create table phone(
phone_name varchar2(60) not null,
phone_telecom char(2) not null check(phone_telecom in ('SK', 'KT', 'LG')),
phone_price number not null check(phone_price >= 0),
phone_contract number(2) check(phone_contract in (0, 24, 36)),
-- 이름+통신사를 합쳐서 같은 경우는 없다
unique(phone_name, phone_telecom)
);
drop table phone;

insert into phone(phone_name, phone_telecom, phone_price, phone_contract)
values('갤럭시Fold4', 'SK', 1800000, null);
insert into phone(phone_name, phone_telecom, phone_price)
values('갤럭시Fold4', 'SK', 1800000);
insert into phone(phone_name, phone_telecom, phone_price, phone_contract)
values('갤럭시Fold4', 'KT', 1750000, 24);
insert into phone(phone_name, phone_telecom, phone_price, phone_contract)
values('아이폰15', 'LG', 2000000, 36);
insert into phone(phone_name, phone_telecom, phone_price, phone_contract)
values('아이폰15', 'SK', 1990000, null);


/*
	기본키(Primary key)
	- 테이블에 단 한개만 설정할 수 있는 유일한 불변값
	- 대표항목 역할을 하며 not null + unique 효과를 가짐
	- 회원으로 치면 "아이디"와 "닉네임" 중에서 "아이디"가 기본키 역할을 수행할 수 있다
	- 모든 항목 중에 가장 검색 속도가 빠름
	- 테이블 당 1개를 반드시 만들 것을 권장(없으면 번호라도 생성해서 지정)
 */

-- 포켓몬스터 테이블
create table pocketmon(
pocketmon_no number primary key,
pocketmon_name varchar2(30) not null,
pocketmon_type varchar2(9) not null
);
drop table pocketmon;
insert into pocketmon(pocketmon_no, pocketmon_name, pocketmon_type)
values(1, '이상해씨', '풀');
insert into pocketmon(pocketmon_no, pocketmon_name, pocketmon_type)
values(4, '파이리', '불꽃');
insert into pocketmon(pocketmon_no, pocketmon_name, pocketmon_type)
values(7, '꼬부기', '물');
insert into pocketmon(pocketmon_no, pocketmon_name, pocketmon_type)
values(2, '피카츄', '전기');
select * from pocketmon;

delete pocketmon where pocketmon_no=?;
select * from pocketmon where pocketmon_name like '피카' || '%';
select * from pocketmon where instr(pocketmon_name, ?) > 0; --있냐

update POCKETMON 
set POCKETMON_NAME =?, POCKETMON_TYPE =?
where POCKETMON_NO =?

rollback;
commit;

--board 테이블 생성 구문
/*
*다음 조건을 만족하는 테이블을 생성하고 샘플 데이터를 등록하시오

게시판 테이블(table board)
게시글 번호(board_no)
필수 항목이며 중복이 불가한 숫자
게시글 제목(board_title) 
한글 100자 이내로 설정 가능하며 필수 항목
게시글 내용(board_content)
가능한 최대의 문자열 크기로 설정하며 필수 항목
게시글 작성자(board_writer)
게시글 작성한 사람의 아이디(영문숫자8~20자)
작성자가 탈퇴한 경우 null로 설정됨
게시글 조회수(board_readcount)
0 이상의 숫자로 설정되는 항목
*/
-- varchar2 최대 크기 : 4000, char 최대 크기: 2000
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

--강사님 풀이
drop table board;
create table board(
board_no number primary key,
board_title varchar2(300) not null,
board_content varchar2(4000) not null,--null을 허용한다는 조건은 필요없다 (당연한것임)
board_writer varchar2(20)
	check(regexp_like(board_writer, '^[a-zA-Z0-9]{8,20}$')),
--board_readcount number not null --조회수는 0으로 지정할 수 있음
board_readcount number default 0 not null
	check(board_readcount >= 0)
);
insert into board(
	board_no, board_title, board_content, board_writer, board_readcount
)
values(1, '스프링웹개발자 과정 모집', '내용 없음', 'khacademy', 0);     --만약에 default값을 0으로 지정한 후에 조회수를 지워 버리면 0이 아닌 null이 되버려서 주의 해야한다
insert into board(board_no, board_title, board_content, board_writer)
values(2, '스프링웹개발자 과정 모집2', '내용 없음', 'khacademy');

select * from board;


--시퀀스
-- -프라이머리키를 생성할때 사용
/*
 * 시퀀스(Sequence)
 * - 데이터 베이스 객체 중 하나
 * - 번호 생성기
 * -테이블과 세트로 사용하는 경우가 많으며 "기본키"생성하는 목적으로 주로 사용
 * 
 */
drop sequence product_seq;
create sequence product_seq;
-- create sequence product_seq nocache; --캐시제거
drop table product;
create table product(
product_no number primary key,
product_name varchar2(60) not null,
product_price number not null
);
-- 시퀀스를 이용한 데이터 생성(시퀀스이름.nextval)
insert into product(product_no, product_name, product_price)
values(product_seq.nextval , '30인치 모니터', 250000);
insert into product(product_no, product_name, product_price)
values(product_seq.nextval , 'RTX 3080 Ti', 1460000);
select * from product;

--시퀀스의 자세한 정보 확인
SELECT *FROM  USER_SEQUENCES ;

/*
  날씨데이터
 - date또는 timestamp 형태를 사용
 - date는 초까지 , timestamp는 밀리초까지 저장
 - java.sql.Date 클래스와 timestamp 형태가 호환됨
 - java.sql.Timestamp 클래스와 timestamp 형태가 호환됨
 - 연/월/일/시/분/초(+밀리초)가 모두 필요한 경우 사용한다
 
 - 변환 명령은 to_date()
 - 변환 형식 : Y(연도),M(월),D(일), HH/HH24(시간),MI(분),SS(초)
 - 현재 시각을 구하는 키워드가 존재(sysdate/systimestamp)
 - 날짜는 더하기 빼기가 가능(단위:일) ex)한달 전,한달 후, 일주일 뒤 
*/
 */
drop sequence funding_seq;
create sequence funding_seq;
drop table funding;
create table funding(
funding_no number primary key,
funding_title varchar2(90) not null,
funding_dest number not null,
funding_begin date not null,
funding_end date not null
);
-- 날짜는 문자열로도 설정이 가능하다
insert into funding(
	funding_no, funding_title, funding_dest, 
	funding_begin, funding_end
)
values(
	funding_seq.nextval, '자바 서적', 500000, 
	'2024-01-10', '2024-01-31'
);
-- 변환 명령을 사용하면 더 정확하게 형식을 지정할 수 있다
-- to_date(값, 형식)
insert into funding(
	funding_no, funding_title, funding_dest, 
	funding_begin, funding_end
)
values(
	funding_seq.nextval, '데이터베이스 서적', 600000, 
	to_date('2024-01-10', 'YYYY-MM-DD'),
	to_date('2024-01-31', 'YYYY-MM-DD')
);

insert into funding(
	funding_no, funding_title, funding_dest, 
	funding_begin, funding_end
)
values(
	funding_seq.nextval, '웹 개발 서적', 700000, 
	to_date('2024-01-05 10:58:30', 'YYYY-MM-DD HH24:MI:SS'),
	to_date('2024-01-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')
);

insert into funding(
	funding_no, funding_title, funding_dest, 
	funding_begin, funding_end
)
values(
	funding_seq.nextval, '클라우드 서적', 750000, 
	sysdate,
	to_date('2024-01-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')
);

insert into funding(
	funding_no, funding_title, funding_dest, 
	funding_begin, funding_end
)
values(
	funding_seq.nextval, '한달짜리 펀딩', 750000, 
	sysdate, sysdate+30
);

select * from funding;


--테이블 정의서 (table book)

drop sequence funding_seq;
drop table book;


create sequence funding_seq;
create table book(
book_id number primary key,
book_title varchar2(300) not null,
book_author varchar2(90) 
	check(regexp_like(book_author, '^[^!@#$]+$')),
book_publication_date char(10) 
	check(regexp_like(book_publication_date, '^([0-9]{4})-(02-(0[1-9]|1[0-9]|2[0-8])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$')),
book_price number(*, 2) default 0 not null check(book_price >= 0),
book_publisher varchar2(90),
book_page_count number not null check(book_page_count >= 1),
book_genre varchar2(15) not null
);

INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(1, 'Harry Potter 1', 'J.K. Rowling', '2001-06-26', 19.99, 'Scholastic', 320, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(2, 'To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 14.99, 'Grand Central Publishing', 336, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(3, 'The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 12.99, 'Scribner', 180, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(4, '1984', 'George Orwell', '1949-06-08', 10.99, 'Secker & Warburg', 328, 'Dystopian');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(5, 'Pride and Prejudice', 'Jane Austen', '1813-01-28', 9.99, 'Penguin Classics', 432, 'Romance');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(6, 'The Hobbit', 'J.R.R. Tolkien', '1937-09-21', 15.99, 'Houghton Mifflin Harcourt', 320, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(7, 'The Catcher in the Rye', 'J.D. Salinger', '1951-07-16', 11.99, 'Little, Brown and Company', 224, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(8, 'Lord of the Rings', 'J.R.R. Tolkien', '1954-07-29', 29.99, 'Allen & Unwin', 1178, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(9, 'To the Lighthouse', 'Virginia Woolf', '1927-05-05', 13.99, 'Harcourt, Brace and Company', 209, 'Modernist');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(10, 'The Alchemist', 'Paulo Coelho', '1988-06-01', 9.99, 'HarperOne', 208, 'Fiction');

select * from book;

/*
 	조회(Select)
 	- 데이터베이스에 저장된 데이터들을 원하는 기준에 맞게 읽어내는 것
 	-기본 형식 : Select*from 테이블이름;
 */

--전체 도서 조회
select * from book;
select book.* from book;

--도서명만 조회
select book_title from book;


--도서명과 페이지수만 조회
select book_title, book_page_count from book;

-- 항목을 계산하여 추가로 조회할 수 있다
select book_title, length(book_title) from book;
select book_title 도서제목, length(book_title) 제목글자수 from book;
select book_title "도서 제목", length(book_title) "제목 글자수" from book;

-- 도서명과 출간년도를 조회하고 싶은 경우
-- substr(항목, 시작위치, 글자수) : 오라클은 문자열 위치 시작이 1부터

select 
	book_title 도서명, 
	substr(book_publication_date, 1, 4) 출간년도 
from book;

--항목을 원하는대로 불러낼수있다.

--조건
-- - 제시한 조건에 부합하는 데이터만 조회(필터링)
-- - 조회구문 뒤에 'where 조건식'을 추가

-- 10달러 미만이 도서만 조회
select * from book where book_price < 10;

-- 10~15 달러 사이의 도서만 조회
select * from book where book_price >= 10 and book_price <= 15;  --오라클에서는 &&기호가 scanner와 같아서 못쓴다  그래서 and로 쓴다
select * from book where book_price between 10 and 15;  --between은 이상으로 사이일때만 쓸수 있음 (미만 사이 일땐 사용불가)


--5번 도서만 조회
select * from book where book_id = 5; --5번 만 조회
select * from book where book_id != 5;  --5번빼고 다 조회

--조회결과 (Result set)
--where 은 조회결과에서 탈락시킬 정보들을 보여주는 장치


--문자 조건
--[1] 장르가 판타지(Fantasy)인 도서를 조회
select * from book where book_genre = 'Fantasy';
--오라클은 문자도 '='으로 비교할수있음 
--소문자 대문자 비교는 어떻게 하는가?
select * from book where lower(book_genre) = 'fantasy';  --소문자 비교는 lower로 한다

--[2] T로 시작하는 도서 조회
-- like 연산자는 패턴을 지정할 때 사용하며 %는 해당자리는 무관하다는 뜻 
-- %앞 뒤로 뭐가 오든 신경 안씀  예시:  T%M% 의미는 T나오다가 뭐 나오고 M이 나오는 문자 찾기
-- instr함수는 지정한 글자가 어느 위치에 있는지 알아내는 명령
-- 시작 검사만큼은  like 연산자가 매우 빠르며,나머지는 전반적으로 instr함수가 빠르다

select * from book where book_title like 'T%'; --1.T로 시작하냐
select * from book where instr(book_title, 'T') = 1;  --2.T로시작하냐  (자바의 인덱스와 비슷 : 인덱스_ 어디에 있는지 찾는 친구)

--1과 2같은 의미 이지만 뭐가 다른지 살펴보자
-- - like 'T%'는 첫글자만 보고 바로 끝내버림
-- - instr 'T' 는  T가 나올때까지 계속 끝까지 봄 
-- like가 시작하는것은 훨씬 빠름 !! 하지만 시작하는걸 찾는것이 아닐때는 오래 걸린다.
-- instr 은 시작은 느리지만 나머지는 전반적으로 instr이 더 빠르다

--*********결론 : 검색은 두가지로 나누어진다***************



--(Q) 대소문자 상관 없이 h가 들어 있는 도서 정보를 조회하시오
select * from book where lower(book_title) like '%h%';
select * from book where instr(lower(book_title), 'h') > 0;--추천

--(Q)저자명이 J로 시작 하는 도서를 조회하시오
select * from book where book_author like 'J%';--추천
select * from book where instr(book_author, 'J') = 1;

--(Q)출판사명이 Company로 끝나는 도서를 조회하시오
select * from book where book_publisher like '%Company';
select * from book where instr(book_publisher, 'Company') = length(book_publisher)-length('Company')+1;
--(Q)도서명에 숫자가 들어간 도서를 조회하시오

select * from book where regexp_like(book_title, '[0-9]+');
select * from book where regexp_like(book_title, '^(.*?)[0-9]+(.*?)$');







-- 상품(product) 테이블
drop table product;
create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');

update product set price =0;
select * from product;

rollback; --지금까지의 작업 내용을 취소 
commit; --지금까지의 작업내용을 저장

select * from product;
-- 날짜 조건
-- - 특정 항목을 검사하거나 기간으로 검색하는 경우가 많다
select * from product;

-- 2020년에 제조된 상품 조회
select * from product where extract(year from made) = 2020;
select * from product where to_char(made, 'YYYY') = '2020';

select * from product where 
	made >= to_date('2020-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS')
	and
	made <= to_date('2020-12-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS');
select * from product where 
	made between 
	to_date('2020-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS')
	and
	to_date('2020-12-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS');



--(Q) 여름에 제조한 상품 목록 조회(6,7,8월)
select * from product where extract(month from made) in (6, 7, 8);--스위치 구문처럼 내가 원하는 값을 뽑게 도와준다
select * from product where extract(month from made) between 6 and 8;
select * from product where to_char(made, 'MM') in ('06', '07', '08');

--(Q) 2019년 하반기에 제조한 상품목록 조회(7~12월)
   select * from product 
where 
	extract(year from made) = 2019 
	and 
	extract(month from made) between 7 and 12;

select * from product 
where regexp_like(to_char(made, 'YYYY-MM'), '^2019-(0[7-9]|1[0-2])$');

select * from product
where 
	made between 
	to_date('2019-07-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS') 
	and 
	to_date('2019-12-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS');
   
--(Q) 2020년 이후에 현재까지 제조한 상품목록 조회
  select * from product
where 
	made between 
	to_date('2020-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS') 
	and sysdate;

   
--(Q) 최근 5년간 제조한 상품목록 조회
  select * from product
where made between sysdate-5*365 and sysdate;

--(Q)5분
  select * from product where 
	made between
	sysdate-5/24/60 and sysdate; --소수점 나옴 (0아님)
	--1분: 1/60시간 =1/24/60 일 

--정렬(order by)
-- 조건으로 데이터까지 다 골라냈다면 원하는 기준에 맞게 정렬할 수 있다
-- 조건 구문의 마지막에 'order by 항목 asc/desc'를 적는다
--(중요)조건보다 뒤에 작성되어야한다
	
	select * from book;
	select * from product;

	select * from book order by book_id asc;   --오름차순_ascending order,
	select * from book order by book_id desc; --내림차순_descending order
	
--여러개를 정렬하고 싶을때는 order by 형식 asc/desc, order by 형식 asc/desc, ...; 이런식으로 , 를 이용해서 한다
--정렬은 보통 오름차순으로 함


--(Q)상품을 최근 제조한 순으로 조회(최신순)
	select  * from product order by made desc;
	select  * from product order by made desc, no asc; --시간을 뒤로 갈수록 커짐  (중복일때 no asc) 
--(Q)상품을 이름순으로 출력
	select * from product order by name asc;
	select * from product order by name asc, no asc;
--(Q)상품을 종류별로 가격이 비싼 순으로 출력
	select * from product order by type asc, price desc, no asc; --같은 가격,같은 항목일때
--(Q)유통기한이 가장 짧은 상품 부터 출력
	select * from product order by expire-made asc;

	select product.*, expire-made 유통기한 from product 
	order by expire-made asc;

	select product.*, expire-made 유통기한 from product 
	order by 유통기한 asc, no asc;
	

/*day24
 	수정(update)
 	
 	-update 테이블명 set 변경구문 [where 조건]
 	-사실상 조건은 무조건 사용한다고 봐야하며, 특히 pk조건이 많이 쓰임
 */

--모든 상품의 가격을 0원으로 변경
update product set price =0;
select * from product;
/*
rollback; --지금까지의 작업 내용을 취소 
commit; --지금까지의 작업내용을 저장
*/
select*from product;

--모든  상품의 종류를 과자로, 가격을 100원으로 변경
update product set type ='과자',price =100;
select *from product;
rollback;

--1번 상품의 가격을 2000원으로 변경
update product set price =2000 where no =1;
--(주의사항) 없는 번호도 실행은 된다
update product set price =2000 where no =100;
select *from product;


--(Q) 멘토스의 가격을 1000원으로 변경하고 분류를 과자로 변경
update product set price=1000 where no =9;
--(Q) 과자의 가격을 500원할인(오라클에는 누적연산이 없습니다)
update product set price=price-500 where type ='과자';
--(Q) 아이스크림의 가격을 10%인상(오라클에는 누적 연산이 없습니다)
update product set price=price * 1.1  where type ='아이스크림';

select *from product;
commit;
rollback;

/*
 	삭제(delete)
 	- delete [from] 테이블명 [where 조건]
	- 전체를 지울 일은 거의 존재하지 않으므로 조건을 결합하여 사용
 
 */
--전체 삭제 
delete product; --추천
--delete* from product;  ---가능하지만 비추천 (select 와 헷갈림)

select * from product;
rollback;

--1번 상품 삭제 
delete product where no =1;
select * from product;
rollback;

--(Q)과자와 아이스크림 삭제 
delete product where type='과자'or type ='아이스크림' ; 
delete product where type in('과자','아이스크림');
--(Q)2020년 상반기에 생산된 제품 삭제
 delete product where made between to_date('2020-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS')
 and
to_date('2020-06-30 23:59:59', 'YYYY-MM-DD HH24:MI:SS');

select * from product;
rollback;




-----------emp 사원등록 문제
create sequence emp_seq; --테이블과 시퀀스는 여기서 만든다
create table emp(
emp_no number primary key,--사원번호, 시퀀스로 자동 부여
emp_name varchar2(21) not null,--사원의 한글 이름
emp_dept varchar2(30) not null,--사원의 소속 부서
emp_date char(10) not null,--사원의 입사일
emp_sal number default 0 not null check(emp_sal >= 0)--사원의 급여(원)
);

select * from emp;

update EMP 
set emp_name=?, emp_dept=?, emp_date=?, emp_sal=?
where emp_no=? 

delete emp where emp_no=?
select * from emp where emp_name like '?' || '%';
select * from emp where instr(emp_name, ?) > 0; --있냐

commit;
rollback;


-----------Menu 등록
drop table menu2;
drop sequence menu_seq;
create sequence menu_seq;
create table menu(
menu_no number primary key,--메뉴번호, 시퀀스로 자동 부여
menu_name_kor varchar2(60) not null,--메뉴 한글 이름
menu_name_eng varchar2(60) not null,--메뉴 영문 이름
menu_type varchar2(30) not null,--메뉴 종류
menu_price number default 0 not null check(menu_price >= 0)--메뉴 판매가(원)
);
insert into menu(menu_no, menu_kor_name, menu_eng_name, menu_type,menu_price)
values('1','아메리카노', 'coffee', '음료', '4500');
select * from menu;
select * from menu;
update menu
set MENU_NAME_KOR=?, MENU_NAME_ENG=?, MENU_TYPE=?, MENU_PRICE=?
where MENU_NO=?

delete menu where menu_no=?;


commit;
rollback;
drop table menu;
select * from menu;
select * from emp;
select * from pocketmon;
commit;
