package mysql;

import java.util.List;

public class MySQLRun {
	public static void main(String[] args) throws Exception {
		MySQLExam my = new MySQLExam();
		my.makeConn();
		
//		int row = my.insertSQL("홍길동","제목입니다","내용~");
//		if(row==1)
//			System.out.println("성공");
//		else
//			System.out.println("실패");
		
//		List list = my.SelectSQL();
//		BoardBean bb;
//		for(int x=0;x<list.size();x++) {
//			bb =(BoardBean)list.get(x);
//			System.out.println(bb.no+bb.name+bb.subjcet+bb.content+bb.regdate+bb.redcnt);
//		}
		
		//수정
		int no =1;//수정값 받은것
		my.updateSQL(no,"제목수정","내용수정");
		
				my.takeDown();
	}

}
