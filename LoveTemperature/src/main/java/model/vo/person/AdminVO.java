package model.vo.person;

public class AdminVO {
	
	private String ad_id;
	private String ad_password;
	private String ad_name;
	private String ad_tel;
	private String ad_email;
	
	// 생성자 : 모든 필드
	public AdminVO(String ad_id, String ad_password, String ad_name,
			String ad_tel, String ad_email) {
		super();
		this.ad_id = ad_id;
		this.ad_password = ad_password;
		this.ad_name = ad_name;
		this.ad_tel = ad_tel;
		this.ad_email = ad_email;
	}

	// 생성자 : 기본
	public AdminVO() {
		super();
	
	}

	//setter,getter
	public String getAd_id() {
		return ad_id;
	}

	public void setAd_id(String ad_id) {
		this.ad_id = ad_id;
	}

	public String getAd_password() {
		return ad_password;
	}

	public void setAd_password(String ad_password) {
		this.ad_password = ad_password;
	}

	public String getAd_name() {
		return ad_name;
	}

	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}

	public String getAd_tel() {
		return ad_tel;
	}

	public void setAd_tel(String ad_tel) {
		this.ad_tel = ad_tel;
	}

	public String getAd_email() {
		return ad_email;
	}

	public void setAd_email(String ad_email) {
		this.ad_email = ad_email;
	}

	
	//toString
	@Override
	public String toString() {
		return "AdminVO [ad_id=" + ad_id + ", ad_password=" + ad_password
				+ ", ad_name=" + ad_name + ", ad_tel=" + ad_tel + ", ad_email="
				+ ad_email + "]";
	}
	
	
	
	
}
