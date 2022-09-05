package problem05.dto;

public abstract class Book {
	String id;
	Double price;
	String publisher;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Book() {
	}

	public Book(String id, Double price, String publisher) {
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}

}
