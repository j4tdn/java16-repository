package bean;

public class contestant {
	private Integer id;
	private Integer totalScore;
	private Integer firstPlace;
	private Integer secondtPlace;
	private Integer thirdPlace;
	
	
	public contestant() {
		// TODO Auto-generated constructor stub
	}
	
	public contestant(Integer id, Integer totalScore, Integer firstPlace, Integer secondtPlace, Integer thirdPlace) {
		super();
		this.id = id;
		this.totalScore = totalScore;
		this.firstPlace = firstPlace;
		this.secondtPlace = secondtPlace;
		this.thirdPlace = thirdPlace;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}
	public Integer getFirstPlace() {
		return firstPlace;
	}
	public void setFirstPlace(Integer firstPlace) {
		this.firstPlace = firstPlace;
	}
	public Integer getSecondtPlace() {
		return secondtPlace;
	}
	public void setSecondtPlace(Integer secondtPlace) {
		this.secondtPlace = secondtPlace;
	}
	public Integer getThirdPlace() {
		return thirdPlace;
	}
	public void setThirdPlace(Integer thirdPlace) {
		this.thirdPlace = thirdPlace;
	}

	@Override
	public String toString() {
		return "contestant [id=" + id + ", totalScore=" + totalScore + ", firstPlace=" + firstPlace + ", secondtPlace="
				+ secondtPlace + ", thirdPlace=" + thirdPlace + "]";
	}
	
	
}
