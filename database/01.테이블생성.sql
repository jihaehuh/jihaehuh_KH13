-- soccer 테이블 생성 구문
create table soccer(
rank number(2),
name varchar2(21),
win number(2),
draw number(2),
lose number(2)
);
drop table soccer;

-- account 테이블 생성 구문
create table account(
owner varchar2(21),
base_rate number(5,2),
plus_rate number(5,2),
monthly number,
period number(3)
);
drop table account;

-- player 테이블 생성 구문
create table player(
name varchar2(21),
event varchar2(60),
type char(6),
gold number(3),
silver number(3),
bronze number(3)
);

drop table player;

-- 테이블을 만들고 데이터를 추가하도록 코드 작성

-- 테이블 생성
create table student(
name varchar2(21),
score number(3)
);

-- 데이터 추가
-- insert into 테이블이름(형식들) values(값들);
-- (주의) 오라클에서 문자열은 외따옴표를 쓴다
insert into student(name, score) values('홍길동', 50);

-- 데이터 조회
-- select * from 테이블이름;
select * from student;



-- 통신사 요금제 테이블 생성 및 데이터 추가 코드
create table plan(
telecom char(2),
name varchar2(60),
month_price number,
data_gb number(4),
call_min number(4),
sms_count number(4)
);
drop table plan;

insert into plan(telecom, name, month_price, data_gb, call_min, sms_count)
values('SK', '5G언택트 52', 52000, 200, 1000, 2000);
insert into plan(telecom, name, month_price, data_gb, call_min, sms_count)
values('KT', '5G세이브', 45000, 100, 900, 1500);
insert into plan(telecom, name, month_price, data_gb, call_min, sms_count)
values('LG', '5G시그니처', 130000, 500, 2000, 2500);

select * from plan;
