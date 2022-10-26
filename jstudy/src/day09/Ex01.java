package day09;

public class Ex01 {
/*
 	문제 1 ]
 		'A' ~ 'J'까지의 문자를 랜덤하게 100개를 만든 후 
 		각각의 문자가 몇개씩 만들어졌는지 그래프 형태로 출력하는 프로그램 작성해서 실행
 		
 */
	public Ex01() {
		// 만들어진 횟수 기억할 배열 변수
		int[] apb = new int[10];
		for(int i = 0 ; i < 100 ; i++) {
			
			char ch = (char)(Math.random()*('J'-'A'+1)+'A');
			
			//만들어진 문자 카운트
			apb[ch-'A'] +=1;
		}
		//출력
		for(int i = 0 ; i<apb.length; i++) {
			System.out.print((char)('A' + i) + ":"); 
			
			for(int j = 0 ; j<apb[i];j++) {
				System.out.print("▣");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
