-- ex18_subquery



/*

    ANSI-SQL
    1. Sub Query
    2. Join

    
    Query, 시퀄 > SQL로 작성한 문장
    
    Main Query, 일반 쿼리
    - 하나의 문장안에 하나의 SELECT(INSERT, UPDATE, DELETE)로 되어 있는 쿼리
    
    Sub Query, 서브 쿼리
    - 하나의 문장(SELECT, INSERT, UPDATE, DELETE)안에 또 다른 문장(SELECT)이 들어있는 쿼리
    - 하나의 SELECT문안에 또 다른 SELECT문이 들어있는 쿼리
    - SELECT   > SELECT
    - INSERT   > SELECT
    - UPDATE > SELECT
    - DELETE  > SELECT
    - 삽입 위치 > SELECT절, FROM절, WHERE절, GROUP BY절, HAVING절, ORDER BY절
    - 메인 쿼리에서 값으로 취급(사용)

*/


-- tblCountry. 인구수가 가장 많은 나라의 이름?
select max(population) from tblCountry; --120660 A
select name from tblCountry where population = 120660; -- B

-- select name from tblCountry where population = max(population);
-- ORA-00934: group function is not allowed here 
-- 집계 함수는 WHERE절(레코드 하나하나에 조작)에 사용 불가능하다.

rollback;
update tblCountry set population = 121000 where name = '중국';
-- select > select 장점 : 실시간 데이터가 업데이트 되어도 잘 작동

select name from tblCountry where population = (select max(population) from tblCountry); -- A + B

select name                                                                       -- 3
from tblCountry                                                                  -- 1
where population = (select max(population) from tblCountry);    -- 2


-- tblComedian. 체중이 가장 많이 나가는 사람 이름?
select last||first from tblComedian where weight = (select max(weight) from tblComedian);


-- tblInsa. 급여를 가장 많이 받는 직원 이름?
select * from tblInsa where basicpay >= (select max(basicpay) from tblInsa);


-- 서브쿼리 삽입 위치
-- 1. 조건절 > 비교값으로 사용
--      1. 반환값이  1행  1열 > 단일 값 반환 > 상수 취급 > 값 1개로 사용
--      2. 반환값이 N행  1열 > 다중 값 반환 > 값 N개로 사용 > 열거형 비교 > in 사용
--      3. 반환값이 1행  N열 > 다중 값 반환 > 그룹 비교 > N컬럼:N컬럼 비교
--      4. 반환값이 N행 N열 > 다중 값 반환 > 2 + 3 > in + 그룹비교


-- 급여가 260만원 이상 받는 직원이 근무하는 부서의 직원 명단을 가져오시오.
select * from tblInsa where buseo = (select buseo from tblInsa where basicpay>=2600000);
-- ORA-01427: single-row subquery returns more than one row
-- 삽입한 select절에서 값이 2개('총무부' or '기획부') 

select * from tblInsa where buseo = '총무부' or buseo = '기획부';
select * from tblInsa where buseo in ('총무부','기획부');
select * from tblInsa where buseo in (select buseo from tblInsa where basicpay>=2600000);


-- '홍길동'과 같은 지역, 같은 부서인 직원 명단을 가져오시오.
select * from tblInsa where name = '홍길동';
select * from tblInsa where city = '서울' and buseo = '기획부';

select * from tblInsa 
    where city = (select city from tblInsa where name = '홍길동') 
    and buseo = (select buseo from tblInsa where name = '홍길동');
    -- WHERE절에서 1:1 and 1:1 비교 
    
select * from tblInsa
    where (city, buseo) = (select city, buseo from tblInsa where name = '홍길동');
    -- WHERE절에서 2:2 비교 (순서, 갯수 주의) 
    

-- 급여가 260만원 이상 받는 직원과 같은 부서 같은 지역에 있는 직원들 모두 가져오시오.
-- (기획부에 근무하면서 서울에 있는 직원들과 총무부에 근무하면서 경남에 있는 직원들을 모두 가져오시오.)
select buseo, city from tblInsa where basicpay >= 2600000;
--select * from tblInsa where 컬럼 in (서브쿼리);
select * from tblInsa where (buseo, city) in (select buseo, city from tblInsa where basicpay >= 2600000);





