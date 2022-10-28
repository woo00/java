package day13;

public class Test05 {
/*
 	랜덤하게 가로, 세로 길이를 만들어서
 	사각형의 면적을 출력해주는 프로그램을 작성
 	단.
 		길이반환
 		면적계산
 		출력기능
	은 함수로 제작해서 해결
 */
	public Test05() {
		getLength();
	}

	public static void main(String[] args) {
		new Test05();
	}
	// 가로, 세로 길이 반환함수
	public int[] getLength() {
		/*
		  이 함수는 랜덤하게 가로와 세로를 만들어서 
		  두 데이터를 반환해주는 기능 
		  
		 */
		
		// 반환값 변수 생성
		int[] nums = new int[2];
		// 변수에 데이터 채우기
		for(int i = 0 ; i < 2 ; i++) {
			nums[0] = (int)(Math.random()*16+5);
		}
		// 데이터 반환
		return nums;
	}
	
	public int getArea(int[] l) {
		// 반환값변수 생성
		 int result = 0;
		// 계산해서 변수 채우고
		result = l[0] * l[1];
		// 반환값 반환
		return result;
	}
}
