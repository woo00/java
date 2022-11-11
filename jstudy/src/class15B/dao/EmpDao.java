package class15B.dao;

import java.util.*;
import java.io.Closeable;
import java.sql.*;
import java.sql.Date;

import db.*;
import class15B.sql.*;
import class15B.util.PageUtil;
import class15B.vo.*;

/**
 * 이 클래스는 사원정보 데이터베이스 작업 전담 처리 클래스
 * @author 정우영
 * @since 2022/11/07
 */

public class EmpDao {
/*
	이 클래스가 new되는 경우는
	emp 테이블에 접근해서 데이터베이스 작업이 필요한 경우.
	이 클래스가 new되는 순간 오라클을 사용할 준비가 끝나있어야함.
 */
	private SmartJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private EmpSQL eSQL;
	
	public EmpDao() {
		db = new SmartJDBC();
		eSQL = new EmpSQL();
	}
	
	//사원이름리스트 조회전담 처리함수
	public ArrayList getNameList() {
		//작업순서
		//0. 반환값 변수 생성
		ArrayList list = new ArrayList();
		//1.커넥션 꺼내오기
		con = db.getCon("scott", "tiger");
		//2. 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_NAME_LIST);
		//3. 명령전달 도구 준비하기
		stmt = db.getStmt(con);
		
		// 필요한 질의명령이 채워야할 데이터가 없는 완성된 질의명령이므로
		// 질의명령을 완성작업은 필요없다.
		try {
			//4. 질의명령 보내고 결과받고
			rs = stmt.executeQuery(sql); // 질의명령 실어서 보내는 명령전달 도구
			//5. 조회결과에서 데이터 꺼내기
			// 만들어진 inline테이블이 여러행이므로 반복처리.
			while(rs.next()) {
				/*
				 	re.next()
				 	==> ResultSet이 기억하고있는 인라인테이블의 가상레코드포인터를 한 행 밑으로 내려주는 명령
				 		반환값은 꺼낸 데이터가 있으면 true, 없으면 false
				 		==> EOF로 이동하는 순간 false를 반환
				 */
				//조건식에서 rs.next() 레코드포인터를 데이터를 꺼내올 행으로 이동시켰으니 
				//데이터를 꺼내서 처리해주면 됨
				
				//지금의 경우 사원들의 이름들만 조회를 하고있으니 한 가지 타입의 한 개의 데이터가 여러 행 조회됨.
				// 따라서 문자열을 꺼낸 후 리스트에 채워주면 됨.
				String name = rs.getString("ename");
				
				//6. 꺼낸데이터 ArrayList에 채우고
				list.add(name);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		//7. ArrayList 반환해주고
		return list;
	}
	//사원이름을 전달받아서 사원정보 조회전담 처리함수
	public EmpVO getNameInfo(String name) {
		// 0. 반환값 변수 생성
		EmpVO eVO = new EmpVO();
		// 1.커넥션 얻어오기
		con = db.getCon("scott", "tiger");
		// 2. 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_NAME_INFO);
		// 3. 명령전달도구 꺼내오기
		pstmt = db.getPstmt(con, sql);
		try {
			// 4. 질의명령 완성
			pstmt.setString(1, name);	
			// 5. 질의명령 보내고 결과받기
			rs = pstmt.executeQuery();
			// 6. 결과 꺼내서 vo에 담고
			rs.next();
			int mno = rs.getInt("mno");
			String ename = rs.getString("name");
			String job = rs.getString("job");
			String sname = rs.getString("sname");
			int sal = rs.getInt("sal");
			int grade =rs.getInt("grade");
			int comm = rs.getInt("comm");
			String dname = rs.getString("dname");
			Date hdate = rs.getDate("hdate");
			
			eVO.setMno(mno);
			eVO.setName(ename);
			eVO.setJob(job);
			eVO.setSname(sname);
			eVO.setSal(sal);
			eVO.setGrade(grade);
			eVO.setComm(comm);
			eVO.setDname(dname);
			eVO.setHdate(hdate);
			eVO.setSdate();
			
			//VO에 받아온 데이터를 채우는 작업 완료
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		// 7. vo 반환
		return eVO;
	}
	
	//부서번호 조회 전담 처리함수
	public ArrayList<Integer> getDnoList(){
		//반환값 변수만들기
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		2. 커넥션 얻어오고
		con = db.getCon("scott", "tiger");
//		3. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_DNO_LIST);
//		4. 명령저달도구 꺼내고
		stmt = db.getStmt(con);
//		5. 질의명령 완성	
//		==> 이기능에서 필요한 질의명령은 완성된 질의명령이므로 이 작업이 필요없음
//		6. 질의명령 보내고 결과받고 
		try {
			rs = stmt.executeQuery(sql);
	//		7. 꺼내서 리스트에 담고 
			while(rs.next()) {
				//부서번호 꺼내고
				int dno = rs.getInt("dno");
				//리스트에 치우기
				list.add(dno);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
//		8. 리스트 반환
		return list;
	}
	
	//부서번호를 전달받아서 부서원 정보 조회전담 처리함수
	public ArrayList<EmpVO> getDnoMemberList(int dno){
//		1.반환값 변수 생성
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
//		2. 커넥션 꺼내기
		con = db.getCon();
//		3. 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_DNO_MEMBER_LIST);
//		4. 명령전달도구 꺼내기
		pstmt = db.getPstmt(con, sql);
		try {
	//		5. 질의명령 완성
			pstmt.setInt(1, dno); // 첫번째 물음표에 dno를 채운다.
	//		6. 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			while(rs.next()) {
		//		7. 반복해서 꺼내서 VO에 담고
//				VO생성
				EmpVO eVO = new EmpVO();
				//데이터 꺼내기
				int mno = rs.getInt("mno");
				String name = rs.getString("name");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				
				// VO에 데이터 채우기
				eVO.setMno(mno);
				eVO.setName(name);
				eVO.setJob(job);
				eVO.setSal(sal);
		//		8. list에 VO담고
				list.add(eVO);
			}
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
//		9. list 반환
		return list;
	}
	// 사원 정보 추가 전담 처리함수
	public int addEmp(EmpVO eVO) {
//		0. 반환값 변수
		int cnt = 0;
//		1. 커넥션 꺼내오고
		con = db.getCon();
//		2. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.ADD_EMP);
//		3. 명령전달도구 가져오고
		pstmt = db.getPstmt(con, sql);
		try {
	//		4. 질의명령 완성
			pstmt.setString(1, eVO.getName());
			pstmt.setString(2, eVO.getJob());
			pstmt.setString(3, eVO.getSname());
			pstmt.setInt(4, eVO.getSal());
			pstmt.setInt(5, eVO.getComm());
			pstmt.setString(6, eVO.getSname());
			pstmt.setString(7, eVO.getMail());
	//		5. 질의명령 보내고 결과받고
			/*
				삽입 수정 삭제 명령의 경우
				인라인테이블이 만들어지지 않기때문에
				처리결과를 확인하려면 
					executeUpdate()
				함수를 사용하는 것이 편리
				이 함수의 반환값은 int, 의미는 처리결과 변경된 행의 수를 반환.
				따라서 삽입 질의명령의 결과는 
					성공했을경우 1
					실패했을경우 0
				으로 반환.
			 */
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
//		6. 반환값 내보내기
		return cnt;
	}
	
	//사원이름과 급여를 입력받아 수정해주는 작업 전담 처리함수
	public int editNameSal(String name, int sal) {
		//반환값 변수만들기
		int cnt = 0;
		//1.커넥션 가져오고
		con = db.getCon();
		//2.질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.EDIT_ENO_SAL);
		//3. 명령전달 도구 가져오고
		pstmt = db.getPstmt(con, sql);
		try {
			//4. 질의명령 완성
			pstmt.setInt(1, sal);
			pstmt.setString(2, name);
			//5. 질의명령 보내고 결과받고
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		//6. 결과 반환
		return cnt;
	}
	
	//총 사원수 조회 전담 처리함수 
	public int getTotal() {
		// 할 일 
//		1. 반환값 변수
		int cnt = 0;
//		2.커넥션 꺼내기
		con = db.getCon();
//		3. 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_TOTAL);
//		4. 명령전달도구 준비
		stmt = db.getStmt(con);
		try {
	//		5. 질의명령 전달 & 결과 받기
			rs = stmt.executeQuery(sql);
	//		6. 데이터 꺼내고
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
//		7. 반환
		return cnt;
	}
	
	//사원리스트 조회 전담 처리함수
	public ArrayList<EmpVO> getEmpList(PageUtil page){
//		1. 반환값 변수
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
//		2. 커넥션 꺼내기
		con = db.getCon();
//		3. 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.EMP_LIST);
//		4. 명령전달도구 준비
		pstmt = db.getPstmt(con, sql);
		try {
	//		5. 질의명령 완성
			pstmt.setInt(1, page.getStartRno());
			pstmt.setInt(2, page.getEndRno());
	//		6. 질의명령 보내기 & 결과받기
			rs = pstmt.executeQuery();
				while(rs.next()) {
			//		7. 꺼내서 VO에 담기
	//				반복해서 VO만들고 채워줘야함	
					EmpVO eVO = new EmpVO();
//					데이터꺼내기
//					int rno = rs.getInt("rno");
					int mno = rs.getInt("mno");
					int dno = rs.getInt("dno");
					String name = rs.getString("name");
					Date hdate = rs.getDate("hdate");
//					VO에 채우고
					eVO.setMno(mno);
					eVO.setDno(dno);
					eVO.setName(name);
					eVO.setHdate(hdate);
					eVO.setSdate();
					
			//		8. list에 VO담고
					list.add(eVO);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				db.close(rs);
				db.close(pstmt);
				db.close(con);
			}
//		9. list반환
		return list;
	}
}