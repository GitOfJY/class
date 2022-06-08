-- 교사 정보 출력 (전체 명단의 교사명, 주민번호, 전화번호, 강의 가능 과목 출력)
select 
    t.name as "교사명",
    t.ssn as "주민번호",
    t.tel as "전화번호",
    s.name as "강의가능과목"    
from tblTeacher t
	inner join tblCanSubject c
		on t.teacherSeq = c.teacherSeq
			inner join tblSubject s
				on c.subjectSeq = s.subjectSeq; 




-- 특정교사 선택한 경우 출력 (배정된 개설 과목명, 개설 과목 기간, 과정명, 개설과정기간, 교재명, 강의실, 강의 진행여부)
select
    s.name as "배정 개설 과목",
    o.endDate - o.startDate as "개설 과목 기간",
    e.course as "과정명",
    add_months(a.startDate, e.period) - a.startDate as "개설 과정 기간",
    b.name as "교재명",
    r.classroomname as "강의실",
    case 
        when sysdate between a.startDate and add_months(a.startDate, e.period) then '진행중'
        when a.startdate - sysdate  < 0 then '예정 중'
        when add_months(a.startDate, e.period) - sysdate < 0 then '진행 종료'
    end as "강의 진행 여부"
from tblTeacher t
    inner join tblCanSubject c
        on t.teacherSeq = c.teacherSeq
            inner join tblOpenSubject o
                on c.canSubjectSeq = o.canSubjectSeq
                    inner join tblSubject s
                        on s.subjectSeq = c.subjectSeq
                            inner join tblOpenCourse a
                                on a.openCourseSeq = o.openCourseSeq
                                    inner join tblCourse e
                                        on e.courseSeq = a.courseSeq
                                            inner join tblBook b
                                                on b.subjectSeq = s.subjectSeq
                                                        inner join tblClassroom r
                                                            on r.classroomSeq = a.classroomSeq
                                                                where t.name = '신동민';





select * from tblTeacher;
select * from tblAdmin;
select * from tblclassroom;




-- 교사 강의 가능 과목 등록 (기초 정보 과목명을 이용해 선택적으로 추가)
insert into tblCanSubject (canSubjectSeq, teacherSeq, subjectSeq) values ((select (max(canSubjectSeq)+1) from tblCanSubject), 1, (select subjectSeq from tblSubject where name = 'Oracle'));
insert into tblCanSubject (canSubjectSeq, teacherSeq, subjectSeq) values ((select (max(canSubjectSeq)+1) from tblCanSubject), 1, (select subjectSeq from tblSubject where name = 'Oracle'));




-- 특정 과목 선택시 개설 과목 정보 출력
select
    o.startDate as "시작일"
from tblOpenSubject o
    inner join tblCourseSubject c
        on o.CourseSubjectSeq = c.CourseSubjectSeq
            inner join tblsubject s
                on s.subjectSeq = c.subjectSeq
                    where s.name = '과목명';

select
    s.name as "개설 과목",
    o.endDate - o.startDate as "개설 과목 기간",
    o.startDate as "시작일",
    o.endDate as "종료일",
    b.name as "교재명"
from tblCanSubject c
            inner join tblOpenSubject o
                on c.canSubjectSeq = o.canSubjectSeq
                    inner join tblSubject s
                        on s.subjectSeq = c.subjectSeq
                            inner join tblBook b
                                    on b.subjectSeq = s.subjectSeq
                                        where s.name = 'JAVA';




--개설 과목 입력 > 과목명, 과목기간(시작 년월일, 끝 년월일),  교재명, 교사명(교사명단에서 선택적으로 추가) 
insert into tblOpenSubject (openSubjectSeq, StartDate, EndDate, openCourseSeq, courseSubjectSeq, canSubjectSeq) 
                            values (1, '시작일', '종료일', null, (select c.courseSubjectSeq from tblCourseSubject c inner join tblSubject s on c.subjectSeq = s.subjectSeq where s.name = '과목명'), (select canSubjectSeq from tblCanSubject where teacherSeq = (select teacherSeq from tblTeacher where name = '교사이름') and subjectseq = (select subjectSeq from tblSubject where name = '과목명')
)); 

-- openCourseSeq
select c.courseSeq from tblCourseSubject c inner join tblSubject s on c.subjectSeq = s.subjectSeq;
select openCourseSeq from tblOpenCourse where courseSeq = (select c.courseSeq from tblCourseSubject c inner join tblSubject s on c.subjectSeq = s.subjectSeq where s.name = 'JAVA');

--courseSubjectSeq, canSubjectSeq
select c.courseSubjectSeq from tblCourseSubject c inner join tblSubject s on c.subjectSeq = s.subjectSeq;
select c.courseSubjectSeq from tblCourseSubject c inner join tblSubject s on c.subjectSeq = s.subjectSeq where s.name = '과목명';

