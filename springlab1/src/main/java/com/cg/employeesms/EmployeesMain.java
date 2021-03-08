package com.cg.employeesms;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeesMain {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		Employee employee = context.getBean(Employee.class);
		System.out.print("Employee "+" [empAge = "+employee.getAge()+" empId = "+employee.getEmployeeId()+
				" empName = "+employee.getEmployeeName()+" empSalary = "+employee.getSalary()+
				" SBU details = "+context.getBean(SBU.class)+"]");
        context.close();

	}

}