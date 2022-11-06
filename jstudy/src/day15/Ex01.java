package day15;

public class Ex01 {
/*
 	1.
 		다음 변수를 가지는 Stud 클래스를 생성
 		
 		String nmae;
 		int ban, no, kor, eng, math, total, rank;
 		double avg;
 		
	2. 생성자함수를 정의
		1. 반, 번호, 이름을 알려주면 객체를 만들 수 있는 기능
		2. 반, 번호, 이름, 3과목 점수를 알려주면 객체를 만들 수 있는기능
		3. 반, 번호, 이름 ,3과목 점수를 배열로 알려주면 객체를 만들 수 있는 기능
		
	3. 위 클래스에 다음 기능을 가지는 함수를 추가
		1. 총점을 반환해주는 getTotal()
		2. 평균을 반환해주는 getAvg()
			소수점 이하 둘째자리에서 반올림해서 반환
		3. 반, 번호, 이름, 3과목 점수, 총점, 평균, 순위를 출력해주는 함수
			(toPrint())
		4. 순위를 계산해주는 함수 setRank()
		
 */
	public Ex01() {
		abc("dooy", 1, 2, 3);
	}
	
	public void printSum(int...no) {
		System.out.println(no1[0] + no2[1] + no3[2]);
		
	}
	
	public void abc(String name, int no1, int no2, int no3) {
		System.out.println("가변인수");
		System.out.println(name + no1 + no2 + no3);
	}
	
	public void abc(String name, int ... score) {
		System.out.println("가변인수");
		abc(name, score[0], score[1], score[2]);
//		System.out.println(name + score[0] + score[1] + score[2]);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
