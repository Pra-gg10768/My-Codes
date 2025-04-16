package com.spring.app;


 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Account;

public class Driver {
	
	
	public static Account loadAccount()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Account account = (Account)context.getBean("account");
		return account;

	}

	public static void main(String[] args) 
	{
		Account account = loadAccount();
        account.displayAccountDetails();
	}	 	  	    	    		        	 	


}
