-- ex30_account



-- sys session에서 실행
/*

    사용자 관련 > DCL
    - 계정 생성, 삭제, 잠금 제어
    - 리소스(DB Object) 접근 권한 제어

    현시점 사용 계정
    - system
    - hr
    
    사용자 계정 생성하기
    - 시스템 권한을 가지고 있는 계정만 가능하다. > 관리자급
    - 계정 생성 권한을 가지고 있는 일반 계정도 가능하다.
    
    - 계정 생성 create user 계정명 identified by 암호
    - 계정 삭제 alter user 계정명 identified by 암호
    - 계정 잠금 해제 alter user 계정명 account unlock
    - 계정 잠금 설정 alter user 계정명 account lock
    
    
    - 새로 생성된 계정은 아무 권한이 없다. > 접속할 권한 조차도 없다.
    
    
    사용자에게 권한 부여하기
    - 시스템 권한을 가지고 있는 계정만 가능하다. > 관리자급
    - grant 권한명 to 유저명
    
    사용자에게 권한 제거하기
    - revoke 권한명 from 유저명
    
    
    권한 종류
    - create user
    - drop user
    - create user
    - create table
    - create view
    - create sequence
    - create procedure
    
    
    권한의 집합 > Role
    - HR(connect + resource + create view)
    1. connect 
        - 사용자가 DB 접속 + 기본적 행동 > 권한 모음

    2. resource
        - 사용자가 객체를 생성하거나 조작하는 권한 모음
    
    3. dba
        - 준관리자급 권한 모음
        
*/

show user;

create user hong identified by java1234;

grant create session to hong;
-- hong으로 접속할 수 있는 권한 부여

grant create table to hong;
-- hong으로 table 생성할 수 있는 권한 부여





-- hong session에서 실행
-- ORA-01031: insufficient privileges
create table tblData (
    seq number primary key,
    data varchar2(100) not null
);


-- 프로젝트 진행 > 프로젝트용 계정 생성
create user team identified by java1234;
grant connect, resource, dba to team;





