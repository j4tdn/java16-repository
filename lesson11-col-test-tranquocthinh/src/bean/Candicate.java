package bean;

public class Candicate {
	private int numberOfJudge;
	private int id;
	private double score1;
	private double score2;
	private double score3;

	public Candicate() {
	}

	public Candicate(int numberOfJudge, int id, double score1, double score2, double score3) {
		this.numberOfJudge = numberOfJudge;
		this.id = id;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	public int getNumberOfJudge() {
		return numberOfJudge;
	}

	public void setNumberOfJudge(int numberOfJudge) {
		this.numberOfJudge = numberOfJudge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore1() {
		return score1;
	}

	public void setScore1(double score1) {
		this.score1 = score1;
	}

	public double getScore2() {
		return score2;
	}

	public void setScore2(double score2) {
		this.score2 = score2;
	}

	public double getScore3() {
		return score3;
	}

	public void setScore3(double score3) {
		this.score3 = score3;
	}

	@Override
	public String toString() {
		return "Candicate [numberOfJudge=" + numberOfJudge + ", id=" + id + ", score1=" + score1 + ", score2=" + score2
				+ ", score3=" + score3 + "]";
	}

}
