-- ex19_join



/*
    
    관계형 데이터베이스 시스템이 지양하는 것들 (테이블 설계가 잘못되었을 때)
    - 테이블 다시 수정해야 고쳐지는 것들
    1. 테이블에 기본키가 없는 상태 > 데이터 조작 곤란
    2. null이 많은 상태의 테이블 > 공간 낭비
    3. 데이터가 중복되는 상태 > 공간 낭비 + 데이터 관리 곤란
    4. 하나의 속성값이 원자값이 아닌 상태 > 더 이상 쪼개지지 않는 값을 넣어야한다.




1.
create table tblTest (
    name varchar2(30) not null,
    age number(3) not null,
    nick varchar2(30) not null,
    id varchar2(30) not null
);

- 홍길동, 20,    바보, hong
- 아무개, 25,    천재, any
- 테스트, 22, 멍청이, test
- 홍길동, 20,    바보, hong   > 물리적 문제? > 구별할 수 있는 '기본키' 필요

- 홍길동 별명 수정 
    update tblTest set nick = '고양이' where name = '홍길동'; > 이름/나이/별명/아이디 모두 식별 불가
- 홍길동 탈퇴
    delete from tblTest where 조건;



2.
create table tblTest (
    name varchar2(30) primary key,
    age number(3) not null,
    hobby1 varchar2(30) null,
    hobby2 varchar2(30) null,
    hobby3 varchar2(30) null,
    ...
    hobby8 varchar2(300) null
);

-- 홍길동, 20, 독서, null, null, null, null, null, null, null
-- 아무개, 25, 달리기, 헬스, 게임
-- 테스트, 22, 달리기, 헬스, 게임, 독서, 낮잠, 맛집, 여행, 코딩
-- 홍길동, 20, 독서, null, null, null, null, null, null, null
-- 홍길동, 20, 독서, null, null, null, null, null, null, null
-- 홍길동, 20, 독서, null, null, null, null, null, null, null
-- 홍길동, 20, 독서, null, null, null, null, null, null, null

*/


-- 직원 정보 table tblStaff
-- 직원 (번호(PK), 직원명, 급여, 거주지, 담당프로젝트)

create table tblStaff (
    seq number primary key,
    name varchar2(30) not null,
    salary number not null,
    address varchar2(300) not null,
    project varchar2(300) null
);

insert into tblStaff(seq, name, salary, address, project)
    values (1, '홍길동', 300, '서울시', '홍콩 수출');
insert into tblStaff(seq, name, salary, address, project)
    values (2, '아무개', 250, '인천시', 'TV 광고');
insert into tblStaff(seq, name, salary, address, project)
    values (3, '하하하', 350, '의정부시', '매출 분석');
    
-- '홍길동'에게 담당 프로젝트가 1건 추가 > '고객 관리'
insert into tblStaff(seq, name, salary, address, project)
    values (4, '홍길동', 300, '서울시', '고객 관리');
    
-- '호호호' 직원 추가 + '게시판 관리, 회원 응대'
insert into tblStaff(seq, name, salary, address, project)
    values (5, '호호호', 300, '서울시', '게시판 관리, 회원 응대');
    
-- 'TV 광고' 담당자 호출
select name from tblStaff where project = 'TV 광고';

-- 'TV 광고' > 'SNS 광고'
update tblStaff set project = 'SNS 광고' where project = 'TV 광고'; 
-- 조심 > 맞을 때도 있고 틀릴 때도 있다. > 레코드 값이 'TV 광고' 유일하지 않을 수 있다. (중복값)

-- '회원 응대' 담당자 호출
-- 문제점 : 데이터가 원자값이 아니다.
select name from tblStaff where project = '회원 응대';
select name from tblStaff where instr(project, '회원 응대') > 0;

-- '회원 응대' > '고객 불만 대응'
-- 문제점 : 데이터가 원자값이 아니다.
update tblStaff set project = '고객 불만 대응' where instr(project, '회원 응대') >0;

-- '홍길동' > 연봉 인상 > 350만원
update tblStaff set salary = 350 where seq = 1;

