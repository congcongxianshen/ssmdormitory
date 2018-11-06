package com.kj.base.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ControllerAspect{

	@Pointcut("execution(com.kj.base.controller.*(..))")
	public void Pointcut() {
	}

	
	@Around("Pointcut()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		
		Object proceed = joinPoint.proceed();
		return proceed;
	}

	
	@AfterThrowing(pointcut = "Pointcut()", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, Throwable ex) throws Throwable {
		
	}
}
