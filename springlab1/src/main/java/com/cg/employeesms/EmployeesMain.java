package com.cg.employeesms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeesMain {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(EmployeesConfi.class);
		context.refresh();
		Employees employee = context.getBean(Employees.class);
		System.out.println("Id: " + employee.getId() + " Name: " + employee.getName() + " Salary: "
				+ employee.getSalary() + " Age: " + employee.getAge());

		SBU sbu = context.getBean(SBU.class);
		System.out.println(
				"SbuId: " + sbu.getSbuId() + " SbuHead: " + sbu.getSbuHead() + " SbuName: " + sbu.getSbuName());

	}

}
