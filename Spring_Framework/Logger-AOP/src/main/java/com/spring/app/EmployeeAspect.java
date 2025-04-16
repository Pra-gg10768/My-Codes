package com.spring.app;




import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
public class EmployeeAspect {
	

final static Logger logger = Logger.getLogger("EmployeeAspect.class");


@After("execution(* com.spring.app.Company.registerEmployee(..))")
public void logRegistrationStatus(){
	String timestamp = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    logger.info("[" + timestamp + "] Registration Successful");

	}
	
}