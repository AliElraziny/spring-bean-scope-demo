package com.try2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		
		// load spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean 
		Coach theCoach = context.getBean("myCoachSingleton", Coach.class);
		
		Coach theAnotherCoach = context.getBean("myCoachSingleton", Coach.class);
		
		//check if the two coach the same object
		
		boolean result = (theCoach==theAnotherCoach);
				
		//print out result  
		
		System.out.println("result  :  " + result);
		
		System.out.println("Memory location for theCoach : " + theCoach);
		
		System.out.println("Memory location for theCoach : " + theAnotherCoach);
		 //prototype scopeBean
		Coach theXCoach = context.getBean("myCoachPrototype", Coach.class);
		
		Coach theXAnotherCoach = context.getBean("myCoachPrototype", Coach.class);
		
		//check if the two coach the same object
		
		boolean resultX = (theXCoach==theXAnotherCoach);
				
		//print out result  myCoachPrototype
		
		System.out.println("result  :  " + resultX);
		
		System.out.println("Memory location for theCoach : " + theXCoach);
		
		System.out.println("Memory location for theCoach : " + theXAnotherCoach);
				
	}

}
