package day04;

public class Ex03 {
	/*
	54232원을 지불해야 한다.
	우리나라 화폐단위로 각각 몇개씩 필요한지 계산해서 출력하세요.
		화폐단위 ]
			50000, 10000, 5000, 1000, 500, 100, 50, 10, 1
 */
	public static void main(String[] args) {
		int pay = 54232;
		int won[] = {50000,10000,5000,1000,500,100,50,10,1};
		
		int money[] = new int[won.length];
		int tmp = pay;
		
		for(int i = 0 ; i < won.length ; i++) {
			money[i] = tmp / won[i];
			tmp %= won[i];
		}
		
		//String str = "";
		System.out.println(pay +"원에 대해 지불해야할 화폐의 갯수는");
		for (int i = 0; i < money.length; i++) {
			/*
			if (i < 4) {
				str = "장";
			}else {
				str = "개";
			}
			*/
			//System.out.println(won[i] + "원" + money[i] + str);
			System.out.println(won[i] + "원" + money[i] + ((i<4)?"장":"개"));
		}
		/*
		System.out.println(pay +"원에 대해 지불해야할 화폐의 갯수는");
		System.out.println(won[0] + "원권" + money[0] + "장");
		System.out.println(won[1] + "원권" + money[1] + "장");
		System.out.println(won[2] + "원권" + money[2] + "장");
		System.out.println(won[3] + "원권" + money[3] + "장");
		System.out.println(won[4] + "원권" + money[4] + "개");
		System.out.println(won[5] + "원권" + money[5] + "개");
		System.out.println(won[6] + "원권" + money[6] + "개");
		System.out.println(won[7] + "원권" + money[7] + "개");
		System.out.println(won[8] + "원권" + money[8] + "개");
		
		*/
		
		
		/*for-each문*/
		
		/*while문*/
		
		/*do-while문*/
		
	}

}
