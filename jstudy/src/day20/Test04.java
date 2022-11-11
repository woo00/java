package day20;

import java.util.Iterator;
import java.util.TreeSet;

public class Test04 {
/*
	랜덤하게 학생 성적을 10개 생성 기억시키고
	60점이상과 60점 미만을 별도로 기억.
 */
	public Test04() {
		TreeSet set = new TreeSet();
		while(set.size() < 10) {
			set.add((int)(Math.random()*101));
		}
		
		Iterator<Integer> itor = set.iterator();
		
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
		TreeSet lowSet = (TreeSet)set.headSet(60);
		
		itor = lowSet.iterator();
		System.out.println("##########60점 미만 ###########");
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
		TreeSet upSet = (TreeSet)set.tailSet(60);
		itor = upSet.iterator();
		System.out.println("##########60점 이상 ###########");
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
