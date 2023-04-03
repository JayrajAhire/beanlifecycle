package com.kb.beans.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		// Singleton
		Person person1 = (Person) applicationContext.getBean("person");
		
		person1.setName("Name2");
		
		System.out.println("Name : " + person1.getName());
		
		Person person2 = (Person) applicationContext.getBean("person");
		
		System.out.println("Name : " + person2.getName());
		
		System.out.println(person1 == person2);
		
		
		// prototype
		
		User user1 = (User) applicationContext.getBean("user");
		
		user1.setName("Name2");
		
		System.out.println("Name : " + user1.getName());
		
		
		
		User user2 = (User) applicationContext.getBean("user");
		
		System.out.println("Name : " + user2.getName());
		
		System.out.println(user1 == user2);

		applicationContext.registerShutdownHook();

	
	}

}
