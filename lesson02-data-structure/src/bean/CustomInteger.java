package bean;

public class CustomInteger {
	public int value;

	public CustomInteger(int pValue) {
		this.value = pValue;
	}

	public CustomInteger() {

	}

	@Override
	public String toString() {
		return value + "";
	}
}
