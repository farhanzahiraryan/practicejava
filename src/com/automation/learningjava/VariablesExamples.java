package com.automation.learningjava;

public class VariablesExamples {

	static int classVariable = 5;

	int instancevaraible = 10;

	public static void main(String[] args) {
		int i = 25;
		System.out.println("The local variable value is " + i);
		StudentEx.collegName="Changing the college name";
		System.out.println(StudentEx.collegName);
		
		StudentEx sEx = new StudentEx();
		sEx.sno="1";

	}

}

class StudentEx {

	String sno;
	String snoame;
	static String collegName = "my College";

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSnoame() {
		return snoame;
	}

	public void setSnoame(String snoame) {
		this.snoame = snoame;
	}

}
