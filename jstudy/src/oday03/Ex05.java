package oday03;
/*
	문제 5 ]
		두 사람이 등산을 하는데
		한 사람은 이제 등산을 시작하려고 하고
		다른 사람은 정상에서 하산을 시작하려고 합니다.
		올라가는 속도는 0.54 m/s
		내려가는 속도는 1.07 m/s
		
		두사람이 만나는 시점은 몇 분 몇 초 뒤인지 출력하세요
		
		산의 높이는 7564m 이다.
 */
public class Ex05 {

	public static void main(String[] args) {
		System.out.println("같이 가 그냥.....");
		
//		// 올사의 등산시간 구하기
//		double up = 7564 / 0.54; //14007.407407407407초
//		
//		// 내사의 하산시간 구하기
//		double down = 7564 / 1.07; //7069.158878504672초
//		
//		System.out.print(up + ", " + down);
		
		int sec = 0;
		
		for(;;sec++) {
			if(0.54*sec >= (7564 - 1.07 * sec)) {
				break;
			}
		}
		int hour = sec / 60 / 60;
		sec = sec % (60 * 60);
		int min = sec / 60;
		sec = sec % 60;
		
		System.out.println("두사람이 만나는 시간은 " + hour + "시간" + min + "분" + sec + "초 후에 만난다.");
	}

}

