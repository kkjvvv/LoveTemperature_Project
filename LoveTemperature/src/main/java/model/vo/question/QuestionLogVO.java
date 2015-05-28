package model.vo.question;

import java.util.Date;

import model.vo.person.MemberVO;

public class QuestionLogVO {

	private int ql_no;
	private QuestionVO questionVO;
	private MemberVO memberVO;
	private Date ql_writeDate; //해당 설문 수행 날짜
	
	// 생성자 : 모든필드
	public QuestionLogVO(int ql_no, QuestionVO questionVO, MemberVO memberVO,
			Date ql_writeDate) {
		super();
		this.ql_no = ql_no;
		this.questionVO = questionVO;
		this.memberVO = memberVO;
		this.ql_writeDate = ql_writeDate;
	}


	//setter,getter
	public int getQl_no() {
		return ql_no;
	}


	public void setQl_no(int ql_no) {
		this.ql_no = ql_no;
	}


	public QuestionVO getQuestionVO() {
		return questionVO;
	}


	public void setQuestionVO(QuestionVO questionVO) {
		this.questionVO = questionVO;
	}


	public MemberVO getMemberVO() {
		return memberVO;
	}


	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}


	public Date getQl_writeDate() {
		return ql_writeDate;
	}


	public void setQl_writeDate(Date ql_writeDate) {
		this.ql_writeDate = ql_writeDate;
	}

	//toString
	@Override
	public String toString() {
		return "QuestionLogVO [ql_no=" + ql_no + ", questionVO=" + questionVO
				+ ", memberVO=" + memberVO + ", ql_writeDate=" + ql_writeDate
				+ "]";
	}
	
	
	
	
}
