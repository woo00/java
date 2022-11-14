package day24;

public class Nemo {
	private int garo, sero, area;
	public Nemo() {}
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
	public int getArea() {
		return area;
	}
	public void setArea() {
		area = garo * sero;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public boolean equals(Object o) {
		/*
		 	이 함수는 Object 클래스에서 상속받은 함수로 
		 	원래 주소를 비교하는 기능이었지만
		 	여기서는 넓이가 같으면 같은 사각형으로 처리하기로 해보자
		 */
		Nemo n = (Nemo) o ;
		
		boolean bool = area == n.getArea();
		
		return bool;
	}
	@Override
	public String  toString() {
		return"가로 : " + garo + ", 세로 : " + sero + ", 넓이 : " + area;
	}
}
