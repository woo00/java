package day24.stream;
/*
 	파일을 문자단위 스트림으로 읽어보자.
 */
import java.io.*;
public class Test09 {

	public Test09() {
		FileReader fr= null;
		try {
			fr = new FileReader("src/day24/stream/정보.txt");
			
			// 데이터 기억할 배열 준비 
			char[] buff = new char[1024];
			int len = fr.read(buff);
			String str = new String(buff,0,len);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (Exception e2) {}
			}
	}

	public static void main(String[] args) {
		new Test09();		
	}

}