--canSubjectSeq
select canSubjectSeq from tblCanSubject where teacherSeq = (select teacherSeq from tblTeacher where name = '교사이름') and subjectseq = (select subjectSeq from tblSubject where name = '과목명');
select teacherSeq from tblTeacher where name = '교사이름';
select subjectSeq from tblSubject where name = '과목명';




-- 개설 과목 출력 > 과정명, 과정기간(시작 년월일, 끝 년월일), 강의실, 과목명, 과목기간(시작 년월일, 끝년월일), 교재명, 교사명
select
    e.course as "과정명",
    a.startDate as "과정시작",
    add_months(a.startDate, e.period) as "과정종료",
    add_months(a.startDate, e.period) - a.startDate as "개설 과정 기간",
    o.endDate as "시작일",
    o.startDate as "종료일",
    o.endDate - o.startDate as "개설 과목 기간",
    r.classroomname as "강의실",
    s.name as "과목명",
    b.name as "교재명",
    t.name as "교사명"
from tblTeacher t
    inner join tblCanSubject c
        on t.teacherSeq = c.teacherSeq
            inner join tblOpenSubject o
                on c.canSubjectSeq = o.canSubjectSeq
                    inner join tblSubject s
                        on s.subjectSeq = c.subjectSeq
                            inner join tblOpenCourse a
                                on a.openCourseSeq = o.openCourseSeq
                                    inner join tblCourse e
                                        on e.courseSeq = a.courseSeq
                                            inner join tblBook b
                                                on b.subjectSeq = s.subjectSeq
                                                        inner join tblClassroom r
                                                            on r.classroomSeq = a.classroomSeq;




--개설 과목 수정
update tblOpenSubject set openSubjectSeq = , StartDate = 시작일 수정, EndDate = 종료일 수정,  openCourseSeq, courseSubjectSeq, canSubjectSeq

commit;

select 
    openSubjectSeq 
from tblOpenSubject o
    inner join tblCourseSubject c
        on o.courseSubjectSeq = c.courseSubjectSeq
            inner join tblSubject s
                on s.subjectSeq = c.subjectSeq
                    where s.name = 'JAVA';




--특정 개설 과정 선택 > 개설 과목 정보 출력, 개설 과목별로 성적 등록 여부, 시험 문제 파일 등록 여부 확인
select 
 *
from tblOpenCourse oc 
    inner join tblOpenSubject os on oc.openCourseSeq = os.openCourseSeq
        left outer join tblExam e on os.openSubjectSeq = e.openSubjectSeq
            left outer join tblGrade g on g.openSubjectSeq = os.openSubjectSeq
                inner join tblCourseSubject cs on cs.courseSubjectSeq = os.courseSubjectSeq
                    inner join tblSubject s on s.subjectSeq = cs.subjectSeq;


--개설 과목별로 성적 등록 여부

select
    --s.name as "과목명"
    *
from tblOpenCourse oc 
    inner join tblOpenSubject os on oc.openCourseSeq = os.openCourseSeq
        left outer join tblExam e on os.openSubjectSeq = e.openSubjectSeq
            left outer join tblGrade g on g.openSubjectSeq = os.openSubjectSeq
                inner join tblCourseSubject cs on cs.courseSubjectSeq = os.courseSubjectSeq
                    inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                        left outer join tblCourse c on c.courseSeq = oc.courseSeq
                            where c.course = '스마트웹 개발을 위한 자바웹개발자 양성과정';


select * from tblCourse;
select count(*) from tblOpenCourse oc inner join tblSugang s on oc.opencourseseq = s.opencourseseq where oc.opencourseseq = (select courseSeq from tblCourse where course = '스마트웹 개발을 위한 자바웹개발자 양성과정');
                        select courseSeq from tblCourse where course = '스마트웹 개발을 위한 자바웹개발자 양성과정';

select count(*) from tblGrade g inner join tblOpenSubject os on os.cansubjectseq = g.opensubjectseq


delete from tblExam where examseq = 1;
select * from tblExam;
insert into tblOpenSubject (openSubjectSeq, StartDate, EndDate, openCourseSeq, courseSubjectSeq, canSubjectSeq) values (25, '22/03/04', '22/04/04', 1, 1, 1); 
select * from tblOpenSubject;


select 
    s.name as "과목명"
from tblOpenCourse oc 
    inner join tblOpenSubject os on oc.openCourseSeq = os.openCourseSeq
        left outer join tblExam e on os.openSubjectSeq = e.openSubjectSeq
            left outer join tblGrade g on g.openSubjectSeq = os.openSubjectSeq
                inner join tblCourseSubject cs on cs.courseSubjectSeq = os.courseSubjectSeq
                    inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                        group by s.name;


