package model.vo.point;

public class ProductVO {

	private int pd_no;
	private String pd_name;
	private int pd_pointPrice;
	private String pd_imgUrl;
	
	//생성자 : 모든필드
	public ProductVO(int pd_no, String pd_name, int pd_pointPrice,
			String pd_imgUrl) {
		super();
		this.pd_no = pd_no;
		this.pd_name = pd_name;
		this.pd_pointPrice = pd_pointPrice;
		this.pd_imgUrl = pd_imgUrl;
	}

	
	//setter,getter
	public int getPd_no() {
		return pd_no;
	}

	public void setPd_no(int pd_no) {
		this.pd_no = pd_no;
	}

	public String getPd_name() {
		return pd_name;
	}

	public void setPd_name(String pd_name) {
		this.pd_name = pd_name;
	}

	public int getPd_pointPrice() {
		return pd_pointPrice;
	}

	public void setPd_pointPrice(int pd_pointPrice) {
		this.pd_pointPrice = pd_pointPrice;
	}

	public String getPd_imgUrl() {
		return pd_imgUrl;
	}

	public void setPd_imgUrl(String pd_imgUrl) {
		this.pd_imgUrl = pd_imgUrl;
	}


	//toString
	@Override
	public String toString() {
		return "ProductVO [pd_no=" + pd_no + ", pd_name=" + pd_name
				+ ", pd_pointPrice=" + pd_pointPrice + ", pd_imgUrl="
				+ pd_imgUrl + "]";
	}
	
	
	
}
