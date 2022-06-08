-- ex31_index



/*

    인덱스, index
    - 검색을 빠른 속도로 하기 위해서 사용하는 도구
    - SQL 명령 처리 속도를 빠르게 하기 위해서 특정 컬럼에 대해 생성되는 검색 도구
    - b-tree 구조

    ex)
    도서
    - 앞장 > 목차
    - 뒷장 > 인덱스
    
    데이터베이스
    - 테이블내의 레코드 순서는 우리가 원하는 정렬 상태가 아니다. > 정렬 개념 x
    - 어떤 데이터 검색 > 처음~끝까지 차례대로 검색 > table full scan
    - 특정 컬럼 선택 > 별도의 테이블에 복사 > 미리 정렬(***) > 인덱스
    - 원본 테이블 <- 참조 -> 인덱스
    
    인덱스 장단점
    - 처리 속도를 향상 시킨다.
    - 지나친 인덱스 사용은 전체적인 DB 성능을 저하시킨다.
    
    자동으로 인덱스가 걸리는 컬럼
    1. primary key
    2. unique
    - *** 일반 테이블에서 PK 컬럼을 검색하는 속도 >> 일반 테이블에서 PK가 아닌 컬럼을 검색하는 속도
    
    인덱스를 사용해야 하는 경우
    1. 테이블에 데이터(행)가 너무 많을 때
    2. where절에 사용되는 횟수가 많은 컬럼에 적용 (**********)
    3. join에 조건으로 사용되는 컬럼에 적용 PK-FK (**********) > 속도가 빨라짐
    4. 인덱스의 손익분기점 > 검색 결과가 10~15% 이하인 경우
    5. null을 포함하는 경우 > null 인덱스에서 제외
    
    인덱스를 사용하지 말아야 하는 경우
    1. 테이블에 데이터(행)가 적은 경우 (의미 없음)
    2. 인덱스의 손익분기점 > 검색 결과가 10~15% 이상인 경우
    3. 해당 테이블이 삽입, 수정, 삭제가 빈번할 경우 (***************)
    
*/


create table tblIndex
as
select * from tblInsa;

select * from tblIndex;
select count(*) from tblIndex;

insert into tblIndex select * from tblIndex;
-- 7,864,320개 


select * from tblIndex where name = '홍길동';
-- 인덱스없이 검색
select distinct name from tblIndex where name = '홍길동';

-- 시간 확인 + f5
set timing on;

select distinct name from tblIndex where name = '홍길동';
-- 홍길동
-- 경과 시간: 00:00:00.776

-- SQL 실행
-- 1. ctrl + enter > 결과 > 테이블 출력
-- 2. F5           > 결과 > 텍스트 출력


-- 인덱스 생성
create index idxName on tblIndex(name);

select distinct name from tblIndex where name = '홍길동';
-- 경과 시간: 00:00:00.009





/*

    인덱스 종류
    1. 고유 인덱스
    2. 비고유 인덱스
    3. 단일 인덱스
    4. 복합 인덱스
    5. 함수기반 인덱스

*/


-- 고유 인덱스
-- : 색인의 값 중복이 불가능하다.
-- : PK, UNIQUE
create unique index idxName on tblIndex(name); -- 동명이인 없는 경우


-- 비고유 인덱스
-- : 색인의 값 중복이 가능하다.
-- : 일반 컬럼
create index idxBuseo on tblIndex(buseo);


-- 단일 인덱스
-- : 컬럼 1개를 대상
create index idxBuseo on tblLindex(buseo);
select * from tblIndex where buso = '기획부'; -- 인덱스 효과 o
select * from tblIndex where buseo = '기획부' and name = '홍길동'; -- 인덱스 효과 x


-- 복합(결합) 인덱스
-- : 컬럼 N개를 대상
create index indexBuseoName on tblIndex(buseo, name); -- 경과 시간: 00:00:16.316
select * from tblIndex where buseo = '기획부' and name = '홍길동'; -- 인덱스 효과 o


-- 함수 기반 인덱스
select count(*) from tblIndex where substr(ssn, 8, 1) = '1'; -- 2.084초
create index idxSSN on tblIndex(ssn);
select count(*) from tblIndex where substr(ssn, 8, 1) = '1'; -- 1.859초
create index idxSSN2 on tblIndex(substr(ssn, 8, 1));
select count(*) from tblIndex where substr(ssn, 8, 1) = '1'; -- 0.651초


-- 더미 데이터 확보 + 업무 SQL 테스트 > 평균 시간 > index > 검토 > index > 검토 반복










