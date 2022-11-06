package day16.ex;

public class Nemo extends Dohyung {
	private int garo, sero, area;
	public Nemo() {}
	public Nemo(int garo,int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	public void toPrint() {
		System.out.println("네모");
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
