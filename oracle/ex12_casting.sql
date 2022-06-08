-- ex12_casting



/*
    
    null 함수 > null value 
    1. nvl(값1, 값2)
    2. nv12(값1, 값2, 값3)
    
    
    형변환 함수
    
    1. to_char() : 숫자 > 문자
    2. to_char() : 날짜 > 문자 (*****)
    3. to_number() : 문자 > 숫자
    4. to_date() : 문자 > 날짜 (*****)
    
    
    1. to_char()
    - char to_char(칼럼, 형식문자열)
    
    형식문자열 구성요소
    a. 9 : 숫자 1개를 문자 1개로 바꾸는 역할. 빈자리는 스페이스로 치환 > %5d
    b. 0 : 숫자 1개를 문자 1개로 바꾸는 역할. 빈자리는 0으로 치환 > %05d
    c. $ : 통화기호 표현
    d. L : 통화기호 표현(로컬) > 설정에 따라 바뀜
    e. .  : 소수점 표시
    f. , : 자릿수 표시
    
    
    2. to_char()
    - 날짜 > 문자
    - char to_char(컬럼, 형식문자열)
    
    형식문자열 구성요소
    a. yyyy
    b. yy
    c. month
    d. mon
    e. mm
    f. day
    g. dy
    h. ddd
    i. dd
    j. d
    k. hh
    l. hh24
    m. mi
    n. ss
    o. am(pm)


    3. to_number()
    - 문자 > 숫자
    - number to_number(컬럼)
    - 암시적 형변환으로 잘 사용하지 않지만 가독성 등의 이유로 쓰는 것을 권장
    
    
    4. to_date()
    - 문자 > 날짜 (*****)
    - date to_date(컬럼, 형식문자열)
    
    
    결론 : 날짜 관련 함수 자주 사용, 기억!
    2. 날짜 > 문자
    4. 문자 > 날짜
    
*/

select
    name,
    population,
    
    case
        when population is not null then population
        when population is null then 0
    end as "case1" ,
    
    nvl(population,0) as "nvl1", 
    
    case
        when population is not null then '확인'
        when population is null then '미확인'
    end as "case2",
    
    nvl2(population, '확인', '미확인') as "nvl2"
    
from tblCountry;


select
    weight,                 -- 우측정렬(숫자)
    to_char(weight),        -- 좌측정렬(문자)
    length(weight),         -- 자동으로 형변환 발생, length는 문자열이어야함
    length(to_char(weight))
from tblComedian;


-- *** SQL은 아주 유연한 언어 > 자료형 > 암시적 형변환 잦음
select
    weight,                 -- 우측정렬(숫자)
    to_char(weight),        -- 좌측정렬(문자)
    length(weight),         -- 자동으로 형변환 발생 > length(to_char(weight)) 동일
    length(to_char(weight))
from tblComedian;

select
    10,
    length(10),  -- 10 > '10' 자동 형변환
    length('10'),
    2 * 1,
    '2' * 2      -- '2' > 2 자동 형변환
from dual;


-- Java > Strong Type
-- SQL > Week Type


select
    weight,
    '@' || to_char(weight) || '@',
    '@' || to_char(weight, '99999') || '@',  -- 5자리 문자열로 바꾸고 남은 공간은 공백으로 채운다.
    '@' || to_char(weight, '00000') || '@',  -- 5자리 문자열로 바꾸고 남은 공간은 0으로 채운다.
    '@' || to_char(-weight, '00000') || '@'
from tblComedian;

-- @ 00064@ , @-00064@ > 숫자 앞 공백은 부호 자리


select
    100,
    to_char(100, '$999'),
    -- to_char(100, '999달러'),
    to_char(100, '999') || '달러',
    to_char(100, 'L999')
from dual;


select 
    1234567.89,
    to_char(1234567.89, '9999999.99'),      -- 1234567.89
    to_char(1234567.89, '9999999.9'),       -- 1234567.9,       > 반올림
    to_char(1234567.89, '9999999.999'),     -- 1234567.890,    > 0으로 채움
    to_char(1234567.89, '9,999,999.999')    -- 1,234,567.890   > 자리수 표시
