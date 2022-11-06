package day17.sub;

public class Sagak implements Figure {
	private int garo, sero, area;
	
	public Sagak() {}
	public Sagak(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf(
				"%-4s - 가 로 : %3d, 세 로 : %3d, 넓 이 : %5d\n\n"
				,"네모", garo, sero, area
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
	public void setArea() {
		area = garo * sero;
	}
	public void setArea(int area) {
		this.area = area;
	}

}
