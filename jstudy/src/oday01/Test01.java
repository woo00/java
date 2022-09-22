package oday01;

public class Test01 {

	public static void main(String[] args) {
//		System.out.println("Hello Java!!!");

		// 이클립스에서 자바 소스코드 실행은
		// ctrl shift f11
		
	//	System.out.println(Math.random());
/*
 		Math.random() 함수
 		Math라는 클래스에 소속된 함수
 		호출할 때 마다 0<=, <1 실수를 꺼내어 보여준다.
 		
 		따라서 원하는 무작위 정수를 꺼내는 방법은
 		
 		double no = Math.random();
 		
 		int result = (int)(no * 10) >>  0<= result < 10
  		
  		***
  		두 정수 사이 랜덤한 정수를 발생시키는 방법
  		(int)(Math.random() * (큰수 - 작은수 + 1 ) + 작은수)
  */
		
		//1 ~10 사이의 랜덤한 정수를 출력 
		
		
		for(int i = 0 ; i < 5 ; i++) {
			int no = (int)(Math.random() * (10 - 1 + 1) + 1);
			System.out.println(no);
	}
	}
}
