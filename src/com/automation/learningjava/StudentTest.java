package com.automation.learningjava;

public class StudentTest {

	private String StudentName;
	private String StudentRoll;

	public StudentTest(String studentName, String studentRoll) {
		super();
		StudentName = studentName;
		StudentRoll = studentRoll;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentRoll() {
		return StudentRoll;
	}

	public void setStudentRoll(String studentRoll) {
		StudentRoll = studentRoll;
	}

	public static void main(String[] args) {
		StudentTest st = new StudentTest("Farhan", "1");
		System.out.println(st);
		StudentTest st2 = new StudentTest("Mira", "2");
		System.out.println(st2);
	}

	@Override
	public String toString() {
		return "StudentTest [StudentName=" + StudentName + ", StudentRoll=" + StudentRoll + "]";
	}

}
