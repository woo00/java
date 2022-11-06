package day16.ex;

public class Dongle extends Dohyung {
	private int ban;
	private double doole, area;
	public Dongle() {}
	public Dongle(int ban) {
		this.ban = ban;
		setDoole();
		setArea();
	}
	public void toPrint() {
		System.out.println("원");
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
		doole = 3.14*2*ban;
	}
	public void setDoole(double doole) {
		this.doole = doole;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = 3.14*ban*ban;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
