package oday02;

public class Ex07 {

	public static void main(String[] args) {
/*
 	문제 5]
 	
 		소수점이 있는 숫자를 입력한 후
 		소수점이하 셋째자리에서 반올림한 결과를 계산해서 출력하자.
 */
		
		double num = 12.345;
		double result = (int)(num * 100 + 0.5) / 100.0;
		
		System.out.println(result);
		
		/*
		 	12.345
		 	1234.5
		 	1234.5 + 0.5
		 	1235
		 	1235/100.0
		 */
		
	}

}
