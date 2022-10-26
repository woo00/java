package oday03;

import javax.swing.*;

/*
 	문제 1]
 		5자리 숫자를 랜덤하게 발생시켜서 
 		각 자리수의 합을 구해주는 프로그램을 작성하세요.
 */


// 10000 ~ 99999

public class Ex01 {

	public static void main(String[] args) {
		int no = (int)(Math.random()*89999+10001);
		int tmp = no;
		int result = 0;
		for(int i = 0 ; i < 5 ; i ++) {
			tmp = no % 10;
		}
		System.out.println(tmp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//숫자 입력
		String sno = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요!");
		// 문자열 정수로 변환하고
		int no  = Integer.parseInt(sno);
		// 임시변수에 기억
		int tmp = no;
		
		//결과값 변수 
		int result =0;
		/*
		 방법 1.
		//각 자리수 꺼내서 더하고
		while(tmp > 0) {
			//맨뒷자리
			int num = tmp % 10;
			result += num;
			tmp /= 10;
		}
		
		 방법 2.
		int gop = 10000;
		while(tmp > 0) {
			//맨앞자리
			int num = tmp / gop;
			
			tmp %= gop;
			gop /= 10;
			
		}
		
		
		for(int i = 0 ; i < sno.length(); i++) {
			// 맨 앞자리부터 문자 하나씩 꺼내기
			char ch = sno.charAt(i);
			// 문자를 숫자로 만듦
//			int num = ch-'0';
			
			int num = Integer.parseInt(ch + "");
			result += num;
		}
		//결과출력
		JOptionPane.showMessageDialog(null, no + "의 각 자리수의 합은 [ " + result + " ] 입니다.");
		*/
	}
}
