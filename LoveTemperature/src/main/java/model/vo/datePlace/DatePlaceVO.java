package model.vo.datePlace;

public class DatePlaceVO {

	private int dp_no;
	private String dp_category;
	private String dp_name;
	private String dp_description;
	private String dp_location;
	private String dp_imgUrl;
	private String dp_linkUrl;
	
	//생성자 : 기본
	public DatePlaceVO() {
		super();
	}


	//생성자 : 모든 필드
	public DatePlaceVO(int dp_no, String dp_category, String dp_name,
			String dp_description, String dp_location, String dp_imgUrl,
			String dp_linkUrl) {
		super();
		this.dp_no = dp_no;
		this.dp_category = dp_category;
		this.dp_name = dp_name;
		this.dp_description = dp_description;
		this.dp_location = dp_location;
		this.dp_imgUrl = dp_imgUrl;
		this.dp_linkUrl = dp_linkUrl;
	}

	//setter,getter
	public int getDp_no() {
		return dp_no;
	}


	public void setDp_no(int dp_no) {
		this.dp_no = dp_no;
	}


	public String getDp_category() {
		return dp_category;
	}


	public void setDp_category(String dp_category) {
		this.dp_category = dp_category;
	}


	public String getDp_name() {
		return dp_name;
	}


	public void setDp_name(String dp_name) {
		this.dp_name = dp_name;
	}


	public String getDp_description() {
		return dp_description;
	}


	public void setDp_description(String dp_description) {
		this.dp_description = dp_description;
	}


	public String getDp_location() {
		return dp_location;
	}


	public void setDp_location(String dp_location) {
		this.dp_location = dp_location;
	}


	public String getDp_imgUrl() {
		return dp_imgUrl;
	}


	public void setDp_imgUrl(String dp_imgUrl) {
		this.dp_imgUrl = dp_imgUrl;
	}


	public String getDp_linkUrl() {
		return dp_linkUrl;
	}


	public void setDp_linkUrl(String dp_linkUrl) {
		this.dp_linkUrl = dp_linkUrl;
	}

	//toString
	@Override
	public String toString() {
		return "DatePlaceVO [dp_no=" + dp_no + ", dp_category=" + dp_category
				+ ", dp_name=" + dp_name + ", dp_description=" + dp_description
				+ ", dp_location=" + dp_location + ", dp_imgUrl=" + dp_imgUrl
				+ ", dp_linkUrl=" + dp_linkUrl + "]";
	}
	
	
	
	
	
}
