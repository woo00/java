package day15;

public class Stud {
	private String name;
	private int ban, no, kor, eng, math, total, rank;
	private double avg;
	public Stud() {}
	public Stud(String name, int ban, int no) {
		this(name, ban, no, 0, 0, 0);
		/*
		this.name = name;
		this.ban = ban;
		this.no = no;
		*/
	}
	//3. 데이터 6개 입력해서 호출하는 생성자
	public Stud(String name, int ban, int no,int kor, int eng, int math) {
//		this(name, ban, no);
		
		this.name = name;
		this.ban = ban;
		this.no = no;
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		setAvg();
	}
	
	//3. 데이터 6개 입력해서 호출하는 생성자
	public Stud(String name, int ban, int no, int ... score) {
		this(name, ban, no, score[0], score[1], score[2]);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
		return (avg+0.05)*10 /10.0;
	}
	public void setAvg() {
		avg = total /3.;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

}
