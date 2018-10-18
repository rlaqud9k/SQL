package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConn {

	public static void main(String[] args) {
		//데이터베이스 정보 저장
		String myDriver = "com.mysql.jdbc.Driver";//반대로 생성
		String myUrl = "jdbc:mysql://localhost:3306/jsl31_db";
						//   //호스트번호//데이터베이스 이름
		String myId = "root";//사용자 아이디
		String myPass = "1234";// 사용자 비번
		
		Connection MyConn;//데이터베이스 연동
		Statement stmt;//sql명령문을 사용하기위한 인터페이스
		//1. jdbc 드라이버 로딩 반드시 예외처리
		try {
			Class.forName(myDriver);
			System.out.println("드라이버 로딩 성공");
			
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
		//2: DB연결(Connection 객체 성공)
		try {
			MyConn = DriverManager.getConnection(myUrl, myId, myPass);
			int no=5;
			String query="delete from tbl_board where no="+no;//숫자일때만"'"+ㅇ+"'"//문자일때
			stmt = MyConn.createStatement();
			int row =stmt.executeUpdate(query);
			System.out.println("삭제된갯수"+row);
			//System.out.println("성공띠");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("디비 연결 실패링");
		}
	}

}
