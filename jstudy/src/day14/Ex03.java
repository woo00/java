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
		String[] names = new String[ran];
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
