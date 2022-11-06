package day14;

public class Ex01 {
/*
 	3~7 사이 랜덤한 정수생성
 	그 정수만큼의 semo 객체를 만들고
 	정보를 출력해주세요
 */
	public Ex01() {
		// 무작위로 만들어질 세모의 개수
		int ran = (int)(Math.random()*4+4);
		
		// 개수만큼 반복
		for(int i = 0 ; i< ran; i++) {
			//세모생성
			Semo tri = new Semo();
			//길이
			tri.garo = (int)(Math.random()*16+5);
			tri.sero = (int)(Math.random()*16+5);
			tri.setArea();
			
			//출력
			System.out.printf("가로가 %3d,\n세로가 %3d,\n넓이가 %5.2f 인 삼각형\n\n",
								tri.garo,tri.sero,tri.area);
			
			}
		}
	
		
	public static void main(String[] args) {
		new Ex01();
	}

}
