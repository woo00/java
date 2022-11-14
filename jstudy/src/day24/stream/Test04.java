package day24.stream;
import java.io.*;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class Test04 {
/*
 	whistle.txt파일을 휘파람.txt로 복사해보기
 */
	public Test04() {
		/*
		 	파일 복사는 먼저 파일을 읽어와서 
		 	읽은 내용을 내보낸다.
		 	따라서, 스트림도 두 가지 종류가 모두 필요하다 
		 */
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream("src/day24/stream/whistle.txt");
			fout = new FileOutputStream("src/day24/stream/휘파람.txt");
//			몇 번 반복 모름
			byte[] buff = new byte[1024];
			while(true) {
				Arrays.fill(buff, (byte)0);
//				읽고
				int len = fin.read(buff);
				/*
					read(byte[] b) 함수는 읽은 데이터가 없는 경우 -1을 반환해준다.
					따라서 이 때는 반복작업을 멈춰야한다.
				 */
				if (len == -1) break;
				
				fout.write(buff,0,len);
			}
			JOptionPane.showMessageDialog(null, "파일 저장 완료");
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "### 파일 저장 실패 ###");
		}finally {
			try {
				fout.close();
				fin.close();
			} catch (Exception e2) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
