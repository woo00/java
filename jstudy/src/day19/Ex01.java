package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex01 {
/*
	사각형 한개의 정보를 기억할  Nemo 클래스 생성
	랜덤하게 가로와 세로를 입력해서 
	10개의 사각형을 ArrayList에 기억
	
		1. 가로 길이 오름차순 정렬
		2. 면적 내림차순 정렬
	
	하고 출력
 */
	ArrayList<Nemo> nemo;
	public Ex01() {
		nemo = new ArrayList<Nemo>();
		
		for(int i = 0 ; i < 10 ; i++) {
			Nemo n = new Nemo((int)(Math.random()*15+6),(int)(Math.random()*15+6));
			
			nemo.add(n);
		}
		
		for(Nemo n : nemo) {
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			
			System.out.printf("가로 : %3d | 세로 : %3d | 넓이 : %4d\n"
								,garo,sero,area
								);
		}
		System.out.println("============가로 오름차순정렬============");
		Collections.sort(nemo, new GaroAsc());
		for(Nemo n : nemo) {
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			
			System.out.printf("가로 : %3d | 세로 : %3d | 넓이 : %4d\n"
					,garo,sero,area
					);
		}
		System.out.println("===========넓이 내림차순정렬============");
		Collections.sort(nemo, new AreaDesc());
		for(Nemo n : nemo) {
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			
			System.out.printf("가로 : %3d | 세로 : %3d | 넓이 : %4d\n"
					,garo,sero,area
					);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
class GaroAsc implements Comparator{
	public int compare(Object o1, Object o2) {
		int result = 0;
		Nemo n1 = (Nemo)o1;
		Nemo n2 = (Nemo)o2;
		
		int no1 = n1.getGaro();
		int no2 = n2.getGaro();
		result = no1-no2;
		return result;
	}
}
class AreaDesc implements Comparator{
	public int compare(Object o1, Object o2) {
		Nemo n1 = (Nemo)o1;
		Nemo n2 = (Nemo)o2;
		
		return (n1.getArea()<n2.getArea() ? 1 : -1);
	}
}