package model.vo.board;

import java.util.Arrays;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import model.vo.person.MemberVO;

public class UserDatePlaceVO {
	
	private int udp_no;
	private String udp_title;
	private String udp_content;
	private MultipartFile[] udp_imgFiles;
	private Date udp_writeDate;
	private int udp_count;
	private MemberVO memberVO;
	
	//생성자 : 이미지 제외

	public UserDatePlaceVO(int udp_no, String udp_title, String udp_content,
			Date udp_writeDate, int udp_count, MemberVO memberVO) {
		super();
		this.udp_no = udp_no;
		this.udp_title = udp_title;
		this.udp_content = udp_content;
		this.udp_writeDate = udp_writeDate;
		this.udp_count = udp_count;
		this.memberVO = memberVO;
	}
	
	//생성자 : 모든 필드
	public UserDatePlaceVO(int udp_no, String udp_title, String udp_content,
			MultipartFile[] udp_imgFiles, Date udp_writeDate, int udp_count,
			MemberVO memberVO) {
		super();
		this.udp_no = udp_no;
		this.udp_title = udp_title;
		this.udp_content = udp_content;
		this.udp_imgFiles = udp_imgFiles;
		this.udp_writeDate = udp_writeDate;
		this.udp_count = udp_count;
		this.memberVO = memberVO;
	}
	
	
	//setter,getter	
	public int getUdp_no() {
		return udp_no;
	}

	public void setUdp_no(int udp_no) {
		this.udp_no = udp_no;
	}

	public String getUdp_title() {
		return udp_title;
	}

	public void setUdp_title(String udp_title) {
		this.udp_title = udp_title;
	}

	public String getUdp_content() {
		return udp_content;
	}

	public void setUdp_content(String udp_content) {
		this.udp_content = udp_content;
	}

	public MultipartFile[] getUdp_imgFiles() {
		return udp_imgFiles;
	}

	public void setUdp_imgFiles(MultipartFile[] udp_imgFiles) {
		this.udp_imgFiles = udp_imgFiles;
	}

	public Date getUdp_writeDate() {
		return udp_writeDate;
	}

	public void setUdp_writeDate(Date udp_writeDate) {
		this.udp_writeDate = udp_writeDate;
	}

	public int getUdp_count() {
		return udp_count;
	}

	public void setUdp_count(int udp_count) {
		this.udp_count = udp_count;
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
		return "UserDatePlaceVO [udp_no=" + udp_no + ", udp_title=" + udp_title
				+ ", udp_content=" + udp_content + ", udp_imgFiles="
				+ Arrays.toString(udp_imgFiles) + ", udp_writeDate="
				+ udp_writeDate + ", udp_count=" + udp_count + ", memberVO="
				+ memberVO + "]";
	}

	
	
}
