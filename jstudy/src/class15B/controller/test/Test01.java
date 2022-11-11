package class15B.controller.test;

import class15B.dao.EmpDao;
import java.util.*;

import javax.swing.JOptionPane;
/*
 	db에서 데이터를 꺼내는 경우는 
 		1. 한 필드 한 행으로 조회되는 결과
 			ex) select count(*) from emp;
		2. 여러개의 필드가 한 행으로 조회되는 결과
			ex) select * frmo emp where enmae = 'SMITH';
		3.	하나의 필드가 여러행으로 조회되는 결과
			ex) select ename from emp;
		4. 여러개의 필드가 여러행으로 조회되는 결과
			ex) select * from emp;
			
	추가기능 ]
		한 페이지에 4명만 보이도록 기능 구현
 */
public class Test01 {
/*
 	이 클래스가 컨트롤러 역할을 함
 */
	private EmpDao eDao;
	private boolean bool = true;
	
	public EmpDao geteDao() {
		return eDao;
	}
	public void seteDao(EmpDao eDao) {
		this.eDao = eDao;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public Test01() {
		eDao = new EmpDao();
		EnameSearch eSrch = new EnameSearch(this);
		DnoSearch	dSrch = new DnoSearch(this);
		EditSal eSal = new EditSal(this);
//		eSrch.candy();
//		dSrch.candy();
//		eSal.candy();
		HashMap<String, Father> map = new HashMap<String, Father>();
		map.put("ename", eSrch);
		map.put("dno", dSrch);
		map.put("sal", eSal);
		map.put("elist", new EmpList(this));
		/*
		// map의 키값들만 추출
		Set<String> keys = map.keySet(); // map의 키값들만 모두 추출, Set으로 반환
		
		// 꺼내서 실행
		Iterator<String> itor = keys.iterator();
		while(itor.hasNext()) {
			String key = itor.next();
			
			Father f = map.get(key);
			f.candy();
		}
		*/
		while(bool) {
			String key = JOptionPane.showInputDialog("이름검색 : ename\n부서번호 : dno\n급여수정 : sal\n리스트조회 : elist\n종 료 : q");
			if(key.equals("q")) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				setBool(false);
//				break;
//				return;
			} else {
				map.get(key).candy();
			}
		}
		/*
		switch(key) {
		case"ename":
			map.get(key).candy();
			break;
		case"dno":
			map.get(key).candy();
			break;
		case"sal":
			map.get(key).candy();
			break;
		case"q":
			break;
		}
		*/
	}

	public static void main(String[] args) {
		new Test01();
	}

}
