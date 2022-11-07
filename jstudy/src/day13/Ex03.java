package day13;

import java.util.*;

public class Ex03 {

	/*
		계산기 프로그램을 작성해서 실행하세요.
		
		수식 입력
		계산
		출력 기능은 각가의 함수로 작성해서 구현하세요.
		
	 */
	public Ex03() {
		Object[] arr = getData();
		calc((int)arr[0], (int)arr[2], (char)arr[1]);
	}

	public static void main(String[] args) {
		new Ex03();
	}
	
	public Object[] getData() {
		Object[] data = new Object[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계산식 입력 : ");
		String sik = sc.nextLine();
		int idx = 0;
		for(int i = 0 ; i < sik.length(); i++ ) {
			if(sik.charAt(i) < '0' || sik.charAt(i) > '9') idx = i;
		}
		
		data[0] = Integer.parseInt(sik.substring(0, idx));
		data[1] = sik.charAt(idx);
		data[2] = Integer.parseInt(sik.substring(idx + 1));
		
		return data;
	}
	
	public void calc(int no1, int no2, char giho) {
		int result;
		switch(giho) {
		case '+':
			result = plus(no1, no2);
			System.out.printf("%4d + %4d = %5d\n", no1, no2, result);
			break;
		case '-':
			result = minus(no1, no2);
			System.out.printf("%4d - %4d = %5d\n", no1, no2, result);
			
			break;
		case '*':
			result = gop(no1, no2);
			System.out.printf("%4d * %4d = %5d\n", no1, no2, result);
			break;
		case '/':
			double result1 = nanum(no1, no2);
			System.out.printf("%4d / %4d = %7.2f\n", no1, no2, result1);
			break;
		}
	}
	
	public int plus(int no1, int no2) {
		return no1 + no2;
	}
	
	public int minus(int no1, int no2) {
		return no1 - no2;
	}
	
	public int gop(int no1, int no2) {
		return no1 * no2;
	}
	
	public double nanum(int no1, int no2) {
		return no1 / (double)no2;
	}
}