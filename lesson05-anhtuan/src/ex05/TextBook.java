package ex05;

public class TextBook extends Father {
	private String status;
	
	public TextBook() {
		
	}

	public TextBook(String id, int price, String publishingCompany, String status) {
		super(id, price, publishingCompany);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [status=" + status + "]";
	}
	

}
