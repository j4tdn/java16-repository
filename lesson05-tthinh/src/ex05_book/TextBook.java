package ex05_book;

public class TextBook extends Book{
	private String status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, double price, String publishingCompany, String status) {
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
