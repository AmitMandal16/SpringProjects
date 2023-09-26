package com.amit.springAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectConfig {
	
	@Pointcut("execution(* com.amit.springAOP.pointcuts.Items.*())")
	private void mypointcut() {}
	
	@Before("mypointcut()")
	public void printLogo(JoinPoint jp) {
		
		System.out.println("method call before --> "+jp.getSignature().getName());
		
		System.out.println("*************************************\n"
				         + "***************D-MART****************\n"
				         + "*************************************");
		
	}

}
