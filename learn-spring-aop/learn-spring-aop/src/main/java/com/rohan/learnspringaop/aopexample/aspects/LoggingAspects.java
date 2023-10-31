package com.rohan.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspects {
	
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	@Before("execution(* com.rohan.learnspringaop.aopexample.*.*.*(..))")
	public void logMethodCallBefore(JoinPoint joinPoint) {
		logger.info("Method {} called with arguments {} ", joinPoint, joinPoint.getArgs());
	}
	
	@After("execution(* com.rohan.learnspringaop.aopexample.*.*.*(..))")
	public void logMethodCallAfter(JoinPoint joinPoint) {
		logger.info("After {} has ran ", joinPoint);
	}
	
	@AfterThrowing(pointcut="execution(* com.rohan.learnspringaop.aopexample.*.*.*(..))",
			throwing="exception")
	public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
		logger.info("AfterThrowing aspect {} has ran and thrown {} ", joinPoint,exception);
	}
	
	@AfterReturning(pointcut="execution(* com.rohan.learnspringaop.aopexample.*.*.*(..))",
			returning="resultValue")
	public void logMethodCallAfterReturning(JoinPoint joinPoint, Object resultValue ) {
		logger.info("AfterReturning aspect {} has ran and returned {} ", joinPoint, resultValue);
	}

}
