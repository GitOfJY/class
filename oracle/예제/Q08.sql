-- Q08



-- 1. tblInsa. 남자 급여(기본급+수당)을 (내림차순)순위대로 가져오시오. (이름, 부서, 직위, 급여, 순위 출력)
select * from tblInsa order by basicpay+sudang desc;
select a.*, rownum as rnum from (select * from tblInsa order by basicpay+sudang desc) a;
select 
    name as "이름", 
    buseo as "부서", 
    jikwi as "직위", 
    basicpay+sudang as "급여", 
    rnum as "순위"
from (select a.*, rownum as rnum 
        from (select * from tblInsa order by basicpay+sudang desc) a);
        

select name,  buseo, jikwi, salary, rownum from (
                    select
                        name,
                        buseo,
                        jikwi,
                        (basicpay+sudang) as salary
                    from tblInsa
                        where substr(ssn,8,1)='1'
                            order by (basicpay+sudang) desc);



-- 2. tblInsa. 여자 급여(기본급+수당)을 (오름차순)순위대로 가져오시오. (이름, 부서, 직위, 급여, 순위 출력)
select 
    name as "이름", 
    buseo as "부서", 
    jikwi as "직위", 
    basicpay+sudang as "급여", 
    rnum as "순위"
from (select a.*, rownum as rnum 
        from (select * from tblInsa where substr(ssn, 8, 1) = '2' order by basicpay+sudang) a);        




-- 3. tblInsa. 여자 인원수가 (가장 많은 부서 및 인원수) 가져오시오.
-- 1순위인 팀이 중복될 경우 ? > 다른 조건이 없으니 넘어가기
select buseo, count(*) from tblInsa where substr(ssn, 8, 1) = '2' group by buseo;
select a.* from (select buseo, count(*) as count from tblInsa where substr(ssn, 8, 1) = '2' group by buseo) a order by count;

select 
    buseo as "부서",
    count as "인원수",
    rownum as "순위"
 from (select a.* from (select buseo, count(*) as count from tblInsa where substr(ssn, 8, 1) = '2' group by buseo) a order by count)
 where rownum = '1';
 
 
 select buseo, cnt, rownum from(
select
    buseo,
    count(*) as cnt
from tblInsa
    where substr(ssn, 8,1)='2'
        group by buseo
            order by count(*) desc)
                where rownum = 1;



-- 4. tblInsa. 지역별 인원수 (내림차순)순위를 가져오시오.(city, 인원수)
select count(*) from tblInsa where city = '서울';
select city, count(*) from tblInsa group by city;
select a.* from (select city, count(*) as count from tblInsa group by city) a order by count desc;

select
    city as "지역",
    count as "인원수"
from (select a.* from (select city, count(*) as count from tblInsa group by city) a order by count desc);



-- 5. tblInsa. 부서별 인원수가 가장 많은 부서 및 인원수 출력.
select buseo, count(*) from tblInsa group by buseo;
select buseo, count(*) from tblInsa group by buseo;
select a.* from (select buseo, count(*) as count from tblInsa group by buseo) a order by count desc;

select
    buseo as "부서",
    count as "인원수",
    rownum as "순위"
from (select a.* from (select buseo, count(*) as count from tblInsa group by buseo) a order by count desc) where rownum = 1;



-- 6. tblInsa. 남자 급여(기본급+수당)을 (내림차순) 3~5등까지 가져오시오. (이름, 부서, 직위, 급여, 순위 출력)
select * from tblInsa where substr(ssn, 8,1) = '1' order by basicpay+sudang desc;

select 
    name,
    buseo,
    jikwi,
    basicpay+sudang,
    rownum as rnum
from (select * from tblInsa where substr(ssn, 8,1) = '1' order by basicpay+sudang desc) ;

select * from (
select 
    name,
    buseo,
    jikwi,
    basicpay+sudang,
    rownum as rnum
from (select * from tblInsa where substr(ssn, 8,1) = '1' order by basicpay+sudang desc)
) where rnum between 3 and 5;



-- 7. tblInsa. 입사일이 빠른 순서로 5순위까지만 가져오시오.
select * from tblInsa order by ibsadate;

select name, ibsadate, rownum from (select * from tblInsa order by ibsadate) where rownum <= 5;



-- 8. tblhousekeeping. 지출 내역(가격 * 수량) 중 가장 많은 금액을 지출한 내역 3가지를 가져오시오.
select item, price*qty from tblhousekeeping order by price*qty desc;
select a.*, rownum from (select item, price*qty from tblhousekeeping order by price*qty desc) a where rownum <=3;



-- 9. tblinsa. 평균 급여 2위인 부서에 속한 직원들을 가져오시오.
select * from tblInsa where buseo = (
select buseo from(
select buseo, avgbasicpay, rownum as rnum from(
select buseo, round(avg(basicpay)) as avgbasicpay from tblInsa group by buseo order by avg(basicpay) desc))
    where rnum = 2);


-- 10. tbltodo. 등록 후 가장 빠르게 완료한 할일을 순서대로 5개 가져오시오.
select title, completedate - adddate from tblTodo where completedate is not null order by completedate - adddate;

select 
    title, rownum
from (select title, completedate - adddate from tblTodo where completedate is not null order by completedate - adddate)
    where rownum <= 5;



-- 11. tblinsa. 남자 직원 중에서 급여를 3번째로 많이 받는 직원과 9번째로 많이 받는 직원의 급여 차액은 얼마인가?
select * from tblInsa where substr(ssn, 8, 1) = '1' order by basicpay desc;

select a.*, rownum as rnum from (select * from tblInsa where substr(ssn, 8, 1) = '1' order by basicpay desc) a;

select basicpay from (select a.*, rownum as rnum from (select * from tblInsa where substr(ssn, 8, 1) = '1' order by basicpay desc) a);
select basicpay from (select a.*, rownum as rnum from (select * from tblInsa where substr(ssn, 8, 1) = '1' order by basicpay desc) a) where rnum = 3;
-- 2540000
select basicpay from (select a.*, rownum as rnum from (select * from tblInsa where substr(ssn, 8, 1) = '1' order by basicpay desc) a) where rnum = 9;
-- 2300000

select
((select basicpay from (select a.*, rownum as rnum from (select * from tblInsa where substr(ssn, 8, 1) = '1' order by basicpay desc) a) where rnum = 3) 
-
(select basicpay from (select a.*, rownum as rnum from (select * from tblInsa where substr(ssn, 8, 1) = '1' order by basicpay desc) a) where rnum = 9) ) as "결과"
from dual;
-- 240000



