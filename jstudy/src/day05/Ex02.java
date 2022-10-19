package day05;

import java.util.Scanner;

public class Ex02 {
/*
    문제 2 ]
       알바펫 문자 하나를 입력 받아서
       그 문자가 대문자인지 소문자인지 판별해서 출력하고
       
       소문자면 대문자로 변환하고
       대문자면 소문자로 변환해서
       출력하세요. (아스키코드로 대소비교)
       
       참고 ]
          문자열에서 문자 추출하는 방법
          
             문자열.charAt(위치값)
             
          이 문제의 경우는 하나의 문자만 입력할 예정이므로
          
             문자열. charAt(0)
             
          로 꺼내서 사용하면 된다.
 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		String asd = sc.next();
		sc.close();
		
		char abc = asd.charAt(0);
		
		/*
		String str = "";
		str = (abc>='a'&&abc<='z')? "소문자" : str;
		str = (abc>='A'&&abc<='Z')? "대문자" : str;
		
		System.out.printf("입력된 문자는 %c 이며 이 문자는 %s 입니다. ",abc, str);
		
		char result = abc;
		
		result = (abc>='a' && abc<='z') ? (char)(abc-('a'-'A')) : (abc>='A' && abc<='Z') ? (char)(abc+('a'-'A')) : abc;
		
		System.out.printf("입력된 문자는 %c 이며 변환된 문자는 %c 입니다.", abc, result);
		*/
		char result = (abc<'a') ? 
					// 대문자를 입력한 경우
					// 대문자를 소문자를 변환해주세용
					(char)(abc + ('a'-'A'))
				:
					//소문자를 입력한경우
					(char)(abc - ('a' - 'A'))
		;
		System.out.println("입력받은 알파벳은 [ " + abc + " ] 이고 변환하면 [ " + result + " ] 입니다.");
	}

}
