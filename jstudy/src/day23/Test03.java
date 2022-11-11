package day23;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Test03 {

	HashMap<Integer, String> map;
	public Test03() {
		
		//맵 사용준비
		map = new HashMap<Integer, String>();
		map.put(10, "회계부");
		map.put(20, "개발부");
		map.put(30, "영업부");
		map.put(40, "관리부");
		
		String sno = JOptionPane.showInputDialog("조회할 부서번호 입력");
		int dno = 0;
		try{
			dno = Integer.parseInt(sno);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			printDname(dno);
		}catch(NotFoundDepartmentException e) {
			e.printStackTrace();
		}
	}
	
	public void printDname(int dno) throws NotFoundDepartmentException{
		if (dno == 0 || dno > 40) {
			throw new NotFoundDepartmentException();
		}
		
		String dname = map.get(dno);
		JOptionPane.showMessageDialog(null, dno + "번 부서 이름 : " + dname);
//		System.out.println(dno + "번 부서 이름 : " + dname);
	}
	public static void main(String[] args) {
		new Test03();
	}
	//없는 부서번호 입력 예외클래스
	class NotFoundDepartmentException extends Exception{
		@Override
		public String toString() {
			return "존재하지 않는 부서번호입니다.";
		}
	}
}
