package oday08;

public class Tree {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 65 - i ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 1 + i * 2; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < 48 + i*2 ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 35 - i *4 ; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 55-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 9 - i*2 ; k++) {
				System.out.print("★");
			}
			for(int l = 0 ; l < 0 +i ; l++) {
				System.out.print(" ");
			}
			for(int m = 0 ; m < 1 + i *4 ; m++) {
				System.out.print("▲");
			}
			for(int n = 0 ; n < 0 + i ; n++) {
				System.out.print(" ");
			}
			for(int o = 0 ; o < 9 -i*2; o++) {
				System.out.print("★");
			}
			System.out.println();
		}
		for(int i = 0 ; i < 7 ; i++) {
			for(int j = 0 ; j < 60 - i*4; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 8 + i*8 ; k++) {
				System.out.print("▲");
			}
			System.out.println();
		}
		for(int i = 0 ; i < 7 ; i++) {
			for(int j = 0 ; j < 50 - i*4 ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 30 + i*8 ; k++) {
				System.out.print("▲");
			}
			System.out.println();
		}		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 55 ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 20 ; k++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}

}
