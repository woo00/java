package day04;

import java.util.*;


public class Ex02 {
	/*
	문제 2 ]
		하나의 숫자를 입력받은 후
		그 숫자를 반지름으로 하고
		원의 넓이와 원의 둘레를 구해서 출력해주는 프로그램을 작성하세요.
		
		원의 넓이 ]
			반지름 * 반지름 * 3.14
			
		원의 둘레 ]
			2 * 반지름 * 3.14
 */
	public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력해요 : ");
	int no = sc.nextInt();
	sc.close();
	
	System.out.println("원의 넓이는 : "+ no*no*3.14+" 원의 둘레는 : "+ 2*no*3.14);
	}

}
