package com.Virtusa.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Virtusa.bean.Employee;



public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e1 = (Employee) ctx.getBean("employee");
		System.out.println(e1);
		ctx.registerShutdownHook();
		ctx.close();
		
	}
}
