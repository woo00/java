package day05;

import java.util.Scanner;

public class Ex02 {
/*
 	문제 2 ]
 		알파벳 문자 하나를 입력받아서
 		그 문자가 대문자인지 소문자인지 판별해서 출력하고
 		
 		소문자면 대문자로 변환
 		대문자면 소문자로 변환
 		출력
		
		참고 ]
			문자열에서 문자 추출하는 방법
			
				문자열.charAt(위치값)
				
			이 문제의 경우는 하나의 문자만 입력할 예정이므로
			
				문자열.charAt(0)
			로 꺼내서 사용.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		String abc = sc.next();
		sc.close();
		
		String result = "";
		result = (abc >='a'&& abc<='z') ? : 
	}

}
