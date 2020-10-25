package com.automation.learningjava;

public class Exam {

	private String subject;
	private String number;
	public Exam(String subject, String number) {
		super();
		this.subject = subject;
		this.number = number;
	
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		Exam ex1 = new Exam("Math", "81");
		System.out.println(ex1);
		Exam ex2 = new Exam("Bio", "90");
		System.out.println(ex2);
		
	}
	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", number=" + number + "]";
	}
	
	
}
