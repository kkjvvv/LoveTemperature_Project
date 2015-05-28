package model.vo.board;

import java.util.Date;

import model.vo.person.MemberVO;

public class LoveCounselVO {

	private int lc_no;
	private String lc_title;
	private String lc_content;
	private Date lc_writeDate;
	private MemberVO memberVO;
	
	
	// 생성자 : 모든 필드
	public LoveCounselVO(int lc_no, String lc_title, String lc_content,
			Date lc_writeDate, MemberVO memberVO) {
		super();
		this.lc_no = lc_no;
		this.lc_title = lc_title;
		this.lc_content = lc_content;
		this.lc_writeDate = lc_writeDate;
		this.memberVO = memberVO;
	}


	//setter,getter
	public int getLc_no() {
		return lc_no;
	}


	public void setLc_no(int lc_no) {
		this.lc_no = lc_no;
	}


	public String getLc_title() {
		return lc_title;
	}


	public void setLc_title(String lc_title) {
		this.lc_title = lc_title;
	}


	public String getLc_content() {
		return lc_content;
	}


	public void setLc_content(String lc_content) {
		this.lc_content = lc_content;
	}


	public Date getLc_writeDate() {
		return lc_writeDate;
	}


	public void setLc_writeDate(Date lc_writeDate) {
		this.lc_writeDate = lc_writeDate;
	}


	public MemberVO getMemberVO() {
		return memberVO;
	}


	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}


	//toString
	@Override
	public String toString() {
		return "LoveCounselVO [lc_no=" + lc_no + ", lc_title=" + lc_title
				+ ", lc_content=" + lc_content + ", lc_writeDate="
				+ lc_writeDate + ", memberVO=" + memberVO + "]";
	}
	
	
}
