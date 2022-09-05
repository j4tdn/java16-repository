package ex05;

public class TextBook extends Book {
	private String status;

	public TextBook() {
		super();
	}

	public TextBook(String idBook, float price, String publishingCompany, String status) {
		super(idBook, price, publishingCompany);
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
		return super.toString() + " Status: " + this.status;
	}

}
