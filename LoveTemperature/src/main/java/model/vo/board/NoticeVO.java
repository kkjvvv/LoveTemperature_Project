package model.vo.board;

import java.util.Date;

import model.vo.person.AdminVO;

public class NoticeVO {

	private int noti_no;
	private String noti_title;
	private String noti_content;
	private Date noti_wirteDate; //작성 날짜
	private AdminVO adminVO;
	
	// 생성자 : 기본
	public NoticeVO() {
		super();

	}

	// 생성자 : 모든 필드
	public NoticeVO(int noti_no, String noti_title, String noti_content,
			Date noti_wirteDate, AdminVO adminVO) {
		super();
		this.noti_no = noti_no;
		this.noti_title = noti_title;
		this.noti_content = noti_content;
		this.noti_wirteDate = noti_wirteDate;
		this.adminVO = adminVO;
	}

	//setter,getter
	public int getNoti_no() {
		return noti_no;
	}

	public void setNoti_no(int noti_no) {
		this.noti_no = noti_no;
	}

	public String getNoti_title() {
		return noti_title;
	}

	public void setNoti_title(String noti_title) {
		this.noti_title = noti_title;
	}

	public String getNoti_content() {
		return noti_content;
	}

	public void setNoti_content(String noti_content) {
		this.noti_content = noti_content;
	}

	public Date getNoti_wirteDate() {
		return noti_wirteDate;
	}

	public void setNoti_wirteDate(Date noti_wirteDate) {
		this.noti_wirteDate = noti_wirteDate;
	}

	public AdminVO getAdminVO() {
		return adminVO;
	}

	public void setAdminVO(AdminVO adminVO) {
		this.adminVO = adminVO;
	}

	//toString
	@Override
	public String toString() {
		return "NoticeVO [noti_no=" + noti_no + ", noti_title=" + noti_title
				+ ", noti_content=" + noti_content + ", noti_wirteDate="
				+ noti_wirteDate + ", adminVO=" + adminVO + "]";
	}
	
	
	
	
}
