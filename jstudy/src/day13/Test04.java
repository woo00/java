package day13;

public class Test04 {
/*
 	랜덤하게 가로, 세로 길이를 만들어서
 	사각형의 면적을 출력하자
 	단, 
 		길이세팅
 		면적계산
 		출력 기능 
 	은 함수로 제작해서 
 */
	int garo, sero, area; // 전역변수이므로 클래스내 모든곳에서 접근가능
	public Test04() {
		// 길이 세팅함수호출
		setLength();
		// 면적 계산후 세팅 함수호출
		setArea();
		// 사각형 정보출력함수 호출
		toPrint();
	}

	public static void main(String[] args) {
		new Test04();
	}
	
	//길이 세팅
	public void setLength() {
		garo = (int)(Math.random()*16+5);
		sero = (int)(Math.random()*16+5);
	}
	
	// 면적계산
	public void setArea() {
		area = garo * sero;
	}
	
	// 출력
	public void toPrint() {
		System.out.printf("가로가 %3d 이고\n세로가 %3d인 사각형의 \n넓이는 %4d 입니다",garo,sero,area);
	}
}
