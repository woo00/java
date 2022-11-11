package day20;

public class Semo {
	private int garo,sero;
	private double area;
	public Semo() {}
	public Semo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
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
