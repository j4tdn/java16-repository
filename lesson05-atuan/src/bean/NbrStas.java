package bean;

public class NbrStas {
	private int number;
	private int count;
	
	public NbrStas() {
		
	}

	public NbrStas(int number, int count) {
		super();
		this.number = number;
		this.count = count;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "NbrStas [number=" + number + ", count=" + count + "]";
	}
	

}
