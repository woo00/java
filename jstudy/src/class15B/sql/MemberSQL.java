package class15B.sql;

public class MemberSQL {
	// 질의명령들 코드 정의
	public final int SEL_ID_LIST	=	1001;
	public final int SEL_ID_INFO	=	1002;
	
	// 수정질의명령
	public final int EDIT_MAIL_ID	=	2001;
	
	// 질의명령의 코드값을 입력받아서 해당 질의명령을 반환해주는 함수
	public String getSQL(int code) {
		//반환값 변수
		StringBuffer buff = new StringBuffer();
		/*
		 	StringBuffer 사용방법
		 		1. new시키고
		 		2. 변수.append(문자열);
		 		3. 변수.toStirng() 문자열로 변환 후 반환해준다.
		 */
		switch(code) {
		// 현재 활동중인 회원의 아이디를 조회하는 질의명령
		case SEL_ID_LIST:
			buff.append("SELECT ");
			buff.append("	id ");
			buff.append("FROM "); // ==> idFrom - X , id From ==> O
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isShow = 'Y' ");
			break;
		
		case SEL_ID_INFO:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail, tel, birth, gen, avt, joindate ");
			buff.append("FROM "); // ==> idFrom - X , id From ==> O
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			break;
// 아이디를 알려주고 메일주소를 알려주면 해당 아이디의 메일을 변경해주는 질의명령
		case EDIT_MAIL_ID :
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	mail =? ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			break;
		}
		return buff.toString();
	}
		
}
