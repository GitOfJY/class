-- Q07



-- 01)employees. 'Munich' 도시에 위치한 부서에 소속된 직원들 명단?
select
    e.first_name||' '|| e.last_name as "직원명",
    d.department_name as "부서명",
    l.city as "도시명"
from employees e
    inner join departments d
        on d.department_id = e.department_id
            inner join locations l
                 on l.location_id = d.location_id
                    where l.city = 'Munich';



-- 02)tblMan. tblWoman. 서로 짝이 있는 사람 중 남자와 여자의 정보를 모두 가져오시오.
--    [남자]        [남자키]   [남자몸무게]     [여자]    [여자키]   [여자몸무게]
--    홍길동         180       70              장도연     177        65
--    아무개         175       null            이세영     163        null
--    ..
select * from tblMan;
select * from tblWoman;

select 
    m.name as "[남자]",
    m.height as "[남자키]",
    m.weight as "[남자몸무게]",
    w.name as "[여자]",
    w.height as "[여자키]",
    w.weight as "[여자몸무게]"
from tblMan m
    inner join tblWoman w
        on m.couple = w.name;
        


-- 03)tblAddressBook. 가장 많은 사람들이 가지고 있는 직업은 주로 어느 지역 태생(hometown)인가?
select 
    distinct hometown
from tblAddressBook
    where job = (select job from tblAddressBook group by job having count(*) = (select max(count(*)) from tblAddressBook group by job))
        order by hometown asc;
        


-- 04)tblAddressBook. 이메일 도메인들 중 평균 아이디 길이가 가장 긴 이메일 사이트의 도메인은 무엇인가?
select 
    substr(email,instr(email,'@')+1), 
    avg(length(substr(email,1,instr(email,'@')-1)))
from tbladdressbook
    group by substr(email,instr(email,'@')+1)
        having avg(length(substr(email,1,instr(email,'@')-1))) 
            = (select max(avg(length(substr(email,1,instr(email,'@')-1)))) from tbladdressbook group by substr(email,instr(email,'@')+1));
            


-- 05)tblAddressBook. 평균 나이가 가장 많은 출신(hometown)들이 가지고 있는 직업 중 가장 많은 직업은?
select 
    job
from tblAddressBook
    where hometown = (select hometown from tblAddressBook group by hometown having avg(age) = (select max(avg(age)) from tblAddressBook group by hometown))
        group by job
            having count(*) = (select max(count(*)) from tblAddressBook where hometown = (select hometown from tblAddressBook group by hometown having avg(age) = (select max(avg(age)) from tblAddressBook group by hometown)) group by job); 
 


-- 06)tblAddressBook. 남자 평균 나이보다 나이가 많은 서울 태생 + 직업을 가지고 있는 사람들을 가져오시오.
select * from tblAddressBook
    where age > (select avg(age) from tblAddressBook where gender = 'm') 
    and hometown like '서울%'     
    and job <> '백수' and job <> '취업준비생';



-- 07)tblAddressBook. gmail.com을 사용하는 사람들의 성별 > 세대별(10,20,30,40대) 인원수를 가져오시오.
SELECT age FROM tbladdressbook where substr(email,instr(email,'@') + 1) = (SELECT substr(email,instr(email,'@') + 1) FROM tbladdressbook 
    where substr(email,instr(email,'@') + 1) = 'gmail.com'
    group by substr(email,instr(email,'@') + 1)) group by age  ;

SELECT substr(email,instr(email,'@') + 1) FROM tbladdressbook 
    where substr(email,instr(email,'@') + 1) = 'gmail.com'
    group by substr(email,instr(email,'@') + 1);
    
SELECT 
    case
        when gender = 'm' then '남자'
        when gender = 'f' then '여자'
    end as "성별",
    count(case
        when age BETWEEN 10 and 19 then 1
    end) as "10대",
    count(case
        when age BETWEEN 20 and 29 then 1
    end) as "20대",
    count(case
        when age BETWEEN 30 and 39 then 1
    end) as "30대",
    count(case
        when age BETWEEN 40 and 49 then 1
    end) as "40대"
