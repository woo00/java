package doc;

public class Test04 {

	public static void main(String[] args) {
		// do~ while 문으로 8단 구구단을 출력.
		
		// 단 변수
		int dan = 8;
		// 곱 변수
		int gop =1;
		
		do{
			System.out.println(dan + " X " + gop + " = " + (dan * gop));
			gop++; // 카운터변수 증가
		}while(gop< 10);
	}

}
