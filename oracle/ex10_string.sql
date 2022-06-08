--ex10_string



/*
    
    문자열 함수
    
    upper(), lower(), initcap()
    - varchar2 upper(컬럼)
    - varchar2 lower(컬럼)
    - varchar2 initcap(컬럼)
    
    
    subsrt()
    - 문자열 추출 함수
    - varhar2 substr(컬럼, 시작위치, 가져올 문자 개수)
    - varcar2 substr(컬럼, 시작위치)
    - *** SQL은 one-base index 사용, 첨자를 1부터 시작한다.
    
    
    length()
    - 문자열 길이
    - number length(칼럼)
    
    
    instr()
    - 검색(=indexOf())
    - 검색어의 위치를 반환
    - number instr(컬럼, 검색어)
    - number instr(컬럼, 검색어, 시작위치)
    - 못찾으면 0을 반환
    
    
    lpad(), rpad()
    - left padding, right padding
    - varchar2 lpad(칼럼, 개수, 문자)
    - varchar2 rpad(컬럼, 개수, 문자)
    
    
    trim(), ltrim(), rtrim()
    - varchar2 trim(칼럼)
    
  
    replace()
    - 문자열 치환
    - varchar2 replace(컬럼, 찾을 문자열, 바꿀 문자열)
    
    
    decode()
    - 문자열 치환
    - varchar2 deocde(컬럼, 찾을 문자열, 바꿀 문자열 [찾을 문자열, 바꿀 문자열]*N)
    - 못 찾으면 null 반환(***)
    - case의 간단한 버전 느낌
    
*/


select 
    first_name,
    upper(first_name),
    lower(first_name)
from employees;

select 'abc', initcap('abc') from dual;  -- 첫 글자 대문자로 변환


--이름에 'an' 포함된 직원 > 대소문자 구분없이
select first_name from employees where lower(first_name) like '%an%';


select 
    title,
    substr(title, 3,4)
from tblTodo;


select
    'ABCDEFG',
    substr('ABCDEFG',2,3)
from dual;


select
    name,
    substr(name, 1, 1) as 성,
    substr(name, 2) as "이름", 
    substr(SSN, 1, 2) as "생년",
    substr(SSN, 3, 2) as "생월",
    substr(SSN, 5, 2) as "생일",
    substr(SSN, 8, 1) as "성별"
from tblInsa;


-- 김, 이, 박, 최, 정 > 몇 명?
select
    count( case when substr(name, 1, 1) = '김' then 1 end) as "김씨", 
    count( case when substr(name, 1, 1) = '이' then 1 end) as "이씨",
    count( case when substr(name, 1, 1) = '박' then 1 end) as "박씨",
    count( case when substr(name, 1, 1) = '최' then 1 end) as "최씨",
    count( case when substr(name, 1, 1) = '정' then 1 end) as "정씨",
    count(case when substr(name, 1, 1) not in ('김', '이', '박', '최', '정') then 1 end) as "기타"
from tblInsa;


select * from tblInsa order by substr(SSN, 8, 1) asc;


-- 컬럼 리스트에서 사용
select name, length(name) from tblCountry;


-- 조건절에서 사용
select name from tblCountry where length(name) > 3;
select name from tblCountry where length(name) between 4 and 6;


-- 정렬에 사용
select name from tblCountry order by length(name) desc, name asc;


-- 남자 > 여자 순
select * from tblInsa order by substr(ssn, 8, 1) asc, ssn asc;


-- 게시판 제목 > 길면 잘라서 말줄임표 (...)
select
    title,
    case
        when length(title) >=8 then substr(title, 1, 8) || '...'
        else title
    end
from tblTodo;


select 
    '안녕하세요. 홍길동님' as c1,
    instr('안녕하세요. 홍길동님', '홍길동') as c2,
    instr('안녕하세요. 홍길동님', '아무개') as c3,
    instr('안녕하세요. 홍길동님. 반갑습니다. 홍길동님', '홍길동') as c4,
    instr('안녕하세요. 홍길동님. 반갑습니다. 홍길동님', '홍길동') as c5,
    instr('안녕하세요. 홍길동님. 반갑습니다. 홍길동님', '홍길동', 11) as c6,
    instr('안녕하세요. 홍길동님. 반갑습니다. 홍길동님', '홍길동', instr('안녕하세요. 홍길동님. 반갑습니다. 홍길동님', '홍길동')+length('홍길동')) as c7
from dual;


select * from tblInsa where tel like '010%';
select * from tblInsa where substr(tel, 1, 3) = '010';
select * from tblInsa where instr(tel, '010') = 1;


select 
    'a',
    lpad('a', 5, 'b'),
    '1',
    lpad('1', 3, '0'),
    rpad('1', 3, '0')
from dual;


select
    '       하나    둘    셋        ',
    trim('       하나    둘    셋        '),
    ltrim('       하나    둘    셋        '),
    rtrim('       하나    둘    셋        ')
from dual;


select
    replace('홍길동', '홍', '김'),
    replace('홍길동', '이', '김')
from dual;


select 
    name, ssn,
    case
        when substr(ssn,8,1) ='1' then '남자'
        when substr(ssn,8,1) ='2' then '여자'
    end
from tblInsa;


select 
    name, ssn,
    replace(substr(ssn,8,1), '1', '남자'),
    replace(substr(ssn,8,1), '2', '여자'),
    replace(replace(substr(ssn,8,1), '1', '남자'), '2', '여자')
from tblInsa;


select 
    name,
    continent,
    case
        when continent = 'AS' then '아시아'
        when continent = 'EU' then '유럽' 
    end as c,
    replace(replace(continent, 'AS', '아시아'), 'EU', '유럽'),
    decode(continent, 'AS', '아시아', 'EU', '유럽', 'AF', '아프리카')
from tblCountry;


select
    substr(ssn, 8, 1),
    replace(replace(substr(ssn, 8, 1), '1', '남자'), 2, '여자'),
    decode(substr(ssn, 8, 1), '1', '남자', '2', '여자')
from tblInsa;


-- 남자? 여자?
select 
    count(case
        when gender = 'm' then 1
    end),
    count(case
        when gender = 'f' then 1
    end),
    count(decode(gender, 'm', 1)),
    count(decode(gender, 'f', 1))
from tblComedian;



