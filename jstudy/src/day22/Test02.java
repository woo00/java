package day22;
import java.io.*;
import java.util.*;

import javax.swing.*;
public class Test02 {
/*
 	Properties의 데이터를 입력해서 
 	파일로 저장해보자.
 */
	public Test02() {
		// 프로퍼티스 준비
		Properties prop = new Properties();
		// map처럼 데이터 추가
		prop.put("name", "우영");
		prop.put("age", "32");
		prop.put("mail", "wooyoung@githrd.com");
		prop.put("addr", "서울시 영등포구 신길동");
		
//		System.out.println("주소 : " + prop.getProperty("addr"));
		//파일로 저장
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day22/wooyoung.smart");
			// prop에 기억된 내용을 파일로 내보낸다.
			prop.store(fout,"주석에 사용할 문자열 데이터");
			// 위 함수가 무사히 실행되면 파일에 저장이 끝난 상ㅌ
			JOptionPane.showMessageDialog(null, "^^");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
