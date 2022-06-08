-- 예제 복습


--Q06
-- 4. tblInsa. 부장 몇명? 과장 몇명? 대리 몇명? 사원 몇명?
select
    count(case
            when jikwi = '부장' then 1
          end) as "부장",
    count(case
            when jikwi = '과장' then 1
          end) as "과장",
    count(case
            when jikwi = '대리' then 1
          end) as "대리",
    count(case
            when jikwi = '사원' then 1
          end) as "사원"
from tblInsa;

select
    count(decode(jikwi, '부장', 1)) as 부장,
    count(decode(jikwi, '과장', 1)) as 과장,
    count(decode(jikwi, '대리', 1)) as 대리,
    count(decode(jikwi, '사원', 1)) as 사원
from tblInsa;



-- 6. tblInsa. 기획부, 영업부, 총무부, 개발부의 각각 평균 급여?
select * from tblInsa;
select
    buseo as "부서",
    round(avg(basicpay)) as "평균급여"
from tblInsa
    group by buseo;

select
    round(sum(basicpay)/count(decode(buseo, '기획부', 1))) as "기획부 평균 급여",
    round(sum(basicpay)/count(decode(buseo, '영업부', 1))) as "영업부 평균 급여",
    round(sum(basicpay)/count(decode(buseo, '총무부', 1))) as "총무부 평균 급여",
    round(sum(basicpay)/count(decode(buseo, '개발부', 1))) as "개발부 평균 급여"
from tblInsa;



-- 7. tblInsa. 남자 직원 가장 나이가 많은 사람이 몇년도 태생? 여자 직원 가장 나이가 어린 사람이 몇년도 태생?
select * from tblInsa;
select min(substr(ssn, 1, 2)) from tblInsa where substr(ssn, 8, 1) = '1';
select max(substr(ssn, 1, 2)) from tblInsa where substr(ssn, 8, 1) = '2';

select 
    name,
    substr(ssn, 1, 2) 
from tblInsa 
    where substr(ssn, 1, 2) = (select min(substr(ssn, 1, 2)) from tblInsa where substr(ssn, 8, 1) = '1');

select 
    name,
    substr(ssn, 1, 2) 
from tblInsa 
    where substr(ssn,1,2) = (select max(substr(ssn, 1, 2)) from tblInsa where substr(ssn, 8, 1) = '2');
    
select
    '19' || min(decode(substr(ssn, 8, 1), '1', substr(ssn, 1, 2))),
    '19' || max(decode(substr(ssn, 8, 1), '2', substr(ssn, 1, 2)))
from tblInsa;

-- 확실히 decode 사용하면 코드가 짧아지네



--Q07
-- 22)employees, jobs. 직무(job_id)별 최고급여(max_salary) 받는 사원 정보를 가져오시오.
select * from employees;

select 
    * 
from employees e
    inner join jobs j
        on e.job_id = j.job_id
            group by e.job_id;
-- ORA-00979: not a GROUP BY expression
-- join에서는 group by 불가능???? > group by 인데 * 사용해서,,,

select 
    e.job_id,
    --name where salary = max(salary), > 정보를 어떻게 가져와야할지 모르겠음
    max(salary)
from employees e
    inner join jobs j
        on e.job_id = j.job_id
            group by e.job_id;
                --having salary = max(salary);
                
select 
    * 
from employees e 
    inner join jobs j 
        on e.job_id = j.job_id
            where e.salary = j.max_salary;
            
SELECT 
    * 
FROM HR.employees e
    INNER JOIN (SELECT 
                    j.job_id as job1,
                    count(*),
                    max(j.max_salary) as maxvalue 
                FROM HR.employees e
                    inner join HR.jobs j
                        on e.job_id = j.job_id
                            group by j.job_id) k
        on e.job_id = k.job1
            where e.salary = k.maxvalue;                



-- 31)employees. 사원번호와 사원이름, 관리자의 사원번호와 사원이름을 출력하되 각각의 컬럼명을 '사원번호', '사원이름', '관리자번호', '관리자이름'으로 하여 가져오시오.
SELECT 
    e.first_name||' '||e.last_name as "사원이름", 
    e.employee_id as "사원번호",
    f.first_name||' '||f.last_name as "관리자이름", 
    f.employee_id as "관리자번호"
FROM HR.employees e
    inner join HR.employees f
        on e.manager_id = f.employee_id;
-- 한번더 조인해서 구분하는구나        

    
    
-- 36)employees. 자신의 매니저보다 먼저 고용된 사원들의 first_name, last_name, 고용일을 가져오시오.
SELECT 
    e.first_name, e.last_name, e.hire_date 
FROM HR.employees e
    inner join HR.employees f
        on e.manager_id = f.employee_id
            WHERE e.hire_date < f.hire_date;






