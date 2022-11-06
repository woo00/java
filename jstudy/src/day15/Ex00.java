package day15;

public class Ex00 {
/*
 	학생의 이름, java, db, web, 총점, 평균점수, rank를 
 	기억학 Student 클래스를 생성
 	이 클래스가 객체가 될 때 필요한 클래스를 입력받아서 객체가 될 수 있도록하고 
 	변수는 은닉화.
 	
1.
	다섯명의 학생의 점수를 기억할 배열을 만들고
	학생을 입력
	
2. 
	1번문항의 학생들의 순위를 계산해서 세팅

3.
	총점 기준 내림차순 정렬
	
extra ]
	랜덤하게 3 - 7 명의 학생을 기억할 배열을 만들고
	학생들의 정보를 입력해서 위 문항의 내용으로 해결
 */
	String[] names = {"철수","영희","민수","민지","평례"};
	
	public Ex00() {
		Student[] sco = new Student[5];
		
		for(int i = 0 ; i < sco.length; i++) {
			sco[i] = new Student(
								names[i],
								(int)(Math.random()*41+60),
								(int)(Math.random()*41+60),
								(int)(Math.random()*41+60)
								);
		}
		for(int i = 0 ; i < sco.length; i++) {
			Student s = sco[i];
			System.out.printf("학생이름 : %4s\n자바 : %3d\n디비 : %3d\n웹  : %3d\n총점 : %3d\n평균 :%5.2f\n석차 : %2d\n\n"
								,s.getName(),s.getJava(),s.getDb(),s.getWeb(),s.getTotal(),s.getAvg(),s.getRank());
		}
		//정렬
		for(int i = 0 ; i < sco.length -1 ; i++) {
			for(int j = i + 1 ; j < sco.length ; j++) {
				if(sco[i].getTotal() < sco[j].getTotal()){
					Student tmp = sco[i];
					sco[i] = sco[j];
					sco[j] = tmp;
				}
			}
		}
		System.out.println("======================================================");
		for(int i = 0 ; i < sco.length; i++) {
			Student s = sco[i];
			System.out.printf("이름 : %2s - 총점 : %3d - 평균 :%5.2f - 석차 : %2d\n\n"
					,s.getName(),s.getTotal(),s.getAvg(),s.getRank());
		}
		//석차
//		for(int i = 0 ; i < sco.length ;i++) {
//			Student s = sco[i];
//			s.setRank(i+1);
//		}
		for(int i = 0 ; i < sco.length; i++) {
			for(int j = 0 ; j < sco.length ; j++) {
				sco[i].setRank(sco[j]);
			}
		}
		System.out.println("=======================석차==========================");
		for(int i = 0 ; i < sco.length; i++) {
			Student s = sco[i];
			System.out.printf("이름 : %2s - 총점 : %3d - 평균 :%5.2f - 석차 : %2d\n\n"
					,s.getName(),s.getTotal(),s.getAvg(),s.getRank());
		}
	}
	
	public static void main(String[] args) {
		new Ex00();
	}

}
