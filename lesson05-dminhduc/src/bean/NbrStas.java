package bean;

public class NbrStas {

	private int number;
	private int count;
	public NbrStas(int number, int count) {
		super();
		this.number = number;
		this.count = count;
	}
	
	public NbrStas()
	{
		
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
	public void plusCount()
	{
		this.count ++;
	}

	@Override
	public String toString() {
		return "\n NbrStas [number=" + number + ", count=" + count + "]";
	}
}
