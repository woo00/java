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
			for(int i = 0; i<5; i++) {
				for(int j=0;j<5-i;j++) {
					System.out.print("*");
				}
					System.out.println();
				
			}
			
			
// 712 아래로 다섯번늘이기
// 713 갈수록 줄이기 
	}

}
