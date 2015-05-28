package model.vo.board.comment;

import java.util.Date;

import model.vo.datePlace.DatePlaceVO;
import model.vo.person.MemberVO;

public class DatePlaceCommentVO {
	private int dpc_no;
	private String dpc_content;
	private Date dpc_writeDate;
	private int dpc_score;
	private MemberVO memberVO;
	private DatePlaceVO datePlaceVO;
	
	
	// 생성자 : 기본
	public DatePlaceCommentVO() {
		super();
	}

	// 생성자 : 모든 필드
	public DatePlaceCommentVO(int dpc_no, String dpc_content,
			Date dpc_writeDate, int dpc_score, MemberVO memberVO,
			DatePlaceVO datePlaceVO) {
		super();
		this.dpc_no = dpc_no;
		this.dpc_content = dpc_content;
		this.dpc_writeDate = dpc_writeDate;
		this.dpc_score = dpc_score;
		this.memberVO = memberVO;
		this.datePlaceVO = datePlaceVO;
	}

	//setter,getter
	public int getDpc_no() {
		return dpc_no;
	}

	public void setDpc_no(int dpc_no) {
		this.dpc_no = dpc_no;
	}

	public String getDpc_content() {
		return dpc_content;
	}

	public void setDpc_content(String dpc_content) {
		this.dpc_content = dpc_content;
	}

	public Date getDpc_writeDate() {
		return dpc_writeDate;
	}

	public void setDpc_writeDate(Date dpc_writeDate) {
		this.dpc_writeDate = dpc_writeDate;
	}

	public int getDpc_score() {
		return dpc_score;
	}

	public void setDpc_score(int dpc_score) {
		this.dpc_score = dpc_score;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	public DatePlaceVO getDatePlaceVO() {
		return datePlaceVO;
	}

	public void setDatePlaceVO(DatePlaceVO datePlaceVO) {
		this.datePlaceVO = datePlaceVO;
	}

	//toString
	@Override
	public String toString() {
		return "DatePlaceCommentVO [dpc_no=" + dpc_no + ", dpc_content="
				+ dpc_content + ", dpc_writeDate=" + dpc_writeDate
				+ ", dpc_score=" + dpc_score + ", memberVO=" + memberVO
				+ ", datePlaceVO=" + datePlaceVO + "]";
	}
	
	
	
	
	
	
	
}
