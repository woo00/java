package day10;

public class Nemo extends Figure{
	public int garo, sero, around, area;
	

	 public void setAround() {
		 around = (garo*2)+(sero*2);
	 }
	 public void setArea() {
		 area = garo*sero;
	 }
	 
	 public void toPrint() {
		 System.out.println("이 사각형은 가로가" + garo +
							"\n세로가 " + sero +
							"\n넓이가 " + area
							);
	 }
}
