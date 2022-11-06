package day14;

public class Nemo {
	int garo, sero;
	double area;
	public Nemo() {
		garo = 1;
		sero = 1;
		setArea();
	}
	public Nemo(int garo, int sero) {
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
		area = garo * sero;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void test01() {
		new Nemo();
	}
}
