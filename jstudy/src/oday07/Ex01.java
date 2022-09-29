package oday07;

public class Ex01 {
/*
 	79456원을 샌드위치값으로 지불하려고 합니다.
 	이 금액은 대한민국 화폐 각각 몇 개로 지불해야되는지 계산하여 출력하자.
 */
	public static void main(String[] args) {
		
		int won = 79456;
		int[] money = {
					50000, 10000, 5000, 1000, 500, 100, 50, 10, 1
					//0      1     2      3    4
		};
		
		int[] pay = new int[9];
		int tmp = won;
		/*
		for(int i = 0 ; i < money.length ; i++) {
			pay[i] = tmp / money[i];
			tmp %= money[i];
		}
		System.out.println(won + "원에 필요한 화폐는");
		System.out.println("오만원권 "+ pay[0] +"장,");
		System.out.println("만원권 "+ pay[1] + "장,");
		System.out.println("오천원권 "+ pay[2] +"장,");
		System.out.println("천원권 "+ pay[3] + "장,");
		System.out.println("오백원권 "+ pay[4] + "개,");
		System.out.println("백원권 "+ pay[5] + "개,");
		System.out.println("오십원권 " + pay[6] + "개,");
		System.out.println("십원권 " + pay[7] + "개,");
		System.out.println("일원권 " + pay[8] + "개가 필요합니다.");
		*/
		//for each문 ==>향상된포문
		int num = 0;
		
		for (int no : money) {
			pay[num] = tmp / no;
			tmp %= no;
			num++;
		}
		System.out.println(won + "원에 필요한 화폐는");
		System.out.println("오만원권 "+ pay[0] +"장,");
		System.out.println("만원권 "+ pay[1] + "장,");
		System.out.println("오천원권 "+ pay[2] +"장,");
		System.out.println("천원권 "+ pay[3] + "장,");
		System.out.println("오백원권 "+ pay[4] + "개,");
		System.out.println("백원권 "+ pay[5] + "개,");
		System.out.println("오십원권 " + pay[6] + "개,");
		System.out.println("십원권 " + pay[7] + "개,");
		System.out.println("일원권 " + pay[8] + "개가 필요합니다.");
		//while 문
		
		//do while문
	}

}
