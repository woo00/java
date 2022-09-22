package oday02;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
/*
 	문제 7]
 	산수 계산식을 입력받으면
 	그 결과를 처리해서 출력해주는 프로그램을 작성하세요.
 	
 	조건문, 반복문이 필요하면 사용하세요.
 	
 	예]
 		123-23
 		==> 100
 */
		//입력도구
		Scanner sc = new Scanner(System.in);
		//메시지출력
		System.out.print("계산식 입력 : ");
		//읽어서 기억
		String sik = sc.nextLine();
		//연산자 위치값 추출
//		 no1, no2, 
		int idx=0;
		
		String sno1="";
		String sno2="";
		String giho="";
		
		//기호꺼내고
		for(int i = 0; i <sik.length();i++) {
			char ch= sik.charAt(i);
			
			if(ch<'0'||ch>'9') {
				//추출한 문자가 연산기호인 경우
				idx=i;
				giho = ch + "";
			}
		}
		
		// 첫번째 숫자 꺼내기
		for(int i = 0 ; i < idx;i++) {
			sno1 = sno1 + sik.charAt(i);
		}
		// 두번째 숫자 꺼내기
		for(int i = idx+1; i<sik.length();i++) {
			sno2 = sno2+sik.charAt(i);
		}
		//숫자 두개 생성
		int no1= Integer.parseInt(sno1);
		int no2= Integer.parseInt(sno2);
		//계산
		int result = 0;
		
		if(giho.equals("+")) {
			result = no1+no2;
		}else if(giho.equals("-")) {
			result=no1-no2;
		}else if(giho.equals("*")) {
			result=no1*no2;
		}else if(giho.equals("/")) {
			result=no1/no2;
		}
		System.out.println("입력된계산식"+sik+"의결과는"+result);
	}
}
