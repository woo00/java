package oday02;

public class Ex02 {
/*
문제 2 ]

 1
 2  3
 4  5  6
 7  8  9 10
11 12 13 14 15


방법은 두가지...

1. 

2. 카운터변수(i, j)로만 숫자를 생성하는 방법 (해결못해도 되는 방법...)

 */
	public static void main(String[] args) {
		int no = 0;
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j < 1 + i ; j++) {
				no += 1;
				System.out.printf("%3d",no);
			}
			System.out.println();
		}
	}

}
