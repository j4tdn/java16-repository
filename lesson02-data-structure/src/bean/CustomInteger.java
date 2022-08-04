package bean;

public class CustomInteger {
	public int value; // HEAP
	
	// constructor ==> không có KDL trả về 
	public CustomInteger(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "" + this.value;
	}
}
