package bean;

public class ClassicalBook extends Book {
	private boolean status;
	public ClassicalBook() {
		
	}
	
	//this : doi tuong hien tai=>goi cac thuoc tinh class hien tai & class,interface cha
	//supper: doi tuong o class, interface cha
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
		return "ClassicalBook [status=" + status + "]";
	}
	

	
  
}
