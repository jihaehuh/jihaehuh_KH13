-----------Menu 등록
drop table menu2;
drop sequence menu_seq;
create sequence menu_seq;
create table menu2(
menu_no number primary key,--메뉴번호, 시퀀스로 자동 부여
menu_name_kor varchar2(60) not null,--메뉴 한글 이름
menu_name_eng varchar2(60) not null,--메뉴 영문 이름
menu_type varchar2(30) not null,--메뉴 종류
menu_price number default 0 not null check(menu_price >= 0)--메뉴 판매가(원)
);
select * from menu2;
commit;
rollback;
