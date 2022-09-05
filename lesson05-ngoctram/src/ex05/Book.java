package ex05;

public class Book {
	private String id;
	private int price;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String id, int price, String publisher) {
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
	
}
