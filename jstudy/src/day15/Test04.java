package day15;

public class Test04 {
	
	int cnt;
	public Test04() {
		cnt = (int)(Math.random()*10+1);
		
		Member m = new Member();
		m.setArr(this);
		
		int aCnt = m.getArr().length;
		System.out.println("cnt : " + cnt);
		System.out.println("m.arr.length : " + aCnt);
	}
	

	public static void main(String[] args) {
		new Test04();
	}

}
