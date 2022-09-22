package oday01;

public class Ex09 {

	public static void main(String[] args) {
		/*
	 	
	 	문제 9 ]
	 		12345
	 		23456
	 		34567
	 		45678
	 		56789

	 */
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(j+i+1);
			}
			System.out.println();
		}

	}

}
