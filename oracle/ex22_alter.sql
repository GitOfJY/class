-- ex22_alter



/*

    객체생성 : CREATE
    객체삭제 : DROP
    객체수정 : ALTER
    
    데이터생성 : INSERT
    데이터삭제 : DELETE
    데이터수정 : UPDATE
    
    테이블 수정하기
    - 테이블 정의 수정 > 테이블 스키마 수정 > 컬럼 수정 (컬럼명 or 자료형(길이) or 제약사항)
    - 되도록 테이블 수정하는 상황을 발생시키면 안된다. > 설계를 반드시 완벽하게
    
    
    
    테이블 수정해야하는 상황 발생
    1. 테이블 삭제(DROP) > 테이블 DDL(CREATE) 수정 > 수정된 DDL로 새롭게 테이블 생성
        a. 기존 테이블에 데이터가 없었을 경우 > 아무 문제 없음
        b. 기존 테이블에 데이터가 있었을 경우 > 미리 데이터 백업 > 테이블 삭제 > 수정 후 생성 > 데이터 복구
            - 개발 중에 사용 가능
            - 공부할 때 사용
            - 서비스 운영중에는 거의 불가능한 방법
        
    2. ALTER 명령어 사용 > 기존 테이블의 구조 변경
        a. 기존 테이블에 데이터가 없을 경우 > 아무 문제 없음
        b. 기존 테이블에 데이터가 있었을 경우 > 경우에 따라 다름
            - 개발 중에 사용 가능
            - 공부할 때 사용
            - 서비스 운영중에는 거의 가능한 방법
    
*/

drop table tblEdit;

create table tblEdit (
    seq number primary key,
    data varchar2(20) not null
);

insert into tblEdit values (1, '마우스');
insert into tblEdit values (2, '키보드');
insert into tblEdit values (3, '모니터');

select * from tblEdit;


-- Case 1. 새로운 컬럼 추가하기
-- alter table tblEdit add (새로 추가할 컬럼의 정의);
alter table tblEdit 
    add (price number null);

alter table tblEdit 
    add (memo varchar2(100) not null);
-- ORA-01758: table must be empty to add mandatory (NOT NULL) column

delete from tblEdit;
-- 기존의 데이터가 없을 땐 not null 컬럼 추가 가능 (권장)

insert into tblEdit values (1, '마우스', 3000, '로지텍');

alter table tblEdit
    add (memo2 varchar2(100) default '임시' not null);
-- default 지정으로 not null 컬럼 추가 가능 (불필요한 스키마 default 추가로 비권장)


-- Case 2. 기존 컬럼 삭제하기
alter table tblEdit
    drop column memo2;

select * from tblEdit;

alter table tblEdit
    drop column memo;

alter table tblEdit
    drop column seq; -- PK 컬럼 삭제 > 절대 금지


-- Case 3.  컬럼 수정하기

select * from tblEdit;

insert into tblEdit values (4, '인텔 i7 12세대 최신형 노트북');
-- ORA-12899: value too large for column "HR"."TBLEDIT"."DATA" (actual: 38, maximum: 20)

-- Case 3-1.  컬럼의 길이 수정하기 (확장/축소)
alter table tblEdit
    modify (data varchar2(100));

alter table tblEdit
    modify (data varchar2(20));
-- ORA-01441: cannot decrease column length because some value is too big

-- Case 3-2.  컬럼의 제약사항 수정하기 
alter table tblEdit
    modify (data varchar2(100) null);
    
alter table tblEdit
    modify (data varchar2(100) not null);
    
-- Case 3-3.  컬럼의 자료형 수정하기 > 테이블 비우고 작업
alter table tblEdit
    modify (data number);
-- ORA-01439: column to be modified must be empty to change datatype

alter table tblEdit
    modify (seq varchar2(100));
    
desc tblEdit;

-- Case 3-4.  컬럼명 수정하기
alter table tblEdit
    rename column data to etc;

select * from tblEdit;




-- 제약사항 수정하기

drop table tblEdit;

create table tblEdit (
    seq number,
    data varchar2(20) not null,
    color varchar2(30) null
);


alter table tblEdit
    add constraint tblEdit_seq_pk primary key(seq);
    
alter table tblEdit
    add constraint tblEdit_color_ck
        check ( color in ('red', 'yellow', 'blue'));

alter table tblEdit
    drop constraint tblEdit_color_ck; 
-- 제약 삭제로 데이터 손실 일어나지 않음, 테이블 자체로는 큰 변화 없음

insert into tblEdit values (1, '마우스', 'red');
-- ORA-00001: unique constraint (HR.TBLEDIT_SEQ_PK) violated

insert into tblEdit values (2, '키보드', 'yellow');
insert into tblEdit values (3, '모니터', 'white');
-- ORA-02290: check constraint (HR.TBLEDIT_COLOR_CK) violated

select * from tblEdit;



