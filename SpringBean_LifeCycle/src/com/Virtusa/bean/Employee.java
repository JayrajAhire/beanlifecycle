package com.Virtusa.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	
	private String EmpId;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee no-arg constructor");
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + "]";
	}
	
	@PostConstruct
	public void postCreate() {
		System.out.println("initialize bean");
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Inside preDestroy method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	
	
	
	

}
