package class15B.dao;

import java.util.*;
import java.sql.*;
import java.sql.Date;

import db.*;
import class15B.sql.*;
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
}
