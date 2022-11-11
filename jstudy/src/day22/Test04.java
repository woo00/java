package day22;
import java.util.*;
public class Test04 {

	public Test04() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "짱구");
		map.put("age", "7");
		map.put("mail", "jjang@githrd.com");
		
		String name = map.get("name");
		System.out.println("이름 : "+name);
	}

	public static void main(String[] args) {
		new Test04();
	}

}
