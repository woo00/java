package day17;

public class Nemo extends Figure {
	private int garo, sero, area;
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	@Override
	public void setArea() {
		area = garo * sero;
	}

	@Override
	public void toPrint() {
		System.out.printf(
							"사각형\n\t"
							+ "가로 : %2d\n\t"
							+ "세로 : %2d\n\t"
							+ "넓이 : %4d\n\n"
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}

}
