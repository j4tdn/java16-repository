package bean;

public class CustomeInteger {
	public int value;
	
	// hàm khởi tạo(constructor) không có kiểu dữ liệu trả về
	public  CustomeInteger(int pvalue) {
		this.value=pvalue;
	}
	
	@Override
	public String toString() {
		return ""+value;
	}
}
