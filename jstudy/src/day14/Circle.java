package day14;

public class Circle {
	int ban;
	double doole, area;
	
	
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
		doole = ban*3.14*2;
	}
	public void setDoole(double doole) {
		this.doole = doole;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = ban*ban*3.14;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "반지름" +ban+"이고\n둘레가" + doole + "이고\n넓이가" +
				area + "인 원.";
	}
}
