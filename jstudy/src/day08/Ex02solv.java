
package day08;

public class Ex02solv {
/*
	원, 삼각형, 사각형을 기억할 Object  타입 배열을 만들어서
	10개를 랜덤하게 채워넣고
	넓이 기준 오름차순 정렬해서
	정보를 출력해주는 프로그램을 작성하세요.
	
	참고 ]
		객체의 타입 확인해주는 연산자
		instanceof
			형식 ]
				변수  instanceof	클래스이름
			==> 변수의 타입이 클래스이름타입이냐???
				반환값을 논리값(true, false)으로 반환된다.
 */
	
	public void exec() {
		Object[] moyang = new Object[10];
		
		for(int i = 0 ; i < moyang.length ; i++ ) {
			int tmp = (int)(Math.random()*3);
			
			int no1 = (int)(Math.random()*16 + 5);
			int no2 = (int)(Math.random()*16 + 5);
			
			switch(tmp) {
			case 0:
				Won w = new Won();
				w.ban = no1;
				w.setArea();
				w.setDoole();
				moyang[i] = w;
				break;
			case 1:
				Semo s = new Semo();
				s.garo = no1;
				s.sero = no2;
				s.setArea();
				moyang[i] = s;
				break;
			case 2:
				Nemo n = new Nemo();
				n.garo = no1;
				n.sero = no2;
				n.setArea();
				moyang[i] = n;
				break;
			}
			
		}
		System.out.println();
		for(int i = 0 ; i < moyang.length - 1; i++ ) {
			
			for(int j = i + 1 ; j < moyang.length ; j++ ) {
				Object o1 = moyang[i];
				double area1 = (o1 instanceof Won)? ((Won) o1).area : (o1 instanceof Semo) ? ((Semo)o1).area:((Nemo)o1).area;
				Object o2 = moyang[j];
				double area2 = (o2 instanceof Won) ? ((Won) o2).area : ( (o2 instanceof Semo) ? ((Semo) o2).area : ((Nemo)o2).area);
				
				if(area1 > area2) {
					moyang[i] = o2;
					moyang[j] = o1;
				}
			}
		}
		
		// 출력
		for(Object o : moyang) {
			if(o instanceof Nemo) {
				System.out.printf("가로가 %2d이고\n세로가 %2d이고 넓이가 %5d인 사각형입니다.", 
						((Nemo) o ).garo,((Nemo) o ).sero, ((Nemo) o ).area);
			} else if(o instanceof Semo) {
				System.out.printf("밑변이 %2d이고\n높이가 %2d이고 넓이가 %5.2f인 삼각형입니다.", 
						((Semo) o ).garo,((Semo) o ).sero, ((Semo) o ).area);
			} else if(o instanceof Won) {
				System.out.printf("반지름이 %2d이고\n둘레가 %5.2f이고 넓이가 %7.2f인 원입니다.", 
						((Won) o ).ban,((Won) o ).doole, ((Won) o ).area);
			}
			System.out.println();
			System.out.println();
		}
	}
	public void exec1() {
		Object[] moyang = new Object[10];
		
		for(int i = 0 ; i < moyang.length ; i++ ) {
			int tmp = (int)(Math.random()*3);
			
			int no1 = (int)(Math.random()*16 + 5);
			int no2 = (int)(Math.random()*16 + 5);
			
			switch(tmp) {
			case 0:
				Won w = new Won();
				w.ban = no1;
				w.setArea();
				w.setDoole();
				moyang[i] = w;
				break;
			case 1:
				Semo s = new Semo();
				s.garo = no1;
				s.sero = no2;
				s.setArea();
				moyang[i] = s;
				break;
			case 2:
				Nemo n = new Nemo();
				n.garo = no1;
				n.sero = no2;
				n.setArea();
				moyang[i] = n;
				
				break;
			}
			
		}
		for(int i = 0 ; i < moyang.length - 1; i++ ) {
			
			for(int j = i + 1 ; j < moyang.length ; j++ ) {
				if(getArea(moyang[i]) > getArea(moyang[j])) {
					Object tmp = moyang[i];
					moyang[i] = moyang[j];
					moyang[j] = tmp;
				}
			}
		}
		
		// 출력
		for(Object o : moyang) {
			if(o instanceof Nemo) {
				System.out.printf("가로가 %2d이고\n세로가 %2d이고 넓이가 %5d인 사각형입니다.", 
						((Nemo) o ).garo,((Nemo) o ).sero, ((Nemo) o ).area);
			} else if(o instanceof Semo) {
				System.out.printf("밑변이 %2d이고\n높이가 %2d이고 넓이가 %5.2f인 삼각형입니다.", 
						((Semo) o ).garo,((Semo) o ).sero, ((Semo) o ).area);
			} else if(o instanceof Won) {
				System.out.printf("반지름이 %2d이고\n둘레가 %5.2f이고 넓이가 %7.2f인 원입니다.", 
						((Won) o ).ban,((Won) o ).doole, ((Won) o ).area);
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Ex02solv e = new Ex02solv();
		e.exec1();
	}

	// 면적 꺼내주는 함수
	public double getArea(Object o) {
		double area = 0;
		if(o instanceof Won) {
			area = ((Won) o).area;
		} else if(o instanceof Semo) {
			area = ((Semo) o).area;
		} else if(o instanceof Nemo) {
			area = ((Nemo) o).area;
		}
		
		return area;
	}
}