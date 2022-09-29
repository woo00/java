package oday03;
/*
	문제 6 ]
		1년은 365.2426일이다.
		이것은 몇일 몇시간 몇분 몇초인지를 계산해서 출력하세여.

	this is 연산자 문제
 */
public class Ex06 {

	public static void main(String[] args) {
		
	/*	
		double year = 365.2426; //1년은 365일, 8760시간, 525600분, 31536000초 이다.
		
		double hour = year * 24;
		
		double min = hour * 60;
		
		double sec = min * 60;
		
		System.out.print(year + "일은 "+ (int)year + "일, " +(int) hour + "시간, " +(int) min + "분, " + (int)sec + "초 이다.");
	*/	
		
		double ryear = 365.2426;
		int year = (int)ryear;
		
		int total = (int) ((ryear - year) * 24 * 60 * 60);
		
		int sec = total % 60;
		
		total /= 60;
		
		System.out.print(year + ", " + sec);
	}
		
}
