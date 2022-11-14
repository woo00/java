package day24;
/*
 	점수를 입력받아서 학점을 출력해주는 프로그램을 작성하세요.
 */

import java.text.*;
import javax.swing.*;

public class Test06 {

	public Test06() {
		// limits 배열
		double[] limits = { 0, 60, 70, 80, 90 };
		/*
		 * limits배열 생성시 주의사항 반드시 오름차순으로 정렬되어야함. 의미 : 0 ~ 59 : ???? 60 ~ 69 : ???? ... 90
		 * ~ : ????
		 */
//		format 생성
		String[] formats = { "F", "D", "C", "B", "A" };
//		formats 생성시 주의사항 : 반드시 limits 개수와 일치시킨다.

//		형식만들고
		ChoiceFormat form = new ChoiceFormat(limits, formats);

//		점수입력
		String sno = JOptionPane.showInputDialog("점수입력 : ");
//		정수변환
		int scor = Integer.parseInt(sno);
//		학점계산
		String grade = form.format(scor);
//		출력
		System.out.println("점수 : " + scor + "학점 : " + grade);
	}

	public static void main(String[] args) {
		new Test06();
	}

}
