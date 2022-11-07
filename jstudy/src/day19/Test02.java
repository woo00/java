package day19;

import java.util.*;

public class Test02 {

	public Test02() {
		LinkedList list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//출력
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print((String)list.get(i) + " | ");
			
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
