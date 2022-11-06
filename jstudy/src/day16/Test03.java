package day16;

import day10.*;

public class Test03 {

	public Test03() {
		Figure[] arr = new Figure[5];
		
		arr[0] = new Figure();
		arr[1] = new Won(); // 상속자의 자동형변환
		arr[2] = new Semo(); // 상속자의 자동형변환
		arr[3] = new Nemo(); // 상속자의 자동형변환
		arr[4] = new Won();
		
		for(int i = 0 ; i < arr.length ; i++) {
			Figure f = arr[i];
			if(f instanceof Won) {
				int rad = (int)(Math.random()*16+5);
				((Won) f).ban = rad;
				((Won) f).setDoole();
				((Won) f).setArea();
			}else if(f instanceof Semo) {
				int garo = (int)(Math.random()*16+5);
				int sero = (int)(Math.random()*16+5);
				((Semo) f).garo =garo;
				((Semo) f).sero = sero;
				((Semo) f).setArea();
			}else if(f instanceof Nemo) {
				int garo = (int)(Math.random()*16+5);
				int sero = (int)(Math.random()*16+5);
				((Nemo) f).garo = garo;
				((Nemo) f).sero = sero;
				((Nemo) f).setArea();
			}else if(f instanceof Figure) {}
			
			
			f.toPrint();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
