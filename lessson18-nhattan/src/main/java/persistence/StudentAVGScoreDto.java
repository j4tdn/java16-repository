package persistence;

public class StudentAVGScoreDto {
	
	public static final String STUDENT_ID = "sId";
	public static final String STUDENT_NAME = "sName";
	public static final String AVG_SCORE = "avgScore";
	
	private Integer sId;
	
	private String sName;
	
	private Double avgScore;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(Double avgScore) {
		this.avgScore = avgScore;
	}

	@Override
	public String toString() {
		return "StudentAVGScoreDto [sId=" + sId + ", sName=" + sName + ", avgScore=" + avgScore + "]";
	}

}
