package day21;

import java.util.Comparator;
import java.util.TreeSet;

public class Test02 {
	Comparator localComp;
	public Test02() {
		TreeSet set1 = new TreeSet(new Comparator() {
			//무명 내부클래스
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}

	public static void main(String[] args) {
		new Test02();

	}
	class SetSort1 implements Comparator{
		// 전역 내부클래스
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	public TreeSet getTree() {
		TreeSet set ;
		
		class LInnerCls implements Comparator{
			// 지역 내부클래스 
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		/*
		localComp = new LInnerCls();
		set = new TreeSet(localComp);
		*/
		set = new TreeSet(new LInnerCls());
		return set;
	}
}
