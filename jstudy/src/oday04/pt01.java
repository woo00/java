package oday04;

public class pt01 {

	public static void main(String[] args) {
		String[] student = {"제니", "리사", "로제", "지수"};
		int[] java = {100, 80, 90, 95};
		int[] db = {90, 95, 80, 80};
		int[] web = {80, 80, 95, 100};
		
		// 문제 이차원배열 score 에 자바, 디비, 웹 점수를 학생별로 기억시키세요.
		// int[][] score = new int[4][3];
		int[][] score = new int[4][3];
		
		for(int i = 0 ; i < 4 ; i++) {
			score[i][0] = java[i];
			score[i][1] = db[i];
			score[i][2] = web[i];
		}
		
		for(int i = 0 ; i < 4 ; i ++) {
			for(int j = 0 ; i < score[i].length; j++) {
				System.out.println();
			}
		}
		
	}

}
