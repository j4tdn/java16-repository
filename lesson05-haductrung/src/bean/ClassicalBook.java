package bean;

public class ClassicalBook extends Book {// không kế thừa được private nhưng có thể truy cập được
	private boolean status;

	public ClassicalBook() {
		// TODO Auto-generated constructor stub
	}

	// this: đối tượng hiện tại
	// : có thể gọi các thuộc tính và hàm ở class hiện tại và class/interface cha
	// super: đối tượng cha
	// : gọi được các thuộc tính, hàm ở class/ interface cha
	// this, super: gọi được các hàm khởi tạo của nhau
	public ClassicalBook(String id, double price, String publisher, boolean status) {
		super(id, price, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString()+ " , " + status; 
	}

}
