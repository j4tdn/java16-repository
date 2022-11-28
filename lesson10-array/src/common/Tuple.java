package common;

public class Tuple implements Comparable<Tuple> {
	private int max = Integer.MAX_VALUE;
	private int min = Integer.MIN_VALUE;
	
	public Tuple(int max, int min) {
		super();
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
		return max + " " + min ;
	}

	@Override
	public int compareTo(Tuple o) {
		return this.max - o.max;
	}
		
}
