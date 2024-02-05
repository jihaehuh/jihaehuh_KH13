
select board_seq.nextval from dual;
drop sequence board_seq;
---시퀀스번호 시작 지정해주기 
create sequence board_seq start with 21;




-----------------------첨부 파일 테이블
drop sequence attach_seq;
create sequence attach_seq;
create table attach(
attach_no number primary key,
attach_name varchar2(255) not null,
attach_type varchar2(90) not null,
attach_size number not null
);

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

select * from attach;
-- 상품+첨부파일 연결테이블
create table item_attach(
item_no references item(item_no) on delete cascade,
attach_no references attach(attach_no) on delete cascade
);
