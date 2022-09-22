package oday02;

public class Ex05 {

	public static void main(String[] args) {
/*
 	문제 3 ]
 		0 ~ 255 사이의 랜덤한 아스키코드를 만들어서 
 		이 코드값에 해당하는 문자가 알파벳인지 아닌지 판별해주는 프로그램을 작성하자
 */
		int no = (int)(Math.random()*255+1);
		String result ="알파벳이 아닙니다.";
		if(no>='A'&&no<='Z') {
			//대문자인경우
			result ="알파벳입니다.";
		}else if(no>='a'&&no<='z') {
			//소문자인경우
			result ="알파벳입니다.";
		}else{
			 //알파벳이 아닌경우
		}
		System.out.printf("랜덤하게 만든 문자 [%c] 는 %s",(char) no, result);
		}
//		int result = result < no && result > no  ? a : b ;
		
	}

