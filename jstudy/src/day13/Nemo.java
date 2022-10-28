package day13;

/*
 	VO(Value Object, DTO : Data Transfer Object)
 */
public class Nemo {
	private int garo,sero;
	private double area;
	
	// 변수에 세팅해주는 함수들..
	// 가로
	public void setGaro(int garo) {
		// 이 함수는 입력받은 데이터 garo를 멤버변수에 세팅해주는 기능
		this.garo = garo;
//		return;
	}
	
	// 변수에 세팅된 값을 알려주는 함수들
	// 가로 
	public int getGaro() {
		// 멤버변수가 기억하고 있는 값을 알려주는 기능
		// 따라서 함수 실행의 결과는 garo의 값
		// 반환값 타입은 garo의 타입을 기입
		
		// garo 반환
		return garo;
	}
	// 세로 세팅
	public void setSero(int sero) {
		this.sero = sero;
	}
	
	// 세로 꺼내는 함수
	public int getSero() {
		return sero;
	}
	
	//면적
	// Overloading : 함수의 중첩
	public void setArea() {
		area = garo * sero;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	//면적 알려주는 함수
	public double getArea() {
		return area;
	}
}
