package day13;

public class Test02 {

	public Test02() {
		
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	public String getName() {
		return null; // 이렇게 적고 작업을 하다가 반환값이 결정되면 반드시 수정해준다.
	}
	
	public int getNo() {
//		return null; ==> null 은 기본데이터타입이 아니기때문에 에러가 발생한다.
		return 0; // 0으로 셋팅해놓고 작업을 진행한 후 반드시 반환값으로 수정해준다.
	}
	
	public Nemo getNemo() {
		Nemo n = new Nemo();
		
		return n;
	}
}