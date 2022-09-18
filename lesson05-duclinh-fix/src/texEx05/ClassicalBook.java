package texEx05;

public class ClassicalBook extends Book {
	private boolean status;
	public ClassicalBook() {
		// TODO Auto-generated constructor stub
	}
	
	public ClassicalBook(String id, double price, String publiser, boolean status) {
		super(id, price, publiser);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return status;
	}
	public String toString() {
		return super.toString() + ", " +status;
	}
}
