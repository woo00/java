package day05;

import java.util.Scanner;

public class Ex01 {
/*
<<<<<<< HEAD
 	숫자 3개를 입력받아서
 	가장 큰수를 선택해서 출력해주는 프로그램을 
 	3항연산자를 사용해서 구현
 */
	public static void main(String[] args) {
			// 세개의 숫자를 입력받는 방법
		//1. 입력도구
		Scanner sc = new Scanner(System.in);
		//2. 메시지출력
		System.out.print("첫번째 숫자 : ");
		//3. 입력데이터 꺼내서 변수에 기억
		int no1 = sc.nextInt();
		//2. 메시지출력
		System.out.print("두번째 숫자 : ");
		//3. 입력데이터 꺼내서 변수에 기억
		int no2 = sc.nextInt();
		//2. 메시지출력
		System.out.print("세번쨰 숫자 : ");
		//3. 입력데이터 꺼내서 변수에 기억
		int no3 = sc.nextInt();
		
		sc.close();
		int result = 0;
		
		result = (no1 > no2 && no1 > no3) ? no1 : (no2>no3) ? no2 : no3;
				
				
		System.out.print("가장큰수 : " + result);
				
=======
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
		
	
>>>>>>> branch 'main' of https://github.com/woo00/java.git
	}

}
