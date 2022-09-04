package ex04management;



public class President extends People {

	private int jobcoefficient;
	
	
	public President()
	{
		
	}
	
	@Override
	public String toString() {
		return "President [jobcoefficient=" + jobcoefficient + ", calSalary()=" + calSalary() + ", getName()="
				+ getName() + ", getDatebirth()=" + getDatebirth() + "]";
	}

	public int getJobcoefficient() {
		return jobcoefficient;
	}

	public void setJobcoefficient(int jobcoefficient) {
		this.jobcoefficient = jobcoefficient;
	}

	public President(int jobcoefficient) {
		super();
		this.jobcoefficient = jobcoefficient;
	}

	@Override
	public float calSalary() {
		// TODO Auto-generated method stub
		return ((float)getSalary() + (float)jobcoefficient) * 1250000;
	}

	
}
