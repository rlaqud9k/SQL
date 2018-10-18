package mysql;

public class BoardBean {
	int no;
	String name;
	String subjcet;
	String content;
	String regdate;
	int redcnt;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubjcet() {
		return subjcet;
	}
	public void setSubjcet(String subjcet) {
		this.subjcet = subjcet;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getRedcnt() {
		return redcnt;
	}
	public void setRedcnt(int redcnt) {
		this.redcnt = redcnt;
	}
}
