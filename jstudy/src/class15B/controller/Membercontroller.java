package class15B.controller;

import class15B.dao.MemberDao;

public class Membercontroller {
	private MemberDao mDao;
	
	public Membercontroller() {
		mDao = new MemberDao();
		
		printIdList();
		printInfo();
	}

	//회원 아이디 리스트 질의명령 출력
	public void printIdList() {
		// 질의명령 꺼내오기
		String sql = mDao.getIdList();
		
		// 출력
		System.out.println("회원 아이디 리스트 조회 질의명령 : \n" + sql);
	}
	public void printInfo() {
		String sql1 = mDao.getInfo();
		System.out.println("회원 정보 조회 질의명령 : \n" + sql1);
	}
	
	public static void main(String[] args) {
		new Membercontroller();
	}

}
