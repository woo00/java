package oday02;

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int no = sc.nextInt();
			if(no==-999) {
				System.out.println("###프로그램을 종료합니다.###");
				break;
			}
			int result = no/100 * 100;
			
			System.out.println(result);
	}
		sc.close();
	}
}
