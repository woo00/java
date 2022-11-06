package day14;

public class Test02 {
	int no1, no2;
	/*
	 	숫자를 더하는 기능의 plus 함수를 제작
	 	
	 	멤버 변수 no1, no2 가 기억하는 숫자를 더하는 기능의 plus 함수를 오버로딩.
	 	
	 	새개의 숫자를 입력받고 더해서 반환해주는 함수로 오버로딩.
	 	
	 	두개의 정수를 입력받아서 멤버변수 no1에 세팅해주는 함수로 오버로딩
	 */
	public Test02() {
	}
	public int plus(int a, int b) {
		return a + b;
	}
	/*
	반환값 타입과는 관계없고 매개변수리스트가 달라야한다.
	
	public void plus(int a, int b) {
		no1 = a + b;
	}
	
	*/
	public int plus(int a, int b, int c) {
		return a + b + c;
	}
	
	public int plus() {
		// no1, no2 는 전역변수!
		// 매개변수로 입력되어야될 없다.
		return no1 + no2;
	}
	public static void main(String[] args) {
		new Test02();
		
	}

}
