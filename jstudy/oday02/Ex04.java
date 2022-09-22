package oday02;

import java.util.*;

public class Ex04 {
/*
	문제 2 ]
		3자리로 구성된 숫자 하나를 입력 받은 후
		십단위 이하를 버린 숫자를 만들어서 출력하세요.
		
		예 ]
			123
			==> 100
 */
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력메세지 출력
		System.out.print("세자리 숫자 입력 : ");
		// 입력된 데이터 변수에 기억시키고
		int no = sc.nextInt();
		// 다 사용한 자원 반환해주고
		sc.close();
		
		/*
		// 1.
		int namuji = no % 100;
		int result = no - namuji;
		*/
		
		/*
		// 2.
		int result = no / 100 * 100;
		
		System.out.println("입력된 숫자 : " + no);
		System.out.println("계산된 숫자 : " + result);
		*/
		
		String sno = no + "";
		/*
		'0' - '0' ==> 0
		'1' - '0' ==> 1
		*/
		char ch = sno.charAt(0);
		
//		sno = ch + "";
		
//		int result = Integer.parseInt(sno) * 100;
		int result = (ch - '0') * 100;
		System.out.println("입력된 숫자 : " + no);
		System.out.println("계산된 숫자 : " + result);
	}

}
