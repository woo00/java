package day13;

public class Ex04 {
/*
 	nums 배열에 정수 (10~99) 10개를 기억시키고 
 	합을 구하고
 	평균을 구해서 
 	출력
 	
 		배열세팅
 		합계산
 		평균계산
 		출력
	은 각각의 함수로 구현
	배열 세팅 함수는 반환값을 가지는 함수로 구현
 */
//	int nums[] = null;
//	int hap = 0;
//	double avg = 0.0;
	public Ex04() {
		int[] nums = null;
		int hap = 0;
		double avg = 0;
		nums = makeArr(nums);
		hap = arrHap(nums);
		avg = arrAvg(hap);
		print(nums, hap, avg);
		//int nums[] = new int[10];
		/*
		int hap = 0;
		System.out.print(" | ");
		for(int i = 0 ; i < 10; i++) {
			int no = (int)(Math.random()*90+10);
			nums[i]=no;
			System.out.print(nums[i]+ " | ");
			hap += nums[i];
		}
		*/
	}
	
	public int[] makeArr(int[] nums) {
		nums = new int[10];
		for(int i = 0 ; i < 10; i++) {
			int no = (int)(Math.random()*90+10);
			nums[i]=no;
		}
		return nums;
	}
	
	public int arrHap(int[] nums) {
		int hap = 0;
		for (int i = 0; i < nums.length; i++) {
			hap += nums[i];
		}
		return hap;
	}
	public double arrAvg(int hap) {
		double avg = hap/10.;
		return avg;
	}
	public void print(int[] nums, int hap, double avg) {
		for(int i = 0 ; i < nums.length; i++) {
			System.out.print(nums[i] + " | ");
		}
		System.out.println();
		System.out.println("hap : " + hap);
		System.out.println("avg : " + avg);
		
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
