package bean;

public class NbStas {
	private int number;
	private int count;
	
	public NbStas() {
		// TODO Auto-generated constructor stub
	}

	public NbStas(int number, int count) {
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
	public void plusCount() {
		this.count++;//lấy 1 đối tượng.phusCount là lấy đối tượng chính nó .Count +1
	}

	@Override
	public String toString() {
		return "\nNbStas [number=" + number + ", count=" + count + "]";
	}
	

}
