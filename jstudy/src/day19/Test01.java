package day19;

import java.util.ArrayList;

public class Test01 {

	public Test01() {
		ArrayList list = new ArrayList<>();
		
		//데이터 채우기
		list.add("abcd");	
		list.add("efgh");	
		list.add("ijkl");	
		list.add("mnop");	
		
		System.out.println("list size : " + list.size());
		
		list.add(1,"EFGH");
		System.out.println("list size : " + list.size());
		
		for(int i = 0 ; i <list.size(); i ++) {
			System.out.print((String) list.get(i) + " | ");
		}
		System.out.println();
		
		//데이터 수정
		list.set(0, "가나다라");
		for(int i = 0 ; i <list.size(); i ++) {
			System.out.print((String) list.get(i) + " | ");
		}
		System.out.println();
		
		System.out.println("list contains '가나다라' " + (list.contains("abcd") ? "있" : "없"));
	}

	public static void main(String[] args) {
		new Test01();
	}

}
