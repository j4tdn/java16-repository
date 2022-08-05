package bean;

public class CustomInteger {
	public int value;
	
	public CustomInteger(int Value) {
		this.value = Value;
	}
	
	@Override
	public String toString() {
		return "" + this.value;
	}
}
