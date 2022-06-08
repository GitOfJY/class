--drop
drop table tblMovie;
drop table tblPGenre;
drop table tblMovieGenre;
drop table tblPCountry;
drop table tblMovieCountry;
drop table tblImport;
drop table tblDistribute;
drop table tblMovieDistribute;
drop table tblMovieImport;
drop table tblGrade;
drop table tblReMovie;
drop table tblRecommend;
drop table tblScore;
drop table tblJournalist;
drop table tblJournalistScore;
drop table tblAudienceScore;
drop table tblNetizenScore;
drop table tblAudienceProgress;
drop table tblGender;
drop table tblAge;
drop table tblImpression;
drop table tblExpect;
drop table tblAuthor;
drop table tblPMember;
drop table tblComment;
drop table tblActor;
drop table tblAppearanceActor;
drop table tblLine;
drop table tblDirector;
drop table tblMovieDiretor;


-- 영화 
create table tblMovie(
        seq number primary key,
        name varchar(50) not null,
        nameEng varchar2(50),
        time number, 
        summary varchar2(300),
        startDate date,
        audienceNum number
     );
                                                                
drop table tblMovie;
select * from tblMovie;
                                                                                                                                                            
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (1, '신비한 동물들과 덤블도어의 비밀', 'Fantastic Beasts: The Secrets of Dumbledore', 142, '가장 위험한 마법에 맞선, 세상을 구할 전쟁이 시작된다!', to_date('2022-04-13', 'yyyy-mm-dd'), 1090198);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (2, '닥터 스트레인지: 대혼돈의 멀티버스', 'Doctor Strange in the Multiverse of Madness', 126, '지금껏 본 적 없는 마블의 극한 상상력!', to_date('2022-05-04', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (3, '공기살인', 'TOXIC', 108, '봄이 되면 나타났다 여름이 되면 사라지는 죽음의 병.', to_date('2022-04-22', 'yyyy-mm-dd'), 146927);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (4, '니 부모 얼굴이 보고싶다', null, 111, '누군가 잘못했겠지 하지만 내 아들은 절대 아니야', to_date('2022-04-27', 'yyyy-mm-dd'), 249690);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (5, '앵커', 'Anchor', 111, '제 죽음이 정세라 앵커의 입을 통해 보도되면 너무 기쁠 것 같아요', to_date('2022-04-20', 'yyyy-mm-dd'), 160430);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (6, '범죄도시2', 'the roundup', 106, '느낌 오지? 이 놈 잡아야 하는 거', to_date('2022-05-18', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (7, '로스트 시티', 'The Lost City', 111, '전설의 트레저를 차지하기 위해 재벌 페어팩스(다니엘 래드클리프)는 유일한 단서를 알고 있는 베스트셀러 작가', to_date('2022-04-20', 'yyyy-mm-dd'), 103622);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (8, '부기나이트', 'BOOGIE NIGHTS', 88, '살아있을 마지막 날, 오늘은 뭘 해도 되는 날이다', to_date('2022-04-28', 'yyyy-mm-dd'), 1504);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (9, '봄날', 'When Spring Comes', 102, '제2의 전성기는 반드시 온다!', to_date('2022-04-27','yyyy-mm-dd'), 24716);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (10, '서울괴담', 'Urban Myths', 123, '어두운 터널을 홀로 지날 때의 두려움', to_date('2022-04-27','yyyy-mm-dd'), 65150);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (11, '스텔라', 'Stellar', 98, '막다른 인생 제대로 한 번 달려본 적 없는 차량담보업계 에이스.', to_date('2022-04-06', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (12, '더 컨트랙터', 'The Contractor', 103, '국가를 위해 극비 작전에 뛰어든 남자', to_date('2022-04-28', 'yyyy-mm-dd'), 5881);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (13, '언차티드', 'Uncharted', 116, '모든 것을 걸었다면 세상 누구보다 빠르게 찾아야 한다!', to_date('2022-02-16', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (14,'불도저에 탄 소녀', 'The Girl on a Bulldozer', 112, '그냥 당하지 않겠다', to_date('2022-04-07', 'yyyy-mm-dd'), 10383);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (15, '뜨거운 피', 'Hot Blooded', 120, '부산 변두리 작은 포구 구암의 절대적인 주인 손영감(김갑수)', to_date('2022-03-23', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (16, '앰뷸런스', 'Ambulance', 136, 'LA 도심을 뒤흔든 미친 추격! 멈추면 죽는다', to_date('2022-04-06', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (17, '영희', 'Young-hee', 112, '당신의 예상을 빗나간다. 그녀는 직진이다', to_date('2022-05-01', 'yyyy-mm-dd'), 19);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (18, '수퍼 소닉2', 'Sonic the Hedgehog 2', 122, '레벨 업! 초특급 히어로 소닉의 새로운 시대가 열린다', to_date('2022-04-06', 'yyyy-mm-dd'), 288441);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (19, '배드 가이즈', 'The Bad Guys', 100, '드림웍스 최초의 범죄오락액션 블록버스터!', to_date('2022-05-04', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (20, '극장판 귀멸의 칼날: 무한열차편', 'Demon Slayer: Kimetsu no Yaiba the Mov', 117, '혈귀로 변한 여동생 네즈코를 되돌리기 위해 귀살대가 된 탄지로!', to_date('2022-01-17', 'yyyy-mm-dd'), 2184793);
                                                                              
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (21, '중경삼림', 'Chungking Express', 102, ' 네 사람이 만들어낸 두 개의 로맨스', to_date('2022-04-20', 'yyyy-mm-dd'), 92412);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (22, '한산: 용의 출현', null, null, '명량 대첩 5년 전, 수세에 몰린 조선을 방어하기 위한 이순신 장군과 조선수군들의 전략과 패기의 한산해전을 그린 전쟁 액션 영화', to_date('2022-07-01', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (23, '더 배트맨', 'The Batman', 176, '영웅이 될 것인가 악당이 될 것인가', to_date('2022-03-01', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (24, '극장판 주술회전 0', 'Jujutsu Kaisen: Zero', 105, '12월 24일, 우리는 백귀야행을 결행한다', to_date('2022-02-17', 'yyyy-mm-dd'), 625473);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (25, '브로커', 'Broker', 129, ' 베이비 박스, 그곳에서 의도치 않게 만난 이들의 예기치 못한 특별한 여정이 시작된다.', to_date('2022-06-08', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (26, '내가 처음으로 사랑한 소녀', 'The First Girl I Loved', 95, ' 평생 함께하자던 소울메이트였던 그들, 그때 너도 나와 같은 마음이었을까?', to_date('2022-04-22', 'yyyy-mm-dd'), 3590);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (27, '세븐틴 파워 오브 러브 : 더 무비', 'SEVENTEEN POWER OF LOVE : THE MOVIE', 115, '2021년 열린 온라인 콘서트 POWER OF LOVE의 감동이 스크린으로 다시 펼쳐진다!', to_date('2022-04-20', 'yyyy-mm-dd'), 46636);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (28, '엄마', 'UMMA', 83, '미국의 한 외딴 농장에서 딸 크리스와 단둘이 평온하게 살아오던 아만다.', to_date('2022-05-11', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (29, '늑대들', 'WOLVES', 99, '늑대들이 펼치는 하드보일드 액션!', to_date('2022-04-27', 'yyyy-mm-dd'), 1309);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (30, '모비우스', 'Morbius', 104, '마블 최강의 안티 히어로가 탄생한다!', to_date('2022-03-30', 'yyyy-mm-dd'), null);
                                                                              
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (31, '이상한 나라의 수학자', 'In Our Prime', 117, '정답보다 중요한 건 답을 찾는 과정이야', to_date('2022-03-09', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (32, '쥬라기 월드: 도미니언', 'Jurassic World: Dominion', 147, '이제 모든 것이 끝난다, 지상 최대 블록버스터의 압도적 피날레!', to_date('2022-06-01', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (33, '평평남녀', 'Unboxing Girl', 121, ' 일도 사랑도 꼬여버린 할많하않 오피스 브이로그가 온다!', to_date('2022-04-28', 'yyyy-mm-dd'), 835);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (34, '스파이더맨: 노 웨이 홈', 'Spider-Man: No Way Home', 148, '미스테리오의 계략으로 세상에 정체가 탄로난 스파이더맨 피터 파커는 하루 아침에 평범한 일상을 잃게 된다.', to_date('2021-12-15', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (35, '토르: 러브 앤 썬더', 'Thor: Love and Thunder', null, null, null, null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (36, '버블', 'Bubble', 100, '하늘에서 거품이 내리며 중력이 망가지고 폐허가 된 도쿄. 이곳에서 특별한 재능을 가진 소년과 신비한 소녀가 운명처럼 만난다.', null, null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (37, '몬스터 아카데미', 'CRANSTON ACADEMY: MONSTER ZONE', 85, '상위 1%의 천재들만 다니는 크랜스턴 아카데미', to_date('2022-04-27', 'yyyy-mm-dd'), 11470);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (38, '우연과 상상', 'Wheel of Fortune and Fantasy', 121, '마법보다 더 불확실한 걸 믿어볼 생각 있어?', to_date('2022-03-09', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (39, '민스미트 작전', 'Operation Mincemeat', 127, '제2차 세계대전의 판도를 바꿀 단 한 번의 기회!', to_date('2022-05-11', 'yyyy-mm-dd'), null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (40, '메리 미', 'Marry Me', 112, '선결혼 후연애! 슈퍼스타 X 슈퍼노멀 커플 탄생!', to_date('2022-03-16', 'yyyy-mm-dd'), null);
                                                                              
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (41, '쿠폰의 여왕','QUEENPINS',110,'역대 최고 규모! 쿠폰으로 백만장자 된 여자들의 쿠폰 실화! 골 때리는 범죄 코미디가 온다!',to_date('2022-04-27', 'yyyy-mm-dd') ,6645);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (42, '그날','The Free Fall',82,'모든 것이 낯설어진 그날, 믿었던 모든 기억이 뒤틀린다!',to_date('2022-05-02', 'yyyy-mm-dd'),null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (43, '야차','Yaksha: Ruthless Operations',null,'전 세계 스파이의 최대 접전지 선양에서 활동하는 국정원 해외 비밀공작 전담 블랙팀',null,null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (44, '탑건: 매버릭','Top Gun: Maverick',130,'한순간의 실수도 용납되지 않는 하늘 위, 가장 압도적인 비행이 시작된다!',to_date('2022-06-22', 'yyyy-mm-dd'),null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (45, '소설가의 영화','The Novelist’s Film',92,'여소설가가 잠적한 후배의 책방으로 먼 길을 찾아옵니다.', to_date('2022-04-21', 'yyyy-mm-dd'),7321);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (46, '클라우스','Klaus',96,'편지 6천 통을 배달하라고요? 소통은커녕 싸움만 일삼는 마을에서요?',to_date('2019-11-15', 'yyyy-mm-dd'),null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (47, '문폴','Moonfall',130,'1969년 인류의 위대한 도전, 달 착륙 성공 2022년 인류 최후의 재난, 달이 지구와 충돌한다!',to_date('2022-03-16', 'yyyy-mm-dd'),null);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (48, '배니싱: 미제사건','MATIN CALME, Vanishing',88,'신원 미상의 시체 발견! 대한민국이 발칵 뒤집혔다!', to_date('2022-03-30', 'yyyy-mm-dd'),32487);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (49, '뮤지컬 킹키부츠 라이브','Kinky Boots: The Musical',122,'폐업 위기의 구두공장을 물려받은 찰리는 우연히 하나부터 열까지 자신과 다른 롤라를 만나 공장을 일으켜 세울 빅 아이디어를 얻는다.',to_date('2022-04-28','yyyy-mm-dd'),4448);
insert into tblMovie(seq, name, nameEng, time, summary, startDate, audienceNum) values (50, '극장판 엉덩이 탐정','Butt Detective the Movie: the',59,'1년 내내 바람이 부는 수플레 섬에 괴도 유의 예고장이 도착했다!', to_date('2022-05-05', 'yyyy-mm-dd') ,null);




-- 장르
create table tblPGenre (
	genreSeq number primary key,
	genre varchar2(30) not null
);

drop table tblPGenre;
select * from tblPGenre;

insert into tblPGenre(genreSeq, genre) values(1, '판타지');
insert into tblPGenre(genreSeq, genre) values(2, '모험');
insert into tblPGenre(genreSeq, genre) values(3, '가족');
insert into tblPGenre(genreSeq, genre) values(4, '액션');
insert into tblPGenre(genreSeq, genre) values(5, '드라마');
insert into tblPGenre(genreSeq, genre) values(6, '스릴러');
insert into tblPGenre(genreSeq, genre) values(7, '범죄');
insert into tblPGenre(genreSeq, genre) values(8, '코미디');
insert into tblPGenre(genreSeq, genre) values(9, '멜로/로맨스');
insert into tblPGenre(genreSeq, genre) values(10, '느와르');
insert into tblPGenre(genreSeq, genre) values(11, '공포');
insert into tblPGenre(genreSeq, genre) values(12, '애니메이션');
insert into tblPGenre(genreSeq, genre) values(13, 'SF');
insert into tblPGenre(genreSeq, genre) values(14, '다큐멘터리');
insert into tblPGenre(genreSeq, genre) values(15, '전쟁');
insert into tblPGenre(genreSeq, genre) values(16, '공연실황');
insert into tblPGenre(genreSeq, genre) values(17, '뮤지컬');



create table tblMovieGenre (
	movieGenreSeq number primary key,
	genreSeq number references tblPGenre(genreSeq),
    seq number not null references tblMovie(seq)
);

drop table tblMovieGenre;


insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (1, 1, 1);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (2, 2, 1);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (3, 3, 1);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (4, 1, 2);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (5, 2, 2);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (6, 4, 2);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (7, 5, 3);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (8, 5, 4);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (9, 6, 5);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (10, 4, 6);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (11, 7, 6);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (12, 2, 7);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (13, 4, 7);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (14, 8, 7);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (15, 9, 7);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (16, 8, 8);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (17, 4, 9);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (18, 5, 9);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (19, 10, 9);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (20, 11, 10);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (21, 5, 11);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (22, 8, 11);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (23, 4, 12);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (24, 6, 12);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (25, 2, 13);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (26, 4, 13);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (27, 5, 14);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (28, 5, 15);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (29, 7, 15);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (30, 4, 16);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (31, 7, 16);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (32, 8, 17);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (33, 1, 18);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (34, 2, 18);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (35, 3, 18);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (36, 4, 18);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (37, 8, 18);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (38, 12, 18);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (39, 13, 18);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (40, 4, 19);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (41, 7, 19);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (42, 12, 20);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (43, 5, 21);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (44, 4, 22);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (45, 5, 22);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (46, 4, 23);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (47, 5, 23);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (48, 7, 23);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (49, 12, 24);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (50, 5, 25);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (51, 5, 26);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (52, 9, 26);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (53, 14, 27);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (54, 6, 28);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (55, 4, 29);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (56, 2, 30);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (57, 4, 30);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (58, 5, 30);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (59, 5, 31);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (60, 2, 32);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (61, 4, 32);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (62, 5, 33);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (63, 9, 33);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (64, 2, 34);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (65, 4, 34);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (66, 13, 34);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (67, 1, 35);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (68, 2, 35);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (69, 4, 35);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (70, 4, 36);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (71, 12, 36);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (72, 1, 37);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (73, 2, 37);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (74, 4, 37);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (75, 12, 37);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (76, 5, 38);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (77, 9, 38);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (78, 5, 39);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (79, 15, 39);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (80, 8, 40);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (81, 9, 40);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (82, 7, 41);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (83, 8, 41);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (84, 11, 42);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (85, 2, 43);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (86, 4, 43);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (87, 4, 44);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (88, 5, 45);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (89, 3, 46);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (90, 8, 46);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (91, 12, 46);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (92, 2, 47);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (93, 4, 47);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (94, 5, 47);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (95, 6, 47);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (96, 13, 47);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (97, 6, 48);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (98, 7, 48);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (99, 16, 49);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (100, 17, 49);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (101, 3, 50);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (102, 8, 50);
insert into tblMovieGenre(movieGenreSeq, genreSeq, seq) values (103, 12, 50);



-- 국가
create table tblPCountry(
	countrySeq number primary key,
	name varchar2(100) not null
);

select * from tblPCountry;
drop table tblPCountry;


insert into tblPCountry values(1, '한국');
insert into tblPCountry values(2, '미국');
insert into tblPCountry values(3, '일본');
insert into tblPCountry values(4, '캐나다');
insert into tblPCountry values(5, '홍콩');
insert into tblPCountry values(6, '멕시코');
insert into tblPCountry values(7, '영국');
insert into tblPCountry values(8, '스페인');
insert into tblPCountry values(9, '프랑스');


create table tblMovieCountry (
	movieCountrySeq number primary key,
	seq number not null references tblMovie(seq),
	countrySeq number not null references tblPCountry(countrySeq)
);

select * from tblMovieCountry;
drop table tblMovieCountry;


insert into tblMovieCountry values(1, 1, 2);
insert into tblMovieCountry values(2, 2, 2);
insert into tblMovieCountry values(3, 3, 1);
insert into tblMovieCountry values(4, 4, 1);
insert into tblMovieCountry values(5, 5, 1);
insert into tblMovieCountry values(6, 6, 1);
insert into tblMovieCountry values(7, 7, 2);
insert into tblMovieCountry values(8, 8, 1);
insert into tblMovieCountry values(9, 9, 1);
insert into tblMovieCountry values(10, 10, 1);
insert into tblMovieCountry values(11, 11, 1);
insert into tblMovieCountry values(12, 12, 2);
insert into tblMovieCountry values(13, 13, 2);
insert into tblMovieCountry values(14, 14, 1);
insert into tblMovieCountry values(15, 15, 1);
insert into tblMovieCountry values(16, 16, 2);
insert into tblMovieCountry values(17, 17, 1);
insert into tblMovieCountry values(18, 18, 2);
insert into tblMovieCountry values(19, 18, 4);
insert into tblMovieCountry values(20, 19, 2);
insert into tblMovieCountry values(21, 20, 3);
insert into tblMovieCountry values(22, 21, 5);
insert into tblMovieCountry values(23, 22, 1);
insert into tblMovieCountry values(24, 23, 2);
insert into tblMovieCountry values(25, 24, 3);
insert into tblMovieCountry values(26, 25, 1);
insert into tblMovieCountry values(27, 26, 5);
insert into tblMovieCountry values(28, 27, 1);
insert into tblMovieCountry values(29, 28, 2);
insert into tblMovieCountry values(30, 29, 1);
insert into tblMovieCountry values(31, 30, 2);
insert into tblMovieCountry values(32, 31, 1);
insert into tblMovieCountry values(33, 32, 2);
insert into tblMovieCountry values(34, 33, 1);
insert into tblMovieCountry values(35, 34, 2);
insert into tblMovieCountry values(36, 35, 2);
insert into tblMovieCountry values(37, 36, 3);
insert into tblMovieCountry values(38, 37, 4);
insert into tblMovieCountry values(39, 37, 6);
insert into tblMovieCountry values(40, 37, 7);
insert into tblMovieCountry values(41, 38, 3);
insert into tblMovieCountry values(42, 39, 2);
insert into tblMovieCountry values(43, 40, 2);
insert into tblMovieCountry values(44, 41, 2);
insert into tblMovieCountry values(45, 42, 2);
insert into tblMovieCountry values(46, 43, 1);
insert into tblMovieCountry values(47, 44, 2);
insert into tblMovieCountry values(48, 45, 1);
insert into tblMovieCountry values(49, 46, 7);
insert into tblMovieCountry values(50, 46, 8);
insert into tblMovieCountry values(51, 47, 2);
insert into tblMovieCountry values(52, 48, 9);
insert into tblMovieCountry values(53, 49, 7);
insert into tblMovieCountry values(54, 50, 3);





-- 제작(수입/배급사)
create table tblImport (
	importSeq number primary key,
	name varchar2(100) not null
);


select * from tblImport;
drop table tblImport;


insert into tblImport(importSeq, name) values(1, '워너 브러더스 코리아(주)');
insert into tblImport(importSeq, name) values(2, '월트 디즈니 컴퍼니 코리아');
insert into tblImport(importSeq, name) values(3, '롯데엔터테인먼트');
insert into tblImport(importSeq, name) values(4, '조이앤시네마');
insert into tblImport(importSeq, name) values(5, '소니픽처스코리아');
insert into tblImport(importSeq, name) values(6, '유니버설 픽쳐스');
insert into tblImport(importSeq, name) values(7, '에스엠지홀딩스 주식회사');
insert into tblImport(importSeq, name) values(8, '(주)엔케이컨텐츠');
insert into tblImport(importSeq, name) values(9, '대원미디어(주)');
insert into tblImport(importSeq, name) values(10, '와이드 릴리즈(주)');
insert into tblImport(importSeq, name) values(11, '그린나래미디어(주)');
insert into tblImport(importSeq, name) values(12, '(주)왓챠');
insert into tblImport(importSeq, name) values(13, '즐감');
insert into tblImport(importSeq, name) values(14, '누리픽쳐스');





create table tblDistribute (
	distributeSeq number primary key,
	name varchar2(100) not null
);


select * from tblDistribute;
drop table tblDistribute;



insert into tblDistribute(distributeSeq, name) values(1, '워너 브러더스 코리아(주)');
insert into tblDistribute(distributeSeq, name) values(2, '월트 디즈니 컴퍼니 코리아');
insert into tblDistribute(distributeSeq, name) values(3, 'TCO(주)더콘텐츠온');
insert into tblDistribute(distributeSeq, name) values(4, '에이스메이커');
insert into tblDistribute(distributeSeq, name) values(5, '에이비오엔터테인먼트');
insert into tblDistribute(distributeSeq, name) values(6, '메가박스중앙(주)플러스엠');
insert into tblDistribute(distributeSeq, name) values(7, '롯데엔터테인먼트');
insert into tblDistribute(distributeSeq, name) values(8, '(주)라온컴퍼니플러스');
insert into tblDistribute(distributeSeq, name) values(9, '콘텐츠판다');
insert into tblDistribute(distributeSeq, name) values(10, 'CJ CGV');
insert into tblDistribute(distributeSeq, name) values(11, '(주)제이앤씨미디어그룹');
insert into tblDistribute(distributeSeq, name) values(12, '소니픽처스코리아');
insert into tblDistribute(distributeSeq, name) values(13, '트윈플러스파트너스(주)');
insert into tblDistribute(distributeSeq, name) values(14, '(주)스튜디오 디에이치엘');
insert into tblDistribute(distributeSeq, name) values(15, '(주)키다리스튜디오');
insert into tblDistribute(distributeSeq, name) values(16, '유니버설 픽쳐스');
insert into tblDistribute(distributeSeq, name) values(17, '워터홀 컴퍼니(주)');
insert into tblDistribute(distributeSeq, name) values(18, '(주)씨엠닉스');
insert into tblDistribute(distributeSeq, name) values(19, '(주)디스테이션');
insert into tblDistribute(distributeSeq, name) values(20, '(주)대교');
insert into tblDistribute(distributeSeq, name) values(21, 'CJ ENM');
insert into tblDistribute(distributeSeq, name) values(22, '트리필름');
insert into tblDistribute(distributeSeq, name) values(23, '(주)쇼박스');
insert into tblDistribute(distributeSeq, name) values(24, '씨네소파');
insert into tblDistribute(distributeSeq, name) values(25, '와이드 릴리즈(주)');
insert into tblDistribute(distributeSeq, name) values(26, '그린나래미디어(주)');
insert into tblDistribute(distributeSeq, name) values(27, '(주)스튜디오산타클로스');
insert into tblDistribute(distributeSeq, name) values(28, '(주)영화특별시SMC');
insert into tblDistribute(distributeSeq, name) values(29, '(주)왓챠');
insert into tblDistribute(distributeSeq, name) values(30, '즐감');
insert into tblDistribute(distributeSeq, name) values(31, '(주) 영화제작전원사');
insert into tblDistribute(distributeSeq, name) values(32, '(주)누리픽쳐스');




create table tblMovieDistribute (
	movieDistributeSeq number primary key,
	distributeSeq number references tblDistribute(distributeSeq),
	seq number not null references tblMovie(seq)
);


select * from tblMovieDistribute;
drop table tblMovieDistribute;


insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(1, 1, 1);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(2, 2, 2);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(3, 3, 3);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(4, null, 4);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(5, 4, 5);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(6, 5, 6);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(7, 6, 6);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(8, 7, 7);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(9, 8, 8);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(10, 9, 9);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(11, 6, 10);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(12, 10, 11);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(13, 11, 12);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(14, 12, 13);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(15, 13, 14);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(16, 14, 15);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(17, 15, 15);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(18, 16, 16);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(19, 18, 17);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(20, 7, 18);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(21, 16, 19);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(22, 17, 20);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(23, 19, 21);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(24, 7, 22);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(25, 1, 23);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(26, 20, 24);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(27, 21, 25);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(28, null, 26);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(29, null, 27);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(30, 12, 28);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(31, 22, 29);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(32, 12, 30);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(33, 23, 31);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(34, 16, 32);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(35, 24, 33);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(36, 12, 34);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(37, 2, 35);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(38, null, 36);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(39, 25, 37);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(40, 26, 38);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(41, 27, 39);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(42, 16, 40);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(43, 29, 41);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(44, 28, 41);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(45, 30, 42);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(46, null, 43);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(47, 7, 44);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(48, 31, 45);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(49, 9, 45);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(50, null, 46);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(51, 32, 47);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(52, 11, 48);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(53, 27, 48);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(54, null, 49);
insert into tblMovieDistribute (movieDistributeSeq, distributeSeq, seq) values(55, null, 50);





create table tblMovieImport (
	movieImportSeq number primary key,
	importSeq number references tblImport(importSeq),
	seq number not null references tblMovie(seq)
);


select * from tblMovieImport;
drop table tblMovieImport;


insert into tblMovieImport(movieImportSeq, importSeq, seq) values(1, 1, 1);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(2, 2, 2);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(3, null, 3);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(4, null, 4);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(5, null, 5);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(6, null, 6);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(7, 3, 7);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(8, null, 8);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(9, null, 9);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(10, null, 10);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(11, null, 11);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(12, 4, 12);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(13, 5, 13);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(14, null, 14);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(15, null, 15);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(16, 6, 16);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(17, null, 17);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(18, 3, 18);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(19, 6, 19);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(20, 7, 20);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(21, 8, 21);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(22, null, 22);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(23, 1, 23);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(24, 9, 24);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(25, null, 25);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(26, null, 26);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(27, null, 27);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(28, 5, 28);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(29, null, 29);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(30, 5, 30);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(31, null, 31);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(32, null, 32);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(33, 6, 33);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(34, 5, 34);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(35, 2, 35);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(36, null, 36);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(37, 10, 37);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(38, 11, 38);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(39, 4, 39);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(40, 6, 40);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(41, 12, 41);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(42, 13, 42);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(43, null, 43);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(44, 3, 44);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(45, null, 45);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(46, null, 46);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(47, 14, 47);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(48, 4, 48);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(49, null, 49);
insert into tblMovieImport(movieImportSeq, importSeq, seq) values(50, null, 50);






--등급
create table tblGrade (
	gradeSeq number primary key,
	grade varchar(30),
	seq number not null references tblMovie(seq)
);


select * from tblGrade;
drop table tblGrade;

insert into tblGrade(gradeSeq, grade, seq) values(1, '[국내]12세 관람가', 1);
insert into tblGrade(gradeSeq, grade, seq) values(2, '[국내]12세 관람가', 2);
insert into tblGrade(gradeSeq, grade, seq) values(3, '[국내]12세 관람가', 3);
insert into tblGrade(gradeSeq, grade, seq) values(4, '[국내]15세 관람가', 4);
insert into tblGrade(gradeSeq, grade, seq) values(5, '[국내]15세 관람가', 5);
insert into tblGrade(gradeSeq, grade, seq) values(6, '[국내]15세 관람가', 6);
insert into tblGrade(gradeSeq, grade, seq) values(7, '[국내]12세 관람가', 7);
insert into tblGrade(gradeSeq, grade, seq) values(8, '[국내]15세 관람가', 8);
insert into tblGrade(gradeSeq, grade, seq) values(9, '[국내]15세 관람가', 9);
insert into tblGrade(gradeSeq, grade, seq) values(10, '[국내]15세 관람가', 10);
insert into tblGrade(gradeSeq, grade, seq) values(11, '[국내]15세 관람가', 11);
insert into tblGrade(gradeSeq, grade, seq) values(12, '[국내]15세 관람가', 12);
insert into tblGrade(gradeSeq, grade, seq) values(13, '[국내]12세 관람가', 13);
insert into tblGrade(gradeSeq, grade, seq) values(14, '[국내]15세 관람가', 14);
insert into tblGrade(gradeSeq, grade, seq) values(15, '[국내]15세 관람가', 15);
insert into tblGrade(gradeSeq, grade, seq) values(16, '[국내]15세 관람가', 16);
insert into tblGrade(gradeSeq, grade, seq) values(17, '[국내]15세 관람가', 17);
insert into tblGrade(gradeSeq, grade, seq) values(18, '[국내]전체 관람가', 18);
insert into tblGrade(gradeSeq, grade, seq) values(19, '[국내]전체 관람가', 19);
insert into tblGrade(gradeSeq, grade, seq) values(20, '[국내]15세 관람가', 20);
insert into tblGrade(gradeSeq, grade, seq) values(21, '[국내]15세 관람가', 21);
insert into tblGrade(gradeSeq, grade, seq) values(22, null, 22);
insert into tblGrade(gradeSeq, grade, seq) values(23, '[국내]15세 관람가', 23);
insert into tblGrade(gradeSeq, grade, seq) values(24, '[국내]15세 관람가', 24);
insert into tblGrade(gradeSeq, grade, seq) values(25, null, 25);
insert into tblGrade(gradeSeq, grade, seq) values(26, '[국내]15세 관람가', 26);
insert into tblGrade(gradeSeq, grade, seq) values(27, '[국내]전체 관람가', 27);
insert into tblGrade(gradeSeq, grade, seq) values(28, '[국내]12세 관람가', 28);
insert into tblGrade(gradeSeq, grade, seq) values(29, '[국내]청소년 관람불가', 29);
insert into tblGrade(gradeSeq, grade, seq) values(30, '[국내]15세 관람가', 30);
insert into tblGrade(gradeSeq, grade, seq) values(31, '[국내]12세 관람가', 31);
insert into tblGrade(gradeSeq, grade, seq) values(32, '[국내]12세 관람가', 32);
insert into tblGrade(gradeSeq, grade, seq) values(33, '[국내]12세 관람가', 33);
insert into tblGrade(gradeSeq, grade, seq) values(34, '[국내]12세 관람가', 34);
insert into tblGrade(gradeSeq, grade, seq) values(35, null, 35);
insert into tblGrade(gradeSeq, grade, seq) values(36, '[국내]12세 관람가', 36);
insert into tblGrade(gradeSeq, grade, seq) values(37, '[국내]전체 관람가', 37);
insert into tblGrade(gradeSeq, grade, seq) values(38, '[국내]15세 관람가', 38);
insert into tblGrade(gradeSeq, grade, seq) values(39, '[국내]12세 관람가', 39);
insert into tblGrade(gradeSeq, grade, seq) values(40, '[국내]12세 관람가', 40);
insert into tblGrade(gradeSeq, grade, seq) values(41, '[국내]15세 관람가', 41);
insert into tblGrade(gradeSeq, grade, seq) values(42, '[국내]15세 관람가', 42);
insert into tblGrade(gradeSeq, grade, seq) values(43, null, 43);
insert into tblGrade(gradeSeq, grade, seq) values(44, '[국내]12세 관람가', 44);
insert into tblGrade(gradeSeq, grade, seq) values(45, '[국내]12세 관람가', 45);
insert into tblGrade(gradeSeq, grade, seq) values(46, '[국내]전체 관람가', 46);
insert into tblGrade(gradeSeq, grade, seq) values(47, '[국내]12세 관람가', 47);
insert into tblGrade(gradeSeq, grade, seq) values(48, '[국내]15세 관람가', 48);
insert into tblGrade(gradeSeq, grade, seq) values(49, '[국내]12세 관람가', 49);
insert into tblGrade(gradeSeq, grade, seq) values(50, '[국내]전체 관람가', 50);



-- 관련 영화 추천
create table tblReMovie(
	reMovieSeq number primary key,
	reMoiveName varchar2(100) not null
);

select * from tblReMovie;
drop table tblReMovie;



insert into tblReMovie values(1, '신비한 동물사전');
insert into tblReMovie values(2, '로스트 시티');
insert into tblReMovie values(3, '살인의 추억');
insert into tblReMovie values(4, '영화명');
insert into tblReMovie values(5, '다운');
insert into tblReMovie values(6, '킹메이커');
insert into tblReMovie values(7, '퍼펙트맨');
insert into tblReMovie values(8, '더 게임');
insert into tblReMovie values(9, '피와 불');
insert into tblReMovie values(10, '더 배트맨');
insert into tblReMovie values(11, '닥터 스트레인지:대혼돈의 멀티버스');
insert into tblReMovie values(12, '검은 사제들');
insert into tblReMovie values(13, '숨바꼭질');
insert into tblReMovie values(14, '도굴');
insert into tblReMovie values(15, '앵커');
insert into tblReMovie values(16, '형');
insert into tblReMovie values(17, '너의 이름은');
insert into tblReMovie values(18, '어벤져스: 인피니티 워');
insert into tblReMovie values(19, '가족 계획');
insert into tblReMovie values(20, '범죄도시2');
insert into tblReMovie values(21, '주토피아');
insert into tblReMovie values(22, '슈퍼 소닉2');
insert into tblReMovie values(23, '귀멸의 칼날: 나타구모산 편');
insert into tblReMovie values(24, '화양연화');
insert into tblReMovie values(25, '괴물');
insert into tblReMovie values(26, '이스케이프');
insert into tblReMovie values(27, '학살기관');
insert into tblReMovie values(28, '루시드 드림');
insert into tblReMovie values(29, '어스');
insert into tblReMovie values(30, '숲속의 부부');
insert into tblReMovie values(31, '범죄와의 전쟁 : 나쁜놈들 전성시대');
insert into tblReMovie values(32, '신비한 동물들과 덤블도어의 비밀');
insert into tblReMovie values(33, '평화로운 나날');
insert into tblReMovie values(34, '걸프렌드');
insert into tblReMovie values(35, '셰익스피어 인 러브');
insert into tblReMovie values(36, '온리 포 유');
insert into tblReMovie values(37, '앰뷸런스');
insert into tblReMovie values(38, '배드 가이즈');
insert into tblReMovie values(39, '미션 임파서블 7');
insert into tblReMovie values(40, '뜨거운 피');
insert into tblReMovie values(41, '이스케이프 런');
insert into tblReMovie values(42, '극장판 시그널');





create table tblRecommend (
	recommendSeq number primary key,
	recommendNum number references tblReMovie(reMovieSeq),
    seq number not null references tblMovie(seq)
);


select * from tblRecommend;
drop table tblRecommend;

insert into tblRecommend values(1, 1, 1);
insert into tblRecommend values(2, 2, 2);
insert into tblRecommend values(3, 5, 3);
insert into tblRecommend values(4, 3, 3);
insert into tblRecommend values(5, 6, 4);
insert into tblRecommend values(6, 7, 4);
insert into tblRecommend values(7, 8, 5);
insert into tblRecommend values(8, 9, 5);
insert into tblRecommend values(9, 10, 6);
insert into tblRecommend values(10, 11, 7);
insert into tblRecommend values(11, 12, 8);
insert into tblRecommend values(12, 13, 9);
insert into tblRecommend values(13, 14, 10);
insert into tblRecommend values(14, 15, 11);
insert into tblRecommend values(15, 16, 11);
insert into tblRecommend values(16, 17, 12);
insert into tblRecommend values(17, 11, 13);
insert into tblRecommend values(18, 18, 13);
insert into tblRecommend values(19, 19, 14);
insert into tblRecommend values(20, 10, 15);
insert into tblRecommend values(21, 20, 16);
insert into tblRecommend values(22, 15, 17);
insert into tblRecommend values(23, 21, 18);
insert into tblRecommend values(24, 22, 19);
insert into tblRecommend values(25, 23, 20);
insert into tblRecommend values(26, 24, 21);
insert into tblRecommend values(27, 25, 22);
insert into tblRecommend values(28, 26, 23);
insert into tblRecommend values(29, 27, 24);
insert into tblRecommend values(30, 25, 25);
insert into tblRecommend values(31, 28, 26);
insert into tblRecommend values(32, 22, 27);
insert into tblRecommend values(33, 29, 28);
insert into tblRecommend values(34, 30, 29);
insert into tblRecommend values(35, 2, 30);
insert into tblRecommend values(36, 31, 31);
insert into tblRecommend values(37, 32, 32);
insert into tblRecommend values(38, 33, 33);
insert into tblRecommend values(39, 11, 34);
insert into tblRecommend values(40, 11, 35);
insert into tblRecommend values(41, null, 36);
insert into tblRecommend values(42, 22, 37);
insert into tblRecommend values(43, 34, 38);
insert into tblRecommend values(44, 35, 39);
insert into tblRecommend values(45, 7, 40);
insert into tblRecommend values(46, 36, 40);
insert into tblRecommend values(47, 37, 41);
insert into tblRecommend values(48, 38, 42);
insert into tblRecommend values(49, 2, 43);
insert into tblRecommend values(50, 39, 44);
insert into tblRecommend values(51, 15, 45);
insert into tblRecommend values(52, 22, 46);
insert into tblRecommend values(53, 21, 46);
insert into tblRecommend values(54, 25, 47);
insert into tblRecommend values(55, 40, 48);
insert into tblRecommend values(56, 41, 49);
insert into tblRecommend values(57, 42, 50);







-- 평점
create table tblScore(
	scoreSeq number primary key,
    seq number not null references tblMovie(seq)
);

select * from tblScore;
drop table tblScore;



insert into tblScore(scoreSeq, seq) values (1, 1);
insert into tblScore(scoreSeq, seq) values (2, 2);
insert into tblScore(scoreSeq, seq) values (3, 3);
insert into tblScore(scoreSeq, seq) values (4, 4);
insert into tblScore(scoreSeq, seq) values (5, 5);
insert into tblScore(scoreSeq, seq) values (6, 6);
insert into tblScore(scoreSeq, seq) values (7, 7);
insert into tblScore(scoreSeq, seq) values (8, 8);
insert into tblScore(scoreSeq, seq) values (9, 9);
insert into tblScore(scoreSeq, seq) values (10, 10);

insert into tblScore(scoreSeq, seq) values (11, 11);
insert into tblScore(scoreSeq, seq) values (12, 12);
insert into tblScore(scoreSeq, seq) values (13, 13);
insert into tblScore(scoreSeq, seq) values (14, 14);
insert into tblScore(scoreSeq, seq) values (15, 15);
insert into tblScore(scoreSeq, seq) values (16, 16);
insert into tblScore(scoreSeq, seq) values (17, 17);
insert into tblScore(scoreSeq, seq) values (18, 18);
insert into tblScore(scoreSeq, seq) values (19, 19);
insert into tblScore(scoreSeq, seq) values (20, 20);

insert into tblScore(scoreSeq, seq) values (21, 21);
insert into tblScore(scoreSeq, seq) values (22, 22);
insert into tblScore(scoreSeq, seq) values (23, 23);
insert into tblScore(scoreSeq, seq) values (24, 24);
insert into tblScore(scoreSeq, seq) values (25, 25);
insert into tblScore(scoreSeq, seq) values (26, 26);
insert into tblScore(scoreSeq, seq) values (27, 27);
insert into tblScore(scoreSeq, seq) values (28, 28);
insert into tblScore(scoreSeq, seq) values (29, 29);
insert into tblScore(scoreSeq, seq) values (30, 30);

insert into tblScore(scoreSeq, seq) values (31, 31);
insert into tblScore(scoreSeq, seq) values (32, 32);
insert into tblScore(scoreSeq, seq) values (33, 33);
insert into tblScore(scoreSeq, seq) values (34, 34);
insert into tblScore(scoreSeq, seq) values (35, 35);
insert into tblScore(scoreSeq, seq) values (36, 36);
insert into tblScore(scoreSeq, seq) values (37, 37);
insert into tblScore(scoreSeq, seq) values (38, 38);
insert into tblScore(scoreSeq, seq) values (39, 39);
insert into tblScore(scoreSeq, seq) values (40, 40);

insert into tblScore(scoreSeq, seq) values (41, 41);
insert into tblScore(scoreSeq, seq) values (42, 42);
insert into tblScore(scoreSeq, seq) values (43, 43);
insert into tblScore(scoreSeq, seq) values (44, 44);
insert into tblScore(scoreSeq, seq) values (45, 45);
insert into tblScore(scoreSeq, seq) values (46, 46);
insert into tblScore(scoreSeq, seq) values (47, 47);
insert into tblScore(scoreSeq, seq) values (48, 48);
insert into tblScore(scoreSeq, seq) values (49, 49);
insert into tblScore(scoreSeq, seq) values (50, 50);





create table tblJournalist (
	journalistSeq number primary key,
    name varchar2(300) not null,
    job varchar2(300) null
);


select * from tblJournalist;
drop table tblJournalist;

insert into tblJournalist(journalistSeq, name, job) values (1, '이은선', '영화저널리스트');
insert into tblJournalist(journalistSeq, name, job) values (2, '정시우', '영화저널리스트');
insert into tblJournalist(journalistSeq, name, job) values (3, '정유미', '영화저널리스트');
insert into tblJournalist(journalistSeq, name, job) values (4, '김성찬', null);
insert into tblJournalist(journalistSeq, name, job) values (5, '김소미', null);
insert into tblJournalist(journalistSeq, name, job) values (6, '임수연', null);
insert into tblJournalist(journalistSeq, name, job) values (7, '송경원', null);
insert into tblJournalist(journalistSeq, name, job) values (8, '이용철', null);
insert into tblJournalist(journalistSeq, name, job) values (9, '오진우', null);
insert into tblJournalist(journalistSeq, name, job) values (10, '이지혜', null);
insert into tblJournalist(journalistSeq, name, job) values (11, '김형석', null);
insert into tblJournalist(journalistSeq, name, job) values (12, '김현수', null);
insert into tblJournalist(journalistSeq, name, job) values (13, '심규한', '<씨네플레이>기자');
insert into tblJournalist(journalistSeq, name, job) values (14, '정재현', null);
insert into tblJournalist(journalistSeq, name, job) values (15, '김소미', null);
insert into tblJournalist(journalistSeq, name, job) values (16, '김철홍', null);
insert into tblJournalist(journalistSeq, name, job) values (17, '박정원', null);




create table tblJournalistScore (
	journalistScoreSeq number primary key,
    score number,
    title varchar2(300),
    journalComment varchar2(300),
    journalistSeq number not null references tblJournalist(journalistSeq),
    scoreSeq number not null references tblScore(scoreSeq)       
);


select * from tblJournalistScore;
drop table tblJournalistScore;


insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (1, 5.67, '뒷전으로 밀려난 뉴트와 동물들은 어디로', '이 시리즈의 신작은 몇 편까지 전편과 다음편을 잇는 가교에 그치려는 걸까.', 1, 1);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (2, 5.00, null, '실화의 무게에 짓눌리다', 4, 3);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (3, 6.14, '염치 없는 사회의 민낯', '원작의 중요한 뼈대는 그대로 지키면서 시공간을 무리 없이 확장했다.', 1, 4);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (4, 5.50, '폭주하는 욕망의 심연', '초반에 제시되는 사건은 인물들의 폐허를 들여다보기 위해 통과하는 일종의 진입로다.', 1, 5);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (5, 5.67, '장단점이 너무 명확한 오락 영화', '오락적 요소는 충분한데 애매하다.', 3, 7);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (6, 4.00, null, '아무리 지구 종말 전날이라도 허술함까지 포용되는 건 아닐 텐데', 6, 8);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (7, 7.00, null, '충청 조폭은 처음이지?', 4, 9);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (8, 6.00, null, '괴담의 짧은 호흡과 모호한 매력이 살아 있는', 5, 10);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (9, 5.00, null, '얼렁뚱땅 억지로 굴러가긴 하지만', 7, 11);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (10, 6.00, null, '할리우드 원톱 액션의 가능성, 크리스 파인', 9, 12);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (11, 5.40, '톰 홀랜드 표 액션 어드벤처', '동명의 인기 게임을 재구성한 액션 어드벤처 영화.', 3, 13);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (12, 5.67, '척박한 현실을 등에 업은 소녀', '<최선의 삶> <낫아웃> 그리고 작년 수많은 영화제에서 각광받은 <성적표의 김민영> 등 스물 즈음의 불완전한 연령대를 담아낸 최근의 한국 영화들 중 <불도저에 탄 소녀>는 그 화력 면에서는 최강이다.', 11, 14);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (13, 6.00, '마이클 베이가 마이클 베이했다', '마이클 베이에게 기대할 수 있는 모든 것들이 총출동한다.', 10, 16);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (14, 7.00, '업그레이드에 성공한 시리즈', '2년 만에 돌아온 <수퍼 소닉> 시리즈.', 3, 18);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (15, 7.00, null, '배드 가이즈의 우정을 건 갱생 테스트', 9, 19);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (16, 6.00, null, '일륜도로 한일간 혐오의 실도 끊어내길', 12, 20);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (17, 7.30, '어둡고, 무겁고, 음울하다. 그게 배트맨이다.', '복수심과 정의감 사이의 어딘가를 바라보며, 영웅과 빌런 사이 어딘가에 서 있는 젊은 배트맨의 고뇌를 담았다.', 13, 23);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (18, 6.00, null, '(인기 시리즈로서)주어진 숙제에 대한 성실한 답변. 고죠 사토루에 별 반개 추가', 7, 24);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (19, 6.00, '진심 어린 첫사랑 이야기', '2000년대 홍콩을 배경으로 두 소녀의 사랑을 그린 퀴어 로맨스 영화.', 3, 26);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (20, 5.67, null, '비정함만 갖고 비장미를 완성할 순 없다', 14, 29);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (21, 5.17, '마블 최강의 안티 히어로라 하기엔…', '병을 고치려다 괴물이 된 모비우스(자레드 레토) 박사는 갑자기 생긴 큰 힘을 파괴 대신 보호에 쓰기로 결정하면서 히어로로 거듭난다.', 10, 30);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (22, 5.43, '두 나라의 아웃사이더', '학문의 자유를 찾아 남한으로 내려온 수학자는 어느 명문 고등학교 경비원으로 일한다.', 11, 31);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (23, 5.50, null, '백번 교육보다 한편의 영화', 8, 33);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (24, 7.09, '성공적으로 완성된 소년 영웅의 성장담', 'MCU라는 어른들의 질서 속에서 갈피를 잃은 스파이더맨의 모습을 걷어내고 가난하고 외롭지만 꿋꿋하게 선을 향하는 캐릭터의 본성을 마침내 회복한다.', 13, 34);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (25, 5.50, '개성 있는 몬스터 애니메이션', '애니메이션에서 몬스터와 학교는 아이들이 좋아하는 몬스터 캐릭터를 대거 등장시킬 수 있는 최적의 조합이다.', 3, 37);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (26, 8.40, null, '말의 파도, 대화의 구조, 이야기의 힘. 참으로 마법이어라', 7, 38);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (27, 6.00, '군더더기 없는 로맨틱 코미디의 정석', '제니퍼 로페즈와 오웬 윌슨은 2000년대와 2010년대를 거쳐 2020년에도 자신들이 로맨틱 코미디의 주인공으로 건재하다는 것을 입증한다.', 3, 40);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (28, 6.00, null, '공감의 아이콘, 크리스틴 벨의 비상', 15, 41);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (29, 8.00, null, '홍상수의 창작론. 아무것도 아닌 것이자 모든 것.', 7, 45);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (30, 5.67, null, '밤하늘의 달까지 따다주는 스펙터클 사랑', 16, 47);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (31, 5.00, null, '생경한 풍경 위에서 피어나는 로맨스 스릴러', 17, 48);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (32, 6.00, null, '스틸레토와 마놀로가 뭔지 알려주마', 8, 49);
insert into tblJournalistScore(journalistScoreSeq, score, title, journalComment, journalistSeq, scoreSeq) values (33, 5.50, null, '바람이 네 미래를 알려주리라', 8, 50);





create table tblAudienceScore (
	audienceScoreSeq number primary key,
    score number null,
    scoreSeq number not null references tblScore(scoreSeq)
);


select * from tblAudienceScore;
select count(*) from tblAudienceScore;
drop table tblAudienceScore;

insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (1, 6.82, 1);--신비한동물들
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (2, null, 2);--닥터스트레인지
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (3, 7.98, 3);--공기살인
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (4, 8.04, 4);--니부모얼굴이보고싶다
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (5, 6.93, 5);--앵커
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (6, null, 6);--범죄도시
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (7, 6.33, 7);--로스트시티
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (8, null, 8);--부기나이트
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (9, 7.15, 9);--봄날
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (10, 5.61, 10);--서울괴담

insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (11, 7.61, 11);--스텔라
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (12, 7.13, 12);--더컨트랙터
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (13, 7.02, 13);--언차티드
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (14, 8.09, 14);--불도저에탄소녀
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (15, 7.03, 15);--뜨거운피
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (16, 7.32, 16);--앰뷸런스
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (17, 10.00, 17);--영희
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (18, 7.76, 18);--수퍼소닉
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (19, null, 19);--배드가이즈
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (20, 9.60, 20);--귀멸의칼날

insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (21, 9.11, 21);--중경삼림
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (22, null, 22);--한산
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (23, 8.05, 23);--더배트맨
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (24, 9.01, 24);--주술회전
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (25, null, 25);--브로커
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (26, 8.00, 26);--내가처음으로사랑한소녀
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (27, 9.92, 27);--세븐틴파워
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (28, null, 28);--엄마
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (29, 10.00, 29);--늑대들
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (30, 6.76, 30);--모비우스

insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (31, 7.97, 31);--이상한나라의수학자
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (32, null, 32);--쥬라기월드
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (33, 6.00, 33);--평평남녀
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (34, 9.11, 34);--스파이더맨
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (35, null, 35);--토르
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (36, 10.00, 36);--버블
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (37, null, 37);--몬스터아카데미
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (38, null, 38);--우연과상상
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (39, null, 39);--민스미트
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (40, 7.45, 40);--메리미

insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (41, 6.97, 41);--쿠폰의여왕
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (42, 6.00, 42);--그날
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (43, 2.00, 43);--야차
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (44, null, 44);--탑건
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (45, 7.83, 45);--소설가의영화
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (46, 10.00, 46);--클라우스
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (47, 5.67, 47);--문폴
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (48, 5.45, 48);--배니싱
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (49, 9.00, 49);--킹키부츠
insert into tblAudienceScore(audienceScoreSeq, score, scoreSeq) values (50, null, 50);--엉덩이탐정


create table tblNetizenScore (
	netizenScoreSeq number primary key,
    score number null,
    scoreSeq number not null references tblScore(scoreSeq)
);


select * from tblNetizenScore;
select count(*) from tblNetizenScore;
drop table tblNetizenScore;

insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (1, 6.48, 1);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (3, 8.61, 3);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (4, 7.84, 4);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (5, 7.30, 5);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (7, 6.13, 7);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (8, 7.08, 8);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (9, 7.70, 9);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (10, 4.82, 10);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (11, 5.99, 11);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (12, 7.07, 12);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (13, 7.53, 13);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (14, 7.86, 14);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (15, 7.34, 15);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (16, 6.90, 16);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (17, 10.00, 17);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (18, 8.29, 18);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (20, 9.27, 20);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (21, 8.90, 21);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (23, 7.20, 23);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (24, 9.26, 24);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (26, 8.36, 26);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (27, 9.38, 27);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (29, 8.20, 29);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (30, 7.19, 30);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (31, 8.25, 31);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (33, 7.67, 33);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (34, 8.82, 34);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (36, 7.85, 36);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (37, 5.38, 37);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (40, 7.66, 40);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (41, 7.07, 41);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (42, 6.00, 42);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (43, 5.34, 43);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (45, 8.02, 45);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (46, 9.81, 46);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (47, 5.11, 47);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (48, 4.11, 48);
insert into tblNetizenScore(netizenScoreSeq, score, scoreSeq) values (49, 8.30, 49);




create table tblAudienceProgress (
	audienceProgressSeq number primary key,
    seq number not null references tblMovie(seq)
);

select * from tblAudienceProgress;
select count(*) from tblAudienceProgress;

insert into tblAudienceProgress(audienceProgressSeq, seq) values (1, 1);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (2, 2);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (3, 3);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (4, 4);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (5, 5);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (6, 6);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (7, 7);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (8, 8);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (9, 9);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (10, 10);


insert into tblAudienceProgress(audienceProgressSeq, seq) values (11, 11);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (12, 12);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (13, 13);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (14, 14);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (15, 15);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (16, 16);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (17, 17);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (18, 18);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (19, 19);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (20, 20);

insert into tblAudienceProgress(audienceProgressSeq, seq) values (21, 21);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (22, 22);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (23, 23);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (24, 24);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (25, 25);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (26, 26);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (27, 27);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (28, 28);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (29, 29);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (30, 30);

insert into tblAudienceProgress(audienceProgressSeq, seq) values (31, 31);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (32, 32);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (33, 33);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (34, 34);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (35, 35);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (36, 36);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (37, 37);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (38, 38);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (39, 39);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (40, 40);

insert into tblAudienceProgress(audienceProgressSeq, seq) values (41, 41);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (42, 42);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (43, 43);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (44, 44);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (45, 45);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (46, 46);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (47, 47);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (48, 48);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (49, 49);
insert into tblAudienceProgress(audienceProgressSeq, seq) values (50, 50);



create table tblGender (
	genderSeq number primary key,
    male number not null,
    female number not null,
    audienceProgressSeq number references tblAudienceProgress(audienceProgressSeq),
    audienceScoreSeq number references tblAudienceScore(audienceScoreSeq),
    netizenScoreSeq number references tblNetizenScore(netizenScoreSeq)
);


select * from tblGender;
select count(*) from tblGender;
drop table tblGender;

insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (1, 47, 53, 1, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (2, 54, 46, 3, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (3, 56, 44, 4, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (4, 58, 42, 5, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (5, 54, 46, 7, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (6, 68, 32, 9, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (7, 52, 48, 10, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (8, 56, 44, 11, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (9, 69, 31, 12, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (10, 57, 43, 13, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (11, 64, 36, 14, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (12, 62, 38, 15, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (13, 62, 38, 16, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (14, 62, 38, 18, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (15, 56, 44, 20, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (16, 31, 69, 21, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq)values (17, 65, 35, 23, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq)values (18, 44, 56, 24, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (19, 20, 80, 26, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (20, 0, 100, 27, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (21, 50, 50, 29, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (22, 59, 41, 30, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (23, 57, 43, 31, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (24, 100, 0, 33, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (25, 63, 37, 34, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (26, 52, 48, 40, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (27, 53, 47, 41, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (28, 64, 36, 45, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (29, 60, 40, 47, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (30, 53, 47, 48, null, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (31, 25, 75, 49, null, null);


insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (32, 6.37, 7.31, null, 1, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (33, 7.37, 8.43, null, 3, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (34, 7.34, 8.17, null, 4, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (35, 6.71, 8.28, null, 5, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (36, 5.98, 6.79, null, 7, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (37, 8.00, 0.00, null, 8, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (38, 7.31, 7.06, null, 9, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (39, 5.69, 5.57, null, 10, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (40, 5.09, 7.05, null, 11, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (41, 7.13, 7.23, null, 12, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (42, 6.89, 7.20, null, 13, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (43, 7.86, 8.50, null, 14, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (44, 6.89, 7.23, null, 15, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (45, 7.29, 7.46, null, 16, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (46, 7.78, 7.75, null, 18, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (47, 9.56, 9.65, null, 20, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (48, 8.86, 9.22, null, 21, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (49, 8.01, 8.12, null, 23, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (50, 8.68, 9.30, null, 24, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (51, 6.00, 8.60, null, 26, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (52, 9.50, 9.96, null, 27, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (53, 10.0, 10.0, null, 29, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (54, 6.63, 7.00, null, 30, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (55, 7.81, 8.18, null, 31, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (56, 6.00, 7.00, null, 33, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (57, 9.11, 9.11, null, 34, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (58, 7.55, 7.31, null, 40, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (59, 7.19, 6.83, null, 41, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (60, 7.83, 7.50, null, 45, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (61, 5.55, 5.92, null, 47, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (62, 4.66, 6.33, null, 48, null);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (63, 8.75, 9.40, null, 49, null);


insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (64, 5.13, 7.52, null, null, 1);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (65, 8.01, 9.33, null, null, 3);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (66, 7.40, 8.17, null, null, 4);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (67, 6.75, 8.29, null, null, 5);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (68, 5.37, 6.23, null, null, 7);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (69, 6.37, 9.47, null, null, 8);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (70, 7.22, 8.36, null, null, 9);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (71, 4.27, 5.22, null, null, 10);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (72, 5.19, 7.11, null, null, 11);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (73, 6.68, 7.70, null, null, 12);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (74, 7.08, 8.74, null, null, 13);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (75, 6.93, 9.56, null, null, 14);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (76, 7.10, 7.98, null, null, 15);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (77, 6.31, 7.64, null, null, 16);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (78, 10.00, 0, null, null,17);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (79, 8.63, 9.54, null, null, 18);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (80, 8.76, 9.54, null, null, 20);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (81, 8.66, 9.19, null, null, 21);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (82, 6.88, 7.39, null, null, 23);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (83, 8.80, 9.73, null, null, 24);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (84, 7.00, 8.94, null, null, 26);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (85, 4.11, 10.00, null, null, 27);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (86, 7.00, 10.00, null, null, 29);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (87, 6.95, 8.30, null, null, 30);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (88, 7.91, 8.96, null, null, 31);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (89, 8.00, 10.00, null, null, 33);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (90, 8.62, 8.99, null, null, 34);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (91, 7.28, 8.88, null, null, 36);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (92, 2.67, 6.00, null, null, 37);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (93, 7.29, 8.95, null, null, 40);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (94, 6.60, 7.75, null, null, 41);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (95, 4.85, 7.04, null, null, 43);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (96, 7.79, 9.38, null, null, 45);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (97, 9.71, 9.89, null, null, 46);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (98, 4.85, 5.57, null, null, 47);
insert into tblGender(genderSeq, male, female, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (99, 2.94, 3.51, null, null, 48);





create table tblAge (
    ageSeq number primary key,
    teen number not null,
    twenty number not null,
    thirty number not null,
    forty number not null,
    fifty number not null,
    audienceProgressSeq number references tblAudienceProgress(audienceProgressSeq),
    audienceScoreSeq number references tblAudienceScore(audienceScoreSeq),
    netizenScoreSeq number references tblNetizenScore(netizenScoreSeq)
);


select count(*) from tblAge;
drop table tblAge;
select * from tblAge;

--네티즌
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (1, 7.53, 6.36, 5.94, 6.07, 6.53, null, null, 1);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (2, 8.63, 8.29, 8.74, 8.85, 8.91, null, null, 3);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (3, 8.49, 7.37, 7.91, 7.82, 7.64, null, null, 4);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (4, 9.10, 7.64, 7.62, 6.73, 6.67, null, null, 5);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (5, 6.11, 6.76, 6.26, 4.79, 4.61, null, null, 7);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (6, 0.00, 7.78, 7.29, 7.03, 5.83, null, null, 8);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (7, 5.50, 8.10, 8.20, 7.58, 7.18, null, null, 9);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (8, 5.04, 4.02, 5.29, 5.75, 4.56, null, null, 10);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (9, 1.00, 8.43, 7.22, 6.56, 6.67, null, null, 12);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (10, 8.73, 7.80, 7.42, 7.56, 7.31, null, null, 13);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (11, 9.50, 8.55, 7.42, 7.43, 8.17, null, null, 14);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (12, 6.12, 7.40, 7.60, 7.36, 7.43, null, null, 15);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (13, 6.14, 6.96, 6.32, 6.72, 6.70, null, null, 16);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (14, 9.28, 8.75, 8.89, 8.96, 7.75, null, null, 18);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (15, 9.51, 9.41, 9.02, 7.92, 8.10, null, null, 20);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (16, 8.95, 8.99, 8.78, 8.64, 8.49, null, null, 21);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (17, 8.64, 7.27, 6.62, 6.67, 6.92, null, null, 23);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (18, 9.75, 9.34, 8.77, 8.73, 9.24, null, null, 24);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (19, 4.00, 9.56, 9.00, 7.33, 7.50, null, null, 26);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (20, 9.50, 9.04, 8.20, 10.0, 10.0, null, null, 27);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (21, 0.00, 5.50, 7.75, 10.0, 0.00, null, null, 29);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (22, 6.30, 6.88, 7.70, 7.92, 7.67, null, null, 30);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (23, 9.23, 7.92, 8.01, 8.42, 8.58, null, null, 31);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (24, 0.00, 0.00, 0.00, 8.67, 8.00, null, null, 33);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (25, 9.57, 8.99, 8.52, 7.79, 7.43, null, null, 34);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (26, 0.00, 8.54, 8.69, 7.39, 7.60, null, null, 40);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (27, 0.00, 4.00, 7.00, 8.17, 0.00, null, null, 41);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (28, 9.50, 7.50, 8.33, 8.08, 8.70, null, null, 45);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (29, 5.29, 4.81, 5.01, 5.11, 4.98, null, null, 47);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (30, 3.07, 2.08, 2.81, 3.39, 3.92, null, null, 48);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty,audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (31, 10.0, 6.00, 8.50, 8.00, 0.00, null, null, 49);

--관람객
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (32, 7.35, 6.99, 6.67, 6.95, 6.81, null, 1, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (33, 10.0, 7.91, 7.65, 8.00, 9.00, null, 3, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (34, 7.00, 7.85, 7.71, 7.97, 7.91, null, 4, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (35, 8.60, 7.29, 6.93, 6.74, 6.44, null, 5, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (36, 7.50, 6.33, 6.11, 6.63, 6.69, null, 7, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (37, 5.50, 6.62, 7.20, 8.00, 7.62, null, 9, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (38, 5.50, 5.23, 5.75, 5.93, 6.75, null, 10, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (39, 0.00, 7.80, 7.22, 8.50, 6.00, null, 11, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (40, 0.00, 6.67, 7.15, 7.64, 7.00, null, 12, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (41, 8.47, 6.91, 7.00, 6.95, 7.33, null, 13, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (42, 0.00, 8.42, 8.67, 7.50, 7.00, null, 14, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (43, 6.71, 6.98, 6.87, 7.42, 6.85, null, 15, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (44, 8.62, 7.14, 7.39, 7.29, 7.93, null, 16, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (45, 8.25, 7.84, 7.68, 7.90, 7.57, null, 18, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (46, 9.78, 9.67, 9.50, 9.34, 9.31, null, 20, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (47, 9.44, 9.08, 9.12, 9.18, 8.95, null, 21, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (48, 8.84, 8.10, 7.95, 8.07, 7.93, null, 23, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (49, 9.67, 9.30, 8.55, 8.51, 8.38, null, 24, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (50, 10.0, 9.50, 6.00, 6.00, 7.00, null, 26, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (51, 10.0, 10.0, 9.60, 10.0, 0.00, null, 27, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (52, 0.00, 0.00, 10.0, 7.00, 0.00, null, 29, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (53, 6.56, 6.61, 6.72, 7.18, 7.07, null, 30, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (54, 8.00, 7.85, 7.82, 8.31, 8.19, null, 31, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (55, 0.00, 0.00, 6.00, 6.50, 0.00, null, 33, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (56, 9.58, 9.24, 9.08, 8.78, 8.36, null, 34, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (57, 7.00, 7.21, 7.12, 8.44, 7.50, null, 40, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (58, 0.00, 6.53, 6.92, 7.70, 7.17, null, 41, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (59, 8.50, 7.50, 7.91, 7.72, 7.71, null, 45, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (60, 8.50, 5.08, 5.76, 6.37, 5.55, null, 47, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty, audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (61, 5.50, 5.31, 5.81, 5.16, 5.05, null, 48, null);
insert into tblAge(ageSeq, teen, twenty, thirty, forty, fifty,audienceProgressSeq, audienceScoreSeq, netizenScoreSeq) values (62, 9.00, 9.40, 8.50, 0.00, 9.50, null, 49, null);


create table tblImpression (
    impressionSeq number primary key,
    direction number not null,
    acting number not null,
    story number not null,
    visualBeauty number not null,
    ost number not null,
    audienceScoreSeq number references tblAudienceScore(audienceScoreSeq),
    netizenScoreSeq number references tblNetizenScore(netizenScoreSeq)
);

select count(*) from tblimpression;
select * from tblimpression;


insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (1, 18, 24, 15, 31, 12, null, 1);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (2, 24, 29, 33, 8, 6, null, 3);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (3, 20, 44, 25, 7, 4, null, 4);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (4, 20, 46, 21, 8, 5, null, 5);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (5, 13, 44, 12, 23, 8, null, 7);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (6, 22, 33, 22, 10, 12, null, 8);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (7, 22, 44, 18, 8, 8, null, 9);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (8, 23, 29, 22, 15, 12, null, 10);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (9, 13, 35, 29, 12, 11, null, 11);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (10, 20, 47, 17, 12, 3, null, 12);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (11, 22, 28, 16, 28, 7, null, 13);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (12, 17, 50, 20, 6, 7, null, 14);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (13, 19, 47, 20, 8, 6, null, 15);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (14, 29, 24, 10, 27, 9, null, 16);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (15, 25, 12, 25, 25, 12, null, 17);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (16, 24, 17, 18, 30, 10, null, 18);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (17, 25, 13, 21, 24, 18, null, 20);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (18, 22, 17, 12, 27, 22, null, 21);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (19, 24, 20, 16, 23, 17, null, 23);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (20, 26, 12, 21, 23, 19, null, 24);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (21, 18, 25, 20, 24, 13, null, 26);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (22, 26, 12, 22, 21, 18, null, 27);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (23, 16, 21, 21, 32, 11, null, 29);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (24, 19, 32, 17, 27, 6, null, 30);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (25, 16, 38, 23, 9, 13, null, 31);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (26, 20, 60, 20, 0, 0, null, 33);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (27, 25, 20, 25, 20, 10, null, 34);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (28, 25, 11, 12, 32, 21, null, 36);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (29, 32, 14, 27, 14, 14, null, 37);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (30, 10, 25, 16, 12, 37, null, 40);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (31, 11, 41, 39, 1, 1, null, 41);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (32, 100, 0, 0, 0, 0, null, 42);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (33, 23, 31, 20, 16, 9, null, 43);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (34, 32, 34, 20, 11, 3, null, 45);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (35, 22, 10, 33, 22, 14, null, 46);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (36, 20, 13, 17, 42, 8, null, 47);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (37, 18, 38, 16, 11, 17, null, 48);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (38, 20, 17, 20, 17, 27, null, 49);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (39, 15, 29, 10, 36, 10, 1, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (40, 21, 34, 32, 6, 7, 3, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (41, 18, 50, 24, 5, 3, 4, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (42, 14, 58, 16, 6, 4, 5, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (43, 12, 47, 12, 22, 8, 7, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (44, 25, 25, 0, 25, 25, 8, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (45, 16, 54, 21, 4, 4, 9, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (46, 18, 35, 19, 18, 11, 10, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (47, 15, 36, 21, 11, 17, 11, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (48, 18, 49, 19, 12, 3, 12, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (49, 19, 30, 11, 34, 6, 13, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (50, 21, 51, 16, 9, 4, 14, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (51, 17, 52, 17, 8, 6, 15, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (52, 31, 28, 7, 26, 8, 16, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (53, 21, 18, 16, 34, 10, 18, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (54, 26, 12, 21, 26, 16, 20, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (55, 22, 16, 11, 29, 21, 21, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (56, 24, 22, 14, 25, 16, 23, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (57, 26, 10, 21, 25, 18, 24, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (58, 19, 25, 12, 25, 19, 26, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (59, 21, 11, 20, 27, 20, 27, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (60, 14, 43, 14, 14, 14, 29, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (61, 19, 38, 9, 28, 6, 30, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (62, 14, 46, 19, 8, 12, 31, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (63, 0, 100, 0, 0, 0, 33, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (64, 25, 20, 26, 20, 9, 34, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (65, 8, 26, 16, 9, 41, 40, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (66, 10, 41, 40, 3, 6, 41, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (67, 30, 37, 20, 11, 2, 45, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (68, 18, 14, 12, 51, 6, 47, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (69, 17, 45, 14, 10, 13, 48, null);
insert into tblImpression(impressionSeq, direction, acting, story, visualBeauty, ost, audienceScoreSeq, netizenScoreSeq) values (70, 21, 18, 18, 14, 29, 49, null);





-- 기대지수
create table tblExpect (
	expectSeq number primary key,
	likeNum number not null,
    dislikeNum number not null,
    seq number not null references tblMovie(seq)	
);

select * from tblExpect;
select count(*) from tblExpect;


insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (1, 34772, 950, 2);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (2, 24513, 676, 6);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (3, 608, 30, 19);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (4, 8499, 411, 22);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (5, 5072, 161, 25);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (6, 295, 41, 28);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (7, 11148, 253, 32);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (8, 2429, 75, 35);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (9, 261, 6, 38);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (10, 244, 9, 39);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (11, 4994, 115, 44);
insert into tblExpect(expectSeq, likeNum, dislikeNum, seq) values (12, 225, 12, 50);


-- 제작진
create table tblAuthor (
    authorSeq number primary key,
    name varchar2(100),
    nameEng varchar2(100),
    seq number not null references tblMovie(seq)
);

drop table tblAuthor;

select * from tblAuthor;

insert into tblAuthor (authorSeq, name, nameEng, seq) values (1,'조앤 K. 롤링','Joan K. Rowling',1);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (2,'스탠 리','Stan Lee',2);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (3,'조용선',null,3);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (4,'김경미',null,4);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (5,'정지연','Ji yeon Jung',5);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (6,null,null,6);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (7,'데이너 폭스','Dana Fox',7);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (8,'김경엽',null,8);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (9,'이돈구','Donku LEE',9);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (10,'김도윤',null,10);

insert into tblAuthor (authorSeq, name, nameEng, seq) values (11,'배세영',null,11);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (12,null,null,12);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (13,'레이프 저드킨스','Rafe Judkins',13);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (14,'박이웅','PARK Ri-woong',14);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (15,'천명관',null,15);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (16,null,null,16);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (17,'차상민',null,17);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (18,null,null,18); 
insert into tblAuthor (authorSeq, name, nameEng, seq) values (19,null,null,19);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (20,'고토게 코요하루','Koyoharu Gotoge',20);

insert into tblAuthor (authorSeq, name, nameEng, seq) values (21,'왕가위', 'Kar Wai Wong',21);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (22,null,null,22);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (23,'벤 애플렉','Ben Affleck',23);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (24,null,null,24);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (25,'고레에다 히로카즈','Hirokazu Koreeda',25);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (26,null,null,26);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (27,null,null,27); 
insert into tblAuthor (authorSeq, name, nameEng, seq) values (28,null,null,28);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (29,'전규환','Jeon Kyu hwan',29);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (30,'매트 사자마','Matt Sazama',30);

insert into tblAuthor (authorSeq, name, nameEng, seq) values (31,null,null,31);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (32,'콜린 트레보로우','Colin Trevorrow',32);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (33,'김수정','KIM Soojung',33);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (34,'크리스 맥켄나','Chris McKenna',34);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (35,'타이카 와이티티','Taika Waititi',35);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (36,null,null,36);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (37,null,null,37);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (38,'하마구치 류스케','Hamaguchi Ryusuke',38);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (39,null,null,39);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (40,null,null,40);

insert into tblAuthor (authorSeq, name, nameEng, seq) values (41,null,null,41);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (42,null,null,42);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (43,null,null,43);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (44,'피터 크레이그', 'Peter Craig',44);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (45,'홍상수', 'Hong Sang soo',45);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (46,null,null,46);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (47,null,null,47);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (48,null,null,48);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (49,null,null,49);
insert into tblAuthor (authorSeq, name, nameEng, seq) values (50,null,null,50);



-- 회원
create table tblPMember (
    idSeq number primary key,
    id varchar2(100) not null
);

select * from tblMember;

insert into tblPMember (idSeq, id) values (1,'tlaw');
insert into tblPMember (idSeq, id) values (2,'silv');
insert into tblPMember (idSeq, id) values (3,'adon');
insert into tblPMember (idSeq, id) values (4,'wlwh');
insert into tblPMember (idSeq, id) values (5,'band');
insert into tblPMember (idSeq, id) values (6,'ssam');
insert into tblPMember (idSeq, id) values (7,'ooo');
insert into tblPMember (idSeq, id) values (8,'jbb1');
insert into tblPMember (idSeq, id) values (9,'yihw');
insert into tblPMember (idSeq, id) values (10,'kih0');

insert into tblPMember (idSeq, id) values (11,'kjmj');
insert into tblPMember (idSeq, id) values (12,'i2kr');
insert into tblPMember (idSeq, id) values (13,'euna');
insert into tblPMember (idSeq, id) values (14,'beat');
insert into tblPMember (idSeq, id) values (15,'kii1');
insert into tblPMember (idSeq, id) values (16,'alal');
insert into tblPMember (idSeq, id) values (17,'face');
insert into tblPMember (idSeq, id) values (18,'nwhg');
insert into tblPMember (idSeq, id) values (19,'hyoj');
insert into tblPMember (idSeq, id) values (20,'yeji');

insert into tblPMember (idSeq, id) values (21,'vita');
insert into tblPMember (idSeq, id) values (22,'miy9');
insert into tblPMember (idSeq, id) values (23,'sphp');
insert into tblPMember (idSeq, id) values (24,'jsa3');
insert into tblPMember (idSeq, id) values (25,'esso');
insert into tblPMember (idSeq, id) values (26,'ally');
insert into tblPMember (idSeq, id) values (27,'seoh');
insert into tblPMember (idSeq, id) values (28,'twin');
insert into tblPMember (idSeq, id) values (29,'baks');
insert into tblPMember (idSeq, id) values (30,'cold');

insert into tblPMember (idSeq, id) values (31,'kimj');
insert into tblPMember (idSeq, id) values (32,'pose');
insert into tblPMember (idSeq, id) values (33,'ppmh');
insert into tblPMember (idSeq, id) values (34,'yclo');
insert into tblPMember (idSeq, id) values (35,'now');
insert into tblPMember (idSeq, id) values (36,'siio');
insert into tblPMember (idSeq, id) values (37,'suns');
insert into tblPMember (idSeq, id) values (38,'exci');


-- 한줄평
create table tblComment (
    commentSeq number primary key,
    score number not null,
    regdate date not null,
    good number not null,
    bad number not null,
    commentWhat varchar2(300) not null,
    idSeq number not null references tblPMember(idSeq),
    seq number not null references tblMovie(seq)
);

select * from tblComment;

insert into tblComment values (1, 6,  to_date('2022/04/13', 'yyyy-mm-dd'), 436, 37, '이 시리즈의 끝을 꼭 봐야겠어', 1, 1);				
insert into tblComment values (2, 10, to_date('2022/04/22', 'yyyy-mm-dd'), 132, 24, '방금 보고나왔는데요 최근 한국영화중 최고.. 배우들 연기는 물론이고 스토리도 최고였음 얼른 이 문제 해결되길 바람... 대한민국 국민이면 이 영화 한번 쯤 보는게 좋을 듯',2,3);
insert into tblComment values (3, 10, to_date('2022/04/27', 'yyyy-mm-dd'), 71, 3, '나는 다를 수 있을까...',3,4) ;
insert into tblComment values (4, 8,  to_date('2022/04/20', 'yyyy-mm-dd'), 54, 19, '배우들의 연기가 좋고 긴장감 있었음',4,5);
insert into tblComment values (5, 6,  to_date('2022/04/20', 'yyyy-mm-dd'), 17, 0, '그가 사라지자 영화의 재미도 사라졌다',5,7);
insert into tblComment values (6, 10, to_date('2022/05/01', 'yyyy-mm-dd'), 8, 1,'연기력 구성 다재밌어요 꼭보세요 시간 순삭입니다',6,8);
insert into tblComment values (7, 10, to_date('2022/04/27', 'yyyy-mm-dd'), 21, 4, '손현주 연기 진짜.. 진짜 너무 잘한다',7,9);
insert into tblComment values (8, 5,  to_date('2022/04/27', 'yyyy-mm-dd'), 63, 14, '스토리가 문방구에 파는 500원짜리 괴담집에 나오는 이야기급..',8,10);
insert into tblComment values (9, 1,  to_date('2022/04/10', 'yyyy-mm-dd'), 90, 40, '객 재미없는영화만 평 남기는데 이 영화가 그영화네',9,11);
insert into tblComment values (10, 10, to_date('2022/04/30', 'yyyy-mm-dd'), 5, 0, '비장하고 비참한 상황을 잘 살렸다. 크리스 파인의 연기가 끝내준다.',10,12);

insert into tblComment values (11, 7, to_date('2022/02/16', 'yyyy-mm-dd'), 574, 76, '해적3 - 바다로 간 피터파커',11,13);
insert into tblComment values (12, 8, to_date('2022/04/09', 'yyyy-mm-dd'), 48, 9, '김혜윤 연기가 불도저급',12,14);
insert into tblComment values (13, 2, to_date('2022/03/24', 'yyyy-mm-dd'), 413, 153, '한국영화도 자막 달아야 됨',13,15);
insert into tblComment values (14, 7, to_date('2022/04/07', 'yyyy-mm-dd'), 45, 12, '별다른 스토리 없고 그냥 막 흔들어재낌',14,16);
insert into tblComment values (15, 10,to_date('2022/05/02', 'yyyy-mm-dd'), 2, 2, 'K-조커',15,17);
insert into tblComment values (16, 10,to_date('2022/04/06', 'yyyy-mm-dd'), 42, 5, '이거 소닉팬이면 무조건보세요',16,18);
insert into tblComment values (17, 10,to_date('2021/01/27', 'yyyy-mm-dd'), 3443, 630, '너무 재밌었음 마지막 전투씬은 애니매이션중에선 최고가 아니었을까?..',17,20);
insert into tblComment values (18, 10,to_date('2011/08/08', 'yyyy-mm-dd'), 935, 25, '오늘 이영화를 본 난 영화에는 유통기한이 없다는걸 깨달았다',18,21);
insert into tblComment values (19, 10,to_date('2022/03/01', 'yyyy-mm-dd'), 1079, 254, '원래 dc가 detective comics의 준말임. 이거에 가장 부합하는 영화인 거 같음.',19,23);
insert into tblComment values (20, 10,to_date('2022/02/17', 'yyyy-mm-dd'), 311, 50, '구성 미쳤다 고죠 생얼 나올때마다 헉 하는 관객들 소리 다 들림', 20,24);

insert into tblComment values (21, 7, to_date('2022/04/28', 'yyyy-mm-dd'), 9, 1, '오랜만에 보는 홍콩영화 동성간의 사랑을 주제로 미묘한 감정을 잘 표현한 영상미 아름다운 작품입니다.',21,26);
insert into tblComment values (22, 10, to_date('2022/04/20', 'yyyy-mm-dd'), 15, 1, '평캐다짐하게 만들어주는 영화',22,27);
insert into tblComment values (23, 10, to_date('2022/04/28', 'yyyy-mm-dd'), 2, 1,  '독립영화라고해서 기대안하고 봤다가 완전 만족만족! 배우들 눈빛연기 뭐야뭐야~~~영상미와 OST도 인상적인 영화!',23,29);
insert into tblComment values (24, 8, to_date('2022/03/30', 'yyyy-mm-dd'), 388, 113,  '평론가 평점 못믿겠다 솔직히 베놈2보다 재밌었음쿠키영상 2개도',24,30);
insert into tblComment values (25, 10,to_date('2022,03,09', 'yyyy-mm-dd'), 144, 33,'최민식이 열고 최민식이 닫았다....',25,31);
insert into tblComment values (26, 10,to_date('2022/05/02', 'yyyy-mm-dd'), 3, 0, '다큐인가 영화인가, 영진의 앞날에 평평함만 있기를',26,33);
insert into tblComment values (27, 10, to_date('2021/12/15', 'yyyy-mm-dd'), 10015, 504, '삼십 대의 내가 십 대, 이십 대의 나를 만났다',27,34);
insert into tblComment values (28, 10, to_date('2022/05/01', 'yyyy-mm-dd'), 8, 0, '이 영화 제목그대로 거품입니다.',28,36);
insert into tblComment values (29, 6, to_date('2022/04/29', 'yyyy-mm-dd'), 2, 0, '몬스터 대학교와는 전혀 다른 작품이다',29,37);
insert into tblComment values (30, 10,to_date('2022/03/16', 'yyyy-mm-dd'), 9, 1, '너무 재밌음 눈과 귀기 즐거운 로코의 정석',30,40);

insert into tblComment values (31, 7, to_date('2022/04/27', 'yyyy-mm-dd'), 18, 0, '4월 문화의날 올데이 5천원으로 잘봤습니다.쿠폰 주제의 영화이므로 정가로 관람하지 마세요.',31,41);
insert into tblComment values (32, 6, to_date('2022/05/02', 'yyyy-mm-dd'), 1, 1, '앗싸 1빠 ! 영화 지금 봅니다.',32,42);
insert into tblComment values (33, 2, to_date('2022/04/08', 'yyyy-mm-dd'), 315, 130, '쫔팔린다. 네플릭스엔 올리지 말지...',33,43);
insert into tblComment values (34, 8, to_date('2022/04/20', 'yyyy-mm-dd'), 25, 2, '홍상수감독이 하고픈말? 아깝긴 뭐가 아까워. 초등학생도 아닌데. 다큰 성인이 자기 인생사는데. 상업영화찍으며 돈벌면 안 아까운가?',34,45);
insert into tblComment values (35, 10,to_date('2022/02/17', 'yyyy-mm-dd'), 128, 2, '이 영화 완내스!!! 박박!! 절레절레동화!! 허니잼 꿀잼 개꿀!',35,46);
insert into tblComment values (36, 2, to_date('2022/03/17', 'yyyy-mm-dd'), 260, 37, '역시 Made in China',36,47);
insert into tblComment values (37, 2, to_date('2022/03/30', 'yyyy-mm-dd'), 77, 15, '진짜 해도 너무 하다 할 정도로 이상한 영화..',37,48);
insert into tblComment values (38, 10,to_date('2022/04/30', 'yyyy-mm-dd'), 2, 0, '정말 재미있다 더 많은 사람들이 보기를',38,49);



-- 배우
create table tblActor (
    actorSeq number primary key,
    name varchar2(100),
    nameEng varchar2(100)
);

select * from tblActor;

insert all
    into tblActor (actorSeq, name, nameEng) values (1,'에디 레드메인', 'Eddie Redmayne')
    into tblActor (actorSeq, name, nameEng) values (2,'베네딕트 컴버배치', 'Benedict Cumberbatch')
    into tblActor (actorSeq, name, nameEng) values (3,'김상격',null)
    into tblActor (actorSeq, name, nameEng) values (4,'설경구',null)
    into tblActor (actorSeq, name, nameEng) values (5,'천우희',null)
    into tblActor (actorSeq, name, nameEng) values (6,'마동석','Don Lee')
    into tblActor (actorSeq, name, nameEng) values (7,'산드라 블록','Sandra Bullock')
    into tblActor (actorSeq, name, nameEng) values (8,'최귀화',null)
    into tblActor (actorSeq, name, nameEng) values (9,'손현주',null)
    into tblActor (actorSeq, name, nameEng) values (10,'김도윤',null)
    into tblActor (actorSeq, name, nameEng) values (11,'손호준',null)
    into tblActor (actorSeq, name, nameEng) values (12,'크리스 파인', 'Chris Pine')
    into tblActor (actorSeq, name, nameEng) values (13,'톰 홀랜드','Tom Holland')
    into tblActor (actorSeq, name, nameEng) values (14,'김혜윤',null)
    into tblActor (actorSeq, name, nameEng) values (15,'정우',null)
    into tblActor (actorSeq, name, nameEng) values (16,'제이크 질렌할','Jake Gyllenhaal')
    into tblActor (actorSeq, name, nameEng) values (17,'기은수',null)
    into tblActor (actorSeq, name, nameEng) values (18,'제임스 마스던','James Marsden')
    into tblActor (actorSeq, name, nameEng) values (19,'샘 록웰','Sam Rockwell')
    into tblActor (actorSeq, name, nameEng) values (20,'이경태',null)
    into tblActor (actorSeq, name, nameEng) values (21,'임청하',null)
    into tblActor (actorSeq, name, nameEng) values (22,'박해일',null)
    into tblActor (actorSeq, name, nameEng) values (23,'로버트 패틴슨','Robert Pattinson')
    into tblActor (actorSeq, name, nameEng) values (24,'오가타 메구미','Megumi Ogata')
    into tblActor (actorSeq, name, nameEng) values (25,'송강호','Song Kang-ho')
    into tblActor (actorSeq, name, nameEng) values (26,null,null)
    into tblActor (actorSeq, name, nameEng) values (27,null,null)
    into tblActor (actorSeq, name, nameEng) values (28,'산드라 오','Sandra O')
    into tblActor (actorSeq, name, nameEng) values (29,'오종혁',null)
    into tblActor (actorSeq, name, nameEng) values (30,'자레드 레토','Jared Leto')
    into tblActor (actorSeq, name, nameEng) values (31,'최민식',null)
    into tblActor (actorSeq, name, nameEng) values (32,'크리스 프랫','Chris Pratt')
    into tblActor (actorSeq, name, nameEng) values (33,'이태경','LEE Tae-kyoung')
    into tblActor (actorSeq, name, nameEng) values (34,'톰 홀랜드','Tom Holland')
    into tblActor (actorSeq, name, nameEng) values (35,'크리스 헴스워스','Chris Hemsworth')
    into tblActor (actorSeq, name, nameEng) values (36,null,null)
    into tblActor (actorSeq, name, nameEng) values (37,'김소희',null)
    into tblActor (actorSeq, name, nameEng) values (38,'후루카와 코토네',null)
    into tblActor (actorSeq, name, nameEng) values (39,'콜린 퍼스','Colin Firth')
    into tblActor (actorSeq, name, nameEng) values (40,'제니퍼 로페즈','Jennifer Lopez')
    into tblActor (actorSeq, name, nameEng) values (41,'크리스틴 벨','Kristen Bell')
    into tblActor (actorSeq, name, nameEng) values (42,'숀 애쉬모어','Shawn Ashmore')
    into tblActor (actorSeq, name, nameEng) values (43,'설경구',null)
    into tblActor (actorSeq, name, nameEng) values (44,'톰 크루즈','Tom Cruise')
    into tblActor (actorSeq, name, nameEng) values (45,'이혜영',null)
    into tblActor (actorSeq, name, nameEng) values (46,'제이슨 슈왈츠먼','Jason Schwartzman')
    into tblActor (actorSeq, name, nameEng) values (47,'할리 베리', 'Halle Berry')
    into tblActor (actorSeq, name, nameEng) values (48,'유연석',null)
    into tblActor (actorSeq, name, nameEng) values (49,null,null)
    into tblActor (actorSeq, name, nameEng) values (50,null,null)
select * from dual;




-- 출연배우
create table tblAppearanceActor (
    appearanceActorSeq number primary key,
    name varchar2(100),
    actorSeq number not null references tblActor(actorSeq),
    seq number not null references tblMovie(seq)    
);


insert all
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (1,'뉴트 스캐맨더',1,1)									
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (2,'닥터 스트레인지',2,2)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (3,null,3,3)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (4,null,4,4)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (5,'정세라',5,5)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (6,null,6,6)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (7,null,7,7)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (8,'유빈',8,8)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (9,'호성',9,9)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (10,null,10,10)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (11,'영배',11,11)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (12,'제임스 하퍼',12,12)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (13,'네이선 드레이크',13,13)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (14,'혜영',14,14)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (15,'희수',15,15)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (16,null,16,16)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (17,'영희',17,17)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (18,null,18,18)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (19,null,19,19)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (20,'카마도 탄지로 목소리',20,20)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (21,'노랑머리 마약밀매 중계자',21,21)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (22,null,22,22)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (23,'브루스 웨인/배트맨',23,23)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (24,'옷코츠 유타',24,24)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (25,null,25,25)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (26,null,26,26)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (27,null,27,27)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (28,'아만다',28,28)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (29,null,29,29)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (30,'마이클 모비우스 박사',30,30)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (31,'이학성',31,31)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (32,'오웬 그래디',32,32)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (33,null,33,33)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (34,'피터 파커/스파이더맨',34,34)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (35,'토르',35,35)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (36,null,36,36)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (37,null,37,37)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (38,'메이코',38,38)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (39,null,39,39)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (40,null,40,40)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (41,null,41,41)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (42,null,42,42)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (43,'강인',43,43)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (44,'매버릭',44,44)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (45,'준희',45,45)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (46,null,46,46)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (47,null,47,47)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (48,null,48,48)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (49,null,49,49)
    into tblAppearanceActor (appearanceActorSeq, name,  actorSeq, seq) values (50,null,50,50)
select * from dual;


-- 명대사
create table tblLine (
    lineSeq number primary key,
    line varchar2(255) not null,
    recommend number,
    appearanceActorSeq number not null references tblAppearanceActor(appearanceActorSeq),
    idSeq number not null references tblPMember(idSeq),
    seq number not null references tblMovie(seq)
);

drop table tblLine;

insert into tblLine values (1, '정답, 후플푸프에 3점', 60, 1, 1, 1);						
insert into tblLine values (2, '죄 없는 사람들이 죽은거 잖아!', 4, 3, 2, 3);
insert into tblLine values (3, '동반자살이 아니라 살인 후 자살입니다.', 4, 5, 4, 5);
insert into tblLine values (4, '니그로요??', 23, 13, 11, 13);
insert into tblLine values (5, '희수야~ 니는 어디로 갈끼고!', 41, 15, 13, 15);
insert into tblLine values (6, '왼쪽으로', 5, 16, 14, 16);
insert into tblLine values (7, 'Gotta Go Fast', 1, 18, 16, 18);
insert into tblLine values (8, '내 가족들이 할 리가 없잖아! 그런 소리를!', 518, 20, 17, 20);
insert into tblLine values (9, '사람은 변한다. 어제 파인애플을 좋아했던 사람이 오늘은 아닐 수도 있다', 186, 21, 18, 21);
insert into tblLine values (10, '나는 복수다', 58, 23, 19, 23);
insert into tblLine values (11, '무례하긴.. 순애야',484, 24, 20, 24);
insert into tblLine values (12, '아이엠 베놈', 27, 30, 24, 30);
insert into tblLine values (13, '야.. 내가 수학 좋아하면 안되냐? 어 내가 함수 좀 좋아하면 안돼? 이 씨 세상 왜 다 나한테, 그래 안그래!', 94, 31, 25, 31);
insert into tblLine values (14, '마법보다 더 강력한 건 수학이죠!', 684, 34, 27, 34);
insert into tblLine values (15, '뭐가 아까운 건데요?', 1, 45, 34, 45);
insert into tblLine values (16, '선한 행동은 또다른 선한 행동을 낳는 법', 6, 46, 35, 46);
insert into tblLine values (17, '전속력으로 따돌려야지! ( 렉서스 스포츠 모드로 바꾸며 )', 6, 47, 36, 47);






-- 영화 감독
create table tblDirector (
	directorSeq number primary key,
	name varchar2(100) not null,
	nameEng varchar2(100)
);


select count(*) from tblDirector;


insert into tblDirector values(1, '데이빗 예이츠', 'David Yates');
insert into tblDirector values(2, '샘 레이미', 'Sam Raimi');
insert into tblDirector values(3, '조영선', null);
insert into tblDirector values(4, '김지훈', 'KIM Ji-hoon');
insert into tblDirector values(5, '정지연', 'Ji yeon Jung');
insert into tblDirector values(6, '이상용', null);
insert into tblDirector values(7, '애덤 니', 'Adam Nee');
insert into tblDirector values(8, '아론 니', 'Aaron Nee');
insert into tblDirector values(9, '김경엽', null);
insert into tblDirector values(10, '이돈구', 'Donku LEE');
insert into tblDirector values(11, '홍원기', null);
insert into tblDirector values(12, '권수경', null);
insert into tblDirector values(13, '타릭 살레', 'Tarik Saleh');
insert into tblDirector values(14, '루벤 플레셔', 'Ruben Fleischer');
insert into tblDirector values(15, '박이웅', 'PARK Ri-woong');
insert into tblDirector values(16, '천명관', null);
insert into tblDirector values(17, '마이클 베이', 'Michael Bay');
insert into tblDirector values(18, '차상민', null);
insert into tblDirector values(19, '제프 파울러', 'Jeff Fowler');
insert into tblDirector values(20, '파에르 페리펠', 'Pierre Perifel');
insert into tblDirector values(21, '소토자키 하루오', 'Haruo Sotozaki');
insert into tblDirector values(22, '왕가위', 'Kar Wai Wong');
insert into tblDirector values(23, '김한민', null);
insert into tblDirector values(24, '맷 리브스', 'Matt Reeves');
insert into tblDirector values(25, '박성후', null);
insert into tblDirector values(26, '고레에다 히로카즈', 'Hirokazu Koreeda');
insert into tblDirector values(27, '오영산', 'Candy Ng');
insert into tblDirector values(28, '양조개', 'Chiu Hoi Yeung');
insert into tblDirector values(29, '오윤동', null);
insert into tblDirector values(30, '아이리스 심', 'Iris Shim');
insert into tblDirector values(31, '전규환', 'Jeon Kyu hwan');
insert into tblDirector values(32, '다니엘 에스피노사', 'Daniel Espinosa');
insert into tblDirector values(33, '박동훈', null);
insert into tblDirector values(34, '콜린 트레보로우', 'Colin Trevorrow');
insert into tblDirector values(35, '김수정', 'KIM Soojung');
insert into tblDirector values(36, '존 왓츠', 'Jon Watts');
insert into tblDirector values(37, '타이카 와이티티', 'Taika Waititi');
insert into tblDirector values(38, '아라키 테츠로', 'Tetsuro Araki');
insert into tblDirector values(39, '레오폴로 아귈라', 'Leopoldo Aguilar');
insert into tblDirector values(40, '하마구치 류스케', 'Hamaguchi Ryusuke');
insert into tblDirector values(41, '존 매든', 'John Madden');
insert into tblDirector values(42, '캣 코이로', 'Kat Coiro');
insert into tblDirector values(43, '아론 고뎃', 'Aron Gaudet');
insert into tblDirector values(44, '기타 펄라필리', 'Gita Pullapilly');
insert into tblDirector values(45, '애덤 스틸웰', 'Adam Stilwell');
insert into tblDirector values(46, '나현', null);
insert into tblDirector values(47, '조셉 코신스키', 'Joseph Kosinski');
insert into tblDirector values(48, '홍상수', 'Hong Sang soo');
insert into tblDirector values(49, '서지오 파블로스', 'Sergio Pablos');
insert into tblDirector values(50, '카를로스 마르티네즈 로페즈', 'Carlos Martinez Lopez');
insert into tblDirector values(51, '롤랜드 에머리히', 'Roland Emmerich');
insert into tblDirector values(52, '드니 데르쿠르', 'Denis Dercourt');
insert into tblDirector values(53, '브렛 설리반', 'Brett Sullivan');
insert into tblDirector values(54, '자코 아키후미', 'Zako Akifumi');



create table tblMovieDiretor (
	movieDirectorSeq number primary key,
	directorSeq number not null references tblDirector(directorSeq),
	seq number not null references tblMovie(seq)
 );


insert into tblMovieDiretor values(1, 1, 1);
insert into tblMovieDiretor values(2, 2, 2);
insert into tblMovieDiretor values(3, 3, 3);
insert into tblMovieDiretor values(4, 4, 4);
insert into tblMovieDiretor values(5, 5, 5);
insert into tblMovieDiretor values(6, 6, 6);
insert into tblMovieDiretor values(7, 7, 7);
insert into tblMovieDiretor values(8, 8, 7);
insert into tblMovieDiretor values(9, 9, 8);
insert into tblMovieDiretor values(10, 10, 9);
insert into tblMovieDiretor values(11, 11, 10);
insert into tblMovieDiretor values(12, 12, 11);
insert into tblMovieDiretor values(13, 13, 12);
insert into tblMovieDiretor values(14, 14, 13);
insert into tblMovieDiretor values(15, 15, 14);
insert into tblMovieDiretor values(16, 16, 15);
insert into tblMovieDiretor values(17, 17, 16);
insert into tblMovieDiretor values(18, 18, 17);
insert into tblMovieDiretor values(19, 19, 18);
insert into tblMovieDiretor values(20, 20, 19);
insert into tblMovieDiretor values(21, 21, 20);
insert into tblMovieDiretor values(22, 22, 21);
insert into tblMovieDiretor values(23, 23, 22);
insert into tblMovieDiretor values(24, 24, 23);
insert into tblMovieDiretor values(25, 25, 24);
insert into tblMovieDiretor values(26, 26, 25);
insert into tblMovieDiretor values(27, 27, 26);
insert into tblMovieDiretor values(28, 28, 26);
insert into tblMovieDiretor values(29, 29, 27);
insert into tblMovieDiretor values(30, 30, 28);
insert into tblMovieDiretor values(31, 31, 29);
insert into tblMovieDiretor values(32, 32, 30);
insert into tblMovieDiretor values(33, 33, 31);
insert into tblMovieDiretor values(34, 34, 32);
insert into tblMovieDiretor values(35, 35, 33);
insert into tblMovieDiretor values(36, 36, 34);
insert into tblMovieDiretor values(37, 37, 35);
insert into tblMovieDiretor values(38, 38, 36);
insert into tblMovieDiretor values(39, 39, 37);
insert into tblMovieDiretor values(40, 40, 38);
insert into tblMovieDiretor values(41, 41, 39);
insert into tblMovieDiretor values(42, 42, 40);
insert into tblMovieDiretor values(43, 43, 41);
insert into tblMovieDiretor values(44, 44, 41);
insert into tblMovieDiretor values(45, 45, 42);
insert into tblMovieDiretor values(46, 46, 43);
insert into tblMovieDiretor values(47, 47, 44);
insert into tblMovieDiretor values(48, 48, 45);
insert into tblMovieDiretor values(49, 49, 46);
insert into tblMovieDiretor values(50, 50, 46);
insert into tblMovieDiretor values(51, 51, 47);
insert into tblMovieDiretor values(52, 52, 48);
insert into tblMovieDiretor values(53, 53, 49);
insert into tblMovieDiretor values(54, 54, 50);

