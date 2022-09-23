package oday03;



/*
 	문제 1]
 		5자리 숫자를 랜덤하게 발생시켜서 
 		각 자리수의 합을 구해주는 프로그램을 작성하세요.
 */

// 10000 ~ 99999

public class Ex01 {

	public static void main(String[] args) {
		
		int no = (int)(Math.random()*99999-10000+1)+10000;
	System.out.print(no);
	}
}
