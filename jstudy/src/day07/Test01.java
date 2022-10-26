package day07;

public class Test01 {

	public static void main(String[] args) {	
		// 잘못 된 예//
		
		//랜덤정수
		int no = (int)(Math.random()*10);
		//결과값 변수
		String result ="";
		// switch ~ case 처리
		switch(no) {
		case 0:
			result = "영";
			break;
		case 1:
			result = "하나";
			break;
		case 2:
			result = "둘";
			break;
		case 3:
			result = "셋";
		case 4:
			result = "넷";
		case 5:
			result = "다섯";
		case 6:
			result = "여섯";
		case 7:
			result = "일곱";
		case 8:
			result = "여덟";
		case 9:
			result = "아홉";
		}
		System.out.println("입력된 정수는 [ " + no + " ] 이고 [ " + result + " ] (이)라고 합니다.");
	}

}
