package day06;

public class Test07 {

	public static void main(String[] args) {
		Myinfo woo0 = new Myinfo();
		woo0.name ="정우영";
		
		
		System.out.println("name : " + woo0.name);
		
		Myinfo[] member = new Myinfo[4];
		for(int i = 0 ; i < 4 ; i++) {
			member[i] = new Myinfo();
		}
		
		member[0].name = "김경욱";
		member[1].name = "전진형";
		member[2].name = "정민혁";
		member[3].name = "정우영";
		
		for(Myinfo m : member) {
			System.out.println(m.name);
		}
		
	}

}
