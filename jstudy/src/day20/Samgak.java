package day20;

public class Samgak implements Comparable {
	private int garo,sero;
	private double area;
	public Samgak() {}
	public Samgak(int garo, int sero) {
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
	@Override
	public int compareTo(Object o) {
		int result = 0;
		Samgak s = (Samgak) o;
		result = getArea() == s.getArea() ? 0 : getArea() < s.getArea() ? 1 : -1;
		return result;
	}
	
}
