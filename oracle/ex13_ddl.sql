-- ex13_ddl



/*

    ex01~ex12 : DML 기본
    
    DDL
    - 데이터 정의어
    - 데이터베이스 객체를 생성/수정/삭제한다.
    - 데이터베이스 객체 > 테이블, 뷰, 인덱스, 프로시저, 트리거, 제약사항, 시노닙 등
    - CREATE, ALTER, DROP
    
    
    테이블 생성하기 > 스키마 정의하기 > 속성(컬럼) 정의하기 > 속성(컬럼)의 성격(이름)과 도메인(자료형, 제약) 정의
    
    CREATE TABLE 테이블명
    (
        컬럼 정의,
        컬럼 정의,
        컬럼 정의,
        컬럼 정의        >      컬럼명 자료형(길이) NULL 제약사항
    );
    
    
    제약 사항, Constraint
    - 해당 컬럼에 들어갈 데이터(값)에 대한 조건
                > 조건에 만족하면 대입
                > 조건에 만족하지 못하면 에러 발생
    - 유효성 검사 도구
    - 데이터 무결성을 보장하기 위한 도구 (*****)
    
    
    1. NOT NULL
        - 해당 컬럼이 반드시 값을 가져야 한다.
        - 해당 컬럼에 값이 없으면 에러 발생
        - 필수값
    
    2. PRIMARY KEY, PK
        - 기본 키
        - 테이블의 행을 구분하기 위한 제약
        - 행을 식별하는 수많은 키들 중 대표로 지정한 키
        - 모든 테이블안에는 반드시 1개의 기본키가 존재해야 한다.
        - 중복값을 가질 수 없다. > unique
        - 값을 반드시 가진다.    > not null
    
    3. FOREIGN KEY
    
    4. UNIQUE
        - 유일하다. > 행들간에서 동일한 값을 가질 수 없다.
        - UNIQUE 제약은 null을 가질 수 있다. > 식별자가 될 수 있다.
        - ex) 경품
                - 고객 (번호(PK), 이름, 주소, 당첨(UQ))   
                        1. 홍길동, 서울, 1등
                        2. 아무개, 부산, null
                        3. 하하하, 서울, 2등
                        4. 호호호, 경기, 3등
                        5. 후후후, 제주, null
        - ex) 초등학교 교실
                - 학생(번호(PK), 이름, 직책(UQ))
                        1. 홍길동, 반장
                        2. 아무개, 체육부장
                        3. 하하하, 부반장
                        4. 호호호, null
                        5. 후후후, null
    
    5. CHECK
        - 사용자 정의 제약 조건
        - where절과 동일한 조건을 컬럼에 적용한다.
    
    6. DEFAULT
        - 기본값 설정
        - insert/update 작업 때 컬럼값을 대입하지 않으면(null을 넣게되면) null 대신 미리 설정한 값을 넣는다.
    

*/

-- 메모 테이블
create table tblMemo  (

    -- 컬럼명 자료형(길이) NULL 제약사항 (null 생략가능)
    -- seq number(3)  (null 생략가능) ,       
    seq number(3) null,                         -- 메모번호
    name varchar2(30) null,                     -- 작성자
    memo varchar2(1000) null,                   -- 메모
    regdate date null                           -- 작성날짜

);

select * from tblMemo;


