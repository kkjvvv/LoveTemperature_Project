package model.vo.person;

import model.vo.question.DateTypeVO;

public class MyLoverVO {

	private int ml_no;
	private String ml_name;
	private String ml_bloodType;
	private String ml_job;
	private String ml_style;
	private DateTypeVO dateTypeVO;
	
	//생성자 : dateTypeVO제외
	public MyLoverVO(int ml_no, String ml_name, String ml_bloodType,
			String ml_job, String ml_style) {
		super();
		this.ml_no = ml_no;
		this.ml_name = ml_name;
		this.ml_bloodType = ml_bloodType;
		this.ml_job = ml_job;
		this.ml_style = ml_style;
	}
	
	
	//생성자 : 모든 필드
	public MyLoverVO(int ml_no, String ml_name, String ml_bloodType,
			String ml_job, String ml_style, DateTypeVO dateTypeVO) {
		super();
		this.ml_no = ml_no;
		this.ml_name = ml_name;
		this.ml_bloodType = ml_bloodType;
		this.ml_job = ml_job;
		this.ml_style = ml_style;
		this.dateTypeVO = dateTypeVO;
	}


	//setter,getter
	public int getMl_no() {
		return ml_no;
	}


	public void setMl_no(int ml_no) {
		this.ml_no = ml_no;
	}


	public String getMl_name() {
		return ml_name;
	}


	public void setMl_name(String ml_name) {
		this.ml_name = ml_name;
	}


	public String getMl_bloodType() {
		return ml_bloodType;
	}


	public void setMl_bloodType(String ml_bloodType) {
		this.ml_bloodType = ml_bloodType;
	}


	public String getMl_job() {
		return ml_job;
	}


	public void setMl_job(String ml_job) {
		this.ml_job = ml_job;
	}


	public String getMl_style() {
		return ml_style;
	}


	public void setMl_style(String ml_style) {
		this.ml_style = ml_style;
	}


	public DateTypeVO getDateTypeVO() {
		return dateTypeVO;
	}


	public void setDateTypeVO(DateTypeVO dateTypeVO) {
		this.dateTypeVO = dateTypeVO;
	}


	//toString
	@Override
	public String toString() {
		return "MyLoverVO [ml_no=" + ml_no + ", ml_name=" + ml_name
				+ ", ml_bloodType=" + ml_bloodType + ", ml_job=" + ml_job
				+ ", ml_style=" + ml_style + ", dateTypeVO=" + dateTypeVO + "]";
	}

	
	
}
