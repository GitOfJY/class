-- ex32_synonym



/*

    동의어, synonym
    - 시노님
    - 데이터베이스 객체의 별칭(Alias 차이 있음)
    - 다른 사용자 소유의 객체를 접근 > 별칭 사용
    
    테이블 등 자원은 계정 소속이다.

*/



show user;
-- USER이(가) "HR"입니다.

select * from tabs where table_name = 'TBLINSA';
-- 존재



show user;
-- USER이(가) "SYSTEM"입니다.
-- 관리자 계정 > 다른 계정의 자원을 접근할 권한이 있다.
-- select * from 계정.tbl이름;

select * from tblInsa;
-- ORA-00942: table or view does not exist
-- 테이블 등 자원은 계정 소속 

select * from hr.tblInsa;
-- 다른 계정의 자원 접근 > 계정명.자원명

-- 일반 다른 계정 생성 > scott
create user scott identified by java1234;
grant connect, resource to scott;

-- 시노님
grant create synonym to scott;

-- scott에게 hr.tblInsa에 접근할 수 있는 권한 부여
grant select, update, insert, delete 
    on hr.TblInsa 
        to scott;
        
grant select, delete 
    on hr.TblInsa 
        to scott;
       
-- 권한 부여 취소        
revoke delete on hr.tblInsa from scott;



show user;
-- USER이(가) "SCOTT"입니다.
select * from tabs; 
-- 자원 아무것도 없음

select * from tblInsa;
select * from hr.tblInsa;
-- ORA-00942: table or view does not exist
-- 다른 계정의 자원은 접근 불가능

select * from hr.tblInsa;
-- sys 계정에서 권한 부여 후 실행 가능

update hr.tblInsa set basicpay = 3000000 where name = '홍길동';  -- 비인덱스 (일반키)
update hr.tblInsa set basicpay = 3000000 where num = 1001;      -- 인덱스 (PK 자동으로 인덱스) > 속도 훨씬 빠름, 안정성 보장
-- SQL 오류: ORA-01031: insufficient privileges (update 권한 부여 없음)

delete from hr.tblInsa where num = 1001;
-- 권한이 있기 때문에 삭제 가능


-- 영구적으로 hr의 tblInsa를 scott이 접근해야 하는 경우
select i.name, i.buseo, i.jikwi from hr.tblInsa i;

-- create synonym 별칭 for 자원;
create synonym insa for hr.tblInsa;
select * from insa;
-- 짧게 줄이는 용도 뿐

-- dual, tabs > public synonym
select sysdate from dual;
select * from tabs;
















