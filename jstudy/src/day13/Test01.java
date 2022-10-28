package day13;

public class Test01 {
	public Test01() {
		Nemo squ = new Nemo();
		squ.setGaro((int)(Math.random()*16+5));
		squ.setSero((int)(Math.random()*16+5));
		
		squ.setArea();
		System.out.println(squ.getArea());
	}
	public static void main(String[] args) {
		new Test01();
	}

}
