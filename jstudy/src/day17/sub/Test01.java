package day17.sub;

import static java.lang.Math.*;

public class Test01 {
	Figure[] arr;
	public Test01() {
		setArr();
		
		printArr();
	}
	
	//배열세팅 함수
	public void setArr() {
		arr = new Figure[20];
		
		for(int i = 0 ; i < arr.length ; i++) {
			int ran = (int)(random()*3);
			switch(ran) {
			case 0 : 
				arr[i] = new Circle((int)(random()*16+5));
				break;
			case 1 : 
				arr[i] = new Samgak((int)(random()*16+5),(int)(random()*16+5));
				break;
			case 2 : 
				arr[i] = new Sagak((int)(random()*16+5),(int)(random()*16+5));
				break;
			}
		}
	}
	public void printArr() {
		for(int i = 0 ; i<arr.length; i++) {
			arr[i].toPrint();
		}
	}
	public static void main(String[] args) {
		new Test01();
	}

}
