package day11;

public class Ex03 {
	public Ex03() {
		// 학생 10명을 기억할 배열
		Student[] stu = new Student[10];
		
		// 10명의 국어점수 기억할 배열을 만들고 랜덤하게 채우세요
		Student[] kors = new Student[10];
		for(int i = 0 ; i < kors.length ; i ++) {
			Student ko = new Student();
			ko.kor = (int)(Math.random()*41+60);
			kors[i] = ko;
		}
		// 10명의 영어점수 기억할 배열을 만들고 랜덤하게 채우세요
		Student[] engs = new Student[10];
		for(int i = 0 ; i < engs.length ; i++) {
			Student en = new Student();
			en.eng = (int)(Math.random()*41+60);
			engs[i]= en;
		}
			
		// 10명의 수학점수 기억할 배열을 만들고 랜덤하게 채우세요
		Student[] mats = new Student[10];
		for(int i = 0 ; i < mats.length ; i++) {
			Student ma = new Student();
			ma.math = (int)(Math.random()*41+60);
			mats[i]=ma;
		}	
		// 10명의 총점 기억할 배열을 만들고 계산해서 채우세요
		Student[] tots = new Student[10];
		for(int i = 0 ; i < 10 ; i++) {
			Student to = new Student();
			to.total = kors[i].kor + engs[i].eng + mats[i].math;
			tots[i] = to;
		}
		// 10명의 평균 기억할 배열을 만들고 계산해서 채우세요
		Student[] avgs = new Student[10];
		for(int i = 0 ; i < 10 ; i++) {
			Student av = new Student();
			av.avg = tots[i].total / 3.0;
			avgs[i]=av;
		}
		// 학생배열에 각 데이터를 채워넣으세요
		for(int i = 0 ; i < 10 ; i++) {
			Student data = new Student();
			data.kor = kors[i].kor;
			data.eng = engs[i].eng;
			data.math = mats[i].math;
			data.total = tots[i].total;
			data.avg = avgs[i].avg;
			stu[i]=data;
		}
		for(Student s : stu) {
			System.out.printf("언%3d,\n외%3d,\n수%3d,\n합%4d,\n평%5.2f\n",s.kor, s.eng, s.math,s.total,s.avg);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Ex03();
	}
}

