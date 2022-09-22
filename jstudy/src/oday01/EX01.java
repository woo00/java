package oday01;

public class EX01 {

	public static void main(String[] args) {
/*
  				문제 1 ]
				구구단의 단을 랜덤하게 발생시켜서
				그 단의 구구단을 출력하는 프로그램을 작성하세요
*/
	// 1. 구구단을 만들자 
	
	// 2. 랜덤하게 만들자 
		int dan = (int)(Math.random()*(9-2 +1) +2);
//		for(; dan < 10 ; dan++){
			for(int gop=1; gop<10 ; gop++) {
				System.out.println(dan + " x " + (gop) + " = " + (dan * gop));
			}
//	}
	}
}
