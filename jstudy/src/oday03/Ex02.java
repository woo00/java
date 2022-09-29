package oday03;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	문제 2]
 		두 자리 숫자를 입력받아
 		두 수의 최소공배수를 구해서 출력해주는 프로그램을 작성하자.
 		
 		최대 공약수도
 */
public class Ex02 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		//메시지 출력
		System.out.print("첫 번째 정수 : ");
		int no1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int no2 = sc.nextInt();
		
		/*
		 	no1 작은 수 기억할 변수
		 	no2 큰 수 기억할 변수
		 */
		//먼저 두 수 중 큰 수와 작은 수 를 판별해준다.
		if(no1 > no2) {
			int tmp = no1; // 큰 수 임시저장
			no1 = no2;		// 작은 수에 no2 기억
			no2 = tmp;		// 큰 수에 임시저장된 숫자 기억...
		}
		
		// 작은 수부터 1씩 감소시켜가면서 두 수를 나눠서 검사
		
		for(int i = no1 ; i > 0 ; i--) {
			if(no1 % i == 0 && no2 % i == 0) {
				String msg = "입력한 두 수 " + no1 + " 과 " + no2 + " 의 \n 최소공약수는 " + i + "입니다.";
				JOptionPane.showMessageDialog(null, msg);
				//반복문 즉시종료
				//<<최대공약수를 찾았기 때문에
				break;
			
			
			}
			
		}
		
		int result = no2;
		//최소 공배수
		while(true) {
			if(result % no1 == 0 && result % no2 == 0) {
				//공통배수를 찾은 경우
				break;
			}
			result++;
		}
		//결고 ㅏ출력 
		JOptionPane.showMessageDialog(null, no1 + "과 " + no2 + " 의 최소공배수는 [" + result + "] 입니다.");
		
	}

}
