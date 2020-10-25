package com.automation.learningjava;

public class Employee {
	
	private String EmployeeName;
	private String EmployeeSalary;
	
	public Employee(String employeeName, String employeeSalary) {
		super();
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}
	
	public String getEmployeeName() {
		return EmployeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	
	public String getEmployeeSalary() {
		return EmployeeSalary;
	}
	
	public void setEmployeeSalary(String employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
	
	public static void main(String[] args) {
		Employee em1 = new Employee ("farhan", "100");
		System.out.println(em1);
		Employee em2 = new Employee ("mira", "180");
		System.out.println(em2);
	}

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeSalary=" + EmployeeSalary + "]";
	}


}
