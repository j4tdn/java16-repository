package bean;

public class CustomInteger {
	
	public int value;
	
	public CustomInteger(int pValue) {
		this.value = pValue;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}
