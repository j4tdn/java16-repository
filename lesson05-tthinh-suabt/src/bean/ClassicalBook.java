package bean;

public class ClassicalBook extends Book {
	private boolean status;

	public ClassicalBook() {
	}
	// this: đối tượng hiện tại
	// : gọi các thuộc tính, hàm ở class hiện tại và class/interface cha

	// super: đối tượng cha
	// : gọi các thuộc tính, hàm ở class/interface cha

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
		return super.toString() + "," + status;
	}

}
