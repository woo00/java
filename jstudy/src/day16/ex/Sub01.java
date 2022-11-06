package day16.ex;

public class Sub01 {
	
	Extra main;
	public Sub01() {}
	public Sub01(Extra main) {
		this.main = main;
	}
	
	public void setArr() {
		main.setArr(new Dohyung[5]);
		
		for(int i = 0 ; i< main.getArr().length; i++) {
			int no = (int)(Math.random()*3);
			
			Dohyung d = null;
			
			switch(no) {
			case 0 :
				d = new Dongle((int)(Math.random()*16+5));
				break;
			case 1 :
				d = new Semo((int)(Math.random()*16+5),(int)(Math.random()*16+5));
				break;
			case 2 :
				d = new Nemo((int)(Math.random()*16+5),(int)(Math.random()*16+5));
				break;
			}
			main.getArr()[i] =d;
		}
	}
	public void arrPrint() {
		for(int i = 0; i < main.getArr().length; i++) {
			main.getArr()[i].toPrint();
		}
	}
	
}
