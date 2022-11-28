package bean;

public class Contestant {
	private Integer id;
	private Integer score;
	private Integer firstPlace;
	private Integer secondtPlace;
	private Integer thirdPlace;


	public Contestant() {
		// TODO Auto-generated constructor stub
	}

	public Contestant(Integer id, Integer score, Integer firstPlace, Integer secondtPlace, Integer thirdPlace) {
		super();
		this.id = id;
		this.score = score;
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
	public Integer getscore() {
		return score;
	}
	public void setscore(Integer score) {
		this.score = score;
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
		return "contestant [id=" + id + ", score=" + score + ", firstPlace=" + firstPlace + ", secondtPlace="
				+ secondtPlace + ", thirdPlace=" + thirdPlace + "]";
	}


}