select 
    s.name as "과목명"
from tblOpenCourse oc
    inner join tblCourse c on oc.courseseq = c.courseSeq
        inner join tblOpenSubject os on os.opencourseseq = oc.opencourseseq
            inner join tblCourseSubject cs on cs.courseSubjectSeq = os.coursesubjectseq
                inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                    where c.course = '스마트웹 개발을 위한 자바웹개발자 양성과정';
                    

select 
    s.name as "과목명",
    os.startDate as "시작일",
    os.endDate as "시작일",
    oc.openCourseSeq as "개설과정번호",
    os.openSubjectSeq as "개설과목번호",
    s.subjectSeq as "과목번호"
from tblOpenCourse oc
    inner join tblCourse c on oc.courseseq = c.courseSeq
        inner join tblOpenSubject os on os.opencourseseq = oc.opencourseseq
            inner join tblCourseSubject cs on cs.courseSubjectSeq = os.coursesubjectseq
                inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                    where c.course = '스마트웹 개발을 위한 자바웹개발자 양성과정';


-- 특정 과목 수강 신청 count(*) 
-- 특정 과목 성적 count(*) 
select count(*) from tblSugang s inner join tblOpenCourse oc on s.opencourseseq = oc.opencourseseq where s.opencourseseq = 개설과정번호;
select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 개설과정번호 and os.openSubjectSeq = 개설과목번호;

select count(*) from tblSugang s inner join tblOpenCourse oc on s.opencourseseq = oc.opencourseseq where s.opencourseseq = 1;
select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 1 and os.openSubjectSeq = 1;


select
    case
        when (select count(*) from tblSugang s inner join tblOpenCourse oc on s.opencourseseq = oc.opencourseseq where s.opencourseseq = 1) = (select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 1 and os.openSubjectSeq = 1) then '등록'
        when (select count(*) from tblSugang s inner join tblOpenCourse oc on s.opencourseseq = oc.opencourseseq where s.opencourseseq = 1) <> (select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 1 and os.openSubjectSeq = 1) then '미등록'
    end as "등록여부"
from dual;

select 1 from dual;


select os.opensubjectseq from tblSubject s inner join tblCourseSubject cs on cs.subjectseq = s.subjectseq inner join tblOpenSubject os on os.coursesubjectseq = cs.coursesubjectseq where s.name = 'JAVA';
select os.opensubjectseq from tblSubject s inner join tblCourseSubject cs on cs.subjectseq = s.subjectseq inner join tblOpenSubject os on os.coursesubjectseq = cs.coursesubjectseq where s.name = 'JAVA';

select * from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 1 and os.openSubjectSeq = 1;
select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 1 and os.openSubjectSeq = 1;

select os.opensubjectseq from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 1;
select distinct(openSubjectSeq) from tblGrade;


select 
    s.name as "과목명",
    os.startDate as "시작일",
    os.endDate as "시작일",
    oc.openCourseSeq as "개설과정번호",
    os.openSubjectSeq as "개설과목번호",
    s.subjectSeq as "과목번호"
from tblOpenCourse oc
    inner join tblCourse c on oc.courseseq = c.courseSeq
        inner join tblOpenSubject os on os.opencourseseq = oc.opencourseseq
            inner join tblCourseSubject cs on cs.courseSubjectSeq = os.coursesubjectseq
                inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                    where c.course = '과정명';

select
    case
        when (select count(*) from tblSugang s inner join tblOpenCourse oc on s.opencourseseq = oc.opencourseseq where s.opencourseseq = 과정번호) = (select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 과정번호 and os.openSubjectSeq = 과목번호) then '등록'
        when (select count(*) from tblSugang s inner join tblOpenCourse oc on s.opencourseseq = oc.opencourseseq where s.opencourseseq = 과정번호) <> (select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 과정번호 and os.openSubjectSeq = 과목번호) then '미등록'
    end as "등록여부"
from dual;


select
    *
from tblOpenCourse oc 
    inner join tblOpenSubject os on oc.openCourseSeq = os.openCourseSeq
        left outer join tblExam e on os.openSubjectSeq = e.openSubjectSeq
            left outer join tblGrade g on g.openSubjectSeq = os.openSubjectSeq
                inner join tblCourseSubject cs on cs.courseSubjectSeq = os.courseSubjectSeq
                    inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                        left outer join tblCourse c on c.courseSeq = oc.courseSeq
                            where e.examname is null;

select
    s.name as "과목이름",
    case
        when e.examname is null then '등록'
        when e.examname is not null then '미등록'
    end as "성적파일등록"
