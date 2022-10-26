package day04;

import java.util.*;

public class Ex01 {
	/*
	문제 1 ]
		두 개의 숫자를 가로와 세로로 입력받아서
		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 
		출력해주는 프로그램을 작성하세요.
		
		힌트 ]
			사각형 넓이 공식
				가로 * 세로
				
			삼각형 넓이 공식
				밑변 * 높이 * 0.5(또는 1 / 2.)
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		
		int garo = sc.nextInt();
		
		System.out.println("세로 : ");
		int sero = sc.nextInt();
		
		System.out.println("사각사각 : " + garo*sero);
		System.out.println("삼각삼각 : " + garo*sero*0.5);
	}

}
