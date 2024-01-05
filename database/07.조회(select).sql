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
