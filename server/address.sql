drop table tblAddress;
drop sequence seqAddress;

create table tblAddress (
    seq number primary key,
    name varchar2(30) not null,
    age number(3) not null,
    address varchar2(300) not null,
    gender char(1) not null check(gender in ('m', 'f')),
    tel varchar2(15) not null
);




create sequence seqAddress;
select * from tblAddress;




--주소록 쓰기
insert into tblAddress (seq, name, age, address, gender, tel) values (seqAddress.nextVal, '홍길동', 20, '서울시 강남구 역삼동', 'm', '010-1234-5678');

--주소록 읽기
select * from tblAddress order by name asc;

--주소록 수정하기
update tblAddress set name = '아무개', age='22', address='서울시 강동구 둔촌동', gender='f', tel = '010-1111-111' where seq = 1;

--주소록 삭제하기
delete from tblAddress where seq = 1;

--insert into tblAddress (seq, name, age, address, gender, tel) values (seqAddress.nextVal, '테스트', 20, '서울시 강남구 역삼동', 'm', '010-1234-5678');



commit;