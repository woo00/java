package day05;

import java.util.Scanner;

public class Ex01 {
/*
     문제 1 ]
   숫자 3개를 입력받아서
   가장 큰수를 선택해서 출력해주는 프로그램을
   3항 조건 연산자를 사용해서 구현하세요.
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int no1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int no2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int no3 = sc.nextInt();
		sc.close();
		
		int result = 0;
		
		result = (no1>no2 && no1 > no3) ? no1 : (no2>3) ? no2 : no3;
		
		System.out.println("가장큰 수 는 [ " + result + " ] 입니다.");
		
	}

}
