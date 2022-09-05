package ex05;

public class Book {
	protected String idBook;
	protected float price;
	protected String publishingCompany;

	public Book() {
		super();
	}

	public Book(String idBook, float price, String publishingCompany) {
		super();
		this.idBook = idBook;
		this.price = price;
		this.publishingCompany = publishingCompany;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", price=" + price + ", publishingCompany=" + publishingCompany + "]";
	}

}
