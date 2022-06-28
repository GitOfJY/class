-- C:\calss\server\ToyProject\script.sql

--회원 테이블
create table tblToyUser (
    id varchar2(30) primary key,    
    pw varchar2(30) not null,     
    name varchar2(30) not null,    
    lv char(1) not null,         
    pic varchar2(100) default 'pic.png' not null,
    regdate date default sysdate not null,
    active char(1) default 'y' not null
);

insert into tblToyUser (id, pw, name, lv, pic, regdate) values ('hong', '1111', '홍길동', '1', default, default);
insert into tblToyUser (id, pw, name, lv, pic, regdate) values ('admin', '1111', '관리자', '2', default, default);

commit;

select * from tblToyUser;

alter table tblToyUser add (active char(1) default 'y' not null);





--게시판
create table tblToyBoard (
    seq number primary key,
    subject varchar2(300) not null,
    content varchar2(4000) not null,
    id varchar2(30) not null references tblToyUser(id),
    regdate date default sysdate not null,
    readcount number default 0 not null
);

create sequence seqToyBoard;

commit;







