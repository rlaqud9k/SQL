package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class MySQL {
	//�����ͺ��̽� ���� ����
	String myDriver = "com.mysql.jdbc.Driver";//�ݴ�� ����
	String myUrl = "jdbc:mysql://localhost:3306/jsl31_db";
					//   //ȣ��Ʈ��ȣ//�����ͺ��̽� �̸�
	String myId = "root";//����� ���̵�
	String myPass = "1234";// ����� ���
	
	Connection MyConn;
	
	public MySQL() {}
	public void makeConn() throws Exception{
		Class.forName(myDriver);
		MyConn=DriverManager.getConnection(myUrl, myId, myPass);
		System.out.println("�强");
	}
	public abstract void cleanup () throws Exception;
	public void takeDown() throws Exception{
		cleanup();
		MyConn.close();
	}
	}
