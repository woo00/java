package oday01;

public class Ex08 {

	public static void main(String[] args) {
		/*
	 	문제 8 ]
	 	
	 				i
	 		11111	0+1
	 		22222	1+1
	 		33333	2+1
	 		44444	3+1
	 		55555	4+1

	 */
		// 1. 1 네개 찍기
	
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=5;j++) {
					System.out.print(i);
			}
			// 2. 네개찍은 1을 아래로 다섯번 반복
				System.out.println();
		}
		// 3. 다섯번 반복시킨 1을 순차로 증가시키기 
	}

}
