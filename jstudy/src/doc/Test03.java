package doc;

import java.util.*;

public class Test03 {
/*
 	1~45 까지 랜덤한 정수 6개 생성
 */
	public static void main(String[] args) {
		/*
		 
		 	참고 ]
		 		while 명령은 반복의 횟수를 제어할 카운터변수가
		 		형식에 포함되어있지 않음.
		 		따라서 횟수를 제어하려면 먼저 카운터변수를 만들어놓고 사용.
		 */
		//카운터변수
		int count = 0;
		while(count<6) {//6번 반복
			//랜덤하게 숫자생성
			int no = (int)(Math.random()* 45 + 1 );
			//출력
			System.out.println(no);
			//카운터변수 증가
			count++;
		}
		/*
		 	Set의 특징
		 		1. 입력순서를 보장하지 않음
		 		2. 중복데이터를 허락하지 않음
		 */
		HashSet lotto = new HashSet();
		while(lotto.size() < 6) {
			int no = (int)(Math.random()*45+1);
			lotto.add(no);
		}
		for(Object o : lotto) {
			System.out.print(o + ", ");
		}
	}

}
