package day16.sub;

public class Semo extends Figure {
	private int garo, sero;
	private double area;
//	public int no;
	public Semo() {}
	//생성자 오버로딩
	public Semo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		no = 70;
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
		area = garo*sero*0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public void toPrint() {
		System.out.printf(
						"밑변이 %3d,"+
						"\n높이가 %3d," +
						"\n넓이가 %5.2f인 삼각형\n\n"
						,garo,sero,area
							);
	}
}