-- 급여 지급 > 담당자 > '홍길동' 급여 확인
-- 문제점 : 동일한 데이터'홍길동' 2번 이상 저장 > 350, 300 > 테이블 설계 문제
select * from tblStaff where name = '홍길동'; 



drop table tblStaff;



-- 직원 정보 table tblStaff
-- 직원 (번호(PK), 직원명, 급여, 거주지)
create table tblStaff (
    seq number primary key,
    name varchar2(30) not null,
    salary number not null,
    address varchar2(300) not null
);


-- 프로젝트 정보
-- 프로젝트(프로젝트 번호(PK), 프로젝트명, 직원 번호)
create table tblProject (
    seq number primary key,            -- 프로젝트 번호 (PK)
    project varchar2(30) not null,       -- 프로젝트 명
    staff_seq number not null           -- 직원번호
);


insert into tblStaff (seq, name, salary, address) values (1, '홍길동', 300, '서울시');
insert into tblStaff (seq, name, salary, address) values (2, '아무개', 250, '인천시');
insert into tblStaff (seq, name, salary, address) values (3, '하하하', 3500, '부산시');

insert into tblProject ( seq, project, staff_seq) values (1, '홍콩 수출', 1);       -- 홍길동
insert into tblProject ( seq, project, staff_seq) values (2, 'TV 광고', 2);         -- 아무개
insert into tblProject ( seq, project, staff_seq) values (3, '매출 분석', 3);       -- 하하하
insert into tblProject ( seq, project, staff_seq) values (4, '노조 협상', 1);       -- 홍길동
insert into tblProject ( seq, project, staff_seq) values (5, '대리점 분양', 2);    -- 아무개


-- 1. 원자값 보장
-- 2. 데이터 중복 없음
select * from tblStaff;
select * from tblProject;

-- A. 신입 사원 입사 > 신규 프로젝트 담당
-- A.1 신입 사원 추가
insert into tblStaff (seq, name, salary, address) values (4, '호호호', 250, '성남시');

-- A.2 신규 프로젝트 추가
insert into tblProject (seq, project, staff_seq) values (6, '자제 매입', 4);

-- A.3 신규 프로젝트 추가 > 문제 발생 > 논리 오류, 5번은 없는 사람
insert into tblProject (seq, project, staff_seq) values (7, '고객 유치', 5);

-- '고객 유치' 담당자
select staff_seq from tblProject where project = '고객 유치';
select * from tblStaff where seq = 5;
select * from tblStaff where seq = (select staff_seq from tblProject where project = '고객 유치');

-- B. '홍길동' 퇴시
-- B.1 '홍길동' 삭제 > 문제 발생
delete from tblStaff where seq = 1;

select * from tblStaff where seq = (select staff_seq from tblProject where project = 'TV 광고');
select * from tblStaff where seq = (select staff_seq from tblProject where project = '홍콩 수출');

-- B.2 '아무개' 퇴사 > 인수인계 (위임)
update tblProject set staff_seq = 3 where staff_seq = 2;
update tblProject set staff_seq = (select seq from tblStaff where name = '하하하') 
    where staff_seq = (select seq from tblStaff where name = '아무개');

-- B.3 '아무개' 퇴사 > 삭제
delete from tblStaff where seq = 2;

drop table tblStaff;
drop table tblProject;




create table tblStaff (                                               -- 부모 테이블 (먼저 생성, 참조 당하는 것)
    seq number primary key,
    name varchar2(30) not null,
    salary number not null,
    address varchar2(300) not null
);

create table tblProject (                                             -- 자식 테이블 (나중에 생성, 참조하는 것)
    seq number primary key,                                           -- 프로젝트 번호 (PK)
    project varchar2(30) not null,                                    -- 프로젝트 명
    staff_seq number not null references tblStaff(seq)                -- 직원번호, 외래키(참조키)
);

insert into tblStaff (seq, name, salary, address) values (1, '홍길동', 300, '서울시');
insert into tblStaff (seq, name, salary, address) values (2, '아무개', 250, '인천시');
insert into tblStaff (seq, name, salary, address) values (3, '하하하', 350, '부산시');

