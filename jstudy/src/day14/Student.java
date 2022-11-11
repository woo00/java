package day14;

/*
	학생의 이름, 국어, 영어, 수학, 총점, 평균 점수, 등수
	를 기억할 클래스
 */
public class Student {
	String name;
	int kor, eng, math, total, rank;
	double avg;
	public Student() {}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		setAvg();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		total = kor + eng + math;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		avg = total /3.0;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

}
