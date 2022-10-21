package day08;

public class Test03 {
/*
 	Semo 클래스를 이용하여 삼각형을 만들자!
 	밑변과 높이는 랜덤하게 5-20 사이로 정수로
 */
	public static void main(String[] args) {
		Semo s1 = new Semo();
		/*
		 	위 명령에서
		 		Semo()
	 		는 생성자 함수를 호출하는 것
	 		매개변수에 데이터가 아무것도 입력되지 않는 형태의 생성자를 '기본 생성자'라고 하고
	 		'기본 생성자'는 제작한 클래스에 생성자가 정의되지 않았으면 
	 		자바가상머신이 만들어서 호출한다.
		 */
		s1.width = (int)(Math.random()*(20-5+1)+5);
		s1.height = (int)(Math.random()*(20-5+1)+5);
		
		System.out.println("밑변 : " + s1.width);
		System.out.println("높이 : " + s1.height);
		
		s1.setArea();
		System.out.println("넓이 : " + s1.area);
		
	}

}
