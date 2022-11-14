package day24.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.xml.sax.InputSource;

public class Test10 {
/*
 	휘파람 txt파일을 byte기반 기본스트림과 문자기반 보조스트림을 이용해서 읽어보자
 */
	public Test10() {
//		기본스트림
		FileInputStream fin = null;
//		바이트기반과 문자기반을 연결해줄 보조스트림 필요
		InputStreamReader isr = null;
//		보조스트림
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day24/stream/휘파람.txt");
			isr = new InputStreamReader(fin);	// 기본스트림에 연결
			br = new BufferedReader(isr);		// 보조스트림에 연결
			
			while (true) {
				String line = br.readLine(); // 줄바꿈 기호는 읽어오지 않는다.
				if (line == null) {
					break;
				}
				System.out.println(line);// 강제로 줄바꿈
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
				fin.close();
			} catch (Exception e2) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
