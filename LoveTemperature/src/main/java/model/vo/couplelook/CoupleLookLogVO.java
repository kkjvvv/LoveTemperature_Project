package model.vo.couplelook;

import model.vo.person.MemberVO;

public class CoupleLookLogVO {
	
	private int cll_no;
	private MemberVO memberVO;
	private CoupleLookVO coupleLookVO;
	
	//생성자 : 모든필드
	public CoupleLookLogVO(int cll_no, MemberVO memberVO,
			CoupleLookVO coupleLookVO) {
		super();
		this.cll_no = cll_no;
		this.memberVO = memberVO;
		this.coupleLookVO = coupleLookVO;
	}

	//setter,getter
	public int getCll_no() {
		return cll_no;
	}

	public void setCll_no(int cll_no) {
		this.cll_no = cll_no;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	public CoupleLookVO getCoupleLookVO() {
		return coupleLookVO;
	}

	public void setCoupleLookVO(CoupleLookVO coupleLookVO) {
		this.coupleLookVO = coupleLookVO;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "CoupleLookLogVO [cll_no=" + cll_no + ", memberVO=" + memberVO
				+ ", coupleLookVO=" + coupleLookVO + "]";
	}
	

	
	
}
