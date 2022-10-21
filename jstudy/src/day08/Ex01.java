package day08;

public class Ex01 {

	public static void main(String[] args) {
		Won[] won = new Won[10];
		
		
		for(int i = 0 ; i < won.length ; i++) {
			won[i] = new Won();
			won[i].ban = (int)(Math.random()*16+5);
			won[i].setDoole();
			won[i].setArea();
		}
		for(int i = 0 ; i < won.length -1 ; i++) {
			for(int j = i+1 ; j < won.length; j++) {
				if(won[i].ban <won[j].ban) {
					Won tmp = won[i];
					won[i] = won[j];
					won[j] = tmp;
				}
			}
		}
		for(Won w : won) {
			System.out.print(w.ban+", ");
		}
		System.out.println();
		
	}

}
