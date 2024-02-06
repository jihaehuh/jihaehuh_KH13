------------------------------------------------------------------
--구매 및 삭제
drop sequence buy_seq;
create sequence buy_seq;

drop table buy;
create table buy(
buy_serial number primary key,
member_id varchar2(20) not null,
item_no number not null,
item_name varchar2(90) not null,
buy_time date default sysdate not null,
buy_qty number default 1 not null,
buy_total number not null,
check(buy_qty > 0),
check(buy_total >= 0)
);

select * from buy;
