package ex05book;

public class TextBooks {
	public String id;
	private double price;
	private String publisher;
	private String status;
	
public TextBooks() {
	// TODO Auto-generated constructor stub
}

public TextBooks(String id, double price, String publisher, String status) {
	this.id = id;
	this.price = price;
	this.publisher = publisher;
	this.status = status;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getPublisher() {
	return publisher;
}

public void setPublisher(String publisher) {
	this.publisher = publisher;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

@Override
public String toString() {
	return "TextBooks [id=" + id + ", price=" + price + ", publisher=" + publisher + ", status=" + status + "]";
}

}
