package day24;

public class Test01 {

	public Test01() {
		Nemo n1 = new Nemo(5,10);
		Nemo n2 = new Nemo(10,5);
		
		if(n1.equals(n2)) {
			//면적이 같은 경우 실행되는 블럭
			System.out.println("n1 : " + n1);
		}else {
			//면적이 다른 네모인경우 실행되는 블럭
			System.out.println("n1과 n2는 다른 네모입니다.");
		}
	}

	public static void main(String[] args) {
		new Test01();
	}
}