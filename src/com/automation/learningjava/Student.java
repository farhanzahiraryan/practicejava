package com.automation.learningjava;

public class Student {
	
	
	private String sName;
	private String rollNum;
	
	public String getsNum() {
		return sNum;
	}
	private void setsNum(String sNum) {
		this.sNum = sNum;
	}
	
	
	
	public String getRollNum() {
		return rollNum;
	}
	private void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNum("10");
		student.setsNum("Farhan");
		checkChange(student);
		System.out.println(student.getsNum());
	}
	
	public static void checkChange(Student student) {
		System.out.println(student.getsNum());
		student.setsNum("Sinha");
		System.out.println(student.getsNum());
	}

}
