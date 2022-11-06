package day14;

public class Ex01_01 {
	/*
 	3~7 사이 랜덤한 정수생성
 	그 정수만큼의 semo 객체를 만들고
 	정보를 출력해주세요
 */
	public Ex01_01() {
		int cnt = (int)(Math.random()*5+3);
		
		for(int i = 0 ; i < cnt ; i ++) {
			Semo s = new Semo();
			setGaro(s); // s 는 Semo의 인스턴스의 주소를 기억하는 레퍼런스 변수
			setSero(s);
			setArea(s);
			toPrint(s);
		}
	
	}
	
	//삼각형의 밑변 세팅함수
	public void setGaro(Semo semo) {
		semo.garo = (int)(Math.random()*16+5);
	}
	
	// 높이 세팅함수
	public void setSero(Semo semo) {
		semo.sero = (int)(Math.random()*16+5);
	}
	
	// 넓이 세팅함수
	public void setArea(Semo semo) {
		semo.setArea();
	}
	// 출력
	public void toPrint(Semo s) {
		System.out.printf("가로가 %3d,\n세로가 %3d,\n넓이가 %5.2f 인 삼각형\n\n",
							s.garo,s.sero,s.area);
	}
	public static void main(String[] args) {
		new Ex01_01();
	}

}
