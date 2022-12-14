package bean;

public class CustomInteger {
	public int value; // HEAP
	
	// contructor ==> khong co KDL tra ve
	public CustomInteger(int value) {
		this.value = value;	
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}