insert into tblProject ( seq, project, staff_seq) values (1, '홍콩 수출', 1);       -- 홍길동
insert into tblProject ( seq, project, staff_seq) values (2, 'TV 광고', 2);         -- 아무개
insert into tblProject ( seq, project, staff_seq) values (3, '매출 분석', 3);       -- 하하하
insert into tblProject ( seq, project, staff_seq) values (4, '노조 협상', 1);       -- 홍길동
insert into tblProject ( seq, project, staff_seq) values (5, '대리점 분양', 2);     -- 아무개

insert into tblStaff (seq, name, salary, address) values (4, '호호호', 250, '성남시');
insert into tblProject (seq, project, staff_seq) values (6, '자제 매입', 4);

insert into tblProject (seq, project, staff_seq) values (7, '고객 유치', 5);
-- ORA-02291: integrity constraint (HR.SYS_C007128) violated - parent key not found

delete from tblStaff where seq =1;
-- ORA-02292: integrity constraint (HR.SYS_C007128) violated - child record found

update tblProject set staff_seq = (select seq from tblStaff where name = '하하하') 
    where staff_seq = (select seq from tblStaff where name = '홍길동');
delete from tblStaff where seq =1;

select * from tblStaff;
select * from tblProject;



-- 고객 테이블
create table tblCustomer (
    seq number primary key,            -- 고객 번호 (PK)
    name varchar2(30) not null,        -- 고객 명
    tel varchar2(15) not null,         -- 연락처
    address varchar2(100) not null     -- 주소
);


-- 판매 내역 테이블
create table tblSales (
    seq number primary key,                                -- 판매번호(PK)
    item varchar2(50) not null,                            -- 제품명
    qty number not null,                                   -- 판매수량
    regdate date default sysdate not null,                 -- 판매날짜
    cseq number not null references tblCustomer(seq)       -- 판매한 고객 번호(FK)
);

select * from tblCustomer;
select * from tblSales;





-- [비디오 대여점]

-- 장르 테이블
create table tblGenre (
    seq number primary key,          -- 장르 번호 (PK)
    name varchar2(30) not null,      -- 장르명
    price number not null,           -- 대여 가격
    period number not null           -- 대여기간(일)
);

-- 비디오 테이블
create table tblVideo (
    seq number primary key,                                  -- 비디오 번호 (PK)
    name varchar2(100) not null,                             -- 비디오 제목
    qty number not null,                                     -- 보유 수량
    company varchar2(50) null,                               -- 제작사
    director varchar2(50) null,                              -- 감독
    major varchar2(50) null,                                 -- 주연배우
    genre number not null references tblGenre(seq)           -- 장르번호 (FK)
);

-- 고객 테이블
create table tblMember (
    seq number primary key,                                  -- 회원 번호 (PK)
    name varchar2(100) not null,                             -- 고객명
    grade number(1) not null,                                -- 고객 등급 (1,2,3)
    byear number(4) not null,                                -- 생년
    tel varchar2(15) not null,                               -- 연락처
    address varchar2(300) null,                              -- 주소
    money number not null                                    -- 예치금
);

-- 대여 테이블
create table tblRent (
    seq number primary key,                                     -- 대여번호 (PK)
    member number not null references tblMember(seq),           -- 회원번호(FK)
    video number not null references tblVideo(seq),             -- 비디오 번호 (FK)
    rentdate date default sysdate not null,                     -- 대여 시각
    retdate date null,                                          -- 반납 시각
    remark varchar2(500) null                                   -- 비고
);


-- 장르 <- 비디오 <- 대여 -> 고객
select * from tblGenre;
select * from tblVideo;
select * from tblMember;
select * from tblRent;


