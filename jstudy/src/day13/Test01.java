package day13;

public class Test01 {
	public Test01() {
		Nemo squ = new Nemo();
		squ.setGaro((int)(Math.random()*16+5));
		squ.setSero((int)(Math.random()*16+5));
		
		squ.setArea();
		System.out.println("가로" + squ.getGaro()+ "세로 " + squ.getSero() +"넓이"+ squ.getArea());
	}
	public static void main(String[] args) {
		new Test01();
	}

}