from tblOpenCourse oc 
    inner join tblOpenSubject os on oc.openCourseSeq = os.openCourseSeq
        left outer join tblExam e on os.openSubjectSeq = e.openSubjectSeq
            left outer join tblGrade g on g.openSubjectSeq = os.openSubjectSeq
                inner join tblCourseSubject cs on cs.courseSubjectSeq = os.courseSubjectSeq
                    inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                        left outer join tblCourse c on c.courseSeq = oc.courseSeq
                            where oc.opencourseseq = 1;

select
    s.name as "과목이름",
    case
        when e.examname is null then '등록'
        when e.examname is not null then '미등록'
    end as "성적파일등록"
from tblOpenCourse oc 
    inner join tblOpenSubject os on oc.openCourseSeq = os.openCourseSeq
        left outer join tblExam e on os.openSubjectSeq = e.openSubjectSeq
            left outer join tblGrade g on g.openSubjectSeq = os.openSubjectSeq
                inner join tblCourseSubject cs on cs.courseSubjectSeq = os.courseSubjectSeq
                    inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                        left outer join tblCourse c on c.courseSeq = oc.courseSeq
                            where oc.opencourseseq = 과정번호;


--성적 정보 출력 > 개설 과목별 > 개설 과정명, 개설 과정기간, 강의실명, 개설 과목명, 교사명, 교재명, 해당 개설과목을 수강한 모든 교육생의 성적 정보(이름, 주민번호, 필기, 실기) 출력
select
    c.course as "과정명",
    oc.startdate||'~'||add_months(oc.startDate, c.period) as "과정기간",
    cr.classroomName as "강의실명",
    s.name as "과목명",
    t.name as "교사명",
    b.name as "교재명",
    st.name as "교육생명",
    st.ssn as "주민번호",
    g.noteScore as "필기점수",
    g.practicalScore as "실기점수"
from tblOpenCourse oc
    inner join tblCourse c on oc.courseseq = c.courseseq
        inner join tblCourseSubject cs on cs.courseSeq = c.courseSeq
            inner join tblOpenSubject os on os.courseSubjectSeq = cs.courseSubjectSeq
                inner join tblExam e on e.openSubjectSeq = os.openSubjectSeq
                    inner join tblSugang sg on oc.openCourseSeq = sg.openCourseSeq
                        inner join tblStudent st on st.studentSeq = sg.studentSeq
                            inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                                inner join tblClassroom cr on cr.classroomSeq = oc.classroomSeq
                                    inner join tblBook b on b.subjectSeq = s.subjectSeq
                                        inner join tblCanSubject csj on csj.canSubjectSeq = os.cansubjectseq
                                            inner join tblTeacher t on t.teacherSeq = csj.teacherseq
                                                inner join tblGrade g on g.studentSeq = st.studentSeq;


select
    c.course as "과정명",
    oc.startdate||'~'||add_months(oc.startDate, c.period) as "과정기간",
    cr.classroomName as "강의실명",
    s.name as "과목명",
    t.name as "교사명",
    b.name as "교재명",
    st.name as "교육생명",
    st.ssn as "주민번호",
    g.noteScore as "필기점수",
    g.practicalScore as "실기점수"
from tblOpenCourse oc
    inner join tblCourse c on oc.courseseq = c.courseseq
        inner join tblCourseSubject cs on cs.courseSeq = c.courseSeq
            inner join tblOpenSubject os on os.courseSubjectSeq = cs.courseSubjectSeq
                inner join tblExam e on e.openSubjectSeq = os.openSubjectSeq
                    inner join tblSugang sg on oc.openCourseSeq = sg.openCourseSeq
                        inner join tblStudent st on st.studentSeq = sg.studentSeq
                            inner join tblSubject s on s.subjectSeq = cs.subjectSeq
                                inner join tblClassroom cr on cr.classroomSeq = oc.classroomSeq
                                    inner join tblBook b on b.subjectSeq = s.subjectSeq
                                        inner join tblCanSubject csj on csj.canSubjectSeq = os.cansubjectseq
                                            inner join tblTeacher t on t.teacherSeq = csj.teacherseq
                                                inner join tblGrade g on g.studentSeq = st.studentSeq
                                                    where s.name = 'JAVA';

--팀 등록 
select * from tblTeam; -- teamSeq, teamname, openSubjectSeq
insert into tblTeam values ((select max(teamSeq)+1 from tblTeam), '팀명', 개설과목번호);


--팀 수정
udpate tblTeam set teamName = '팀명', openSubjectSeq = 개설과목번호;
 
--팀 삭제
delete from tblTeam where teamSeq = 팀번호;

rollback;


























































