package day10;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
//		int[] num = new int[] {1,2,3,4,5};
		
		int[] tmp = num;
		
		tmp[0] = 3;
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(tmp));
	}

}
