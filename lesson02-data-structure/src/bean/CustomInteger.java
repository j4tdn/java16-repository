package bean;

public class CustomInteger {
	public int value; // HEAP

	// Contrustor k có KDL trả về
	public CustomInteger (int pValue) {
		this.value = pValue;
	}
	
	public String toString() {
		return "" + this.value;
	}
	

	

}
