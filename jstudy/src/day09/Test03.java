package day09;

public class Test03 {
	public Test03(){
		int [] no3 = new int[10];
//		==>no에 채워진 데이터는 자동 초기화가 돼서 0으로 채워짐.
		for(int no : no3) {
			System.out.println(no);
		}
		
		Nemo[] squ = new Nemo[5];
		for(Nemo n : squ) {
			System.out.println(n.garo + ",");
		}
	}
	public static void main(String[] args) {
		
	}

}
