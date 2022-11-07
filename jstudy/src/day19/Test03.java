package day19;

import java.util.*;

public class Test03 {
/*
	1
	ArrayList에 1 ~ 50 사이의 정수 열개를 랜덤하게 만들어서 채우고 정렬해서 출력
	
	2. 위의 결과를 내림차순 정렬해서 출력
	
	단, 정렬은 Comparator를 구현해서 처리
 */
	public Test03() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10 ; i++) {
			int no = (int)(Math.random()*50+1);
			list.add(no);
		}
		
		// 데이터 출력
		System.out.println("###############정렬 전#####################");
		for(int no : list) {
			System.out.print(no + " | ");
		}
		System.out.println();
		//오름차순 정렬
		Collections.sort(list, new MyAsc());
	
		// 데이터 출력
		System.out.println("###############정렬 후#####################");
		for(int no : list) {
			System.out.print(no + " | ");
		}
		System.out.println();
		
		//내림차순 정렬
		Collections.sort(list, new MyDesc());
		
		// 데이터 출력
		System.out.println("###############정렬 후#####################");
		for(int no : list) {
			System.out.print(no + " | ");
		}
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		new Test03();
	}

}

class MyAsc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		/*
			이 함수는 Collections.sort() 함수가 정렬을 할 때 자동 호출되는 함수,
			반환값이 음수면 순서를 바꾸지 않고 양수일 떄 순서를 바꿈.
		 */
		int no1 = (int)o1;
		int no2 = (int)o2;
		int result = no1 - no2;
		return result;
	}
	
}
class MyDesc implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		//o1 :  원본, o2 : 대상
		/*
			이 함수는 Collections.sort() 함수가 정렬을 할 때 자동 호출되는 함수,
			반환값이 음수면 순서를 바꾸지 않고 양수일 떄 순서를 바꿈.
		 */
		int no1 = (int)o1;
		int no2 = (int)o2;
		int result = no2 - no1;
		return result;
	}
	
}