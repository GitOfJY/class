-- ex28_oracle_cloud



/*
    
    오라클 클라우드 서비스
    - Oracle Cloud Free Tier
    - VM(Virtual Machine) > 2대까지 > 나중에 웹 수업 > 프로젝트 운영 or 포트폴리오(웹)
    - Oracle Autonomous DataBase 2개 > 11g > 19c
    
    
    가상 서버
    - 운영체제 > Ubuntu 20.04 LTS
    - 접속 계정 > "ubuntu" + ""(암호 없음)


    pwd
    - Print working deiretory
    - 현재 작업 중 폴더의 경로
    ex) /home/ubuntu > ubuntu 계정의 홈디렉토리
    
    
    ls <옵션> <디렉토리>
    - List Direcotry Contents
    - '-a' : all. 모든 파일과 디렉토리를 다 출력해라.(숨긴 파일/디렉토리)
    - '-l' : long. 정보를 상세하게...
    ex) ls -a -l
    ex) ls -al
    ex) ls -la
    
    
    clear
    - Clear Screen
    
    
    방향키(위,아래)
    - 여태 실행했던 명령어의 이력 탐색
    
    
    man <명령어>
    - User's Manual
    
    
    cd
    - change directory
    ex) cd ..
    ex) cd 자식디렉토리
    ex) cd /
    ex) cd ~ : 홈 디렉토리로 이동
    ex) cd - : 이전 디렉토리로 이동
    ex) cd : 홈 디렉토리로 이동
    
    
    Prompt
    > 계정명@서버이름:현재디렉토리$
    
    홈디렉토리(~)
    > ubuntu@ubuntu:~$ 
    
    
    ubuntu@ubuntu:/home$
    
    
    
    free
    - 메모리 상태를 출력한다.
    
    
    
    date
    - 현재 시각 출력
    
    
    mkdir
    - make directory
    - $ mkdir 폴더명
    - $ mkdir 폴더명 폴더명 폴더명 > 동시에 여러개 생성
    - $ mkdir -p 폴더명 폴더명    > 동시에 부모/자식 관계 폴더 생성

    
    rmdir
    - remove directory
    - 비어있는 디렉토리만 삭제가 가능하다.
    
    
    tree
    - 기본 명령어 아님 > 설치 필요
    - $ sudo apt-get install tree


    touch
    - $ touch 파일명
    - 파일을 생성한다.
    - vim > i > 내용작성 > exit > :wq(저장 후 나가기) 
                        > exit > :q! (저장없이 나가기) 
         
                        
    -----------------------------------------------------------------------------------
    
    
    쉘
    - echo $0
    1. bash
    2. zsh
    
    
    zsh 설치
    - $ sudo apt-get install zsh
    - $ sudo chsh -s S(which zsh) > 기본 쉘을 zsh로 변경한다.
    - $ sudo chsh -s /usr/bin/zsh > 기본 쉘을 zsh로 변경한다.

    
    zsh 확장 테마
    - oh-my-zsh > 제공 플러그인 중 테마
    - $ sh -c "$(wget -O- https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"
    
    
    Swap
    - 메모리의 부족을 보완하기 위해서 > 하드 디스크의 일부를 메모리처럼 사용하게 해준다.
    
    
    루트 사용자 > root > 모든 권한을 가진 관리자
    현재 로그인 계정 > ubuntu > 일반 사용자


    현재 시각 설정하기
    
    1. $ sudo dpkg-reconfigure tzdata
    2. Asia
    3. Seoul
    4. $ date
    
    
    도메인 > 사용 용도와 의미 달라짐
    도메인 구조 == 카테고리 == 패키지
    하위.중위.상위
    
    test.com > 상업 도메인(미국)
    test.co.kr > 국가 도메인
    test.co.jp
    test.ac.kr > 대학교 도메인
    test.go.kr > 정부 도메인
    test.org > 비영리 단체
    
    최상위 도메인
    - 국가 도메인
    
    
*/





















