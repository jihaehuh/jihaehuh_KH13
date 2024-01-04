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
