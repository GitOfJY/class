-- 관리자 계정
create table tblAdmin(
    adminSeq number primary key check (adminSeq <= 5),
    id varchar2(20) not null,
    password varchar2(20) not null
);





-- 교사 계정
create table tblTeacher (
    teacherSeq number primary key,
    name varchar2(20) not null,
    ssn varchar2(20) not null,
    tel varchar2(20) not null,
    state varchar2(20) null
);




-- 교육생 계정
create table tblStudent(
    studentSeq number primary key,
    name varchar2(30) not null,
    ssn varchar2(100) not null,
    tel varchar2(100) not null,
    regdate date default sysdate
);




--강의실
create table tblClassroom (
	classroomSeq number primary key check (classroomSeq < 7), 
    classroomName varchar2(50) not null,
    totalNum number not null check (totalNum in ('26', '30'))
);



--교사 출퇴근
create table tblCommute (
    commuteSeq number primary key,
    commuteDate date default sysdate,
    teacherSeq number not null references tblTeacher(teacherSeq)
);




-- 교육생 출결
create table tblAttendManage(
    attendManageSeq number primary key,
    attendDate date default sysdate,
    studentSeq number not null references tblStudent(studentSeq)
);



-- 근태 상황
create table tblAttendStatus (
    attendStatusSeq number primary key,
    attendStatus varchar(20) not null check (attendStatus in ('정상', '지각', '조퇴', '외출', '병가', '기타')),
    attendManageSeq number references tblAttendManage(attendManageSeq),
    commuteSeq number references tblCommute(commuteSeq) 
);




-- 강의 가능 과목
create table tblCanSubject (
    canSubjectSeq number primary key,
    teacherSeq number not null references tblTeacher(teacherSeq),
    subjectSeq number not null references tblSubject(subjectSeq)
);





-- 과정
create table tblCourse(
    courseSeq number primary key,
    course varchar2(100) not null,
    period varchar2(30) not null check (period in ('5.5', '6', '7'))
);




--과목
create table tblSubject (
	subjectSeq number not null primary key,
	name varchar2(50) not null
);





-- 출판사
create table tblPublisher (
	publisherSeq number not null primary key,
    name varchar2(50) not null
);





-- 교재
create table tblBook(
    bookSeq number primary key,
    name varchar2(100) not null,
    subjectSeq number not null references tblSubject(subjectSeq),
    publisherSeq number not null references tblPublisher(publisherSeq)
);





-- 과정+과목
create table tblCourseSubject(
    courseSubjectSeq number primary key,
    courseSeq number not null references tblCourse(courseSeq),
    subjectSeq number not null references tblSubject(subjectSeq)
);



-- 개설 과정
create table tblOpenCourse(
    openCourseSeq number primary key,
    StartDate date not null,
    classroomSeq number not null references tblClassroom(classroomSeq),
    courseSeq number not null references tblCourse(courseSeq)
);





-- 개설 과목
create table tblOpenSubject(
    openSubjectSeq number primary key,
    StartDate date not null,
    EndDate date not null,
    openCourseSeq number not null references tblOpenCourse(openCourseSeq),
    courseSubjectSeq number not null references tblCourseSubject(courseSubjectSeq),
    canSubjectSeq number not null references tblCanSubject(canSubjectSeq)
);




-- 수강신청
create table tblSugang(
    sugangSeq number primary key,
    studentSeq number not null references tblStudent(studentSeq),
    openCourseSeq number not null references tblOpenCourse(openCourseSeq)
  );





-- 팀 
create table tblTeam (
    teamSeq number primary key,
    teamName varchar2(15) not null,
    openSubjectSeq number not null references tblOpenSubject(openSubjectSeq)
);




-- 소속팀
create table tblHaveTeam (
    haveTeamSeq number primary key,
    studentSeq number not null references tblStudent(studentSeq),
    teamSeq number not null references tblTeam(teamSeq)
);





--시험
create table tblExam (
   examSeq number primary key,
   examName varchar(30) not null,
   openSubjectSeq number not null references tblOpenSubject(openSubjectSeq)
);




-- 배점
create table tblPoints (
    pointsSeq number primary key,
    pointsNote number not null,
    pointsPractical number not null,
    pointsAttend number not null check (pointsAttend >= 20),
    examSeq number not null references tblExam(examSeq)
);




-- 시험 문제
create table tblExamQuestion (
    examQuestionSeq number primary key,
    questionSeq number not null,
    question varchar(100) not null,
    type varchar(30) not null,
    examDate date not null,
    examSeq number not null references tblExam(examSeq)
);




-- 성적
create table tblGrade (
    gradeSeq number primary key,
    practicalScore number not null,
    noteScore number not null,
    attendScore number not null,
    openSubjectSeq number not null references tblOpenSubject(openSubjectSeq),
    studentSeq number not null references tblStudent(studentSeq)
);





-- 후기
create table tblReview (
    reviewSeq number primary key,
    title varchar2(100) not null,
    content varchar2(100) not null,
    studentSeq number not null references tblStudent(studentSeq)
);





-- 후기 댓글
create table tblRecomment(
    recommentSeq number primary key,
    recomment varchar2(100) not null,
    reviewSeq number not null references tblReview(reviewSeq)
);






-- 교육생 커뮤니티
create table tblCommunity(
    communitySeq number primary key,
    reviewSeq number not null references tblReview(reviewSeq)
);





-- 중도 탈락
create table tblDropOut(
    dropOutSeq number primary key,
    outDate date not null,
    studentSeq number not null references tblStudent(studentSeq)
);




-- 질문
create table tblQuestion (
	questionSeq number not null primary key,
    content varchar2(4000) not null,
    studentSeq number not null references tblStudent(studentSeq)
);




-- 답변
create table tblAnswer (
	answerSeq number primary key,
    content varchar2(4000) not null,
    questionSeq number not null references tblQuestion(questionSeq),
    teacherSeq number not null references tblTeacher(teacherSeq)
);





-- 질의 응답
create table tblQna (
	qnaSeq number not null primary key,
    questionSeq number not null references tblQuestion(questionSeq)
);





-- 훈련비
create table tblTrainingFee(
   trainingFeeSeq number primary key,
   trainingFee number not null,
   depositDate date default sysdate not null,
   studentSeq number not null references tblStudent(studentSeq)
);



