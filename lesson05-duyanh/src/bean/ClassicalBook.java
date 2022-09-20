package bean;

public class ClassicalBook extends Book {
	// tinh trang moi cu

	private boolean status;
	
	public ClassicalBook() {
		// TODO Auto-generated constructor stub
	}
	
	public ClassicalBook(String id, double price, String publisher, boolean tax) {
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
		return super.toString() + " , " + status;
	}
	
	
}
