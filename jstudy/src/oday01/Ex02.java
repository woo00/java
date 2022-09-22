package oday01;

public class Ex02 {

	public static void main(String[] args) {
/*
	문제 2 ]
		'A' 부터 문자를 10개를 만들어서 출력하세요.
 */
		
		char no = 0;	
		for(int i=0;i<10;i++) {
			int num = (int)(Math.random()*255+1);
			if(num >= 'A' && num <= 'Z') {
				no = (char)num; 
			}else {
				i--;
				continue;
			}
			 System.out.println(no); 
		}
	}

}
