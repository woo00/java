package day14;

/*
	학생 클래스를 완성하고
	학생을 랜덤하게 4 ~ 10 으로 만들어서
	데이터를 채워서 출력해주는 프로그램을 작성하세요.
	단, 생성자를 이용해서 초기화 하세요.
 */
public class Ex03 {
	String[] names = {
			"jennie", "lisa", "rose", "jisoo", "dooly",
			"heedong", "gildong", "lina", "loopy", "zoro"
	};
	public Ex03() {
		int ran = (int)(Math.random()*7+4);
		Student [] stud = new Student[ran];
		for(int i = 0 ; i < stud.length; i++) {
			Student s = new Student();
			s.setKor((int)(Math.random()*60+41));
			s.setEng((int)(Math.random()*60+41));
			s.setMath((int)(Math.random()*60+41));
			s.setTotal();
			s.setAvg();
			s.setName(names[i]); 
			stud[i] = s;
		}
		
		for (Student s : stud) {
			System.out.printf("이름 : %4s\n국어 : %3d\n영어 : %3d\n수학 : %3d\n 총점 : %4d\n평균 : %5.2f\n\n"
					,s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg()
					);
			System.out.println("------------------------------------------------------");
		}
		for (int i = 0 ; i < stud.length; i++) {
			for(int j = 0 ; j < stud.length; j++) {
				stud[i].setRank(stud[j]);
			}
		}
		for (Student s : stud) {
			System.out.printf("석차 : %1d | 이름 : %4s\n국어 : %3d\n영어 : %3d\n수학 : %3d\n 총점 : %4d\n평균 : %5.2f\n\n"
					,s.getRank(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg()
					);
		}
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
