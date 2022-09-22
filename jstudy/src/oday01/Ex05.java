package oday01;

public class Ex05 {

	public static void main(String[] args) {
		/*
		문제 5 ]
			21 부터 99 사이의 랜덤한 숫자 10개를 만들어서
			그 숫자들을 더한 합을 출력해주는 프로그램을 작성하세요.
	 */			
		int hap = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int num = (int)(Math.random()*(99-21+1)+21);
			System.out.println(num+",");
			hap = hap + num;
		}
		
		System.out.println("합 : " + hap);
			
	}		
	

}
