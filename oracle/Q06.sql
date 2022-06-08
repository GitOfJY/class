-- Q06



--1. traffic_accident. 각 교통 수단 별(지하철, 철도, 항공기, 선박, 자동차) 발생한 총 교통 사고 발생 수, 총 사망자 수, 사건 당 평균 사망자 수를 가져오시오.
select
    trans_type as "교통 수단", 
    sum(total_acct_num) as "총 교통 사고 발생 수",
    sum(death_person_num) as "총 사망자 수",
    round(sum(death_person_num)/sum(total_acct_num), 3) as "평균 사망자 수"
from traffic_accident 
    group by trans_type;    

        
    
--2. tblZoo. 종류(family)별 평균 다리의 갯수를 가져오시오.
select 
    family,
    round(avg(leg)) as "평균 다리 갯수"
from tblZoo 
    group by family;  

    

--3. tblZoo. 체온이 변온인 종류 중 아가미 호흡과 폐 호흡을 하는 종들의 갯수를 가져오시오.
-- 문제 제대로 안 읽음
select 
    breath,
    count(*)
from tblZoo 
    where thermo = 'variable'
    group by breath;

SELECT 
    count(case
        when breath in ('lung') then 1
    end) as "변온,폐 호흡",
    count(case
        when breath in ('gill') then 1
    end) as "변온,아가미 호흡"
FROM tblzoo
    GROUP BY thermo
        HAVING thermo = 'variable';
        
        

--4. tblZoo. 사이즈와 종류별로 그룹을 나누고 각 그룹의 갯수를 가져오시오.
select 
    sizeof, 
    family, 
    count(*) 
from tblZoo
    group by sizeof, family
        order by family;        

SELECT family||decode(sizeof,'small','소형','medium','중형','large','대형') as 분류, count(family) FROM tblzoo
    GROUP BY family,sizeof 
        ORDER BY family asc, sizeof desc;
        
        

--12. tblAddressBook. 관리자의 실수로 몇몇 사람들의 이메일 주소가 중복되었다. 중복된 이메일 주소만 가져오시오.
select * from tblAddressBook;
select
    email as "중복 이메일",
    count(email) as "중복 수"
from tblAddressBook
    group by email
        having count(email) > 1;
    
    

--15. tblAddressBook. 성씨별 인원수가 100명 이상 되는 성씨들을 가져오시오.
select
   substr(name, 1, 1) ,
   count(*)                                         
from tblAddressBook                             
    group by substr(name, 1, 1)                 
        having count(substr(name, 1, 1)) >= 100;  



--16. tblAddressBook. 남자 평균 나이보다 나이가 많은 서울 태생 + 직업을 가지고 있는 사람들을 가져오시오.
select * from tblAddressBook;
select distinct job from tblAddressBook;
select round(avg(age)) from tblAddressBook where gender = 'm';

select
    name
from tblAddressBook
    where age > (select round(avg(age)) from tblAddressBook where gender = 'm')
        and hometown = '서울'
        and job not in ('학생', '백수');

            
            

--17. tblAddressBook. 이메일이 스네이크 명명법으로 만들어진 사람들 중에서 여자이며, 
--     20대이며, 키가 150~160cm 사이며, 고향이 서울 또는 인천인 사람들만 가져오시오. 또는 인천인 사람들만 가져오시오.
select * from tblAddressBook;
-- 스네이크 명명법 이메일
select email from tblAddressBook where email like '%_%';

select 
    * 
from tblAddressBook 
    where email like '%_%' 
        and gender = 'f' 
        and height between 150 and 160 
        and hometown in ('서울','인천');
        
SELECT * FROM tbladdressbook
    where instr(email,'_') <> 0 and gender = 'f' and age like ('2_') and height <= 160 and height >= 150 and hometown in ('서울','인천');
-- instr(email,'_') 사용할 생각을 못함
-- insrt함수는 문자열에서 문자를 찾으면 시작 위치 반환 아니면 0 반환
--             대소문자 구분



--20. tblAddressBook. '건물주'와 '건물주자제분'들의 거주지가 서울과 지방의 비율이 어떻게 되느냐?
select * from tbladdressBook;
select * from tblAddressBook where job in ('건물주자제분', '건물주');
select job, count(*) from tblAddressBook where job in ('건물주', '건물주자제분') group by job;

select
    
    count(
    case
        when job in ('건물주자제분', '건물주') and address like '서울%' then 1
    end) as "서울사는건물",
    
    count(
    case
        when job in ('건물주자제분', '건물주') and address not like '서울%' then 1
    end) as "서울안사는건물"
    
from tblAddressBook;

select
    
    round((count(case when job in ('건물주자제분', '건물주') and address like '서울%' then 1 end)) / (count(case when job in ('건물주자제분', '건물주') then 1 end)) * 100) as "서울",
    
    round((count(case when job in ('건물주자제분', '건물주') and address not like '서울%' then 1 end)) / (count(case when job in ('건물주자제분', '건물주') then 1 end)) * 100) as "서울아님"
    
from tblAddressBook;

SELECT job,
    round(count(case
        when substr(address,1,2) like ('%서울%') then 1 
    end)/count(job)*100,2)||'%' as "서울 거주자",
     round(count(case
        when substr(address,1,2) not like ('%서울%') then 1 
    end)/count(job)*100,2)||'%' as "(비)서울 거주자"   
FROM tbladdressbook group by job having job in ('건물주','건물주자제분');
-- 직업을 마지막에 group by로 묶으면 더 짧구나