-- 서브쿼리 삽입 위치
-- 2. 컬럼리스트에서 사용
--      - 반드시 결과값이 1행 1열이어야 한다. (*****) > 스칼라 쿼리
--      - 다른 컬럼과 관계있는 값을 반환해야 한다. (하나의 레코드의 모든 컬럼은 서로 연관이 있어야 한다.)
--      1. 정적 쿼리 > 모든 행에 동일한 값을 적용하는 쿼리 > 사용 빈도 적음
--      2. 상관 서브쿼리(******) > 서브쿼리의 값과 바깥쪽 메인쿼리의 값을 서로 연결 > 사용 빈도 높음

select
    name, buseo, basicpay,
    (select round(avg(basicpay)) from tblInsa) as "평균급여"
from tblInsa;


select
    name, buseo, basicpay,
    (select jikwi from tblInsa where name = '홍길동') as jikwi
from tblInsa;


select 
    name, buseo, basicpay,
    (select jikwi from tblInsa) -- 여러 레코드 반환 > error
from tblInsa;

select 
    name, buseo, basicpay,
    (select jikwi, sudang from tblInsa where num = 1001) -- 부장 20000 > 여러 레코드 반환 > error
from tblInsa;


-- 상관서브쿼리 (연관있는 쿼리)
select
    name,
    buseo,
    basicpay,
    (select round(avg(basicpay)) from tblInsa) as "전체 평균 급여", -- 정적쿼리
    (select round(avg(basicpay)) from tblInsa where buseo = a.buseo) as "소속 평균 급여"
from tblInsa a; -- 테이블 별칭 > as 없이 바로 명칭 



-- 남자의 이름, 키, 몸무게와 여자친구의 이름을 가져오시오.

select * from tblMan;
select * from tblWoman;

select
    name as "남자 이름",
    height as "남자 키",
    weight as "남자 몸무게",
    couple as "여자 이름",
    (select height from tblWoman where name = tblMan.couple) as "여자 키",
    (select weight from tblWoman where name = tblMan.couple) as "여자 몸무게"
from tblMan;





-- 서브쿼리 삽입 위치
-- 3. FROM절에서 사용
--      - 인라인 뷰 (Inline View)
--      1. 서브쿼리의 결과셋을 또 하나의 테이블이라고 생각하고 또 다른 SELECT의 FROM절에 사용이 가능하다.


-- select 실행 > 결과 테이블(Result Table), 결과셋(ResultSet) > 임시 테이블
-- 연쇄적으로 사용 가능
select * from (select name, buseo, jikwi from tblInsa);
select * from (select * from (select name, buseo, jikwi from tblInsa));



-- 주의점
select name, buseo, jikwi, basicpay from (select name, buseo, jikwi from tblInsa);
-- ORA-00904: "BASICPAY": invalid identifier
-- 메인쿼리 > tblInsa(x), 서브쿼리(o)
-- 서브쿼리 > tblInsa

select name, buseo, jikwi from (select name, buseo, jikwi as position from tblInsa);
select name, buseo, position from (select name, buseo, jikwi as position from tblInsa);
-- from 서브쿼리가 별칭 사용 > 메인쿼리는 별칭을 원래 컬럼명으로 인식
-- ORA-00904: "JIKWI": invalid identifier

select name, length(name) from (select name, length(name) from tblInsa);
select name, length(name) from (select name, length(name) as len from tblInsa);
select name, len from (select name, length(name) as len from tblInsa);
-- "length(name)" 의미? > 반드시 alisa 붙이기

select 
    name, height, couple, 
    (select height from tblWoman where name = tblMan.couple) as height
from tblMan
    order by height asc;
-- ORA-00960: ambiguous column naming in select list
-- height > 남자키? 여자키? 모호함








