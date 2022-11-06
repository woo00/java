package day16;

import day10.*;

public class Test05 {

	public Test05() {
//		int no = abc(10) + abc(20); // 안됨
		int no = (int)abc(10) + (int)abc(20); // 됨
		
		Semo s = new Semo();
//		xyz(s).garo = 20; // 안됨
		((Semo)xyz(s)).garo = 20; // 됨
		/*
		 	xyz(s) 의 반환값은 Figure 타입,
		 	Figure 클래스는  garo를 멤버로 가지고 있지 않음,
		 	garo를 수정하려면,
		 	원래 Semo 타입으로 강제형변환해서 수정해야함.
		 */
		
	}
	public Object abc(int a) {
		return a;
	}
	
	public Figure xyz(Figure f) {
		return f;
	}
	public static void main(String[] args) {
		new Test05();
	}

}
