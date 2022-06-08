--ex09_numerical_function



/*

    숫자 함수 (=수학 함수)
    - 자바의 Math 클래스 역할
    
    round()
    - 반올림 함수
    - number round(컬럼명) : 정수 반환
    - number round(컬럼명, 소수 이하 자릿수) : 실수 반환
    
    
    floor(), trunc()
    - 절삭 함수
    - 무조건 내림 함수
    - number floor(컬럼명)
    - number trunc(컬럼명, [, 소수 이하 자릿수])
    
    
    ceil()
    - 무조건 올림 함수
    - number ceil(컬럼명)
    
    
    mod()
    - 나머지 함수
    - number mod(피제수, 제수)
    
*/

select 
    height / weight, 
    round(height / weight),
    round(height / weight, 1),
    round(height / weight, 2),
    round(height / weight, 3)
from tblComedian;

select round(avg(basicpay)) from tblInsa;


select
    height/weight,
    round(height/weight),
    floor(height/weight),
    trunc(height/weight),
    trunc(height/weight, 1),
    trunc(height/weight, 2)
from tblComedian;


select 
    height / weight,
    round(height / weight),
    floor(height / weight),
    ceil(height / weight)
from tblComedian;


-- 시스템 테이블 dual
select*from dual;  -- 1행 1열 테이블

select 100+100 from tblComedian;
select 100+100 from tblInsa;
select 100+100 from dual;

select 
    round(9.99999999), -- 10
    floor(9.000000001), -- 9
    ceil(9.000000001)   -- 10
from dual;


select 
    10/3,
    floor(10/3) as "몫",
    mod(10, 3) as "나머지"
from dual;


select 
    abs(10),         -- 절댓값
    abs(-10),
    power(2,2),     -- 제곱
    power(2,3),
    power(2,4),
    sqrt(4)            -- 루트
from dual;



