package bean;

public class CustomInteger {
	public int value; //HEAP
	
	//construcor ==> không có KDL trả về
	
	public CustomInteger(int pValue) {
		this.value =pValue;
		
	}
	@Override
	public String toString() {
		return "" + this.value;
	}

}
