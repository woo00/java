package day17.sub;

public class Samgak implements Figure {
	private int garo, sero;
	private double area;
	
	public Samgak() {}
	public Samgak(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf(
							"%-4s - 가 로 : %3d, 세 로 : %3d, 넓 이 : %7.2f\n\n"
							,"세모", garo, sero, area
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
	public void setArea() {
		area = garo * sero * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
