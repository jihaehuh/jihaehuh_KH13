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
commit;
rollback;
