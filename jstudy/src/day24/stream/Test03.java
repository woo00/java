package day24.stream;
import java.io.*;

import javax.swing.JOptionPane;
public class Test03 {
/*
 	파일을 만들어 저장하는 프로그램을 제작
 */
	public Test03() {
//		외부장치(파일)에 연결된 스트림이 필요
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day24/stream/휘파람.txt");
//			파일이 존재하지 않아도 자동으로 만들어줌
			/*
//			1. 한글자만 저장
			fout.write('A');
			*/
			
//			2. 여러글자
			String str = "Hey boy\r\n" + 
					"Make’ em whistle like a missile bomb bomb\r\n" + 
					"Every time I show up blow up (uh)\r\n" + 
					"Make’ em whistle like a missile bomb bomb\r\n" + 
					"Every time I show up blow up (uh)\r\n" + 
					"넌 너무 아름다워\r\n" + 
					"널 잊을 수가 없어\r\n" + 
					"그 눈빛이 아직 나를\r\n" + 
					"이렇게 설레게 해 boom boom\r\n" + 
					"24 365\r\n" + 
					"오직 너와 같이 하고파\r\n" + 
					"낮에도 이 밤에도\r\n" + 
					"이렇게 너를 원해 ooh ooh";
			/*
			 	참고 ]
			 		문자열을 byte[]로 변환해주는 함수
			 		getBytes()
			 */
			byte[] buff = str.getBytes();
//			내보내기
			fout.write(buff);
			JOptionPane.showMessageDialog(null, "저장완료ㅋㅋ");
		} catch (Exception e) {}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
