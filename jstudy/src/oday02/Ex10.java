package oday02;

import java.util.Scanner;

public class Ex10 {
/*
	문제 8 ]
		정수 3개를 입력받아서
		세 수중 제일 큰수만 출력해주는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
		
		//입력도구 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력도구 텍스트 출력
		System.out.print("정수를 입력하세요. : ");
		
		// 입력한 정수 기억
		long num = sc.nextLong();
		
		//2입력도구 생성
		//Scanner sc1 = new Scanner(System.in);
		
		// 2입력도구 텍스트 출력
		System.out.print("정수를 입력하세요. : ");
		
		// 2입력한 정수 기억
		long num1 = sc.nextLong();
		
		//3입력도구 생성
		//Scanner sc2 = new Scanner(System.in);
		
		// 3입력도구 텍스트 출력
		System.out.print("정수를 입력하세요. : ");
		
		// 3입력한 정수 기억
		long num2 = sc.nextLong();
		
		
		// 큰 수만 출력하기
		if(num > num1 && num > num2) {
			System.out.print(num);
		}else if(num1 > num && num1 > num2) {
			System.out.print(num1);
		}else if(num2 > num && num2 > num1) {
			System.out.print(num2);
		}
		/*
		if(num > num1) {
			
			// 이 블럭은 num > num1
			if(num > num2) {
				// num이 최고
			} else {
				// num2 가 최고
			}
		} else {
			// num < num1 인경우
			
			
		}
		*/
//		(num > num1)? () : ();
	}
}
