package model.vo.question;

public class DateTypeVO {

	private String dt_dateType;
	private String dt_description;
	
	//생성자 : 모든 필드
	public DateTypeVO(String dt_dateType, String dt_description) {
		super();
		this.dt_dateType = dt_dateType;
		this.dt_description = dt_description;
	}


	//setter,getter
	public String getDt_dateType() {
		return dt_dateType;
	}


	public void setDt_dateType(String dt_dateType) {
		this.dt_dateType = dt_dateType;
	}


	public String getDt_description() {
		return dt_description;
	}


	public void setDt_description(String dt_description) {
		this.dt_description = dt_description;
	}

	//toString
	@Override
	public String toString() {
		return "DateTypeVO [dt_dateType=" + dt_dateType + ", dt_description="
				+ dt_description + "]";
	}
	
	
}
