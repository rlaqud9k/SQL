package mysql;

import java.util.List;

public class MySQLRun {
	public static void main(String[] args) throws Exception {
		MySQLExam my = new MySQLExam();
		my.makeConn();
		
//		int row = my.insertSQL("ȫ�浿","�����Դϴ�","����~");
//		if(row==1)
//			System.out.println("����");
//		else
//			System.out.println("����");
		
//		List list = my.SelectSQL();
//		BoardBean bb;
//		for(int x=0;x<list.size();x++) {
//			bb =(BoardBean)list.get(x);
//			System.out.println(bb.no+bb.name+bb.subjcet+bb.content+bb.regdate+bb.redcnt);
//		}
		
		//����
		int no =1;//������ ������
		my.updateSQL(no,"�������","�������");
		
				my.takeDown();
	}

}
