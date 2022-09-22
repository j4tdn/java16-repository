package bean;

public class ClassialBook extends Book {
	private boolean status;

	public ClassialBook() {

	}
	// this :đối tượng hiện tại
	// : gọi các thuộc tính ở class hiện tại và class/interface cha.
	// super :đối tượng cha
	// : gọi các thuộc tính , ở class/interface cha

	public ClassialBook(String CustomerId, double price, String publisher, boolean status) {
		super(CustomerId, price, publisher);
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
