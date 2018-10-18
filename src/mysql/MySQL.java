package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class MySQL {
	//데이터베이스 정보 저장
	String myDriver = "com.mysql.jdbc.Driver";//반대로 생성
	String myUrl = "jdbc:mysql://localhost:3306/jsl31_db";
					//   //호스트번호//데이터베이스 이름
	String myId = "root";//사용자 아이디
	String myPass = "1234";// 사용자 비번
	
	Connection MyConn;
	
	public MySQL() {}
	public void makeConn() throws Exception{
		Class.forName(myDriver);
		MyConn=DriverManager.getConnection(myUrl, myId, myPass);
		System.out.println("드성");
	}
	public abstract void cleanup () throws Exception;
	public void takeDown() throws Exception{
		cleanup();
		MyConn.close();
	}
	}
