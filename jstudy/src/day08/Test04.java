package day08;

public class Test04 {
/*
 	원의 정보를 기억할 Won class를 생성하고
 	반지름을 5 - 20사이의 값으로 랜덤하게 갖는 
 	원 하나를 만들어서
 	
 	반지름, 둘레, 넓이 출력
 	
 	둘레공식
 	2 *반지름 * 3.14 
 	넓이공식
 	반지름*반지름*3.14
 */
	public static void main(String[] args) {
		Won w1 = new Won();
		
		w1.ban = (int)(Math.random()*(20-5+1)+5);
		
		w1.setArea();
		w1.setDoole();
		
		System.out.println("반지름 :" + w1.ban);
		System.out.println("둘레 :" + w1.doole);
		System.out.println("넓이 :" + w1.area);
	}

}