/*

    조인, Join
    - (서로 관계를 맺은) 2개(1개) 이상의 테이블을 1개의 결과셋을 만드는 기술
    
    조인의 종류
    1. 단순 조인, CROSS JOIN, 카티션곱(데카르트곱)
    2. 내부 조인, INNER JOIN (*****)
    3. 외부 조인, OUTER JOIN (*****)
    4. 셀프 조인, SELF JOIN
    5. 전체 외부 조인, FULL OUTER JOIN
    
    
    1. 단순 조인, CROSS JOIN, 카티션곱(데카르트곱)
        SELECT 컬럼리스트 FROM 테이블A CROSS JOIN 테이블B;
        SELECT 컬럼리스트 FROM 테이블A, 테이블B;
        A 테이블 레코드 개수 * B 테이블 레코드 개수 = 결과셋 레코드 개수
        - 쓸모없다. > 가치있는 행과 가치없는 행이 뒤섞여 있다.
        - 결과셋 행 개수    > 27개 ( 3 * 9 )
        - 결과셋 컬럼 개수 >  9개 ( 4 + 5 )
        
        
    2. 내부 조인, INNER JOIN (*****)
        SELECT 컬럼리스트 FROM 테이블A INNER JOIN 테이블B ON 테이블A.PK = 테이블B.FK         -- ANSI-SQL
        SELECT 컬럼리스트 FROM 테이블A, 테이블B WHERE 테이블A.PK = 테이블B.FK                -- ORACLE
        - 단순 조인에서 유효한 레코드만 추출한 조인
        
        SELECT
            칼럼리스트
        FROM 테이블A
            INNER JOIN 테이블B
                on 테이블A.PK = 테이블B.Fk;
             

    3. 외부 조인, OUTER JOIN (*****)
                SELECT 컬럼리스트 FROM 테이블A (LEFT|RIGTH) OUTER JOIN 테이블B ON 테이블A.PK = 테이블B.FK    -- ANSI-SQL
        - 내부 조인의 반대 (X)
        - 내부 조인 결과 + 결과셋에 포함되지 못한 부모 테이블의 나머지 레코드를 합하는 행동
        
         SELECT 
            칼럼리스트
         FROM 테이블A
            (LEFT|RIGHT) OUTER JOIN 테이블B
                on 테이블A.PK = 테이블B.Fk;
        
        
    4. 셀프 조인, SELF JOIN
        - 1개의 테이블을 사용해서 조인
        - 테이블이 스스로 관계를 맺는 경우
        
        - 다중 조인(2개) + 내부 조인
        - 다중 조인(2개) + 외부 조인
    
        - 셀프 조인(1개) + 내부 조인
        - 셀프 조인(1개) + 외부 조인
    
    
    5. 전체 외부 조인, FULL OUTER JOIN
        - 서로 참조하고 있는 관계에서만 사용이 가능한 조인
        - 관리가 힘들어서 잘 사용하지 않음
    
    
    
    - 단순 조인 > 테이블 행 * 테이블 행 > 유효o + 유효x > 더미 데이터
    - 내부 조인 > 단순 조인 결과 유효한 행만 추출 (양쪽 테이블 모두 존재하는 데이터만 가져온다.)
     
     
     - 다중 조인(2개) + 내부 조인
     - 다중 조인(2개) + 외부 조인
     - 셀프 조인(1개) + 내부 조인
     - 셀프 조인(1개) + 외부 조인
     
*/


-- 1. 단순 조인, CROSS JOIN, 카티션곱(데카르트곱)

select * from tblCustomer;    -- 3명
select * from tblSales;       -- 9권

select * from tblCustomer cross join tblSales;     -- ANSI-SQL (권장)
select * from tblCustomer, tblSales;               -- Oracle



-- 2. 내부 조인, INNER JOIN 
-- 담당하는 프로젝트명을 포함해서 직원 명단을 가져오시오. 
select * from tblStaff;
select * from tblProject;

select * from tblStaff cross join tblProject;

select 
    name, project 
from tblStaff 
    inner join tblProject 
        on tblStaff.seq = tblProject.staff_seq;


-- 고객 정보와 판매내역을 가져오기 > 고객명, 연락처, 어떤 물건, 몇개?
-- tnlCustomer(고객명, 연락처), tblSales(어떤 물건, 몇개)
-- 대부분의 상황에서 내부 조인의 결과는 자식 테이블 레코드와 동일한 레코드가 나온다. (*****)
-- 대부분의 상황에서 내부 조인의 결과는 부모 테이블 레코드가 반복되는 현상이 생긴다. (*****)
select
   name,
   tel,
   item,
   qty
from tblCustomer 
    inner join tblSales
        on tblCustomer.seq = tblSales.cseq;
        -- on 부모테이블.PK = 자식테이블.FK


select * from tblGenre; -- Parent Table
select * from tblVideo; -- Children Table