from dual;


select sysdate from dual;

select to_char(sysdate) from dual;
select to_char(sysdate, 'yyyy') from dual;           -- 2022 > 년(4자리) ****
select to_char(sysdate, 'yy') from dual;             -- 22 > 년(2자리)
select to_char(sysdate, 'month') from dual;          -- 4월 > 월(풀네임)
select to_char(sysdate, 'mon') from dual;            -- 4월 > 월(약어)
select to_char(sysdate, 'mm') from dual;             -- 04 > 월(2자리) ****
select to_char(sysdate, 'day') from dual;            -- 금요일 > 요일(풀네임)
select to_char(sysdate, 'dy') from dual;             -- 금  > 요일(약어)
select to_char(sysdate, 'ddd') from dual;            -- 112  > 일(올해의 며칠)
select to_char(sysdate, 'dd') from dual;             -- 22 > 일(이번월의 며칠) ****
select to_char(sysdate, 'd') from dual;              -- 6 > 일(이번주의 며칠 == 요일)
select to_char(sysdate, 'hh') from dual;             -- 02 > 시(12시간)
select to_char(sysdate, 'hh24') from dual;           -- 14 > 시(24시간) ****
select to_char(sysdate, 'mi') from dual;             -- 18  > 분 ****
select to_char(sysdate, 'ss') from dual;             -- 29  > 초 ****
select to_char(sysdate, 'am') from dual;             -- 오후 > 오전/오후
select to_char(sysdate, 'pm') from dual;             -- 오후 > 오전/오후

select 
    sysdate,
    to_char(sysdate, 'yyyy-mm-dd'),                  -- 2022-04-22
    to_char(sysdate, 'hh24:mi:ss'),                  -- 14:21:21
    to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss'),       -- 2022-04-22 14:22:50
    to_char(sysdate, 'day am hh:mi:ss')              -- 금요일 오후 02:23:42
from dual;


select 
    name,
    to_char(ibsadate, 'yyyy-mm-dd') as hire_date,
    to_char(ibsadate, 'day') as hire_day,
    
    case
        -- when to_char(ibsadate, 'day') = '토요일' > day, dy는 현재 환경에 따라 언어가 달라짐, 주의
        when to_char(ibsadate, 'd') in ('1', '7') then '주말 입사'
        else '평일 입사'        
    end
    
from tblInsa;


-- 2010년에 입사한 직원
select * from tblInsa where ibsadate >= '2010-01-01' and ibsadate <= '2010-12-31';  -- 오답 (암시적 형변환)
select * from tblInsa where ibsadate between '2010-01-01' and '2010-12-31';  -- 오답 (암시적 형변환)
-- 2010-01-01 00:00:00 ~ 2010-12-31 00:00:00 > 12월30일까지로 계산해서 오답    
    
select '2010-01-01', sysdate from dual; 
-- '2010-01-01' > 문자열
-- 22/04/22 > 날짜
-- 날짜형 리터럴은 없다.


select * from tblInsa
    where to_char(ibsadate, 'yyyy') = '2010';
    
    
select 
    name,
    to_char(ibsadate, 'yyyy-mm-dd day')
from tblInsa
    order by to_char(ibsadate, 'd') asc;
    
    
select 
    1234 as "aaaaaaaaaaaaaaaa",
    '1234' as "bbbbbbbbbbbbbbb",
    to_number('1234') as "ccccccccccccccc"
from dual;
    

-- 프로그램 > 사용자 날짜 입력 > SQL 사용    

select
    sysdate,
    '2022-04-22',                         -- 문맥에 따라 문자열 / 날짜 자동 형변환
    to_date('2022-04-22'),                -- 22/04/22
    to_date('2022-04-22', 'yyyy-mm-dd'),
    to_date('20220422', 'yyyy-mm-dd'),
    to_date('2022/04/22', 'yyyy-mm-dd'),
    to_date('2022-04-22 15:05:30', 'yyyy-mm-dd hh24:mi:ss')
from dual;


