package day10;

public class Ex01 {
	public Ex01() {
		Figure fig1 = new Won();
		Figure fig2 = new Semo();
		Figure fig3 = new Nemo();
//		
//		
		Figure[] sha = new Figure[10];
		for(int i = 0 ; i < sha.length ; i++) {
			
			int ran = (int)(Math.random()*3);
			switch(ran) {
			case 0 :
				//fig1 = new Won();
				((Won)fig1).ban = (int)(Math.random()*16+5);
				((Won)fig1).setDoole();
				((Won)fig1).setArea();
				sha[i] = fig1;
			break;
			case 1 :
				//fig2 = new Semo();
				((Semo)fig2).garo = (int)(Math.random()*16+5);
				((Semo)fig2).sero = (int)(Math.random()*16+5);
				((Semo)fig2).setArea();
				sha[i] = fig2;
			break;
			case 2 :
				//fig3 = new Nemo();
				((Nemo)fig3).garo = (int)(Math.random()*16+5);
				((Nemo)fig3).sero = (int)(Math.random()*16+5);
				((Nemo)fig3).setArea();
				sha[i] = fig3;
				break;
			}
		}
		for(Figure f : sha) {
			f.toPrint();
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
