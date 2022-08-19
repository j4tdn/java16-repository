package bean;

public class Digit {
	private int value;
	private int rowPos;
	private int colPos;

	public Digit() {
	}

	public Digit(int value, int rowPos, int colPos) {
		this.value = value;
		this.rowPos = rowPos;
		this.colPos = colPos;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getRowPos() {
		return rowPos;
	}

	public void setRowPos(int rowPos) {
		this.rowPos = rowPos;
	}

	public int getColPos() {
		return colPos;
	}

	public void setColPos(int colPos) {
		this.colPos = colPos;
	}

	@Override
	public String toString() {
		return "digits[" + getRowPos() + "]" + "[" + getColPos() + "] = " + getValue();
	}
}
