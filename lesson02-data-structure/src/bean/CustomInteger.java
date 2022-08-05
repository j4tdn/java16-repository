package bean;

public class CustomInteger {
	public int value; // HEAP

	// constructor ==> no data return
	public CustomInteger(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value + "";
	}
}
