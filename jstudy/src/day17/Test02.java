package day17;

import java.util.*;

public class Test02 {

	public Test02() {
//		Calendar cal = new Calendar); // 안됨. Calendar는 추상클래스라 new 못 시킴
		Calendar cal = Calendar.getInstance(); // 추상클래스의 인스턴스 확보
		
		String stime = cal.getTime().toString();
		
		System.out.println(stime);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