-- 비디오 제목과 대여 가격 출력하시오.
-- 순서 상관 없지만 from 부모 테이블 inner join 자식 테이블로 맞춰서 하기
select 
    --name
    --ORA-00918: column ambiguously defined
    tblVideo.name,
    price
from tblGenre
    inner join tblVideo
        on tblGenre.seq = tblVideo.genre;


select 
    tblVideo.name,
    tblGenre.price      -- name과 형식 유지
from tblGenre
    inner join tblVideo
        on tblGenre.seq = tblVideo.genre;
        

select 
    v.name,
    g.price
from tblGenre g             -- 테이블명에 alias 붙이기
    inner join tblVideo V
        on g.seq = v.genre;


select * from tblMan;
select * from tblWoman;

select 
    m.name as "남자 이름",
    w.name as "여자 이름"
from tblMan m
    inner join tblWoman w
        on m.couple = w.name;


-- 고객명 + 판매물품명 가져오시오.
select * from tblCustomer;
select * from tblSales;

-- 1. 조인 (고비용 + 속도 느림)
select 
    c.name as "고객명",
    s.item as "판매물품명"
from tblCustomer c 
    inner join tblSales s
        on c.seq = s.cseq;

-- 2. 서브쿼리 (저비용 + 속도 빠름)
select
    -- cseq as "고객번호",
    (select name from tblCustomer where seq = tblSales.cseq) as "고객명",
    item as "판매물품명"
from tblSales; -- 자식 테이블 


select * from tblGenre;     -- 부모
select * from tblVideo;     -- 자식       부모
select * from tblRent;      --                   자식


-- 3개의 테이블 조인
select
    v.name,           -- 어떤 비디오를
    r.rentdate,       -- 언제
    g.price           -- 얼마
from tblGenre g                                     -- tblGenre x tblVideo
    inner join tblVideo v                           -- tblGenre x tblVideo
        on g.seq = v.genre                          -- tblGenre x tblVideo
            inner join tblRent r                    -- tblVideo x tblRent
                on r.video = v.seq;                 -- tblVideo x tblRent
                                                    -- tblGenre x tblVideo x tblRent
                                                          

-- 4개의 테이블 조인
select
    -- * 조인의 결과에는 *를 잘 사용하지 않는다.
    m.name as "회원명",
    v.name as "비디오명",
    r.rentdate as "언제",
    g.price as "가격"
from tblGenre g
    inner join tblVideo v
        on g.seq = v.genre
            inner join tblRent r
                on v.seq = r.video
                    inner join tblMember m
                        on m.seq = r.member;


-- 100% 쓸모없는 결과
-- 가장 이상적인 것 > 부모와 자식 데이터를 조인
select * from tblStaff;  -- 직원
select * from tblSales; -- 판매

select * from tblStaff f 
    inner join tblSales e 
        on f.seq = e.cseq; -- 아무 상관없는 관계


-- HR > 7개 테이블 (employees, jobs, departments, locations, countries, regions, job_history)
select * from employees;    -- 직원 정보
select * from departments;  --직원들의 부서 정보
select * from locations;    --부서가 위치한 지역 정보
select * from countries;    -- 지역이 속한 국가 정보
select * from regions;      -- 국가가 속한 대륙 정보

select * from jobs;         -- 직원들의 직업 정보
select * from job_history;  --직원들이 이직 이력


select
    e.first_name||' '|| e.last_name as "직원명",
    d.department_name as "부서명",
    l.city as "도시명",
    c.country_name as "국가명",
    r.region_name as "대륙명",
    j.job_title as "직업"
from employees e
    inner join departments d
        on d.department_id = e.department_id
            inner join locations l
                on l.location_id = d.location_id
                    inner join countries c
                        on c.country_id = l.country_id
                            inner join regions r
                                on r.region_id = c.region_id
                                    inner join jobs j
                                        on j.job_id = e.job_id;





-- 3. 외부 조인, OUTER JOIN (*****)

select * from tblCustomer;    -- 4명 > 3명 구매이력 있음, 1명 구매이력 없음
select * from tblSales;       -- 9명 > 3명의 구매이력

insert into tblCustomer values (4, '호호호', '010-1234-5678', '서울시');


