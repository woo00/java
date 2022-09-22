package oday02;

public class Test01 {

	public static void main(String[] args) {
		// 숫자형태의 문자 4개를 랜덤하게 만들어서 순서대로 나열하고
		// 그 숫자를 24로 나눈 몫과 나머지를 계산하자.
/*
 * 		char ch ='a'+'a';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
 */
		//작업순서
		
		//3 4번반복한다
		String sno ="";
		for(int i=0; i<4; i++) {
			//1랜덤하게 숫자형태의 문자를 만들자
			//숫자형태의 문자들의 아스키코드 값은 0~9 로 만들어진다.
			char ch = (char)(Math.random()*('9'-'0'+1)+'0');
			
			if(i == 0 && ch == 0) {
				//카운트 1감소시키고
				--i;
				continue;
			}
			//2만든문자를 문자열에 덧붙인다.
			sno = sno + ch;
		}
		//정수로 변환
		int num = Integer.parseInt(sno);
		
		//계산하자
		int mok = num / 24;
		int nam = num % 24;
		
		System.out.printf("만든 숫자 : %s, \n24로 나눈 몫 : %d, \n24로 나눈 나머지 : %d", sno, mok, nam);
	}

}
