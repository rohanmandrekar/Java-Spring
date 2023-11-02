package com.rohan.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
	
	@Pointcut("execution(* com.rohan.learnspringaop.aopexample.*.*.*(..))")
	public void businesAndDataPackageConfig() {}
	@Pointcut("execution(* com.rohan.learnspringaop.aopexample.business.*.*(..))")
	public void businesPackageConfig() {}
	@Pointcut("execution(* com.rohan.learnspringaop.aopexample.data.*.*(..))")
	public void DataPackageConfig() {}
	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}
	@Pointcut("@annotation(com.rohan.learnspringaop.aopexample.annotations.TrackTime)")
	public void trackTimeAnnotaion() {}
	

}
 