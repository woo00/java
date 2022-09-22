package oday02;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
/*
 	문제2]
 		3자리로 구성된 숫자 하나를 입력 받은 후
 		십단위 이하를 버린 숫자를 만들어서 출력하세요.
 		
 		예]
 			123
 			==>100
 */
		//숫자 입력 코드 작성
		Scanner sc = new Scanner(System.in);
		//메시지출력
		System.out.print("세자리 숫자를 입력하세요 : ");
		//입력한 정수를 변수에 기억하고
		int no = sc.nextInt();
		// 다 사용한 자원 반환해주기 ??????????????
		sc.close();
		//십단위이하 단위 버리기
/*		
		방법1. 
 		int nam = no % 100;
		int result = no - nam;
*/		
		int result = no / 100 * 100;
		
		//출력하기
		System.out.println(result);
	}

}
