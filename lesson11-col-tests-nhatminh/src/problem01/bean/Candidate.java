package problem01.bean;

public class Candidate {
	private int point;
	private int firstPos;
	private int secondPos;
	private int thirdPos;
	public Candidate() {
		super();
	}
	public Candidate(int point, int firstPos, int secondPos, int thirdPos) {
		super();
		this.point = point;
		this.firstPos = firstPos;
		this.secondPos = secondPos;
		this.thirdPos = thirdPos;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getFirstPos() {
		return firstPos;
	}
	public void setFirstPos(int firstPos) {
		this.firstPos = firstPos;
	}
	public int getSecondPos() {
		return secondPos;
	}
	public void setSecondPos(int secondPos) {
		this.secondPos = secondPos;
	}
	public int getThirdPos() {
		return thirdPos;
	}
	public void setThirdPos(int thirdPos) {
		this.thirdPos = thirdPos;
	}
	@Override
	public String toString() {
		return "Candidate [point=" + point + ", firstPos=" + firstPos + ", secondPos=" + secondPos + ", thirdPos=" + thirdPos
				+ "]";
	}
}
