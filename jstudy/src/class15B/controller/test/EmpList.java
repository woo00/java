package class15B.controller.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class15B.controller.EmpController;
import class15B.dao.EmpDao;
import class15B.vo.EmpVO;
import class15B.util.*;

public class EmpList implements Father {
/*
 	EmpDao, boolean bool을
 	이 곳에서도 사용해야함.
 	따라서 둘을 가지고있는 Test01객체를 전달받아서
 	이 클래스가 new되는 순간 접근 할 수 있어야한다.
 	==>
 	이 클래스가 객체가 되는 순간 Test01의 멤버에 접근할 수 있어야됨.
 */
	private Test01 main;
	private EmpDao eDao;
	private int nowPage = 1;
	public EmpList() {}
	public EmpList(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}
	
	@Override
	public void candy() {
		
		// 총 사원 수 조회
		int nowPage = 1;
		int total = 0;
		int pageRow = 4;
		int pageGroup = 5;
		PageUtil page = new PageUtil(nowPage, total, pageRow, pageGroup);
		ArrayList<EmpVO> list = null;
		
		while(true) {
//			총사원수조회
			total = eDao.getTotal();
			//페이지 정보 객체 세팅
			page.setPageUtil(nowPage, total, pageRow, pageGroup);
//			리스트가져오고
			list = eDao.getEmpList(page);
//			출력
			printEmpList(list, page);
			
//			이동 페이지번호 입력 받고
			String msg = JOptionPane.showInputDialog("페이지 번호 입력.\n상위메뉴 : UP\n프로그램 종료 : exit");
			// 메시지 내용에 따라 조건처리
			if(msg.toUpperCase().equals("UP")) {
				return;
			}else if(msg.toUpperCase().equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break;
			}else {
				nowPage = Integer.parseInt(msg);
			}
		}
	}
/*
	public void candy() {
		
		// 총 사원 수 조회
		int total = eDao.getTotal();
		int pageRow = 4;
		int pageGroup = 5;
		PageUtil page = new PageUtil(nowPage, total, pageRow, pageGroup);
		boolean isStart = true;
		
		// 기본페이지 출력
		ArrayList<EmpVO> list = eDao.getEmpList(page);
		//출력
//		printEmpList(list);
		
		while(true) {
			// 할 일
			
			// 총 사원 수 조회
			if(!isStart) {
				total = eDao.getTotal();
				page.setPageUtil(nowPage, total);
	//			PageUtill을 객체로 만드려면
	//			필수적으로 필요한 데이터가 noPage, totalCount, pageRow, pageGroup은 필수적으로 필요함. 
				list = eDao.getEmpList(page);
				//결과출력
				printEmpList(list, page);
			}else {
				isStart = false;
			}
			// 메시지 입력받음
			String msg = JOptionPane.showInputDialog("페이지 번호 입력.\n상위메뉴 : UP\n프로그램 종료 : exit");
			// 메시지 내용에 따라 조건처리
			if(msg.toUpperCase().equals("UP")) {
				return;
			}else if(msg.toUpperCase().equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break;
			}else {
				nowPage = Integer.parseInt(msg);
			}
		}
	}
*/
	// 사원정보 출력 전담 처리함수
	public void printEmpList(ArrayList<EmpVO> list, PageUtil page) {
		//리스트에 채워진 길이만큼 반복해서 내용출력
		System.out.println("======================================================");
		for(int i = 0 ; i < list.size() ; i++) {
			EmpVO eVO = list.get(i);
			
			//출력데이터 꺼내고
			int mno = eVO.getMno();
			int dno = eVO.getDno();
			String name = eVO.getName();
			String sdate = eVO.getSdate();
			
			//출력
			System.out.printf("%-5d | %-10s | %15s | %2d\n"
								,mno,name,sdate,dno
								);
		}
		System.out.println("------------------------------------------------------");
		printPage(page);
	}
	// 이동가능한 페이지 번호 출력
	public void printPage(PageUtil page){
		System.out.print("***이동 가능 페이지 : | ");
		for(int i = page.getStartPage(); i < page.getEndPage()+1 ; i++ ) {
			if(i == page.getNowPage()) {
				System.out.print("◈ | ");
				continue;
			}
			System.out.print(i + " | ");
		}
		System.out.println("***");
	}
}