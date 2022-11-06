package day18;

import java.util.*;

public class Test02 {

	public Test02() {
		Vector vec = new Vector(10,10);
		int cap = vec.capacity();
		System.out.println("vec.size() : " + vec.size());
		System.out.println("vec.capacity : " + cap);
		for(int i = 0 ; i < 11 ; i++) {
		vec.add("jennie");
		}
		
		cap =vec.capacity();
		System.out.println("vec.size() : " + vec.size());
		System.out.println(cap);
		System.out.println(vec);
		
		ArrayList list = new ArrayList(vec);
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
