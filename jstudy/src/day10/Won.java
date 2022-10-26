package day10;

public class Won extends Figure {
	
	public int ban;
	public double area, doole;
	
	public void setArea() {
		area = ban*ban*3.14;
	}
	public void setDoole() {
		doole = 2*ban*3.14;
	}
	
	public void toPrint() {
		System.out.println("이 원은 반지름이 " + ban +
							"\n둘레가 " + doole +
							"\n넓이가 " + area
							);
		
	}
}
