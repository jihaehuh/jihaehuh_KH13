--계정에 존재하는 테이블 확인
select * from tab;

--데이터 조회
select * from regions;
select * from countries;
select * from locations;
select * from departments;
select * from employees;
select * from jobs;
select * from job_history;

--대륙(regions)별 국가(contries) 개수
--select * from regions + countries; --inner join  ( 연결된 항목만 )
--select * from regions ← countries; --left outer join ( 왼쪽은 무조건 조회 )

--별칭을 붙일 수 있음. (신중하게 별칭 붙이기)
--나라(contries)를 찍을때 쓰면서 대륙(regions)을 쓰고 싶을때  ex) 네덜란드(유럽) ,프랑스(유럽) , 영국(유럽) 이렇게 조회할 때 사용
select * from regions;
select * from countries;
select * from regions r  inner join countries c  on r.region_id = c.region_id;

--ex)유럽-5개국가 , 아시아 -2개 국가, 아프리카-0개국가  이렇게 조회할 때 사용 
select * from regions;
select * from countries;
select * from regions r  left outer join countries c  on r.region_id = c.region_id;


--[1] 부서장이 있는 부서와 부서장의 정보
select * from employees;
select * from departments;
select * from employees e  inner join departments d  on e.employee_id= d.manager_id ;
--employee의 아이디와 departments의 매니저아이디가 일치한다면 조회하세요

--[2] 직원 정보와 사수의 이름 정보를 같이 조회
select e1.*,e2.first_name, e2.last_name
from employees e1  left outer join employees e2 on e1.manager_id = e2.employee_id ;

--[3] 직종별 이름 , 평균 급여 , 인원수를 조회 
--jobs + employees ? jobs <- employees
--인원수는 없어도 출력되어야 하므로 outer join 을 사용
--겹치는 것 처리하려면 group by 사용
select j.job_title,avg(e.salary),count(e.employee_id)  -- 평균, 인원수 
from jobs j left outer join employees e 
on j.job_id = e.job_id 
group by j.job_title ;


-- [4] 부서별로 가장 오래 근무한 작업자의 이름을 조회


-- [5] 나라별 지점 개수를 조회
-- [6] 대륙별 지점 개수를 조회
-- [7] 각 지역에서 가장 많은 급여를 받는 작업자의 급여액을 조회
-- [8] 지역별로 부서장이 없는 부서의 수를 조회
-- [9] 평균 급여액이 가장 높은 직종 Top 3 조회