FROM tbladdressbook
    where email like('%gmail.com%')
    group by gender;



-- 08)tblAddressBook. 가장 나이가 많으면서 가장 몸무게가 많이 나가는 사람과 같은 직업을 가지는 사람들을 가져오시오.
SELECT 
    * 
FROM tbladdressbook 
    where job = (SELECT 
                    job 
                 FROM tbladdressbook
                    where weight = (SELECT max(weight) FROM tbladdressbook where age = (SELECT max(age) FROM tbladdressbook)) and age = (SELECT max(age) FROM tbladdressbook));



-- 09)tblAddressBook.  동명이인이 여러명 있습니다. 이 중 가장 인원수가 많은 동명이인(모든 이도윤)의 명단을 가져오시오.
select 
    *
from tblAddressBook
    where name = (select name from tblAddressBook group by name having count(*) = (select max(count(*)) from tblAddressBook group by name));



-- 10)tblAddressBook. 가장 사람이 많은 직업의(332명) 세대별 비율을 구하시오.
--    [10대]       [20대]       [30대]       [40대]
--    8.7%        30.7%        28.3%        32.2%
SELECT 
    job,
    round(count(CASE
        when age between 10 and 19 then 1
    end)/count(*)*100,2)||'%' as "[10대]",
    round(count(CASE
        when age between 20 and 29 then 1
    end)/count(*)*100,2)||'%' as "[20대]",
    round(count(CASE
        when age between 30 and 39 then 1
    end)/count(*)*100,2)||'%' as "[30대]",
    round(count(CASE
        when age between 40 and 49 then 1
    end)/count(*)*100,2)||'%' as "[40대]"
FROM tbladdressbook group by job having count(job) = (SELECT max(count(job)) FROM tbladdressbook group by job);




-- 11)tblStaff, tblProject. 현재 재직중인 모든 직원의 이름, 주소, 월급, 담당프로젝트명을 가져오시오.
select 
    s.name,
    s.address,
    s.salary, 
    p.project 
from tblStaff s 
    inner join tblProject p 
        on s.seq = p.staff_seq;
                             
       
       
-- 12)tblVideo, tblRent, tblMember. '뽀뽀할까요' 라는 비디오를 빌려간 회원의 이름은?
select * from tblVideo;

select
    m.name as "회원명"
from tblVideo v 
    inner join tblRent r
        on v.seq = r.video
            inner join tblMember m
                on m.seq = r.member
                    where v.name = '뽀뽀할까요';
    
    
    
-- 13)tblStaff, tblProejct. 'TV 광고'을 담당한 직원의 월급은 얼마인가?
select 
    s.salary
from tblStaff s 
    inner join tblProject p 
        on s.seq = p.staff_seq
            where p.project = 'TV 광고';
                                     
    
    
-- 14)tblVideo, tblRent, tblMember. '털미네이터' 비디오를 한번이라도 빌려갔던 회원들의 이름은?
select
    m.name
from tblVideo v
            inner join tblRent r
                on v.seq = r.video
                    inner join tblMember m
                        on m.seq = r.member
                            where v.name = '털미네이터';
                
                
                
-- 15)tblStaff, tblProject. 서울시에 사는 직원을 제외한 나머지 직원들의 이름, 월급, 담당프로젝트명을 가져오시오.
select 
    s.name, 
    s.salary, 
    p.project 
from tblStaff s 
    inner join tblProject p 
        on s.seq = p.staff_seq
            where s.address <> '서울시';
                                      
        
        
-- 16)tblCustomer, tblSales. 상품을 2개(단일상품) 이상 구매한 회원의 연락처, 이름, 구매상품명, 수량을 가져오시오.
select 
    c.name as "이름",
    c.tel as "연락처",
    s.item as "구매상품명",
    s.qty as "수량"
from tblCustomer c
    inner join tblSales s
        on c.seq = s.cseq
            where s.qty >= 2;
            
            
                                
-- 17)tblVideo, tblRent, tblGenre. 모든 비디오 제목, 보유수량, 대여가격을 가져오시오.
select 
    distinct v.name as "비디오 제목",
    v.qty as "보유수량",
    g.price as "대여가격"
