package day16.ex;

public class Semo extends Dohyung {
	private int sero, garo;
	private double area;
	public Semo() {}
	public Semo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	public void toPrint() {
		System.out.println("세모");
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
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
