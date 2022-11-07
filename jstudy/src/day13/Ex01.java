package day13;

public class Ex01 {
/*
	반지름을 랜덤하게 셋팅한 후 
	원의 넓이와 둘레를 계산해서
	출력해주는 프로그램을 제작하세요.
	단,
		반지름 셋팅
		넓이 계산
		둘레 계산
		출력 기능
	은 각각의 함수로 제작해서 하세요.
 */
	public Ex01() {
		Circle won = new Circle();
		won.setBan((int)(Math.random()*16+5));
		won.setArea();
		won.setDoole();
		
		System.out.println("반지름"+ won.getBan() + "둘레" + won.getDoole() + "넓이" + won.getArea());
	}

	public static void main(String[] args) {
		new Ex01();
	}

}