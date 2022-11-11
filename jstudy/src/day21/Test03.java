package day21;

import java.util.*;

public class Test03 {

	public Test03() {
		HashMap map = new HashMap();
		/*
		map.put("하나", 1);
		map.put("둘", 2);
		map.put("셋", 3);
		map.put("넷", 4);
		
		//데이터 꺼내기
		int no = (int)map.get("하나");
		System.out.println(no);
		*/
		//제니의 정보를 기억하는 맵을 만드세요
		map.put("name", "제니");
		map.put("age", 27);
		map.put("height", 165.5);
		map.put("gen", 'F');
		
		System.out.println("이름 : " + map.get("name"));
		System.out.println("나이 : " + map.get("age"));
		System.out.println("키   : " + map.get("height"));
		System.out.println("성별 : " + map.get("gen"));
	}

	public static void main(String[] args) {
		new Test03();
	}

}
