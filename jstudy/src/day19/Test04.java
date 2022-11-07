package day19;

import java.util.*;

public class Test04 {
	private ArrayList<String> names;
	private ArrayList<PinkScore> blackpink;
	public Test04() {
		blackpink = new ArrayList<PinkScore>();
		
		names = new ArrayList<String>();
		names.add("짱구");
		names.add("철수");
		names.add("맹구");
		names.add("유리");
		
		for(int i = 0 ; i < 4 ; i++) {
			int kor = (int)(Math.random()*41+60);
			int eng = (int)(Math.random()*41+60);
			int math = (int)(Math.random()*41+60);
			String name = names.get(i);
			PinkScore score = new PinkScore(name, kor, eng, math);
			
			blackpink.add(score);
		}
		//출력
		System.out.println("########정렬 전########");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t- %4d, a- %5.2f\n"
								,name,kor,eng,math,total,avg
								);
		}
		
		Collections.sort(blackpink, new TotalDesc());
		System.out.println("########정렬 후########");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t- %4d, a- %5.2f\n"
					,name,kor,eng,math,total,avg
					);
		}
		// 국어점수 기준 내림차순 정렬
		Collections.sort(blackpink, new KorDesc());
		System.out.println("########국어점수기준 정렬 후########");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t- %4d, a- %5.2f\n"
					,name,kor,eng,math,total,avg
					);
		}
		// 평균기준 내림차순 정렬
		Collections.sort(blackpink, new AvgDesc());
		System.out.println("########평균기준 정렬 후########");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t- %4d, a- %5.2f\n"
					,name,kor,eng,math,total,avg
					);
		}
		
		// 이름순 오름차순 정렬
		Collections.sort(blackpink, new NameAsc());
		System.out.println("########이름순 정렬 후########");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t- %4d, a- %5.2f\n"
					,name,kor,eng,math,total,avg
					);
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}

//내림차순 정렬 클래스
class TotalDesc implements Comparator {
	public int compare(Object o1, Object o2) {
		//반환값 변수
		int result = 0 ;
		//원래 리스트에 입력된 타입으로 형변환
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		//총점 꺼내고
		int no1 = p1.getTotal();
		int no2 = p2.getTotal();
		result = no2 - no1;
		return result;
	}
}
class KorDesc implements Comparator {
	public int compare(Object o1, Object o2) {
		//반환값 변수
		int result = 0 ;
		//원래 리스트에 입력된 타입으로 형변환
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		//꺼내고
		int no1 = p1.getKor();
		int no2 = p2.getKor();
		result = no2 - no1;
		return result;
	}
}
class NameAsc implements Comparator {
	public int compare(Object o1, Object o2) {
		//반환값 변수
		int result = 0 ;
		//원래 리스트에 입력된 타입으로 형변환
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		// 꺼내고
		String no1 = p1.getName();
		String no2 = p2.getName();
		result = no2.compareTo(no1);
		return result;
	}
}
class AvgDesc implements Comparator {
	public int compare(Object o1, Object o2) {
		//반환값 변수
//		double result = 0. ;
		//원래 리스트에 입력된 타입으로 형변환
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		/*
		double no1 = p1.getAvg();
		double no2 = p2.getAvg();
		result = no2 - no1;
		return (int)result;
		*/
		return(p1.getAvg() < p2.getAvg() ? 1 : -1);
	}
}
