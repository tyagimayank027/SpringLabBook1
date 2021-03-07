
package com.cg.employeesms;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Employees {
	@Value("${empms.id}")
	private int id;
	@Value("${empms.name}")
	private String name;
	@Value("${empms.salary}")
	private int salary;
	@Value("${empms.bu}")
	private String businessUnit;
	@Value("${empms.age}")
	private int age;
	
	public Employees() {}
	public Employees(String name,int salary,String businessUnit,int age) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.businessUnit=businessUnit;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
	