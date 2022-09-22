package oday02;

public class Ex06 {

	public static void main(String[] args) {
/*
 	 문제 4]
 	 
 	 화씨(Fahreheit)온도 100도는
 	 섭씨(Celcius)온도 몇 도 인지를 출력해주는 프로그램을 작성하자
 	 
 	 참고 ] 
 	 	섭씨온도 = 5 / 9 x(화씨온도-32)
 */
	
		//화씨온도 100도 입력
		int hwa = 100;
		//계산식 작성
		double sub = 5.0/9.0 * (hwa-32);
		//출력
		System.out.print(sub);
	}

}
