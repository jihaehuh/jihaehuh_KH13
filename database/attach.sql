-----------------------첨부 파일 테이블
drop sequence attach_seq;
create sequence attach_seq;
create table attach(
attach_no number primary key,
attach_name varchar2(255) not null,
attach_type varchar2(90) not null,
attach_size number not null
);
drop table attach;
-- 충전상품 테이블
drop sequence item_seq;
create sequence item_seq;
drop table item;
create table item(
item_no number primary key,
item_name varchar2(90) not null,
item_price number not null check(item_price >= 0),
item_charge number not null check(item_charge >= 0)
);

select * from item;
select * from attach;
select * from item_attach;
-- 상품+첨부파일 연결테이블
create table item_attach(
item_no references item(item_no) on delete cascade,
attach_no references attach(attach_no) on delete cascade
);
commit;
drop table ITEM_ATTACH ;

drop sequence member_seq;
------------------------------------------------------
--member 테이블 생성
create table member_attach(
member_id references member(member_id) on delete cascade,
attach_no references attach(attach_no) on delete cascade,
primary key(member_id, attach_no) --한명의 회원이 하나의 파일만 가짐(복합키)
);
drop table member_attach;
select * from member;
select * from member_attach;
