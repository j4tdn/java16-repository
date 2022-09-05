package ex05;

public class TextBook extends Book {
	private double tax;
	private String status;

	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	

	public TextBook(String bookid, double price, String producer, String status) {
		super(bookid, price, producer);
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
		return "bookid:" + getBookid() + ", price:" + getPrice() + ", producer:" + getProducer() +"status: " + status;
	}


}
