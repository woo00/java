package day14;

public class Test04 {

//	public Test04(int no) {
//	} 이렇게 생성자를 정의하게되면 JVM은 기본 생성자를 만들어주지 않음

	public static void main(String[] args) {
		new Test04();
		// 생성자를 정의하지 않으면
		// JVM이 내부적으로 기본 생성자(매개변수가 없는 생성자)를 만들어서 
		// 호출할 수 있게 됨.
	}

}
