package oday02;

public class Ex03 {

	public static void main(String[] args) {
/*
  다음문제를 읽고 마지막 변수들의 값을 예측해보세요
  
  	1.	 
  		int a= 10;
  		int	b = ++a + ++a;
  				11		12
  		
  		b : 23
  		
  	2.
  		int a = 10;
  		int b = ++a + a++;
  				11	  11		
  		b : 22 
  		
  	3.
  		int a = 10;
  		int b = a++ + a++;
  				10		11
  				
  				b: 21
  	4.
  		int a = 10;
  		int b = 10;
  		
  		if(a++ > b && ++a < ++b) {
  			b += 10;
  		}
  		
  		System.out.println(a);
  		System.out.println(b);
  */
		int a = 10;
  		int b = 10;
  		
  		if(a++ > b && ++a < ++b) {
  			b += 10;
  		}
  		
  		System.out.println(a);
  		System.out.println(b);
	}

}
