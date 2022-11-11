package day15;

public class Test01 {
	String name;
	public Test01() {
		Student stud = new Student();
		stud.setName("영희"); 				// stud가 기억하는 주소의 인스턴스 setName()호출
		setName("철수"); 					// (1) 호출
	}

	public void setName(String name) {		 //(1)
		this.name = name;
		System.out.println("이름 : " + name);
	}
	public static void main(String[] args) {
		new Test01();
	}

}
