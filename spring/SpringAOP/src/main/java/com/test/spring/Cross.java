package com.test.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//보조업무 객체
@Aspect    //<bean>에 보조업무 객체 자격 할당
@Component //<bean>로 만들기
public class Cross {
	
	//주업무 지정 > 포인트컷 생성
	//@Pointcut("AspectJ 표현식")
	@Pointcut("execution(public String com.test.spring.AOPController.test())")
	public void pc1() {
		//껍데기 > 구현 x
	}
	
	//보조업무 선언 + 주업무와 결합
	@After("pc1()")
	public void m1() {
		System.out.println("보조업무");
	}

	@Before("pc1()") 
	public void m2() {
		System.out.println("보조업무2");
	}
	
}
