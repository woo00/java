package day10;

public class Semo extends Figure {
	public int garo, sero;
	public double area;
	//넓이계산용 함수 
	public void setArea() {
		area = garo * sero * 0.5;
	}
	
	public void toPrint() {
		System.out.println("이 삼각형은 가로가" + garo +
							"\n세로가 " + sero +
							"\n넓이가 " + area
							);
	}
}
