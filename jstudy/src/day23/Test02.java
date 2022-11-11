package day23;

import java.io.FileNotFoundException;

public class Test02 {

	public Test02() {
		try{
			abc();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}							// 예외의 범위는 좁은 것 부터 나열한다.
	}
	
	public void abc() throws FileNotFoundException{
		// 강제로 예외전이 
		throw new FileNotFoundException();
		
//		System.out.println("abc 함수종료"); // 위에서 예외를 강제로 발생시켜서 안됨
	}
	public static void main(String[] args) {
		new Test02();
	}

}
