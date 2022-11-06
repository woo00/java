package day14;

public class Ex01_02 {
	/*
 	3~7 사이 랜덤한 정수생성
 	그 정수만큼의 semo 객체를 만들고
 	정보를 출력해주세요
 */
	public Ex01_02() {
		int cnt = (int)(Math.random()*5+3);
		
		for(int i = 0 ; i < cnt ; i ++) {
			int garo = (int)(Math.random()*16+5); // 밑변
			int sero = (int)(Math.random()*16+5); // 높이
			
			Samgak s = new Samgak(garo, sero);
			
			System.out.println(s);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01_02();
	}

}
