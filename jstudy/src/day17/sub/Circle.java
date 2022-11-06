package day17.sub;

public class Circle implements Figure {
	private int ban;
	private double doole, area;
	
	public Circle() {}
	public Circle(int ban) {
		this.ban = ban;
		setDoole();
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf(
							"%-5s - 반지름 : %2d, 둘 레 : %7.2f, 면 적 : %7.2f\n\n"
							, "원", ban, doole, area
							);
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public double getDoole() {
		return doole;
	}
	public void setDoole() {
		doole = 2 * ban * Math.PI;
	}
	public void setDoole(double doole) {
		this.doole = doole;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = ban * ban * Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