from tblGenre g
    inner join tblVideo v
        on g.seq = v.genre
            inner join tblRent r
                on v.seq = r.video;
                
                
                
-- 18)tblVideo, tblRent, tblMember, tblGenre. 2007년 2월에 대여된 구매내역을 가져오시오. 회원명, 비디오명, 언제, 대여가격
select
    m.name as "회원명",
    v.name as "비디오명",
    r.rentdate as "언제",
    g.price as "대여가격"
from tblGenre g
    inner join tblVideo v
        on g.seq = v.genre
            inner join tblRent r
                on v.seq = r.video
                    inner join tblMember m
                        on m.seq = r.member
                            where r.rentdate like '07/02%';
        
        
        
-- 19)tblVideo, tblRent, tblMember. 현재 반납을 안한 회원명과 비디오명, 대여날짜를 가져오시오.
select
    m.name as "회원명",
    v.name as "비디오명",
    r.rentdate as "대여날짜"
from tblVideo v 
    inner join tblRent r
        on v.seq = r.video
            inner join tblMember m
                on m.seq = r.member
                    where r.retdate is null;
    
    
    
-- 20)employees, departments. 사원들의 이름, 부서번호, 부서명을 가져오시오.
select 
    e.first_name || ' ' || e.last_name as "이름",
    d.department_id as "부서번호",
    d.department_name as "부서명"
from employees e
    inner join departments d
        on e.department_id = d.department_id;
                      
        
        
-- 21)employees, jobs. 사원들의 정보와 직업명을 가져오시오.
select 
    * 
from employees e
    inner join jobs j
        on e.job_id = j.job_id;



-- *************************************** 못 풀겠음         
-- 22)employees, jobs. 직무(job_id)별 최고급여(max_salary) 받는 사원 정보를 가져오시오.
select * from employees;
select * from jobs;
select max(salary) from employees group by job_id;

select
    *
from employees e
    inner join jobs j
        on e.job_id = j.job_id;

    
    
-- 23)departments, locations. 모든 부서와 각 부서가 위치하고 있는 도시의 이름을 가져오시오.
select 
    d.department_name,
    l.city
from departments d
    inner join locations l
        on d.location_id = l.location_id;


        
-- 24)locations, countries. location_id 가 2900인 도시가 속한 국가 이름을 가져오시오.
select 
    c.country_name
from locations l
    inner join countries c
        on l.country_id = c.country_id
            where l.location_id = 2900;
 
            
            
-- 25)employees. 급여를 12000 이상 받는 사원과 같은 부서에서 근무하는 사원들의 이름, 급여, 부서번호를 가져오시오.
select * from employees;
select distinct department_id from employees where salary >= 12000;
select * from employees where department_id in (select distinct department_id from employees where salary >= 12000);
        
        
        
-- 26)employees, departments. locations.  'Seattle'에서(LOC) 근무하는 사원의 이름, 직위, 부서번호, 부서이름을 가져오시오.
select 
    e.first_name || ' '  || e.last_name,
    e.job_id,
    e.department_id,
    d.department_name
from employees e
    inner join departments d
        on e.department_id = d.department_id
            inner join locations l
                on d.location_id = l.location_id
                    where l.city = 'Seattle';
    
    
    
-- 27)employees, departments. first_name이 'Jonathon'인 직원과 같은 부서에 근무하는 직원들 정보를 가져오시오.  
select
    *
from employees e
    inner join departments d
        on e.department_id = d.department_id
    where d.department_name = (select 
    d.department_name
from employees e
    inner join departments d
        on e.department_id = d.department_id
            where e.first_name = 'Jonathon');
    
    
    
-- 28)employees, departments. 사원이름과 그 사원이 속한 부서의 부서명, 그리고 월급을 출력하는데 월급이 3000이상인 사원을 가져오시오.
select 
    e.first_name || ' ' || e.last_name as "사원이름",
    d.department_name as "부서이름",
    e.salary as "월급"
from employees e
    inner join departments d
        on e.department_id = d.department_id
            where e.salary >= 3000;
 
            
            
