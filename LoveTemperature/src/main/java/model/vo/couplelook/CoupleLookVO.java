package model.vo.couplelook;

public class CoupleLookVO {

	private int cl_no;
	private String cl_style;
	private String cl_imgUrl;
	private String cl_linkUrl;
	
	
	// 생성자 : 기본
	public CoupleLookVO() {
		super();
	}

	// 생성자 : 모든 필드
	public CoupleLookVO(int cl_no, String cl_style, String cl_imgUrl,
			String cl_linkUrl) {
		super();
		this.cl_no = cl_no;
		this.cl_style = cl_style;
		this.cl_imgUrl = cl_imgUrl;
		this.cl_linkUrl = cl_linkUrl;
	}

	//setter,getter
	public int getCl_no() {
		return cl_no;
	}

	public void setCl_no(int cl_no) {
		this.cl_no = cl_no;
	}

	public String getCl_style() {
		return cl_style;
	}

	public void setCl_style(String cl_style) {
		this.cl_style = cl_style;
	}

	public String getCl_imgUrl() {
		return cl_imgUrl;
	}

	public void setCl_imgUrl(String cl_imgUrl) {
		this.cl_imgUrl = cl_imgUrl;
	}

	public String getCl_linkUrl() {
		return cl_linkUrl;
	}

	public void setCl_linkUrl(String cl_linkUrl) {
		this.cl_linkUrl = cl_linkUrl;
	}

	//toString
	@Override
	public String toString() {
		return "CoupleLookVO [cl_no=" + cl_no + ", cl_style=" + cl_style
				+ ", cl_imgUrl=" + cl_imgUrl + ", cl_linkUrl=" + cl_linkUrl
				+ "]";
	}
	
	
	
}
