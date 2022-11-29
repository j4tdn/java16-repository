package bean;

public class Examiner {
	private int pointMiss;
	private int numberMiss;
	public Examiner() {
		// TODO Auto-generated constructor stub
	}
	public int getNumberMiss() {
		return numberMiss;
	}
	public void setNumberMiss(int numberMiss) {
		this.numberMiss = numberMiss;
	}
	public int getPointMiss() {
		return pointMiss;
	}
	public void setPointMiss(int pointMiss) {
		this.pointMiss = pointMiss;
	}
	public Examiner(int numberMiss, int pointMiss) {
		super();
		this.numberMiss = numberMiss;
		this.pointMiss = pointMiss;
	}
	@Override
	public String toString() {
		return "Examiner [numberMiss=" + numberMiss + ", pointMiss=" + pointMiss + "]";
	}
	
	

}
