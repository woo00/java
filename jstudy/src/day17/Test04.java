package day17;

public class Test04 {
	private Figure[] fig;
	
	public Test04() {
		// 배열 세
		setFig();
		//내용 출력
		printFig();
		
		Figure f = new Sagak(10, 20);
		f.toPrint();
	}
	
	// 배열 세팅 전담 처리함수
	public void setFig() {
		//배열 생성
		int ran = (int)(Math.random()*16+5);
		fig = new Figure[ran]; 				// 배열길이를 랜덤하게 만듬
		
		//길이만큼 반복해서 배열에 채움
		for(int i = 0 ; i < ran ; i++) {
			//채울 도형 결정
			int fType = (int)(Math.random()*3);
			
			switch(fType) {
			case 0 : 
				int ban = (int)(Math.random()*16+5);
				fig[i] = new Dongle(ban);
				break;
			case 1 : 
				int garo = (int)(Math.random()*16+5);
				int sero = (int)(Math.random()*16+5);
				fig[i] = new Semo(garo, sero);
				break;
			case 2 :
				int garo1 = (int)(Math.random()*16+5);
				int sero1 = (int)(Math.random()*16+5);
				fig[i] = new Nemo(garo1, sero1);
				break;
			}
		}
	}
	
	// 배열 내용출력 전담 함수
	public void printFig() {
		for(int i = 0; i < fig.length; i++) {
			fig[i].toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
