package day19;

import java.util.*;

public class Ex00 {
/*
 	1.
 		blackpink 멤버들의
 			이름을 기억할 ArrayList names를 만들고 데이터를 추가
 			아이디를 기억할 ArrayList ids를 만들고 데이터를 추가
 			메일을 기억할 AraayList mails 를 만들고 데이터를 추가
 			
	2.
		위 문항에서 완성한 ArrayList에서 데이터를 추출해서 
		각 멤버별 ArrayList를 완성하세요 
	
	3. 
		위 문항에서 완성한 ArrayList를 기억할 ArrayList blackpink를 완성하세요.
		
------------------------------------------------------------------------------------

	2 - 1.
		멤버 한명의 데이터를 기억할 VO BlackPink를 만들고
		1번 문항에서 완성한 ArrayList에서 데이터를 추출하고 채워넣어서
		
		네명의 데이터를 기억할 ArrayList에 기억하세요.
		
		결과출력
 */
	public Ex00() {
		ArrayList names = new ArrayList<>();
		names.add("제니");
		names.add("지수");
		names.add("로제");
		names.add("리사");
		
		for(Object o : names) {
			String name = (String) o;
			System.out.print(name + " | ");
		}
		System.out.println();
		
		ArrayList ids = new ArrayList<>();
		ids.add("jennie");
		ids.add("jisoo");
		ids.add("rose");
		ids.add("lisa");
		
		for(Object o : ids) {
			String id = (String) o;
			System.out.print(id + " | ");
		}
		System.out.println();
		
		ArrayList mails = new ArrayList<>();
		mails.add("jennie@githrd.com");
		mails.add("jisoo@githrd.com");
		mails.add("rose@githrd.com");
		mails.add("lisa@githrd.com");
		
		for(Object o : mails) {
			String mail = (String) o;
			System.out.print(mail + " | ");
		}
		System.out.println();
		
		
		
		
		ArrayList blackpink = new ArrayList<>();
		//임시 arraylist
		ArrayList tmp = new ArrayList<>();
		tmp.add(names);
		tmp.add(ids);
		tmp.add(mails);
		
		for(int i = 0 ; i < 4 ; i++) {
			ArrayList l = new ArrayList<>();
			
			l.add(names.get(i));
			l.add(ids.get(i));
			l.add(mails.get(i));
			
			blackpink.add(l);
		}
		//출력
		for(Object o : blackpink) {
			ArrayList l = (ArrayList) o;
			for(Object obj : l) {
				String s = (String) obj;
				System.out.print(s + " | ");
			}
			System.out.println();
		}
		ArrayList jennie = (ArrayList) blackpink.get(0);
		ArrayList jisoo = (ArrayList) blackpink.get(1);
		ArrayList rose = (ArrayList) blackpink.get(2);
		ArrayList lisa = (ArrayList) blackpink.get(3);
		
		for(Object o : jennie) {
			System.out.print((String)o + " | ");
		}
		
		ArrayList bp = new ArrayList<>();
		for(int i = 0 ; i < bp.size(); i++) {
			String name = (String) ((ArrayList)bp.get(i)).get(0); //이름
			String id = (String) ((ArrayList)bp.get(i)).get(1); //아이디
			String mail = (String) ((ArrayList)bp.get(i)).get(2); //메일
			
			BlackPink vo = new BlackPink();
			vo.setName(name);
			vo.setId(id);
			vo.setMail(mail); // vo에 데이터가 모두 채워짐
			
			// 채워진 vo를 arraylist에 기억시킨다.
			bp.add(vo);
		}
		
		//출력
		for(int i = 0 ; i < bp.size(); i++) {
			Object o = bp.get(i);
			BlackPink vo = (BlackPink) o;
			String name = vo.getName();
			String id = vo.getId();
			String mail = vo.getMail();
			
			System.out.printf(
								"%6s - %6s - %15s\n"
								,name,id,mail
								);
		}
	}

	public static void main(String[] args) {
		new Ex00();
	}

}