insert into tblMemo(seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (2, '아무개', null, sysdate);
insert into tblMemo(seq, name, memo, regdate) values (3, null, null, null);
insert into tblMemo(seq, name, memo, regdate) values (null, null, null, null);                       -- 절대 생성 금지!, 테이블 설계부터 잘못됨
insert into tblMemo(seq, name, memo, regdate) values (4, '홍길동', '테스트', '2022-01-01');           -- 문자열 > 날짜 자동 형변환

insert into tblMemo(seq, name, memo, regdate) values (5, '홍길동', '테스트', '2022-01-01 12:30:00');
-- 2022-01-01 12:30:00
-- ORA-01861: literal does not match format string
-- 환경(클라이언트툴)에 따라 가능/불가능 > 불안정한 코드, 사용 금지

insert into tblMemo(seq, name, memo, regdate) values (5, '홍길동', '테스트', to_date('2022-01-01 12:30:00', 'yyyy-mm-dd hh24:mi:ss'));
-- 문자열 > 날짜로 변경하고 삽입, 정석



drop table tblMemo;



create table tblMemo  (
 
    seq number(3) not null,                   -- 메모번호 (NN)
    name varchar2(30) null,                   -- 작성자
    memo varchar2(1000) not null,             -- 메모 (NN)
    regdate date null                         -- 작성날짜

);

select * from tblMemo;

insert into tblMemo(seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (2, '아무개', null, sysdate);
-- ORA-01400: cannot insert NULL into ("HR"."TBLMEMO"."MEMO")
insert into tblMemo(seq, name, memo, regdate) values (2, '아무개', ' ', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (2, '아무개', '', sysdate);
-- ORA-01400: cannot insert NULL into ("HR"."TBLMEMO"."MEMO")
-- '' null과 같은 것, 스페이스는 글자 취급



drop table tblMemo;



create table tblMemo  (
 
    seq number(3) primary key,                -- 메모번호, primary key > 자동 NOT NULL 설정
    name varchar2(30) null,                   -- 작성자
    memo varchar2(1000) not null,             -- 메모 (NN)
    regdate date null                         -- 작성날짜

);


select * from tblMemo;


insert into tblMemo(seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);
-- ORA-00001: unique constraint (HR.SYS_C007084) violated
-- primary key에 중복값을 넣어서 에러 발생

insert into tblMemo(seq, name, memo, regdate) values (null, '홍길동', '메모입니다.', sysdate);
-- ORA-01400: cannot insert NULL into ("HR"."TBLMEMO"."SEQ")

insert into tblMemo(seq, name, memo, regdate) values (2, '홍길동', '메모입니다.', sysdate);
-- primary key외에 중복값 넣어도 가능하다.



drop table tblMemo;



create table tblMemo  (
 
    seq number(3) ,            
    name varchar2(30) null,        
    memo varchar2(1000) null,    
    regdate date null                 

);

select * from tblMemo where seq = 1;

insert into tblMemo(seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (2, '아무개', null, sysdate);
-- 1~ 3행까지 구분 불가능



drop table tblMemo;



create table tblMemo  (
 
    seq number(3) primary key,             -- 메모번호 (PK)
    name varchar2(30) unique null,         -- 작성자 (UQ)
    memo varchar2(1000) not null,          -- 메모 (NN)
    regdate date null                      -- 작성날짜
    
    );


select * from tblMemo;

insert into tblMemo(seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (2, '홍길동', '메모입니다.', sysdate);
-- ORA-00001: unique constraint (HR.SYS_C007088) violated > unique 제약

insert into tblMemo(seq, name, memo, regdate) values (2, '아무개', '메모입니다.', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (3, null, '메모입니다.', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (4, null, '메모입니다.', sysdate);
-- null은 중복이 아니다.



drop table tblMemo;



create table tblMemo  (
 
    seq number(3) primary key,                                                                   -- 메모번호 (PK)
    name varchar2(30) ,                                                                          -- 작성자 
    memo varchar2(1000),                                                                         -- 메모
    regdate date,                                                                                -- 작성날짜
    priority number check (priority between 1 and 3),                                            -- 1(중요), 2(보통), 3(안중요)
    category varchar2(30) check (category in ('할일', '장보기', '공부', '가족', '친구'))          -- 할일, 장보기, 공부, 가족, 친구
    
    );


select * from tblMemo;


insert into tblMemo(seq, name, memo, regdate, priority, category) 
        values (1, '홍길동', '메모입니다.', sysdate, 1, '할일');
        
insert into tblMemo(seq, name, memo, regdate, priority, category) 
        values (2, '홍길동', '메모입니다.', sysdate, 5, '할일');
-- ORA-02290: check constraint (HR.SYS_C007089) violated > 체크제약 위반, C007089

insert into tblMemo(seq, name, memo, regdate, priority, category) 
        values (2, '홍길동', '메모입니다.', sysdate, 2, 'error test');
-- ORA-02290: check constraint (HR.SYS_C007090) violated > 체크제약 위반, C007090

insert into tblMemo(seq, name, memo, regdate, priority, category) 
        values (2, '홍길동', '메모입니다.', sysdate, 2, null); -- 에러 X

insert into tblMemo(seq, name, memo, regdate, priority, category) 
        values (3, '홍길동', '메모입니다.', sysdate, null, null); -- 에러 X
-- 체크 옵션과 not null 옵션은 별개 > 값이 있을 때만 체크 옵션 실행



drop table tblMemo;



create table tblMemo  (
 
    seq number(3) primary key,                                                     -- 메모번호 (PK)
    name varchar2(30) default '익명',                                              -- 작성자 
    memo varchar2(1000),                                                           -- 메모
    regdate date                                                                   -- 작성날짜
    
    );

select * from tblMemo;

insert into tblMemo(seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);

insert into tblMemo(seq, name, memo, regdate) values (2, null, '메모입니다.', sysdate);
-- name > (null)
-- 개발자의 의도 null 표현 O

insert into tblMemo(seq, memo, regdate) values (3, '메모입니다.', sysdate);
-- name > 익명 > 소극적인 default 실행 방법 (암시적)
-- 개발자의 의도 null 표현 X

insert into tblMemo(seq, name, memo, regdate) values (4, default, '메모입니다.', sysdate);
-- name > 익명 > 적극적인 default 실행 방법 (명시적)



drop table tblMemo;



create table tblMemo  (
 
    seq number(3) primary key,                                                       -- 메모번호 (PK)
    name varchar2(30) default '익명',                                                -- 작성자 
    memo varchar2(1000),                                                             -- 메모
    regdate date default sysdate                                                     -- 작성날짜
    
    );

select * from tblMemo;

insert into tblMemo(seq, name, memo) values (1, '홍길동', '메모입니다.');



/*


    DDL > 테이블 생성 > 컬럼 생성 = 컬럼명 + 자료형(길이) + 제약사항
    1. not null
    2. primary ket = not nukk + unique
    3. unique
    4. check
    5. default
    6. foreign


    제약 사항 만드는 방법
    
    1. 컬럼 수준에서 만드는 방법
        - 위에서 수업한 방법
        - 컬럼을 선언할 때 제약 사항도 같이 정의하는 방법
        
    
    2. 테이블 수준에서 만드는 방법
        - 컬럼 정의와 제약 사항 정의를 분리시킨 방법
        - 제약 사항만 따로 정의 > 관리 차원
        - not null, default > 컬럼 수준에서만 정의 가능
        
        
    3. 외부에서 만드는 방법
        - alter 명령어

*/



drop table tblMemo;

create table tblMemo  (
 
    seq number(3),                                    
    name varchar2(30) not null,                  
    memo varchar2(1000) null,                                           
    regdate date,
    
    -- 테이블 수준의 제약사항 정의
    -- 제약사항명 : 테이블명_컬럼명_제약사항
    -- not null, default > 컬럼 수준에서만 가능하다.
    constraint tblmemo_seq_pk primary key(seq),
    constraint tblmemo_name_uq unique(name),
    constraint tblememo_memo_ch check(length(memo) >= 10)
    
    );


insert into tblMemo(seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', sysdate);
-- ORA-00001: unique constraint (HR.TBLMEMO_SEQ_PK) violated
-- ORA-00001: unique constraint (HR.SYS_C007088) violated
-- ORA-02290: check constraint (HR.TBLEMEMO_MEMO_CH) violated


