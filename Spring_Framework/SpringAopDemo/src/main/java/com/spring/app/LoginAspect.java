package com.spring.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

	@Autowired
	private EasyBank easyBank;

	@Around("execution(* EasyBank.doWithdraw(..))")
	public void validateWithdraw(ProceedingJoinPoint joinPoint) throws Throwable {

		if (easyBank.getTempPin() != easyBank.getPinCode()) {
			throw new Exception();
		} else {
			joinPoint.proceed();
			System.out.println("Your remaining balance is " + (easyBank.getBalance()));

		}

	}

	 @Before("execution(* EasyBank.showBalance(..)) || execution(* EasyBank.doDeposit(..))")
	public void validateBalance() {

		if (easyBank.getTempPin() != easyBank.getPinCode()) {
			throw new RuntimeException();
		}

	}

	 @AfterReturning("execution(* EasyBank.doChangePin(..))")
	public void afterPinChange() {
		System.out.println("You have successfully changed your pin");
	}

	 @AfterThrowing("execution(* EasyBank.*(..))")
	public void afterWrongPin() {
		System.out.println("Invalid Pin");
	}

}