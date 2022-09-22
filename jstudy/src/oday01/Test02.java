package oday01;

public class Test02 {

	public static void main(String[] args) {
		/*
		 	10 ~ 99 사이의 무작위 숫자 다섯개 발생시켜서
		 	각 숫자가 홀수인지 짝수인지를 판별해서 출력하라
		 */
		
		
		
		//1.랜덤한 숫자 만들자
//		double no = Math.random();
		//2.다섯번 반복한다.
		for(int i = 0 ; i < 5 ; i++){
			int no = (int)(Math.random() * (99 - 10 + 1) + 10);
			System.out.print(no);
		
		//3. 홀수인지 짝수인지 판별한다.....................................................
		//4. 결과 출력ㄱㄱㄱㄱ김ㄴㅇ ㅣ람ㄴㅇ;리문이
		if(no % 2 == 1) {
			System.out.println(" : 홀수");
			}
		if(no % 2 == 0){
			System.out.println(" : 짝수");
			}
		}
	}
}
/*
	void getPerson() {
		Person p1 = new Person();
		p1.name = "jennie";
		p1.age = 27;
		
		Person na = new Person();
		na.name = "정우영";
		na.age = 32;
		
	}
*/	