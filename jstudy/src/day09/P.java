package day09;

public class P {
/*
 	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

	제한 조건
	n은 10,000,000,000이하인 자연수입니다.
*/
	public static void main(String[] args) {
	    int num = 165124;
	    String temp = num+"";
		int[] answer = {};
		answer = new int[temp.length()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num%10;
			num = num/10;
			System.out.println(answer[i]);
		}
		
		
		
	        
	}

}
