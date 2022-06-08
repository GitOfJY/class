-- ex14_sequence



/*

    시퀀스, Sequence
    - 데이터베이스 객체 중 하나
    - 오라클 전용 객체(다른 DBMS에는 없음)
    - 일련 번호를 생성하는 객체(***)
    - (주로) 식별자를 만드는데 사용한다. > PK 컬럼에 값을 넣을 때 잘 사용한다.
    
    
    시퀀스 객체 생성하기
    - create sequence 시퀀스명;
    - create sequence 시퀀스명 
                             increment by n      -- 증감치 (양수/음수)
                             start with n        -- 시작값(seed)
                             maxvalue n          -- 최댓값
                             minvalue n          -- 최솟값
                             cycle 
                             cache n;
    
    
    시퀀스 객체 삭제하기
    - drop sequence 시퀀스명;
    
    
    시퀀스 객체 사용하기
    - 시퀀스.nextVal (*****)
    - 시퀀스.currVal

*/


create sequence seqNum;

select 10 + 20 from dual;

select sysdate from dual;

select seqNum.nextVal from dual;



drop table tblMemo;

create table tblMemo  (
    
    seq number(3) primary key,      
    name varchar2(30),   
    memo varchar2(1000),   
    regdate date 

);

create sequence seqMemo;

insert into tblMemo(seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동', '메모입니다.', sysdate);
insert into tblMemo(seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동홍길동홍길동홍길동', '메모입니다.', sysdate);


select * from tblMemo;

select seqMemo.nextVal from dual;

drop sequence seqMemo;
create sequence seqMemo start with 10;


-- 다양한 형태로 활용
-- 쇼핑몰 > 상품 테이블 > 상품번호(A10214)

select 'A' || seqNum.nextval from dual;
select 'A' || to_char(seqNum.nextVal) from dual;
select 'A' || to_char(seqNum.nextVal, '0000') from dual;
select 'A' || trim(to_char(seqNum.nextVal, '0000')) from dual;

-- seq 2개 > 관리하기 너무 힘들다.
-- 독립적으로 1개씩만 다루는 편
select 'A' || trim(to_char(seqNum.nextVal, '0000')) || 'B' || trim(to_char(seqMemo.nextVal, '0000')) from dual;


-- currVal > current Value > Peak() 역할
-- session : 현재 로그인 상태
select seqNum.currVal from dual;
-- ORA-00002: sequence SEQNUM.CURRVAL is not yet defined in this session
-- nextVal 최소 1회이상 호출해야 currVal 실행됨

select seqNum.nextVal from dual;

create sequence seqTest
                       increment by 10; -- 증감치
                       
create sequence seqTest
                       increment by -5;
                       
select seqTest.nextVal from dual; 
--  1 > 11 > 21
-- -1 > -6 > -11


create sequence seqTest
                       -- increment by 1
                       -- start with 1   > 10 > 11 > 12 > 13
                       -- maxvalue 30
                       -- minvalue 5;    > increment가 음수일 때
                       -- cycle
                       cache 20;

drop sequence seqTest;

select seqTest.nextVal from dual;







