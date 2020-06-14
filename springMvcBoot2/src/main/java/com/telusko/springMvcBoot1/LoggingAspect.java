package com.telusko.springMvcBoot1;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.telusko.springMvcBoot1.model.Alien;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);   
	
	@Before("execution(public * com.telusko.springMvcBoot1.AlienController.getAliens())")
	public void logBefore() {
		LOGGER.info("getAliens method called from aspect");
	}
	
	@AfterReturning("execution(public * com.telusko.springMvcBoot1.AlienController.getAliens())")
	public void logAfter() {
		LOGGER.info("getAliens method executed");
	}

	@AfterThrowing("execution(public * com.telusko.springMvcBoot1.AlienController.getAliens())")
	public void logException() {
		LOGGER.info("Issue");
	}


}
