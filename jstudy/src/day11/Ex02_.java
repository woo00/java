package day11;

public class Ex02_ {
/*
	Student 클래스를 이용해서
	학생들 10명의 점수를 기억할 배열을 만들고
	총점을 입력하고
	평균도 계산하고
	-------------------------- (1)
	순위도 계산해서
	-------------------------- (3)
	정렬하세요.
	-------------------------- (2)
 */
	String[] names = {
			"제니", "리사", "로제", "지수", "아이유",
			"경욱", "태윤", "우영", "경민", "혁주"
	};
	public Ex02_() {
		Student[] scor = new Student[10];
		
		for(int i = 0 ; i < scor.length ; i ++) {
			Student stu = new Student();
			
			stu.name = names[i];
			stu.kor = (int)(Math.random()*41+60);
			stu.eng = (int)(Math.random()*41+60);
			stu.math = (int)(Math.random()*41+60);
			stu.total = stu.kor + stu.eng + stu.math;
			stu.avg = stu.total / 3.0;
			
			scor[i]=stu;
		}
		
		for(int i = 0 ; i < scor.length ; i++) {
			scor[i].rank = 1;
			
			for(int j = 0 ; j < scor.length ; j ++) {
				
				if(scor[i].total<scor[j].total) {
					scor[i].rank +=1;
				}
			}
		}
		
		for(int i = 0 ; i < scor.length -1 ; i++) {
			for(int j = i+1 ; j< scor.length ; j++) {
				
				if(scor[i].total<scor[j].total) {
					Student tmp = scor[i];
					scor[i] = scor[j];
					scor[j] = tmp;
				}
			}
		}
		
		for(Student s : scor) {
			System.out.printf("%2d 등 - %3s : 국어 : %3d, 영어 : %3d, 수학 : %3d, 총점 : %3d, 평균 : %5.2f\n",
								s.rank, s.name, s.kor, s.eng, s.math, s.total, s.avg
								);
		}
	}
	public static void main(String[] args) {
		new Ex02_();
	}

}
