package day24.stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test11 {
/*
 	Member 클래스에 친구의 정보를 기록하고 파일로 저장
 	ObjectOutStream 을 이용해서 저장
 */
	public Test11() {
//		데이터만들고
		Member woo = new Member();
		woo.setName("우영");
		woo.setMail("woo00@githrd.com");
		woo.setAge(32);
		
//		스트림 준비
		FileOutputStream fout = null;
//		보조스트림
		ObjectOutputStream oout = null;
		
		try {
			fout = new FileOutputStream("src/day24/stream/woo.young");
			oout = new ObjectOutputStream(fout);
			
//			데이터 보내고
			oout.writeObject(woo);
//			이처럼 클래스전체를 입출력하는 것을 직렬화라고 한다.
			System.out.println("### 저장완료 ###");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
				fout.close();
			} catch (Exception e2) {}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
