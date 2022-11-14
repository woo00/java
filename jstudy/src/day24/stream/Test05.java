package day24.stream;
import java.io.*;

import javax.swing.JOptionPane;
public class Test05 {
/*
 	1. 폴더 하나늘 강제로 만들어보자.
 	2. 계층화된 폴더 하나를 강제로 만들어보자.
 	3. 만들어진 폴더를 삭제해보자.
*/
	public Test05() {
		/*
//		1. 폴더 생성
		File file = new File("src/day24/stream/test01");
		file.mkdir();
		*/
		
		/*
//		2. 계층화된 폴더 생성
		File file = new File("src/day24/stream/test02/t01/t02");
		if (file.mkdirs()) {
			JOptionPane.showMessageDialog(null, "### 폴더생성 성공 ###");
			
		}else {
			JOptionPane.showMessageDialog(null, "### 폴더생성 실패 ###");
		}
		*/
		
//		3.폴더삭제
		/*
		File file = new File("src/day24/stream/test02/t01/t02");
		if(file.delete()) {
			JOptionPane.showMessageDialog(null, "### 폴더삭제 성공 ###");
		}else {
			JOptionPane.showMessageDialog(null, "### 폴더삭제 실패 ###");
		}
		*/
		
//		4. 폴더 이름변경
//		1. 현재폴더와 변경될 폴더를 File로 만들어둔다.
		File oldF = new File("src/day24/stream/test02/t01");
		File newF = new File("src/day24/stream/test02/T01");
		
//		2. 이름 변경 (renameTo())
		oldF.renameTo(newF);
	}

	public static void main(String[] args) {
		new Test05();
	}

}
