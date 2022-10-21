package doc;

public class Test05 {
/*
 	10개의 정수를 기억할 배열에 
 	랜덤하게 0 ~ 20까지 숫자를 만들어서 채워 넣고
 	합을 구하는데 
 	
 	만약 0이 발생하면 합을 구하는 작업을 중지하세요.
 */
	public static void main(String[] args) {
		
		int[] num = new int[10];
		//배열에 랜덤하게 데이터 채우기
		for(int i = 0 ; i < 10 ; i++) {
			num[i] = (int)(Math.random()*21);
		}
		
		int sum = 0;
		// 1. 변수 생성
		boolean bool = false;
		for(int i = 0 ; i < 10 ; i++) {
			int no = num[i];
			if(no==0) {
				bool = true;
				break;
			}
			sum= sum + no;
			
		}
		if (bool) {
			System.out.println("0입니다.");
		}else {
			System.out.println("합 : " + sum);
		}
	}

}
