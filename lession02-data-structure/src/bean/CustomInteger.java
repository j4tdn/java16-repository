package bean;

public class CustomInteger {
	public int value; //HEAP
	
	public CustomInteger(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + value ;
}
}
