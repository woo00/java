package day08;

public class Test05 {
/*
 	원 5개를 기억할 배열을 만들고
 	배열에 랜덤하게 반지름을 입력해서
 	정보를 출력해주는 프로그램 작성
 */
	public static void main(String[] args) {
		
		Won[] cir = new Won[5];
		/*
		 	클래스 타입의 배열의 경우
		 	배열변수를 만들게 되면
		 	배열의 각 방에 데이터를 바로 채울 수 있는 상태가 아니고
		 	배열의 각 방에 해당 클래스의 인스턴스를 채울 공간만 확보한 상태이다.
		 	변수를 만든 후 반드시 인스턴스를 채우는 작업이 필요하다.
		 */
		
		//인스턴스채우기
		for(int i = 0 ; i < cir.length ; i++) {
			cir[i] = new Won();
		}
		//반지름데이터 채우기
		for(int i = 0 ; i < cir.length ; i++) {
			cir[i].ban = (int)(Math.random()*16+5);
			cir[i].setArea();
			cir[i].setDoole();
//			System.out.println(cir[i].ban);
//			System.out.println(cir[i].doole);
		}
		for(Won w: cir) {
			System.out.printf("반지름이 %3d 이고\n둘레가 %7.2f이고\n면적이 %7.2f인 원입니다.", w.ban, w.doole, w.area);
			System.out.println();
			System.out.println();
			
		}
	}

}
