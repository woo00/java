package day09;

public class Ex01_01 {
/*
 	문제 1 ]
 		'A' ~ 'J'까지의 문자를 랜덤하게 100개를 만든 후 
 		각각의 문자가 몇개씩 만들어졌는지 그래프 형태로 출력하는 프로그램 작성해서 실행
 */
	public static void main(String[] args) {
		// 배열만들기 : 횟수를 누적,저장할 배열
		int[] apb = new int[10];
		
		// 랜덤하게 알파벳 만들기
		for(int i = 0 ; i < 100 ; i++) {
			char ch = (char)(Math.random()*('J'-'A'+1)+'A');
			
			// 횟수 카운트하기
			apb[ch-'A'] += 1; 
		}
		
		// 출력하기
		for(int i = 0 ; i < apb.length ; i++) {
			System.out.print((char)('A' + i));
			for(int j = 0 ; j < apb[i] ; j++) {
				System.out.print("▤");
			}
		System.out.println();
		}
	}
}
