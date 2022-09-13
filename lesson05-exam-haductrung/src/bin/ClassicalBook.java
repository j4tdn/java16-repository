package bin;

public class ClassicalBook extends Book {
	
	private boolean status;
	
	public ClassicalBook() {
		// TODO Auto-generated constructor stub
	}

	public ClassicalBook(String id,double price,String publisher,boolean status) {
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