-- 9개 > 9개
-- 문장 : 절의 실행 순서대로 읽는 연습 + 부드럽게(업무 상) 표현
-- + A > 물건을 한번이라도 구매한 이력이 있는 고객의 정보와 그 고객이 사간 판매내역을 가져오시오. (*********)

-- 내부 조인 > 두 테이블에 동시에 존재하는 정보만 가져온다. (********)
-- 한번이라도 구매한 이력이 있는 > 회원 정보 o + 그 회원 구매한 정보 o > 가져옴
select * from tblCustomer c  
    inner join tblSales s
        on c.seq = s.cseq;

-- 구매 이력과 상관없이 > 모든 고객 정보 + 구매한 이력 > 가져옴
select * from tblCustomer c
    cross join tblSales s;

select
    *
from tblCustomer c 
    left outer join tblSales s -- 방향 > 부모테이블쪽으로
        on c.seq = s.cseq;


-- tblVideo, tblRent
select * from tblVideo;
select * from tblRent;


-- 대여가 한번이라도 된 비디오 + 대여 이력
select * from tblVideo v 
    inner join tblRent r
        on v.seq = r.video;

-- 대여가 한번이라도 됐었던 상품의 개수?
select count(*) from tblVideo;

select count(distinct v.name) from tblVideo v 
    inner join tblRent r
        on v.seq = r.video;

        
-- 대여 여부와 상관없이 모든 비디오 + 그 대여 내역
select * from tblVideo v 
    left outer join tblRent r
        on v.seq = r.video;


-- 대여를 한번이라도 한 고객의 정보 + 대여 내역
select
    *
from tblMember m
    inner join tblRent r
        on m.seq = r.member;


-- 대여와 상관없이 모든 고객의 정보 + 대여 내역
select
    *
from tblMember m
    left outer join tblRent r
        on m.seq = r.member;


-- 대여 기록이 있는 회원의 이름 + 대여 횟수
select
    m.name,
    count(*)
from tblMember m
    inner join tblRent r
        on m.seq = r.member 
            group by m.name;


-- 대여 기록과 무관 > 모든 회원의 이름 + 대여 횟수
select
    m.name,
    count(rentdate) -- (*****) 조심
from tblMember m
    left outer join tblRent r
        on m.seq = r.member 
            group by m.name
                order by count(rentdate) desc;

select * from tblRent;





-- 4. 셀프 조인, SELF JOIN
-- 직원 테이블
create table tblSelf (
    seq number primary key,                             -- 직원 번호(PK)
    name varchar2(30) not null,                         -- 직원명
    department varchar2(50) null,                       -- 부서명
    super number null references tblSelf(seq)           -- 직속 상사
);

insert into tblSelf values (1, '홍사장', null, null);
insert into tblSelf values (2, '김부장', '영업부', 1);
insert into tblSelf values (3, '이과장', '영업부', 2);
insert into tblSelf values (4, '정대리', '영업부', 3);
insert into tblSelf values (5, '최사원', '영업부', 4);
insert into tblSelf values (6, '박부장', '개발부', 1);
insert into tblSelf values (7, '하과장', '개발부', 6);

select * from tblSelf;


-- 직원 명단을 가져오시오. 단 상사 명단까지
-- 1. join
select
   b.name as "직원명",
   b.department as "부서",
   a.name as "상사명"
from tblSelf a              -- 부모 역할 (PK 참조 당함) > 상사 
    inner join tblSelf b    -- 자식 역할 (PK 참조) > 직원
        on a.seq = b.super;
        
select
   b.name as "직원명",
   b.department as "부서",
   a.name as "상사명"
from tblSelf a              
    right outer join tblSelf b  -- right vs left 공부
        on a.seq = b.super;


-- 2. sub query
select 
    name as "직원명",
    department as "부서명",
    super as "상사번호",
    (select name from tblSelf where seq = a.super) as "상사명"
from tblSelf a;


-- 직원명 + 매니저명
select 
    b.first_name as "직원명",
    a.first_name as "매니저명"
from employees a                -- 참조 당하는 매니저 > 부모
    inner join employees b      -- 참조 하는 직원 > 자식
        on a.employee_id = b.manager_id;





