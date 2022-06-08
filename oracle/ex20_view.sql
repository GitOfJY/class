-- ex20_view



/*
    
    View, 뷰
    - 데이터베이스 객체 중 하나 ( CREATE/ALER/DROP > 테이블, 시퀀스, 제약사항, 뷰 )
    - 가상 테이블, 복사 테이블, 뷰 테이블 등 
    - 테이블처럼 사용한다. (****)
    - 반복된 SELECT 또는 긴 SELECT > 뷰 생성 > 효과적
    - 뷰 정의 > SQL 저장한 객체 (*******) > 데이터 저장 X
    
    
    CREATE VIEW 뷰이름
    AS
    SELECT 문;
    
    CREATE OR REPLACE VIEW 뷰이름
    AS
    SELECT 문;
    
    
    - 뷰 사용 용도? 쿼리의 양을 줄이는게 목적
    - select * from tblInsa where buseo = '영업부'    vs    select * from vwInsa

*/


create view vwInsa
as
select * from tblInsa;


select * from vwInsa; -- tblInsa처럼 행동


create or replace view vwInsa
as
select * from tblInsa where buseo = '영업부';

select * from vwInsa;


-- 비디오 가게 사장 > 하루 업무
select
    m.name as mname,
    v.name as vname,
    to_char(r.retdate, 'yyy-mm-dd') as rentdate,
    case
        when r.retdate is not null then '반납완료'
        else '미완료'
    end as state
from tblRent r
    inner join tblVideo v
        on v.seq = r.video
            inner join tblMember m
                on m.seq = r.member;


insert into 대여체크 values ('홍길동', '영구와 땡칠이', sysdate, '미완료');


create or replace view 대여체크
as
select
    m.name as mname,
    v.name as vname,
    to_char(r.retdate, 'yyy-mm-dd') as rentdate,
    case
        when r.retdate is not null then '반납완료'
        else '미완료'
    end as state
from tblRent r
    inner join tblVideo v
        on v.seq = r.video
            inner join tblMember m
                on m.seq = r.member;


select * from 대여체크;


-- tblInsa > 서울 직원 > view
create or replace view vwSeoul
as
select * from tblInsa where city = '서울'; -- 뷰를 만드는 시점 > 20명
select * from (select * from tblInsa where city = '서울');   --B. 익명. 이름이 없는 뷰 > 인라인 뷰


select * from vwSeoul; -- 20명


update tblInsa set city = '제주' where num in (1001, 1005, 1008);


select * from tblInsa where city = '서울'; -- 17명


select * from vwSeoul; -- 17명 (원본 테이블의 변화 동기화) > select 결과가 아니라 select 자체를 저장


select * from vwSeoul;                                          -- 실명. 이름이 있는 뷰 > 뷰
select * from (select * from tblInsa where city = '서울');      -- 익명. 이름이 없는 뷰 ? 인라인 뷰


-- 권한 > 계정별로 객체에 대한 접근/조작 등을 통제

select * from tblInsa;           -- 신입, tblInsa 접근권한 x

create or replace view 신입전용
as
select num, ssn, city from tblInsa;

select * from 신입전용;         -- 신입, 신입전용 접근권한o




create or replace view vwTodo
as
select * from tblTodo;


-- 뷰 사용
-- 1. SELECT   > 실행 o > 뷰는 읽기 전용으로 사용한다. (*****) == 읽기 전용 테이블
-- 2. INSERT   > 실행 o > 절대 사용 금지 > 직접 테이블 처리
-- 3. UPDATE   > 실행 o > 절대 사용 금지 > 직접 테이블 처리
-- 4. DELETE   > 실행 o > 절대 사용 금지 > 직접 테이블 처리


select * from vwTodo; -- 단순뷰 > 뷰의 SELECT거 1개의 테이블로 구성
insert into vwTodo values (21, '오라클정의하기', sysdate, null);
update vwTodo set vompletedate = sysdate where seq = 21;
delete from vwTodo where seq = 21;


select * from 대여체크; -- 복합뷰 > 2개 이상의 테이블을 SELECT 
insert into 대여체크 values ('홍길동', '영구와땡칠이', sysdate, '미완료');



