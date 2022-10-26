package day08;

public class Ex02 {
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
	public static void main(String[] args) {
		Object[] moyang = new Object[10];
		
		for(int i = 0 ; i < moyang.length ; i++) {
			int tmp = (int)(Math.random()*3);
			//0 원 1 삼각형 2 사각형
			int no1 = (int)(Math.random()*16+5);
			int no2 = (int)(Math.random()*16+5);
//			moyang[i] = (tmp==0)? new Won() : (tmp==1)? new Semo() : new Nemo();
			
			switch(tmp) {
			case 0 :
				moyang[i] = new Won(); 
				// 각 방에 담겨있는데이터는 원래 타입으로 강제 형변환 해줘야 변수,함수를 사용할 수 있다.
				((Won)moyang[i]).ban = no1;
				((Won)moyang[i]).setDoole();
				((Won)moyang[i]).setArea();
				
				break;
			case 1 :
				moyang[i] = new Semo();
				break;
			case 2 :
				moyang[i] = new Nemo();
				break;
			}
		}
		for(int i = 0 ; i < moyang.length -1; i++) {
			Object o1 = moyang[i];
			double area1 = (o1 instanceof Won)?((Won)o1).area : (o1 instanceof Semo)?((Semo)o1).area:((Nemo)o1).area;
			for(int j = i+1 ; j<moyang.length; j++) {
				double area2 = (o1 instanceof Won)?((Won)o1).area : (o1 instanceof Semo)?((Semo)o1).area:((Nemo)o1).area;
				
				if(area1>area2) {
					moyang[i]=moyang[j];
					moyang[j] =o1;
				}
			}
		}
		/*
		Object o = new Nemo();
		
		double area1 = 0;
		if(o instanceof Nemo) {
			area1 = ((Nemo) o).area;
			// Object 타입으로 변환된 객체는 사용할 때 반드시 원래 타입으로 강제 형변환 해줘야 한다.
		} else if(o instanceof Semo) {
			area1 = ((Semo) o).area;
		} else if(o instanceof Won) {
			area1 = ((Won) o).area;
		}
		*/
	}
	//면적 꺼내주는 함수
	public double getArea(Object o) {
		double area = 0;
		if(o instanceof Won) {
			area = ((Won)o).area;
		}else if(o instanceof Semo) {
			area = ((Semo)o).area;
		}else if(o instanceof Nemo) {
			area = ((Nemo)o).area;
		}
		return area;
	}
}
