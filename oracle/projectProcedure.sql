--B05

******************************************************
--특정교사 선택한 경우 출력

******************************************************
--특정 과목 선택시 개설 과목 정보 출력




--b07
--특정 개설 과정 선택 > 개설 과목 정보 출력, 개설 과목별로 성적 등록 여부, 시험 문제 파일 등록 여부 확인
--특정 개설 과정 선택 > 개설 과목 출력
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

--개설 과목별 성적 등록 여부
select
    case
        when (select count(*) from tblSugang s inner join tblOpenCourse oc on s.opencourseseq = oc.opencourseseq where s.opencourseseq = 과정번호) = (select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 과정번호 and os.openSubjectSeq = 과목번호) then '등록'
        when (select count(*) from tblSugang s inner join tblOpenCourse oc on s.opencourseseq = oc.opencourseseq where s.opencourseseq = 과정번호) <> (select count(*) from tblGrade g inner join tblOpenSubject os on g.opensubjectseq = os.opensubjectseq where os.opencourseseq = 과정번호 and os.openSubjectSeq = 과목번호) then '미등록'
    end as "등록여부"
from dual;

--시험 문제 파일 등록 여부
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
--성적 정보 출력 > 교육생 개인별 출력 > 이름, 주민번호, 개설과정명, 개설 과정기간, 강의실명 등 출력, 교육생 개인이 수강한 모든 개설 과목에 대한 성적정보(개설 과목명, 개설 과목기간, 교사명, 출석, 필기, 실기) 출력
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
    g.practicalScore as "실기점수",
    g.attendScore as “출석점수”
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
                                                    where s.name = '과목명';
                                                    where st.name = '교육생명';
                                                    









--C06

--팀 등록 
insert into tblTeam values ((select max(teamSeq)+1 from tblTeam), '팀명', 개설과목번호);

--팀 수정
udpate tblTeam set teamName = '팀명', openSubjectSeq = 개설과목번호;
 
--팀 삭제
delete from tblTeam where teamSeq = 팀번호;





