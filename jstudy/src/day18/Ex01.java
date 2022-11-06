package day18;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex01 {

	public Ex01() {
	// StringBuffer 객체 생성
			StringBuffer buff = new StringBuffer("name=");
			//데이터 덧붙이고
			buff.append("jennie");
			buff.append("&id=jennie");
			buff.append("&pw=12345");
			buff.append("&mail=jennie@githrd.com");
			
			//문자열로 변환해서 출력
			String param = buff.toString();
			
			/*
			 	param을 분리해서
			 	ArrayList에 담아서 출력
			 	ArrayList에 ArrayList가 들어있는 형태로 만드세요.
			 */
			
			ArrayList params = new ArrayList(); // 전체를 담을 어레이리스트
			StringTokenizer token = new StringTokenizer(param, "&");
			
			while(token.hasMoreElements()) {
				ArrayList list = new ArrayList();
				String tmp = token.nextToken();
				StringTokenizer tk = new StringTokenizer(tmp,"=");
				while(tk.hasMoreElements()) {
					list.add(tk.nextToken());
				}
				params.add(list);
			}
			for(Object o : params) {
				System.out.println(o);
			}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
