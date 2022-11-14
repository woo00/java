package day24;


// Nemo.java 파일의 내용을 읽어보자.

import java.io.*;
import java.util.*;

public class Test04 {

	public Test04() {
		File file = new File("src/day24/Nemo.java");
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			System.out.println("Nemo.java ] ");
			while (true) {
				String str = sc.nextLine();
				if (str == null) {
					break;
					//읽은 문자열이 없으므로 반복문 종료
				}
				System.out.println(str);
			}
		} catch (Exception e) {}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
