package day08;

public class Test02 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		// 꺼내어 10을 곱하여 출력
		for(int no : nums) {
			// nums배열에 담긴 데이터 하나 꺼내서 no에 기억시키고 블럭을 실행한다. 순차적으로 데이터 갯수만큼 반복
			System.out.println(no*10);
			System.out.println(no*10);
		}
		
		int[][] num2 = {
				{1,2,3,4,5},
				{5,6,7,8,9,10},
				{11,12,13,14,15},
		};
		
		for(int[] n :num2) {
			for(int n2 : n) {
				System.out.print(n2 + ", ");
			}
			System.out.println();
		}
	}

}
