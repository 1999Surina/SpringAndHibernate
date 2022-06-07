package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
				
		Account myAccount = new Account();
		
		theAccountDAO.addAccount(myAccount,false);
		
		theAccountDAO.doWork();
		
		theAccountDAO.setName("set");
		theAccountDAO.setServiceCode("34");
		
		theAccountDAO.getName();
		theAccountDAO.getServiceCode();
		
		theMembershipDAO.addSilly();
		
		theMembershipDAO.goToSleep();
		
		context.close();
		
	}

}