-- ex02_datatype



/*
ANSI-SQL 자료형
- 오라클 자료형

1. 숫자형
    - 정수, 실수
    a. number
        - (유효자리)38자리 이하의 숫자를 표현하는 자료형
        - 12345678901234567890123456789012345678
        - 5~22byte
        - 1x10^-130 ~ 9.9999x10^125
        
        - number
        - number(precision) : 전체 자릿수
        - number(precision, scale) : 전체 자릿수 + 소수이하 자릿수
        
        
        
2. 문자형
    - 문자, 문자열
    - char + String > 자바의 String과 유사
    - char vs nchar > n의 의미
    - char vs varchar > var의 의미
    a. char
        - 고정 자릿수 문자열 > 공간(컬럼)의 크기가 불변
        - char(n): n자리 문자열, n(바이트)
        - 최소 크기 : 1바이트
        - 최대 크기 : 2000바이트
        - 주어진 공간을 데이터가 채우지 못하면 나머지 공간을 스페이스로 채운다.
        
    b. nchar
        - n : national > 오라클 인코딩과 상관없이 해당 컬럼을 UTF-16 동작하게 
        - 고정 자릿수 문자열
        - nchar(n): n자리 문자열, n(문자수)
        - 최소 크기 : 1글자
        - 최대 크기 : 1000글자
    
    c. varchar2 > 가장 많이 사용
        - 가변 자릿수 문자열 > 공간(컬럼)의 크기가 가변
        - varchar2(n) : n자리 문자열, n(바이트)
        - 최소 크기 : 1바이트
        - 최대 크기 : 4000바이트
        - 주어진 공간을 데이터가 채우지 못하면 나머지 공간을 버린다. 즉 데이터의 크기가 공간의 크기가 된다.
    
    d. nvarchar2
        - n : national > 오라클 인코딩과 상관없이 해당 컬럼을 UTF-16 동작하게 
        - 가변 자릿수 문자열 > 공간(컬럼)의 크기가 가변
        - varchar2(n) : n자리 문자열, n(바이트)
        - 최소 크기 : 1글자
        - 최대 크기 : 2000글자
        - 주어진 공간을 데이터가 채우지 못하면 나머지 공간을 버린다. 즉 데이터의 크기가 공간의 크기가 된다.
    
    e. clob, nclob
        - 대용량 텍스트
        - 128TB
        - 잘 사용 안함. 참조형 느낌 > 느림
        


3. 날짜/시간형
    - 자바의 Calenar, Date
    a. date
        - 년월일시분초
        - 7byte
        - 기원전 4712년 1월 1일 ~ 9999년 12월 31일 
        
    b. timestamp
        - 년월일시분초 + 밀리초 + 나노초
        
    c. interval
        - 시간
        - 틱값 저장용
        - number로 대신 사용
        
        
        
4. 이진 데이터형
    - 비 텍스트 데이터
    - 이미지, 영상, 음악, 파일 등
    - 잘 사용 안함
    - ex) 게시판(첨부파일), 회원가입(사진) > 파일명만(문자열) 저장 > hong.jpg
    a.blob
        - 최대 128TB
        
        
****결론****
1. 숫자 > number
2. 문자 > varchar2 + char
3. 날짜 > date



테이블 선언(생성)

create table 테이블명 (
    컬럼 선언
    컬럼명 자료형,
    컬럼명 자료형,
    컬럼명 자료형
);
*/


-- *** 오라클은 사용자가 정의한 모든 식별자를 DB에 저장할때 항상 대문자로 변환해서 저장한다.(*****)


-- 식별자: 접두어
create table tblType (
    --num number
    --num number(3) > 3은 컬럼의 크기
    --num number(4,2)
    
    --str1 char(10), > str1 컬럼에는 최대 10바이트 크기의 문자를 저장
    --str2 varchar2(10)
    
    str1 nchar(10)
);

-- ORA-00955: name is already used by an existing object > 이미 type 테이블 있는데 또 만들었다.
-- 구글링 할 때, ORA-00955 검색


-- 테이블 삭제
-- drop table 테이블명;
drop table tblType;


-- ? 확인
select * from tabs; --tables > 현재 계정이 소유하고 있는 테이블 정보

select * from tabs where table_name = 'tblType'; 
select * from tabs where table_name = 'TBLTYPE'; 


-- 데이터 추가하기
insert into tblType (num) values (100); -- 정수형 리터럴
insert into tblType (num) values (3.14); -- 실수형 리터럴


insert into tblType (num) values (123); 
insert into tblType (num) values (-999); 
insert into tblType (num) values (1234); 
insert into tblType (num) values (-10000);


insert into tblType (num) values (3.12345); 
-- num number(3) > 3
-- num number(4,2) > 3.12
insert into tblType (num) values (3.12945); -- num number(4,2) 3.13
insert into tblType (num) values (3.9);  

insert into tblType (num) values (1000000000); 
insert into tblType (num) values (123456789012345678);
insert into tblType (num) values (123456789012345678901234567890); 

-- num number(3) : 3자리 숫자까지만 삽입 가능
-- 자리수 지정하는 순간 정수형 자료형

--num number(4,2) 소수 자리 포함 4자리
insert into tblType (num) values (99.99); --최대
insert into tblType (num) values (-99.99); --최소



insert into tblType (str1) values('A');
insert into tblType (str1) values('ABC');
insert into tblType (str1) values("ABC"); -- 오류, 문자열은 항상 ''
insert into tblType (str1) values('ABCABCABCA'); -- 최대 10바이트 > 영어 10글자
insert into tblType (str1) values('ABCABCABCAB'); 
-- 오류
-- ORA-12899: value too large for column "HR"."TBLTYPE"."STR1" (actual: 11, maximum: 10) > 값이 너무 크다.
insert into tblType (str1) values('가나다');
insert into tblType (str1) values('가나다라'); -- 12바이트, 에러


insert into tblType (str1, str2) values ('ABC', 'ABC');
insert into tblType (str1, str2) values ('ABCABCABCA', 'ABCABCABCA');

--@ABC       @ : char > 최대 크기에 모자란 길이만큼 스페이스(공백문자)를 채워넣는다. > 10바이트
--@ABC@ : varchar > 최대 크기와 상관없이 공간에 데이터만 들어가고 나머지 공간은 삭제된다. > 3바이트

insert into tblType (str1) values('가나다');
insert into tblType (str1) values('가나다라마바');
insert into tblType (str1) values('가나다라마바사아자차');
insert into tblType (str1) values('가나다라마바사아자차카'); -- 에러 
insert into tblType (str1) values('abcdefj');
insert into tblType (str1) values('abcdefjh'); -- 에러 



-- 데이터 가져오기
select * from tblType;




