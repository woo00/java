package day24;
import java.util.regex.*;

import javax.swing.JOptionPane;
/*
 	전화번호를 입력받아서
 	형식이 맞는지 검사하세요.
 */
public class Test02 {

	public Test02() {
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요");
//		1.패턴생성. 
//		(생성자가 감춰진 경우이므로 소속함수 중 반환값이 자기 자신이고 
//				속성이 static인 함수룰 호출해서 사용)
		Pattern form = Pattern.compile("0[0-9]{1,2}-[0-9]{3,4}-[0-9]{4}");
		
//		2.정규식 문법 검사.
//		Matcher matchr() 함수를 사용해서 검사함.
		Matcher mat = form.matcher(tel);
		/*
		 	Matcher 클래스안에 검사한 결과가 기억되어있음.
		 	검사결과 중 맞는지 틀린지 알려주는 함수는 matches()
		 */
		boolean bool = mat.matches();
		
//		결과변수
		String result = "맞는 전화번호 형식입니다.";
		if(!bool) {
			result = "맞지않는 전화번호 형식입니다.";
		}
		JOptionPane.showMessageDialog(null,"입력받은 번호 [ " + tel + " ] 는 " +  result);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
