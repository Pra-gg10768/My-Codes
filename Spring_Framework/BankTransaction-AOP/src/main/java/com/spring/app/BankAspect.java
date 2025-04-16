package com.spring.app;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;



@Aspect
public class BankAspect {
	
	final static Logger logger = Logger.getLogger("BankAspect.class");
		
	@Around("execution(* com.spring.app.Bank.withDraw(..))")
	public Object logTransactionStatus(ProceedingJoinPoint pjp) throws Throwable {
		
		String timestamp = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        logger.info("[" + timestamp + "] Before Method Called");

        Object status = pjp.proceed();

        timestamp = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        logger.info("[" + timestamp + "] Status: " + status);
        
        return status;
		
}

	
}