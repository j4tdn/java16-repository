package ex01;

public class Tuple {
	private double first;
	private double second;
	
	public Tuple() {
		
	}
	public Tuple(double first, double second) {
		super();
		this.first = first;
		this.second = second;
	}
	public double getFirst() {
		return first;
	}
	public void setFirst(double first) {
		this.first = first;
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "Tuple [first=" + first + ", second=" + second + "]";
	}
	
	
}
