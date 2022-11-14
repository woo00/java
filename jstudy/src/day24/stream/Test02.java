package day24.stream;
import java.io.*;
import java.util.Arrays;

public class Test02 {
/*
 	Test01.java 파일을 읽어보자.
 */
	
	public Test02() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day24/stream/Test01.java"); // byte단위 기본스트림
			/*
//			1. 한 글자 읽기
			int ch = fin.read();
//			출력
			System.out.println((char)ch);
			*/
			
			/*
//			2. 여러글자 읽기
			byte[] buff = new byte[1024];
			int len = fin.read(buff); //읽은 데이터를 buff배열에 기억하고, 읽은 개수 반환해줌
			
			String str = new String(buff, 0, len);
//			출력
			System.out.println(str);
			*/
			
//			파일내용 전체 읽기
//			몇 글자인지 모름
			byte[] buff = new byte[1024];
			while(true) {
//				배열 0 으로 채우고
				Arrays.fill(buff, (byte)0);
//				읽고
				int len = fin.read(buff);
//				문자열로 변환
				String str = new String(buff, 0, len);
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
