package day21;

import java.util.Comparator;

public class Test01 {
	public int no = 100;
	public Test01() {
//		Comparator comp = new Comparator(); // 안됨 Comparator는 인터페이스이기때문에 new시킬 수 없다.
		T01 t1 = new T01(); // 됨
		t1.def();
	}

	public static void main(String[] args) {
		new Test01();
	}
	public void abc() {}
	
	public class T01{
		//이건 내부클래스
		int num = no;
//		abc(); // 안됨
		public void def() {
			abc();//됨
		}
	}
	
	public static class TopClass{
		//이건 탑레벨 내부클래스
	}
}

class ExtnClass{
	// 이건 외부클래스임
	Test01 t0 = new Test01();
	int no = t0.no;
	
	public void a1() {
	Test01.T01 t1 = t0.new T01();
	t1.def();
	
	t0.new T01().def();
	}
} 