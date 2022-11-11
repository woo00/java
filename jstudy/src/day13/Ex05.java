package day13;

public class Ex05 {
/*
	10명의 학생의 국어, 영어, 수학 점수를 
		랜덤하게 셋팅해서
		총점과, 평균, 석차를 계산해서
		출력해주는 프로그램을 작성하세요.
	각 기능 모두 별도의 함수로 작성하고
	배열은 [10][6]로 만들어서 처리하세요.
		
		국어, 영어, 수학, 총점, 평균, 석차
 */
	int kor, eng, math, total, rank = 0;
	double avg = 0.;
	int[][] arr = new int[10][6];
	public Ex05() {
		score();
		total();
		avg();
		print();
	}
	
	public void score () {
		for(int i = 0 ; i< arr.length ; i++) {
			kor = (int)(Math.random()*40+61);
			eng = (int)(Math.random()*40+61);
			math = (int)(Math.random()*40+61);
			arr[i][0] = kor; 
			arr[i][1] = eng; 
			arr[i][2] = math; 
		}
	}
	
	public void total() {
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i][3] = arr[i][0]+arr[i][1]+arr[i][2];
		}
	}
	
	public void avg() {
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i][4] = arr[i][3]/3;
		}
	}
	
	public void print() {
		for(int i = 0 ; i < arr.length ; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}

}