package day09;

public class Test02 {
	public Test02() {
		Nemo[] squ = new Nemo[3];
		
		Nemo n = new Nemo();
		n.garo = 10;
		
		squ[0] = n;
		squ[1] = n;
		squ[2] = n;
		
		n.garo = 100;
		
		System.out.println(squ[0].garo);
		System.out.println(squ[2].garo);
		
		System.out.println(squ.toString());
		System.out.println(squ);
	}
	public static void main(String[] args) {
		new Test02();
	}
}