-- 29)employees, departments. 부서번호가 10번인 사원들의 부서번호, 부서이름, 사원이름, 월급을 가져오시오.
select 
    e.first_name || ' ' || e.last_name as "사원이름",
    d.department_id as "부서번호",
    d.department_name as "부서이름",
    e.salary as "월급"
from employees e
    inner join departments d
        on e.department_id = d.department_id
            where d.department_id=10;
            
            
            
-- 30)departments, job_history. 퇴사한 사원의 입사일, 퇴사일, 근무했던 부서 이름을 가져오시오.
select
    d.department_name as "부서이름",
    j.start_date as "입사일",
    j.end_date as "퇴사일"
from departments d
    inner join job_history j
        on d.department_id = j.department_id
            where j.end_date is not null;
        


-- *************************************** 못 풀겠음                     
-- 31)employees. 사원번호와 사원이름, 관리자의 사원번호와 사원이름을 출력하되 각각의 컬럼명을 '사원번호', '사원이름', '관리자번호', '관리자이름'으로 하여 가져오시오.
select * from employees;
select
    employee_id as "사원번호",
    first_name||' '||last_name as "사원이름",
    manager_id as "관리자번호",
    (select first_name||' '||last_name from employees where employee_id = (select manager_id from employees)) as "관리자이름"
from employees;
    

        
-- 32)employees, jobs. 직책(Job Title)이 Sales Manager인 사원들의 입사년도와 입사년도(hire_date)별 평균 급여를 가져오시오. 년도를 기준으로 오름차순 정렬.
select * from employees;
select * from jobs;

select
    e.hire_date as "입사년도",
    round(avg(salary)) as "평균급여"
from employees e
    inner join jobs j
        on e.job_id = j.job_id
            group by e.hire_date
                order by 입사년도; 



-- 33)employees, departments. locations. 각 도시(city)에 있는 모든 부서 사원들의 평균급여가 가장 낮은 도시부터 도시명(city)과 평균연봉, 해당 도시의 사원수를 가져오시오. 단, 도시에 근 무하는 사원이 10명 이상인 곳은 제외하고 가져오시오.
select * from locations;
select 
    l.city as "도시이름",
    round(avg(e.salary)) as "평균연봉",
    count(*) as "사원수"
from employees e
    inner join departments d
        on e.department_id = d.department_id
            inner join locations l
                on d.location_id = l.location_id
                        group by l.city
                            having count(*) < 10;

            
            
-- 34)employees, jobs, job_history. ‘Public  Accountant’의 직책(job_title)으로 과거에 근무한 적이 있는 모든 사원의 사번과 이름을 가져오시오. 
-- 현재 ‘Public Accountant’의 직책(job_title)으로 근무하는 사원은 고려 하지 말것.
select 
    * 
from employees e
    inner join jobs j
        on e.job_id = j.job_id
            inner join job_history h
                on j.job_id = h.job_id;
    
    
    
-- 35)employees, departments, locations. 커미션을 받는 모든 사람들의 first_name, last_name, 부서명, 지역 id, 도시명을 가져오시오.
select 
   e.first_name||' '||e.last_name as "이름",
   d.department_name as "부서명",
   l.location_id as "지역id",
   l.city as "도시명"
from employees e
    inner join departments d
        on e.department_id = d.department_id
            inner join locations l
                on d.location_id = l.location_id
                    where e.commission_pct is not null;
    
    
    
-- *************************************** 못 풀겠음             
-- 36)employees. 자신의 매니저보다 먼저 고용된 사원들의 first_name, last_name, 고용일을 가져오시오.
select * from employees;

select hire_date from employees where manager_id = (select manager_id from employees);
select manager_id from employees;

select
    first_name,
    last_name
from employees
    where hire_date < (select hire_date from employees where employee_id = (select manager_id from employees));
-- ORA-01427: single-row subquery returns more than one row > for문 처럼 말고 1명당 진행해야하는데 그게 어려움 
-- 자신의 매니저 고용일 > 1개만 출력해야하는데 서브쿼리 없이 ?

select
    first_name,
    last_name
from employees
    where hire_date < (select hire_date from employees where employee_id = manager_id);


