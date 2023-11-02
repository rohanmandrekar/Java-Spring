package com.rohan.learnspringaop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerfomanceTrackingAspect {
	
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	@Around("com.rohan.learnspringaop.aopexample.aspects.CommonPointcutConfig.trackTimeAnnotaion()")
	public Object findExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime=System.currentTimeMillis();
		Object returnValue = joinPoint.proceed();
		long stopTime=System.currentTimeMillis();
		long executionDuration=stopTime-startTime;
		
		logger.info("Around Aspect {} Method executed in {} ms",joinPoint,executionDuration);
		
		return returnValue;
	}
}