-- 5. 전체 외부 조인, FULL OUTER JOIN        
-- 서로 참조하고 있는 관계에서만 사용이 가능한 조인

select * from tblMan;           -- 자식 (참조하는 것)
select * from tblWoman;         -- 부모 (참조당하는 것)

select
    *
from tblMan m
    left outer join tblWoman w
        on m.couple = w.name;

select
    *
from tblMan m
    right outer join tblWoman w
        on m.couple = w.name;
        
select
    *
from tblMan m
    full outer join tblWoman w
        on m.couple = w.name;


select * from tblCustomer c
    left outer join tblSales s -- 부모 가리킨 조인
        on c.seq = s.cseq;
        
select * from tblCustomer c
    right outer join tblSales s -- 자식 가리킨 조인 > inner 조인과 같은 결과
        on c.seq = s.cseq;

select * from tblCustomer c
    full outer join tblSales s  -- left outer 조인과 같은 결과
        on c.seq = s.cseq;







-- 장르 데이터
INSERT INTO tblGenre VALUES (1, '액션',1500,2);
INSERT INTO tblGenre VALUES (2, '에로',1000,1);
INSERT INTO tblGenre VALUES (3, '어린이',1000,3);
INSERT INTO tblGenre VALUES (4, '코미디',2000,2);
INSERT INTO tblGenre VALUES (5, '멜로',2000,1);
INSERT INTO tblGenre VALUES (6, '기타',1800,2);


-- 비디오 데이터
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (1, '영구와 땡칠이',5,'영구필름','심영래','땡칠이',3);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (2, '어쭈구리',5,'에로 프로덕션','김감독','박에로',2);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (3, '털미네이터',3,'파라마운트','James','John',1);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (4, '육복성',3,'대만영화사','홍군보','생룡',4);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (5, '뽀뽀할까요',6,'뽀뽀사','박감독','최지후',5);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (6, '우정과 영혼',2,'파라마운트','James','Mike',5);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (7, '주라기 유원지',1,NULL,NULL,NULL,1);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (8, '타이거 킹',4,'Walt','Kebin','Tiger',3);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (9, '텔미 에브리 딩',10,'영구필름','강감독','심으나',5);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (10, '동무',7,'부산필름','박감독','장동근',1);
INSERT INTO tblVideo (seq, Name, qty, Company, Director, Major, Genre) VALUES (11, '공동경쟁구역',2,'뽀뽀사','박감독','이병흔',1);


-- 회원 데이터
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (1, '김유신',1,1970,'123-4567','12-3번지 301호',10000);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (2, '강감찬',1,1978,'111-1111','777-2번지 101호',0);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (3, '유관순',1,1978,'222-2222','86-9번지',20000);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (4, '이율곡',1,1982,'333-3333',NULL,15000);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (5, '신숙주',1,1988,'444-4444','조선 APT 1012호',0);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (6, '안중근',1,1981,'555-5555','대한빌라 102호',1000);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (7, '윤봉길',1,1981,'666-6666','12-1번지',0);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (8, '이순신',1,1981,'777-7777',NULL,1500);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (9, '김부식',1,1981,'888-8888','73-6번지',-1000);
INSERT INTO tblMember (seq, Name,Grade,Byear,Tel,address,Money) VALUES (10, '박지원',1,1981,'999-9999','조선 APT 902호',1200);


-- 대여 데이터

INSERT INTO tblRent (seq, member, video, Rentdate, Retdate) VALUES (1, 1,1,'2007-01-01',NULL);
INSERT INTO tblRent (seq, member, video, Rentdate, Retdate) VALUES (2, 2,2,'2007-02-02','2001-02-03');
INSERT INTO tblRent (seq, member, video, Rentdate, Retdate) VALUES (3, 3,3,'2007-02-03',NULL);
INSERT INTO tblRent (seq, member, video, Rentdate, Retdate) VALUES (4, 4,3,'2007-02-04','2001-02-08');
INSERT INTO tblRent (seq, member, video, Rentdate, Retdate) VALUES (5, 5,5,'2007-02-05',NULL);
INSERT INTO tblRent (seq, member, video, Rentdate, Retdate) VALUES (6, 1,2,'2007-02-10',NULL);






