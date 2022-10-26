package day07;

public class Test02 {

	public static void main(String[] args) {
		String name1 = "jennie"; // 리터럴풀의 데이터자체의 주소를 기억
		String name2 = new String("jennie");// heap에 만들어진 인스턴스의 주소를 기억
		
		// 출력
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println(name1==name2);
		
		// 문자열 동등비교는 반드시 equals()를 사용해서 비교..
		// ==> 비교할 문자열 끼리의 주소를 모르기때문
		System.out.println(name1.equals(name2));
	}

}
