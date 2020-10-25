package com.automation.learningjava;

public class NextTenOddNo {

	public static void main(String[] args) {

		//nextTenOddNo(21);
		inherEx nextTenOddNo = new inherEx();
		nextTenOddNo.nextTenOddNo(35);
	}

	public  void nextTenOddNo(int no) {
		int num = no;
		if (num % 2 == 0) {
			num = no + 1;
		} else {
			num = no+2;
		}
		for (int i = 0; i < 10; i++) {
			
			System.out.println(num);
			num = num + 2;

		}

	}

}

class inherEx extends NextTenOddNo{
	
	@Override
	public  void nextTenOddNo(int no) {
		int num = no;
		if (num % 2 == 0) {
			num = no + 1;
		} else {
			num = no+2;
		}
		for (int i = 0; i < 10; i++) {
			
			System.out.println(num);
			num = num * 2;

		}

	}
	
}
