package oday01;

import java.util.Scanner;

/*
		문제 10 ]
			
			 1. 키보드로 문자열을 입력받아서
			 2. 출력하고
			 3. 하나씩 꺼내서 출력하세요.
			 
			 힌트 ]
			 	문자열중에서 특정위치의 문자 추출하는 방법
			 		
			 		char ch = 문자열.charAt(위치값);
			 		
			 		참고 ]
			 			 문자열중 특정 문자의 위치값을 반환해주는 함수
			 			 	
			 			 	문자열.indexOf(문자 || 문자열);
 */
public class EX10 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("문자열을 입력하세요. :");
	String text = sc.nextLine();
	sc.close();
	
	for (int i = 0; i < text.length(); i++) {
		char ch = text.charAt(i);
		
		int result = text.indexOf('k');//=>2
		System.out.println(ch);
		System.out.println(result);
		}
	
	
	}
}
