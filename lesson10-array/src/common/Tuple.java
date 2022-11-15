package common;

public class Tuple implements Comparable<Tuple> {
	private int max;
	private int min;
	
	public Tuple() {
		// TODO Auto-generated constructor stub
	}

	public Tuple(int max, int min) {
		this.max = max;
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "Tuple [max=" + max + ", min=" + min + "]";
	}
	
	@Override
	public int compareTo(Tuple o) {
		Tuple t1 = this;
		Tuple t2 = o;
		
		return t1.getMin() - t2.getMin();
	}
}
