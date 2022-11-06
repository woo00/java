package day15;

public class Test02 {
/*
 	다양한 개수의 정수 입력
 	그 합을 구해주는 함수 getSum()을 생성 
 	실행
 */
	public Test02() {
		int result1 = getSum(1,2);
		System.out.println(result1);
		int result2 = getSum(10,20,30,40,50);
		System.out.println(result2);
		
		int[] arr1 = {1,2,3};
		System.out.println(getSum(arr1));
	}
	
	
	public int getSum(int ... no) {
		//반환값변수
		int result = 0;
		
		/*
		 	가변인수 변수는 
		 	자동적으로 배열 변수가 되므로
		 	배열처럼 데이터를 다뤄야함.
		 */
		
		// 데이터가 몇개가 입력되는지
		// 입력된 데이터의 개수만큼 배열을 만듦
		for(int i = 0 ; i< no.length ;i++) {
			result +=no[i];
		}
		//반환값반환
		return result;
	}
	public static void main(String[] args) {
		new Test02();
	}

}
