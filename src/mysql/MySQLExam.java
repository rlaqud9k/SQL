package mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQLExam extends MySQL {
	Statement stmt;//일회성
	ResultSet rs=null;//셀렉트때문에씀 Iterator와 유사함.// 주머니 자료를 쌓는용도 filo구조
	PreparedStatement pstmt=null;//Statement의 진화형//이친구를 더 많이씀//재활용 가능
	
	
	public MySQLExam() {
		super();//안불러와도 자동 초기화아닌가???
	}
	//등록 메소드
	public int insertSQL(String name,String subject, String na)throws Exception {
		String query ="insert into tbl_board(name,subject,content)"
				+"values(?,?,?)";
		pstmt=MyConn.prepareStatement(query);
		pstmt.setString(1, name);
		pstmt.setString(2, subject);
		pstmt.setString(3, na);
		int row=pstmt.executeUpdate();
		//pstmt.executeQuery()//인설트일때만
		cleanup();
		return row;
	}
	
	//검색메소드
	public List SelectSQL()throws Exception{
		List list = new ArrayList();
		String query="select * form tbl_board";
		pstmt= MyConn.prepareStatement(query);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			BoardBean bb=new BoardBean();
			bb.setNo(rs.getInt("no"));
			bb.setName(rs.getString("name"));
			bb.setSubjcet(rs.getString("subject"));
			bb.setContent(rs.getString("content"));
			bb.setRegdate(rs.getString("regdate"));
			bb.setRedcnt(rs.getInt("redcnt"));
			list.add(bb);
		}
		return list;
	}
	//수정메소드
	public void updateSQL(int no,String subject, String content) throws Exception{
		String query= "update tbl_board set subject=?, content =? where no=?";
		pstmt = MyConn.prepareStatement(query);
		pstmt.setString(1, subject);
		pstmt.setString(2, content);
		pstmt.setInt(3, no);
		pstmt.executeUpdate();
	}
	//삭제메소드
	public void deleteSQL(int no)throws Exception{
		String query="delete from tbl_board where no=?";
		pstmt = MyConn.prepareStatement(query);
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
	}
	
@Override
public void cleanup() throws Exception {
	//rs.close();
	pstmt.close();
	
}

}
