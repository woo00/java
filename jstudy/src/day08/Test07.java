package day08;

public class Test07 {
/*
 	NEMO 객체 10개를 기억할 배열을 만들어서 기억시키고
 	세로의 내림차순으로 정렬해서
 	출력하십쇼
 */
	public static void main(String[] args) {
		Nemo[] squ = new Nemo[10];
		
		for(int i = 0 ; i < squ.length ; i++) {
			squ[i] = new Nemo();
		}
		
		for(int i = 0 ; i < squ.length ; i++) {
			squ[i].garo = (int)(Math.random()*16+5);
			squ[i].sero = (int)(Math.random()*16+5);
			squ[i].setAround();
			squ[i].setArea();
		}
		for(Nemo n : squ) {
			System.out.print(n.sero+", ");
		}
		System.out.println();
		// 정렬
		for(int i = 0 ; i<squ.length -1 ; i++) {
			
			//비교대상 꺼내서 비교
			for(int j = i+1 ; j<squ.length;j++) {
				if(squ[i].sero < squ[j].sero) {
					Nemo tmp = squ[i];
					squ[i] = squ[j];
					squ[j] = tmp;
					
				}
			}
		}
		for(Nemo n : squ) {
			System.out.print(n.sero+", ");
		}
		System.out.println();
		
	}

}
