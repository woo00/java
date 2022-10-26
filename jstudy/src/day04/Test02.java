package day04;

import java.util.Scanner;

public class Test02 {
/*
	콘솔로 입력받는 방법
	
	1.
		import java.util.Scanner; // Scanner 클래스를 사용할 준비
		또는
		import java.util.*;		// java.util 폴더내에 있는 모든 클래스를 사용할 준비
 	로 사용할 클래스가 있는 위치를 알려주고
 	
 	2.
 	함수내에서
 		Scanner sc = new Scanner(System.in);
	명령으로 입력도구객체를 만듬.
	
	3.
	입력메시지를 출력해주고
	System.out.print("메시지");
	
	4.사용목적에 따라 함수를 호출해서 입력데이터를 꺼내면 된다.
	
		문자열 ]
			sc.nextLine();
			
		정수 ]
			sc.nextInt();
		실수 ]
			sc.nextDouble();
			
		등 으로 읽어서 변수에 기억시켜서 사용하면된다.
 */
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력메시지 출력
		System.out.println("이름입력 : ");
		// 읽어서 변수기억 
		String name = sc.nextLine();
		
		// 나이입력 메시지 출력
		System.out.println("나이입력 : ");
		// 읽어서 변수기억
		int age = sc.nextInt();
		
		// 출력
		System.out.printf("이름:%4s, 나이: %3d",name,age);
	}

}
