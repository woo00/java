package day17;

public class Semo extends Figure {
	private int garo, sero;
	private double area;
	public Semo() {}
	public Semo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	@Override
	public void setArea() {
		area = garo * sero * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.printf(
							"삼각형\n\t"
							+ "가로 : %2d\n\t"
							+ "세로 : %2d\n\t"
							+ "넓이 : %6.2f\n\n"
							,garo, sero, area
						);
	}
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	

}
