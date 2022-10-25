package day10;

import day08.*;

public class Test01 {
	
//	생성자 중 매개변수가 없는 형태의 생성자를 기본생성자라고 한다.
//	기본생성자는 생성자를 하나라도 만들지 않으면 자바가상머신이 만들어 준다.
	public Test01() {
		/*
		 	랜덤하게 원, 세모, 네모를 만들어서
		 	내용을 출력하자.
		 	단 랜덤하게 만들어질 도형의 변수는 모든 도형을 입력할 수 있는 타입(Object)으로한다.
		 */
		
//		Object obj1 = new Won();
//		Object obj2 = new Semo();
//		Object obj3 = new Nemo();
//		
//		 이렇게 작성한 클래스를 Object 타입 변수에 담게되면
//		 Object클래스에는 그 함수와 변수가 없기때문에 사용불가능.
//		 해결법은 작성한 클래스 타입으로 강제 형변환 해주면 사용가능
//		Object obj = null;
		
//		여러개의 도형을 기억해야되므로 배열로 만들고 형태가 각자 다르므로 Object로 모아서관리한다
//		 데이터 10개를 관리할 배열생성
		Object[] arr = new Object[10]; // 각 방에 null로 채워진 상태임
		
//		반복하여 랜덤하게 도형 생성 배열에 집어넣기 10번.
		for(int i = 0 ; i < 10 ; i++) {
			
//		랜덤하게 0~2 까지의 숫자를 만든다. 0 :원 1 :삼각형 2:사각형
			int num = (int)(Math.random()*3);
		
			switch (num) {
			case 0 :
				Won won = new Won();
				//반지름
				won.ban = (int)(Math.random()*16+5);
				//둘레
				won.setDoole();
				//넓이
				won.setArea();
				arr[i] = won;
				break;
			case 1 :
				Semo tri = new Semo();
				//밑변
				tri.garo = (int)(Math.random()*16+5);
				//높이
				tri.sero = (int)(Math.random()*16+5);
				//넓이
				tri.setArea();
				arr[i] = tri;
				break;
			case 2 :
				Nemo squ = new Nemo();
//				밑변
				squ.garo = (int)(Math.random()*16+5);
//				높이
				squ.sero = (int)(Math.random()*16+5);
//				넓이
				squ.setArea();
				arr[i] = squ;
				break;
			}
		}
		
//		정렬하기
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i+1; j <arr.length ; j++) {
//				 원본 면적꺼내기
				
				double area1 = 0;
				if(arr[i] instanceof Won) {
					area1 = ((Won)arr[i]).area;
				}else if(arr[i] instanceof Semo) {
					area1 = ((Semo)arr[i]).area;
				}else if(arr[i] instanceof Nemo) {
					area1 = ((Nemo)arr[i]).area;
				}
				
//				비교본 면적 거내기
				double area2 = 0;
				if(arr[j] instanceof Won) {
					area2 = ((Won)arr[j]).area;
				}else if(arr[j] instanceof Semo) {
					area2 = ((Semo)arr[j]).area;
				}else if(arr[j] instanceof Nemo) {
					area2 = ((Nemo)arr[j]).area;
				}
				
				if(area1 > area2) {
					Object tmp = arr[i]; //임시변수에 기억시켜놓기
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
//		출력
		
//		반복해서 하나씩 꺼내어 출력
		for(int i =0 ; i < arr.length ; i++) {
			/*
			 	arr배열에는 Object 타입으로 데이터를 채웠으니
			 	하나씩 꺼내면 Object 타입의 데이터가 된다.
			 	Object 타입의 데이터를 실제 heap에 만든 인스터스의 형태로
			 	만들어줘야 데이터들을 사용가능
			 */
			Object obj = arr[i];
			if(obj instanceof Won) {//=>변수 obj가 가리키는것이 Won의 인스턴스입니까?
				System.out.println("●의 넓이 : " + ((Won)obj).area);
			}else if( obj instanceof Semo) {
				System.out.println("▲의 넓이 : " +((Semo)obj).area);
			}else if(obj instanceof Nemo) {
				System.out.println("■의 넓이 : " + ((Nemo)obj).area);
			}
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}
