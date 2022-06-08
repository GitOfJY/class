-- ex11_data_time_function



/*

    날짜 연산
    - +, -
    1. 시각 - 시각
    2. 시각 + 시간 = 시각
    3. 시각 - 시간 = 시각
    
    
    날짜 시간 함수
    
    sysdate
    - 현재 시스템의 시간을 반환
    - 자바의 Calendar.getInstance()
    - date sysdate
    
    
    last_day()
    - day last_day(date)
    - 해당 날짜가 포함된 달의 마지막 날짜를 반환
    
    
    시각 - 시각 = 시간(일)
    시각 + 시간(일) = 시각
    시각 - 시각(일) = 시각
    
    months_between()
    - number months_between(date, date)
    - 시각 - 시각 = 시간(월)
    
    
    add_months()
    - date add_months(date, number)
    - 시각 + 시간(월) = 시각

*/

select sysdate from dual; --22/04/22 (RR/MM/DD)

select name, ibsadate from tblInsa;

desc tblInsa;


-- 시각 - 시각 = 시간(일)
select

    name as 이름,
    ibsadate as 입사날짜,
    
    round(sysdate - ibsadate) as 근무일수,
    round((sysdate - ibsadate)/365) as 근무년수, -- 사용 금지
    round((sysdate - ibsadate) *24) as 근무시수,
    round((sysdate-ibsadate)*24*60) as 근무분수,
    round((sysdate-ibsadate)*24*60*60) as 근무초수
    
from tblInsa;


-- (***) 절의 실행 순서
--    1. FROM 테이블명    
--    2. WHRER 조건
--    3. SELECT 컬럼리스트
--    4. ORDER BY 기준

select
    title, 
    adddate, 
    completedate,
    -- round(completedate - adddate, 1) as "실행하기까지 걸린 시간" ORA-00972: identifier is too long > 30바이트(10글자) 이내
   round(completedate - adddate, 1) as "실행까지 걸린 시간"
from tblTodo 
    where completedate is not null and round(completedate - adddate)<=3
    -- and "실행까지 걸린 시간" <= 3
    -- ORA-00904: "실행까지 걸린 시간": invalid identifier
    order by "실행까지 걸린 시간" desc;
    
    
-- 시각 + 시간(일) = 시각
-- 시각 - 시간(일) = 시각

select 
    sysdate,
    sysdate + 100 as "100일 후",
    sysdate - 100 as "100일 전",
    sysdate - (2/24) as "2시간 전",
    sysdate + (3/24) as "3시간 후",
    sysdate + (30/60/24) as "30분 후"
from dual;


select
    sysdate,
    last_day(sysdate) -- 22/04/30
from dual;


select
    name,
    round(sysdate - ibsadate) as "근무일수",
    round(months_between(sysdate, ibsadate)) as "근무월수",
    round(months_between(sysdate, ibsadate) /12) as "근무년수"
from tblInsa;


select
    sysdate,
    sysdate + 10, --10일뒤
    add_months(sysdate, 10), --10개월뒤
    add_months(sysdate, -3),  --3개월전
    add_months(sysdate, 3*12) --3년뒤
from dual;


/*

    시각 - 시각
    1. 일,시,분,초  > 연산자
    2. 월,년        > months_between()
    
    시각 + 시간
    1. 일,시,분,초  > 연산자
    2. 월,년        > add_months()

*/








