package model.vo.question;

public class QuestionVO {

	private int quest_no;
	private String quest_type;
	private String quest_description;
	
	// 생성자 : 모든 필드
	public QuestionVO(int quest_no, String quest_type, String quest_description) {
		super();
		this.quest_no = quest_no;
		this.quest_type = quest_type;
		this.quest_description = quest_description;
	}

	
	//setter,getter	
	public int getQuest_no() {
		return quest_no;
	}

	public void setQuest_no(int quest_no) {
		this.quest_no = quest_no;
	}

	public String getQuest_type() {
		return quest_type;
	}

	public void setQuest_type(String quest_type) {
		this.quest_type = quest_type;
	}

	public String getQuest_description() {
		return quest_description;
	}

	public void setQuest_description(String quest_description) {
		this.quest_description = quest_description;
	}


	//toString
	@Override
	public String toString() {
		return "QuestionVO [quest_no=" + quest_no + ", quest_type="
				+ quest_type + ", quest_description=" + quest_description + "]";
	}
	
	
}
