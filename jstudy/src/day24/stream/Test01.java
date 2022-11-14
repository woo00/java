package day24.stream;
import java.io.*;
import java.util.*;

import oracle.net.aso.b;
public class Test01 {

	public Test01() {
		/*
		 	참고]
		 	키보드 역시 외부장치.
		 	자주사용하는 외부장치이기 때문에
		 	이미 스트림을 준비한 변수가 존재
		 	==> System.in
		 */
		System.out.print("한글자 입력");
		int ch = 0;
		try {
			/*
			//한글자 읽기
			ch = System.in.read();
			System.out.println("읽은 문자 : " + (char)ch);
			//여러글자 읽기
			//읽은 데이터를 기억할 변수
			byte[] buff = new byte[1024]; // 배열의 사이즈에 따라서 한 번에 읽을 수 있는 문자수가 결정됨.
			
			int len = System.in.read(buff);
//			읽은 데이터는 buff배열에 기억시키고 읽은 데이터의 개수를 반환해준다.
//			문자열로 변환
			String str = new String(buff, 0, len);
			
//			출력
			System.out.println("읽은 문자열 : " + str);
		 */
			byte[] buff = new byte[1024];
			Arrays.fill(buff, (byte)'A'); //강제로 'A'로 모두 채우고
			int len = System.in.read(buff, 10, 100);
//			==> 준비된 배열에서 11번째 위치에서부터 읽은 내용을 기억하세요.
//				최대 100개까지만 읽으세요
			String str = new String(buff, 10, len + 100);
			System.out.println("읽은 문자열 " + str);
			System.out.println();
		} catch (Exception e) {}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
