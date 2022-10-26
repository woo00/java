package oday02;

import java.util.Scanner;

public class Ex12 {
/*
	 문제 10 ]
	 	전기 요금을 계산해주는 프로그램을 작성하세요.
	 	
	 				코드		기본요금		사용요금
	 	가정용 		1			3800			245
	 	산업용 		2			2400			157
	 	교육용 		3			2900			169
	 	상업용  	4			3200			174
	 	
	 	계산식은 	기본요금 + 사용량 * 사용요금
	 	
	 	코드를 입력하고
	 	사용량을 입력하면 
	 	전기요금을 계산해주는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
		
		// 입력 도구 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력도구 텍스트 출력
		System.out.print("코드를 입력하세요. : ");
		
		// 입력정수 기억
		int cod = sc.nextInt();
		
		// 입력도구 텍스트 출력
		System.out.print("사용량을 입력하세요. : ");
		
		// 입력정수 기억
		int use = sc.nextInt();
		
		//1
		int result = 0;
		String str = "";
		// 변수 선언하기 3200			174
		switch (cod) {
			case 1 : 
				str = "가정용";
				result = 3800 + use * 245;
				break;
			case 2 : 
				str = "산업용";
				result = 2400 + use * 157;
				break;
			case 3 : 
				str = "교육용";
				result = 2900 + use * 169;	
				break;
			case 4 : 
				str = "상업용";
				result = 3200 + use * 174;
				break;
		}
		System.out.println(str+" 전기세는 ["+result+"]원 입니다.");
	}
}