package day24;
import java.text.*;
import javax.swing.*;
public class Test07 {
/*
 	ChoiceFormat을 만들 때 
 		limits와 formats를 하나로 만들 수 있다.
 		
 		형식 ]
 			60#D	: 60보다<= 의 의미 
 			70<C	: 70보다<의 의미
 			
 			이것을 |를 이용하여 연결해서 사용
 			
 */
	public Test07() {
		String pattern = "0#F|60#D|70#C|80#B|90<A";
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		String sno = JOptionPane.showInputDialog("점수 입력 : ");
		int scor = Integer.parseInt(sno);
		
//		학점계산
		String grade = form.format(scor);
		System.out.println( scor + "점은 "+ grade + "입니다.");
	}

	public static void main(String[] args) {
		new Test07();
	}

}
