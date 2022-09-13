package bin;

public class NbStas {
	private int number;
	private int count;
	
	public NbStas() {
		// TODO Auto-generated constructor stub
	}

	public NbStas(int number, int count) {

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
		return "\nNbStas [number=" + number + ", count=" + count + "]";
	}
	

}
