package model.vo.person;
import java.util.Date;

	public class MemberVO {
	   private String mem_id;
	   private String mem_password;
	   private String mem_name;
	   private String mem_email;
	   private String mem_gender;
	   private String mem_bloodType;
	   private String mem_job;
	   private String mem_favorPlace;
	   private Date mem_coupleDay;
	   private String mem_passQuestion;
	   private String mem_passAnswer;
	   private String mem_profileImg;
	   private String mem_style;
	   private int mem_recommendCount;
	   private int mem_point;
	   private int mem_heart;
	   private int mem_temperature;
	   private MyLoverVO mylover;

	   // 생성자 : 기본
	   public MemberVO() {
	      super();
	      // TODO Auto-generated constructor stub
	   }
	   
	 //생성자 : 나의 연인 제외
		public MemberVO(String mem_id, String mem_password, String mem_name,
				String mem_email, String mem_gender, String mem_bloodType,
				String mem_job, String mem_favorPlace, Date mem_coupleDay,
				String mem_passQuestion, String mem_passAnswer,
				String mem_profileImg, String mem_style, int mem_recommendCount,
				int mem_point, int mem_heart, int mem_temperature) {
			super();
			this.mem_id = mem_id;
			this.mem_password = mem_password;
			this.mem_name = mem_name;
			this.mem_email = mem_email;
			this.mem_gender = mem_gender;
			this.mem_bloodType = mem_bloodType;
			this.mem_job = mem_job;
			this.mem_favorPlace = mem_favorPlace;
			this.mem_coupleDay = mem_coupleDay;
			this.mem_passQuestion = mem_passQuestion;
			this.mem_passAnswer = mem_passAnswer;
			this.mem_profileImg = mem_profileImg;
			this.mem_style = mem_style;
			this.mem_recommendCount = mem_recommendCount;
			this.mem_point = mem_point;
			this.mem_heart = mem_heart;
			this.mem_temperature = mem_temperature;
		}
	   
	   // 생성자 : 로그인을 위해서 (id,password)
	   public MemberVO(String mem_id, String mem_password) {
	      super();
	      this.mem_id = mem_id;
	      this.mem_password = mem_password;
	   }


	   
	   // 생성자 : style까지
	   public MemberVO(String mem_id, String mem_password, String mem_name,
	         String mem_email, String mem_gender, String mem_bloodType,
	         String mem_job, String mem_favorPlace, Date mem_coupleDay,
	         String mem_passQuestion, String mem_passAnswer,
	         String mem_profileImg, String mem_style) {
	      super();
	      this.mem_id = mem_id;
	      this.mem_password = mem_password;
	      this.mem_name = mem_name;
	      this.mem_email = mem_email;
	      this.mem_gender = mem_gender;
	      this.mem_bloodType = mem_bloodType;
	      this.mem_job = mem_job;
	      this.mem_favorPlace = mem_favorPlace;
	      this.mem_coupleDay = mem_coupleDay;
	      this.mem_passQuestion = mem_passQuestion;
	      this.mem_passAnswer = mem_passAnswer;
	      this.mem_profileImg = mem_profileImg;
	      this.mem_style = mem_style;
	   }


	   // 생성자 : 연애온도,MyLover제외
	   public MemberVO(String mem_id, String mem_password, String mem_name,
	         String mem_email, String mem_gender, String mem_bloodType,
	         String mem_job, String mem_favorPlace, Date mem_coupleDay,
	         String mem_passQuestion, String mem_passAnswer,
	         String mem_profileImg, String mem_style,
	         int mem_recommendCount, int mem_point, int mem_heart) {
	      super();
	      this.mem_id = mem_id;
	      this.mem_password = mem_password;
	      this.mem_name = mem_name;
	      this.mem_email = mem_email;
	      this.mem_gender = mem_gender;
	      this.mem_bloodType = mem_bloodType;
	      this.mem_job = mem_job;
	      this.mem_favorPlace = mem_favorPlace;
	      this.mem_coupleDay = mem_coupleDay;
	      this.mem_passQuestion = mem_passQuestion;
	      this.mem_passAnswer = mem_passAnswer;
	      this.mem_profileImg = mem_profileImg;
	      this.mem_style = mem_style;
	      this.mem_recommendCount = mem_recommendCount;
	      this.mem_point = mem_point;
	      this.mem_heart = mem_heart;
	   }

	   // 생성자 : 모든필드
	   public MemberVO(String mem_id, String mem_password, String mem_name,
	         String mem_email, String mem_gender, String mem_bloodType,
	         String mem_job, String mem_favorPlace, Date mem_coupleDay,
	         String mem_passQuestion, String mem_passAnswer,
	         String mem_profileImg, String mem_style,
	         int mem_recommendCount, int mem_point, int mem_heart,
	         int mem_temperature, MyLoverVO mylover) {
	      super();
	      this.mem_id = mem_id;
	      this.mem_password = mem_password;
	      this.mem_name = mem_name;
	      this.mem_email = mem_email;
	      this.mem_gender = mem_gender;
	      this.mem_bloodType = mem_bloodType;
	      this.mem_job = mem_job;
	      this.mem_favorPlace = mem_favorPlace;
	      this.mem_coupleDay = mem_coupleDay;
	      this.mem_passQuestion = mem_passQuestion;
	      this.mem_passAnswer = mem_passAnswer;
	      this.mem_profileImg = mem_profileImg;
	      this.mem_style = mem_style;
	      this.mem_recommendCount = mem_recommendCount;
	      this.mem_point = mem_point;
	      this.mem_heart = mem_heart;
	      this.mem_temperature = mem_temperature;
	      this.mylover = mylover;
	   }

	   
	   //setter,getter
	   public String getMem_id() {
	      return mem_id;
	   }

	   public void setMem_id(String mem_id) {
	      this.mem_id = mem_id;
	   }

	   public String getMem_password() {
	      return mem_password;
	   }

	   public void setMem_password(String mem_password) {
	      this.mem_password = mem_password;
	   }

	   public String getMem_name() {
	      return mem_name;
	   }

	   public void setMem_name(String mem_name) {
	      this.mem_name = mem_name;
	   }

	   public String getMem_email() {
	      return mem_email;
	   }

	   public void setMem_email(String mem_email) {
	      this.mem_email = mem_email;
	   }

	   public String getMem_gender() {
	      return mem_gender;
	   }

	   public void setMem_gender(String mem_gender) {
	      this.mem_gender = mem_gender;
	   }

	   public String getMem_bloodType() {
	      return mem_bloodType;
	   }

	   public void setMem_bloodType(String mem_bloodType) {
	      this.mem_bloodType = mem_bloodType;
	   }

	   public String getMem_job() {
	      return mem_job;
	   }

	   public void setMem_job(String mem_job) {
	      this.mem_job = mem_job;
	   }

	   public String getMem_favorPlace() {
	      return mem_favorPlace;
	   }

	   public void setMem_favorPlace(String mem_favorPlace) {
	      this.mem_favorPlace = mem_favorPlace;
	   }

	   public Date getMem_coupleDay() {
	      return mem_coupleDay;
	   }

	   public void setMem_coupleDay(Date mem_coupleDay) {
	      this.mem_coupleDay = mem_coupleDay;
	   }

	   public String getMem_passQuestion() {
	      return mem_passQuestion;
	   }

	   public void setMem_passQuestion(String mem_passQuestion) {
	      this.mem_passQuestion = mem_passQuestion;
	   }

	   public String getMem_passAnswer() {
	      return mem_passAnswer;
	   }

	   public void setMem_passAnswer(String mem_passAnswer) {
	      this.mem_passAnswer = mem_passAnswer;
	   }

	   public String getMem_profileImg() {
	      return mem_profileImg;
	   }

	   public void setMem_profileImg(String mem_profileImg) {
	      this.mem_profileImg = mem_profileImg;
	   }

	   public String getMem_style() {
	      return mem_style;
	   }

	   public void setMem_style(String mem_style) {
	      this.mem_style = mem_style;
	   }

	   public int getMem_recommendCount() {
	      return mem_recommendCount;
	   }

	   public void setMem_recommendCount(int mem_recommendCount) {
	      this.mem_recommendCount = mem_recommendCount;
	   }

	   public int getMem_point() {
	      return mem_point;
	   }

	   public void setMem_point(int mem_point) {
	      this.mem_point = mem_point;
	   }

	   public int getMem_heart() {
	      return mem_heart;
	   }

	   public void setMem_heart(int mem_heart) {
	      this.mem_heart = mem_heart;
	   }

	   public int getMem_temperature() {
	      return mem_temperature;
	   }

	   public void setMem_temperature(int mem_temperature) {
	      this.mem_temperature = mem_temperature;
	   }

	   public MyLoverVO getMylover() {
	      return mylover;
	   }

	   public void setMylover(MyLoverVO mylover) {
	      this.mylover = mylover;
	   }

	   //toString
	   @Override
	   public String toString() {
	      return "memberVO [mem_id=" + mem_id + ", mem_password=" + mem_password
	            + ", mem_name=" + mem_name + ", mem_email=" + mem_email
	            + ", mem_gender=" + mem_gender + ", mem_bloodType="
	            + mem_bloodType + ", mem_job=" + mem_job + ", mem_favorPlace="
	            + mem_favorPlace + ", mem_coupleDay=" + mem_coupleDay
	            + ", mem_passQuestion=" + mem_passQuestion
	            + ", mem_passAnswer=" + mem_passAnswer + ", mem_profileImg="
	            + mem_profileImg + ", mem_style=" + mem_style
	            + ", mem_recommendCount=" + mem_recommendCount + ", mem_point="
	            + mem_point + ", mem_heart=" + mem_heart + ", mem_temperature="
	            + mem_temperature + ", mylover=" + mylover + "]";
	   }

	}