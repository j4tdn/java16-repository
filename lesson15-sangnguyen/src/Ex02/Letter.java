package Ex02;

public class Letter {
	private char value;
	private int count;
	
	public Letter() {
		
	}
	
	public Letter(char value, int count) {
		super();
		this.value = value;
		this.count = count;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}

