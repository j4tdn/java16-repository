package bean;

public abstract class People {
	String name;
	String date;
	float salaryIndex;
	
	public abstract void input();
	
	public abstract double getSalary();
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		String tmp[] = this.getClass().getName().split("[.]", 0);
		return tmp[tmp.length-1] + "  :" + this.name + " || " + this.date;
	}
	
}
