package day17;

public class Dongle extends Figure {
	private int ban;
	private double doole, area;
	public Dongle() {}
	public Dongle(int ban) {
		this.ban = ban;
		setDoole();
		setArea();
	}

	@Override
	public void setArea() {
		area = ban * ban * Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf(
							"원\n\t반지름 : %2d"
							+ "\n\t둘레 : %5.2f"
							+ "\n\t넓이 : %6.2f\n\n"
							,ban, doole, area);
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
		doole = 2 * ban * Math.PI;
	}
	public void setDoole(double doole) {
		this.doole = doole;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
