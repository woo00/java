package day15;

public class Student {
	private String name;
	private int java, db, web, total, rank;
	private double avg;
	
	public Student() {} // 데이터 입력 없이 객체 만드는 법
	
	public Student(String name, int java, int db, int web) {
		//필요한 데이터 입력하면서 객체 만드는 법
		this.name =name;
		this.java = java;
		this.db = db;
		this.web = web;
		rank = 1;
		setTotal();
		setAvg();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		total = java + db + web;
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
	public void setRank(Student other) {
		if(total < other.getTotal()) {
			rank += 1;
		}
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		avg = total / 3.;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
