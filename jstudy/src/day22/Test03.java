package day22;
import java.util.*;
public class Test03 {

	public Test03() {
		HashSet<String> names = new HashSet<String>();
		names.add("짱구");
		names.add("철수");
		names.add("맹구");
		names.add("유리");
		
		ArrayList list = new ArrayList(names);
		// names의 제너릭스가 전파되지 않는다.
		
		Iterator<String> itor = names.iterator(); 
		// 여기도 Object타입으로 데이터를 기억함.// <String>넣어줌
		// 제너릭스는 전파되지 않으므로 새로운 컬렉션이 만들어질 때 다시 선언해야함
		while(itor.hasNext()) {
			String name = itor.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
