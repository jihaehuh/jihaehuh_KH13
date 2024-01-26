-- 단일행 함수는 조회구문에 붙여서 사용할 수 있다.
select book_title, upper(book_title), lower(book_title), length(book_title) from book;

-- 집계함수는 데이터 개수와 관계없이 결과가 하나로 나온다.
select sum(book_price) from book;
select avg(book_price) from book;
select max(book_price) from book;
select min(book_price) from book;

-- 집계함수는 조회구문에 붙여서 사용할 수 없다.
select book_title, avg(book_price) from book;

-- 집계함수는 전체가 아닌 그룹별로 적용할 수 있다.
-- (ex) 전체 평균 가격 --> 장르별 평균 가격
select book_genre from book;
select book_genre from book group by book_genre;
select book_genre, avg(book_price) from book group by book_genre;

----------------------------------------------------------------------------------------
--(Q) product table 에서 상품종류별 개수와 최고, 최저 가격을 출력
select * from product;
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

commit;
--(Q) product table 에서 상품종류별 개수와 최고, 최저 가격을 출력
----------
select count(no)개수, max(price)최고가, min(price)최저가 from product;

select type from product;
select distinct type from product; --중복제거(그룹아님)
select type from product group by type;
select type, count(no) 개수, max(price) 최고가, min(price) 최저가 
from product group by type;

-----------------------------------------------------
--포켓몬스터 속성별 개체수를 구하여 홈페이지에 출력(개수가 많은 순)
select * from pocketmon;

select pocketmon_type from pocketmon;
select pocketmon_type 항목,count(*)개수 
from pocketmon group by pocketmon_type
order by 개수 desc;
--자료형은 List<statVO>

------------------------------------------------------
--부서별 사원 수 출력
select * from emp;
select emp_dept from emp;

select emp_dept 항목,count(*)개수
from emp group by emp_dept
order by 개수 desc;
-----------------------------------------------------
--유형별 메뉴 개수 출력
select * from menu;
select menu_type from menu;

select menu_type 항목,count(*)개수
from menu group by menu_type
order by 개수 desc;
-------------------------------------------------------
--등급별 인원수 출력
select * from member;
select member_level from member;
select member_level 항목, count(*)개수
from member group by member_level
order by 개수 desc;
