package mysql;

import java.util.List;

public class MySQLRun {
	public static void main(String[] args) throws Exception {
		MySQLExam my = new MySQLExam();
		my.makeConn();
		
		int row = my.insertSQL("ȫ�浿","�����Դϴ�","����~");
		if(row==1)
			System.out.println("����");
		else
			System.out.println("����");
		
		//List list = my.insertSQL();
		my.takeDown();
	}

}
