package human;

public class President extends Person {

	private float jobCoefficient;

	public President() {
		// TODO Auto-generated constructor stub
	}

	public President(String name, String date, float numOfSalary, float jobCoefficient) {
		super(name, date, numOfSalary);
		this.jobCoefficient = jobCoefficient;
	}

	public float getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(float jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}

	@Override
	public String toString() {
		return "President [jobCoefficient=" + jobCoefficient + ", getName()=" + getName() + ", getDate()=" + getDate()
				+ ", getNumOfSalary()=" + getNumOfSalary() + "]";
	}

	@Override
	public double calSalary() {
		return (getNumOfSalary() + getJobCoefficient()) * 3000000;
	}

}
