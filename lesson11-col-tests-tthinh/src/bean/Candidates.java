package bean;

public class Candidates {
	private int id;
	private int amountOfJudge;
	private double c1;
	private double c2;
	private double c3;
	
	public Candidates() {
	}

	public Candidates(int id, int amountOfJudge, double c1, double c2, double c3) {
		super();
		this.id = id;
		this.amountOfJudge = amountOfJudge;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmountOfJudge() {
		return amountOfJudge;
	}

	public void setAmountOfJudge(int amountOfJudge) {
		this.amountOfJudge = amountOfJudge;
	}

	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	public double getC2() {
		return c2;
	}

	public void setC2(double c2) {
		this.c2 = c2;
	}

	public double getC3() {
		return c3;
	}

	public void setC3(double c3) {
		this.c3 = c3;
	}

	@Override
	public String toString() {
		return "Candidates [id=" + id + ", amountOfJudge=" + amountOfJudge + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3
				+ "]";
	}
	
	
}
