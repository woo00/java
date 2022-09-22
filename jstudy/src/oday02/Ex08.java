package oday02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
/*
 	문제 6]
 		숫자 하나를 입력한 후 그 숫자보다 큰 가장 가까운 10의 배수와
 		입력한 숫자와의 차이를 출력하는 프로그램을 작성하자.
 */
		// 입력도구 생성
		
		Scanner sc = new Scanner(System.in);
		
		// 입력도구 텍스트 출력
		System.out.print("숫자를 입력하세요 : ");
		
		// 입력한 정수 변수에 기억
		int num = sc.nextInt();
		
		// 입력한 수 보다 큰 가까운 10의 배수 만들기
		int result = (num + 10) - (num % 10);
		System.out.println("가까운 큰 10의 배수는 : " + result);
		
		// 생성한 10의 배수에서 입력한 수 빼기 
		int result2 = result - num;
		System.out.println("위의 숫자에서 입력한 수를 뺌 : " + result2);
		
		// 출력
		
		
	}

}
