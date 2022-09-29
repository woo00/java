package oday01;

public class Ex07 {

	public static void main(String[] args) {
		/*
	 	문제 7-1 ]
	 			i		count
	 *****   	0		5
	 ****		1		4
	 ***		2		3
	 **			3		2
	 *			4		1
	 	
	 	문제 7-2 ]
	 	
	     *
	    **
	   ***
	  ****
	 *****
	 	
	 	문제 7-3 ]
	 	
	     *
	    ***
	   *****
	  *******
	 *********

	 */
// 711 별 다섯개 찍기
//			for(int i = 0; i<5; i++) {
//				for(int j=0;j<5-i;j++) {
//					System.out.print("*");
//				}
//					System.out.println();
//				
//			}
			
			
// 712 아래로 다섯번늘이기
//			for(int i = 0 ; i < 5  ; i++) {
//				for(int j = 0 ; j < 1 +i ; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//						
//			}
// 712 아래로 다섯번늘이기 (반전)
//			for(int i = 0 ; i < 5 ; i++) {
//				for(int k = 0 ; k < 4 - i ; k++) {
//					System.out.print(" ");
//				}
//				for(int j = 0 ; j < 1 + i ; j++) {
//					System.out.print("*");
//				}
//				
//				System.out.println();
//				
//			}
										//			이게 아닌디..?
// 713 갈수록 줄이기 
			for(int i = 0 ; i < 5 ; i++) {
				for(int j = 0 ; j < 4-i ; j++) {
					System.out.print(" ");
				}
				for(int k = 0 ; k < 1 + i * 2 ; k++) {
					System.out.print("*");
				}
			System.out.println();		
			}
		
		
	}

}
