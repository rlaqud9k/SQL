package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConn {

	public static void main(String[] args) {
		//�����ͺ��̽� ���� ����
		String myDriver = "com.mysql.jdbc.Driver";//�ݴ�� ����
		String myUrl = "jdbc:mysql://localhost:3306/jsl31_db";
						//   //ȣ��Ʈ��ȣ//�����ͺ��̽� �̸�
		String myId = "root";//����� ���̵�
		String myPass = "1234";// ����� ���
		
		Connection MyConn;//�����ͺ��̽� ����
		Statement stmt;//sql��ɹ��� ����ϱ����� �������̽�
		//1. jdbc ����̹� �ε� �ݵ�� ����ó��
		try {
			Class.forName(myDriver);
			System.out.println("����̹� �ε� ����");
			
		}catch(Exception e) {
			System.out.println("����̹� �ε� ����");
		}
		//2: DB����(Connection ��ü ����)
		try {
			MyConn = DriverManager.getConnection(myUrl, myId, myPass);
			int no=5;
			String query="delete from tbl_board where no="+no;//�����϶���"'"+��+"'"//�����϶�
			stmt = MyConn.createStatement();
			int row =stmt.executeUpdate(query);
			System.out.println("�����Ȱ���"+row);
			//System.out.println("������");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("��� ���� ���и�");
		}
	}

}
