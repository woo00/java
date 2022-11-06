package day16;

import java.util.*;
import day10.*;

public class Test04 {

	public Test04() {
		ArrayList list = new ArrayList();
		
		list.add(1); // 1 : int ---> Integer(Boxing) ---> Object(자동형변환)
		list.add("ABC");
		list.add('F');// 'F' : char ---> Character(Box) ---> Object(자동형변환)
		list.add(new Figure());
		
		((Figure)list.get(3)).toPrint();
		
		System.out.println((int)list.get(0) +3);
		/*
		 	list.get(0) --> Integer 강제 형변환(Boxing) --> Int로 자동 UnBoxing
		 */
		
//		ArrayList<int> list1 = new ArrayList<int>(); // 클래스타입이 아니기때문에 안됨
		ArrayList<Integer> list1 = new ArrayList<Integer>(); // 됨
		
		list1.add(10);
		list1.add(20);
		
		System.out.println(list1.get(0)+100);
	}

	public static void main(String[] args) {
		new Test04();
	}

}
