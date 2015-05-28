package model.vo.point;

import model.vo.person.MemberVO;

public class EventBoxVO {

	private int eb_no;
	private ProductVO productVO;
	private MemberVO memberVO;
	
	//생성자 : 모든 필드
	public EventBoxVO(int eb_no, ProductVO productVO, MemberVO memberVO) {
		super();
		this.eb_no = eb_no;
		this.productVO = productVO;
		this.memberVO = memberVO;
	}

	//setter,getter
	public int getEb_no() {
		return eb_no;
	}

	public void setEb_no(int eb_no) {
		this.eb_no = eb_no;
	}

	public ProductVO getProductVO() {
		return productVO;
	}

	public void setProductVO(ProductVO productVO) {
		this.productVO = productVO;
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
		return "EventBoxVO [eb_no=" + eb_no + ", productVO=" + productVO
				+ ", memberVO=" + memberVO + "]";
	}
	
	
	
	
}
