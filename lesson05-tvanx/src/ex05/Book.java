package ex05;

public class Book {
	private String bookid;
	private double price;
	private String producer;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookid, double price, String producer) {
		this.bookid = bookid;
		this.price = price;
		this.producer = producer;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", price=" + price + ", producer=" + producer + "]";
	}
	
}	
