package oday08;

public class STAR {

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 18-i ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 1 + i * 2 ; k++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		for (int i = 0; i < 5 ; i++) {
			for (int k = 0; k < 1 +i*2 ; k++) {
				System.out.print(" ");
			}
			for (int j = 0 ; j < 36- i *4 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9 - i  ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 9 - i *2 ; k++) {
				System.out.print("*");
			}
			for (int l = 0; l < 1 + i*6 ; l++) {
				System.out.print(" ");
			}
			for (int m = 0; m < 9 - i * 2; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}		

}
