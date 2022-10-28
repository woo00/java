package day13;

public class Circle {
	private int ban;
	private double doole, area;
	
	public void setBan(int ban) {
		this.ban = ban;
	}
	
	public int getBan(){
		return ban;
	}
	
	public void setDoole() {
		doole = 2 * 3.14 *ban ;
	}
	
	public void setDoole(double doole) {
		this.doole = doole;
	}
	
	public double getDoole() {
		return doole;
	}
	
	public void setArea() {
		area = ban * ban * 3.14 ;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
}
