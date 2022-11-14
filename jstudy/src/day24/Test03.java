package day24;
import java.util.regex.*;
public class Test03 {
/*
 	특정 문자열을 입력하고
 	그 문자열 중 원하는 규칙에 맞는 부분만 출력
 */
	public Test03() {
		String tel = "전화번호 : 010-3206-6304";
//		이 중 전화번호 만 꺼냄
//		1. 정규식 패턴 생성
		Pattern form = Pattern.compile("0[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}");
//		2. 검사 결과객체 생성(Matcher)
		Matcher mat = form.matcher(tel);
//		3. find()를 이용해서 규칙에 맞는 부분이 있는지 확인 
//		String result0;
		String result1 = null;
		String result = "";
		if (mat.find()) {
//			4. 맞는 부분이 있으면 꺼내기
			result = mat.group();
		}
		System.out.println("result : " + result);
//		System.out.println("result0 : " + result0); // 초기화도 안된 상태이기 때문에 에러발생
		System.out.println("result1 : " + result1);
	}

	public static void main(String[] args) {
		new Test03();
	}

}
