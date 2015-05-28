package model.vo.board.comment;

import model.vo.board.LoveCounselVO;
import model.vo.person.MemberVO;

public class LoveCounselCommentVO {
	
	private int lcc_no;
	private String lcc_content;
	private boolean lcc_isChoice;
	private LoveCounselVO loveCounselVO;
	private MemberVO memberVO;
	
	//생성자 : 모든 필드
	public LoveCounselCommentVO(int lcc_no, String lcc_content,
			boolean lcc_isChoice, LoveCounselVO loveCounselVO, MemberVO memberVO) {
		super();
		this.lcc_no = lcc_no;
		this.lcc_content = lcc_content;
		this.lcc_isChoice = lcc_isChoice;
		this.loveCounselVO = loveCounselVO;
		this.memberVO = memberVO;
	}

	
	//setter,getter
	public int getLcc_no() {
		return lcc_no;
	}

	public void setLcc_no(int lcc_no) {
		this.lcc_no = lcc_no;
	}

	public String getLcc_content() {
		return lcc_content;
	}


	public void setLcc_content(String lcc_content) {
		this.lcc_content = lcc_content;
	}

	public boolean isLcc_isChoice() {
		return lcc_isChoice;
	}

	public void setLcc_isChoice(boolean lcc_isChoice) {
		this.lcc_isChoice = lcc_isChoice;
	}

	public LoveCounselVO getLoveCounselVO() {
		return loveCounselVO;
	}

	public void setLoveCounselVO(LoveCounselVO loveCounselVO) {
		this.loveCounselVO = loveCounselVO;
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
		return "LoveCounselCommentVO [lcc_no=" + lcc_no + ", lcc_content="
				+ lcc_content + ", lcc_isChoice=" + lcc_isChoice
				+ ", loveCounselVO=" + loveCounselVO + ", memberVO=" + memberVO
				+ "]";
	}
	
	
	
}
