package day14;

public class Ex02 {
	Samgak[] semo;
	Nemo[] nemo;
	Circle[] Won;
/*
 	랜덤하게 0~2의 사이의 숫자를 생성
	 	0 원
	 	1 세모
	 	2 네모
 	배열을 만드는데 5 ~ 10 사이의 데이터를 랜덤하게 가지는 배열로 만들고
 	
 	생성자를 통해서 도형이 객체가 되는 순간 기본 세팅이 완료되도록 하고
 	결과 출력
 */
	public Ex02() {
		// 뽑기 
		int ran = (int)(Math.random()*3);
		// 배열길이 
		int arr = (int)(Math.random()*6+5);
		
		for(int i = 0 ; i < 3 ; i++) {
			switch(ran){
			case 0 :
				Won = getCircle(arr);
				break;
			case 1 :
				semo = getSamgak(arr);
				break;
			case 2 :
				nemo = getNemo(arr);
				break;
			}
		}
		
		public void toPrint(int ban, Object[] o) {
			switch(ran) {
			case 0 :
				Circle[] w = (Circle[]) o;
				break;
			}
		}
	}
	//입력된 길이만큼 Circle 배열을 만들어서 반환해주는 함수
	public	Circle [] getCircle(int arr) {
		// 반환값 변수
		Circle[] c = new Circle[arr];
		// 배열 완성 
		for(int i = 0 ; i < arr ; i++) {
			int rad = (int)(Math.random()*16+5);
			c[i] = new Circle(rad);
		}
				
		// 반환하고
		return c;
	}
	
	public Samgak[] getSamgak(int arr) {
		Samgak[] s = new Samgak[arr];
		for(int i = 0 ; i < arr ; i ++) {
			int garo = (int)(Math.random()*16+5);
			int sero = (int)(Math.random()*16+5);
			s[i] = new Samgak(garo, sero);
		}
		return s ;
	}
	
	public Nemo[] getNemo(int arr) {
		Nemo[] n = new Nemo[arr];
		for(int i = 0 ; i < arr ; i ++) {
			int garo = (int)(Math.random()*16+5);
			int sero = (int)(Math.random()*16+5);
			n[i] = new Nemo(garo, sero);
		}
		return n ;
	}
	
	public static void main(String[] args) {
		new	Ex02();
	}

}
