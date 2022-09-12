package bean;

public class NbrStas {
	private int number;
	private int count;
	
	public NbrStas() {
		
	}

	public NbrStas(int number, int count) {
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
	public void plusCount() {
		this.count++;
	}

	@Override
	public String toString() {
		return "\nNbrStas [number=" + number + ", count=" + count + "]";
	}
	

}
