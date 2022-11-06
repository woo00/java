package day17;

public class Test01 {

	public Test01() {
		
	}

	public static void main(String[] args) {
		new Test01();
	}
}

final class Father01 {
	public int no;
	public final int num = 100;
	/*
	 	final 변수는 생성되는 순간 초기화가 되어야함.
	 */
	
	public void abc() {
		System.out.println("Father01.abc()");
	}
	
	public final void xyz() {
//		num = 200; final변수의 데이터는 수정 불가능
		System.out.println("Father01.xyz()");
	}
}

//class Son01 extends Father01 { ==> Father01 클래스는 final이기때문에 더이상 상속 불가능
class Son01 {
	public void abc() {
		System.out.println("Son01.abc()");
	}
	
	public final void xyz() {
		System.out.println("Son01.xyz()");
	}
}

class GrandSon01 extends Son01{
	@Override
	public void abc() {
		System.out.println("GrandSon01.abc()");
		
	}
	/*
	@Override
	public void xyz() {
		System.out.println("GrandSon01.xyz()");
		// xyz는 final 함수이기 때문에 오버라이드 불가능.
	}
	*/
}










