package day11;

import day10.*;

public class Ex01 {
	public Ex01() {
		Figure[] sha = new Figure[10];
		
		int ran = (int)(Math.random()*3);
		
		for(int i = 0 ; i < 10 ; i++) {
			switch(ran) {
			case 0 :
				Won cir = new Won();
				cir.ban = (int)(Math.random()*16+5);
				cir.setDoole();
				cir.setArea();
				sha[i] = cir;
				break;
			case 1 :
				Semo tri = new Semo();
				tri.garo = (int)(Math.random()*16+5);
				tri.sero = (int)(Math.random()*16+5);
				tri.setArea();
				sha[i] = tri;
				break;
			case 2 :
				Nemo squ = new Nemo();
				squ.garo = (int)(Math.random()*16+5);
				squ.sero = (int)(Math.random()*16+5);
				squ.setArea();
				sha[i] = squ;
				break;
			}
		}
		for(Figure f : sha) {
			f.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex01();
		System.out.println();
	}

}
