package class15B.controler;

import class15B.dao.*;
import class15B.vo.*;

import java.util.*;

import javax.swing.JOptionPane;

public class EmpController {
/*
	사원들의 데이터베이스 작업을 컨트롤할 컨트롤러 클래스
 */
	private EmpDao eDao;
	public EmpController() {
		eDao = new EmpDao();
		
		//회원이름 리스트 조회
		printNameList();
		System.out.println();
		
		//조회할 사원이름 입력
		String name = JOptionPane.showInputDialog("조회할 사원이름").toUpperCase();
		//이름으로 사원정보 조회
		printNameInfo(name);
		System.out.println("========================================");
	}
	//사원이름을 입력받아서 사원정보를 출력해주는 함수
	public void printNameInfo(String name) {
		EmpVO eVO = eDao.getNameInfo(name);
		
		String ename = eVO.getName();
		int mno = eVO.getMno();
		String job = eVO.getJob();
		String sname = eVO.getSname();
		int sal = eVO.getSal();
		int grade = eVO.getGrade();
		int comm =eVO.getComm();
		String dname = eVO.getDname();
		String sdate = eVO.getSdate();
		
		System.out.println("사원번호 : " + mno);
		System.out.println("사원이름 : " + ename);
		System.out.println("직    급 : " + job);
		System.out.println("상사이름 : " + sname);
		System.out.println("급    여 : " + sal);
		System.out.println("급여등급 : " + grade);
		System.out.println("커 미 션 : " + comm);
		System.out.println("부서이름 : " + dname);
		System.out.println("입 사 일 : " + sdate);
	}
	// 회원이름 리스트 조회해서 출력해주는 함수
	public void printNameList() {
		ArrayList nameList = eDao.getNameList();
		
		System.out.print("| ");
		for(int i = 0 ; i < nameList.size(); i++) {
			System.out.print((String)nameList.get(i) + " | ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new EmpController();
	}

}
