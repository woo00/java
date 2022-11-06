package day16.ex;

public class Ex01 {
/*
 	"여기는 도형클래스" 를 출력하는 기능을 가진 Dohyung 클래스를 제작
 	Dohyung클래스를 상속받아
 		Semo, Nemo, Dongle
	클래스를 생성
	
	0 ~ 2 랜덤하게 숫자 5개 생성 
		0 원 1 세모 2 네모 		
	의 인스턴스를 배열의 각 방에 채워넣어서
	내용을 출력
 */
	public Ex01() {
		Dohyung[] arr = new Dohyung[5];
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i] instanceof Dongle){
				((Dongle)arr[i]).getArea();
			}
		}
		for(int i = 0 ; i < 5 ; i++) {
			int ran = (int)(Math.random()*3);
			switch(ran) {
			case 0 : 
				Dongle d = new Dongle();
				int ban = (int)(Math.random()*16+5);
				d.setDoole();
				d.setArea(); 
			}
		}
		Semo s = new Semo();
		s.setGaro(10);
		Semo s1 = new Semo(10,10);
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
