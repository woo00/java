package day18;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
public class Test03 {

	public Test03() {
		ArrayList list = new ArrayList();
		//리스트에 데이터 추가
		list.add("jennie");
		list.add("lisa");
		list.add("rose");
		list.add("jisoo");
		
		System.out.println(list);
		
		// 데이터 수정
		list.set(2,"Rose");
		list.add("rose");
		list.add("rose");
		System.out.println(list);
		
		
		Vector vec = new Vector<>(list);
		System.out.println(vec);
		System.out.println();
	
		Enumeration en = vec.elements();
		
		System.out.println("-----------------------------------");
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + ", ");
		}
		System.out.println();
		
		HashSet set = new HashSet(list);
		System.out.println(set);
		System.out.println("=======================================");
		
		Iterator itor = set.iterator();
		while (itor.hasNext()) {
			System.out.println(itor.next());
			
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
