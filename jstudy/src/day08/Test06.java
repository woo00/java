package day08;
//네모 클래스 불러와서 직사각형배열~~~
public class Test06 {

	public static void main(String[] args) {
		Nemo[] squ = new Nemo[5];
		
		for(int i = 0 ; i < squ.length ; i++) {
			squ[i] = new Nemo();
		}
		
		for(int i = 0 ; i < squ.length ; i ++) {
			squ[i].garo = (int)(Math.random()*16);
			squ[i].sero = (int)(Math.random()*16);
			squ[i].setAround();
			squ[i].setArea();
		}
		for(Nemo n : squ) {
			System.out.printf("가로 %3d\n세로%3d\n둘레%4d\n넓이%5d 인 직사각형임",n.garo,n.sero,n.around,n.area);
			System.out.println();
			System.out.println();
		}
		
		String[] str= new String[3];
		
		str[0] = "ㄱ";
		str[1] = "ㄴ";
		str[2] = "ㄷ";
		
		System.out.println(str[1]);
		
	}

}
