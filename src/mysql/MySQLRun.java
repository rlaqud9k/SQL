package mysql;

import java.util.List;

public class MySQLRun {
	public static void main(String[] args) throws Exception {
		MySQLExam my = new MySQLExam();
		my.makeConn();
		
		int row = my.insertSQL("홍길동","제목입니다","내용~");
		if(row==1)
			System.out.println("성공");
		else
			System.out.println("실패");
		
		//List list = my.insertSQL();
		my.takeDown();
	}

}
