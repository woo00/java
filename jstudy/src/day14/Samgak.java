package day14;

public class Samgak {
	public int garo, sero;
	public double area;
	
	public Samgak() {} //기본 생성자. 생성사자가 정의되지 않으면 자바 가상머신이 만들어서 호출해줌.

	public Samgak(int garo, int sero) {
		//밑변과 높이를 세팅해주면서 객체를 만들어주는 생성자 
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	public void setArea() {
		area = garo * sero * 0.5;
	}
	public void setArea(double area) {	//setArea 오버로딩
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "밑볕이" +garo+"이고\n높이가" + sero + "이고\n넓이가" +
				area + "인 삼각형.";
	}
}
