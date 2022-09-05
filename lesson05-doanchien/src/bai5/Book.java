package bai5;

public abstract class Book {
	private int id;
	private double price;
	private String pushCompany;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, double price, String pushCompany) {
		super();
		this.id = id;
		this.price = price;
		this.pushCompany = pushCompany;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPushCompany() {
		return pushCompany;
	}

	public void setPushCompany(String pushCompany) {
		this.pushCompany = pushCompany;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", pushCompany=" + pushCompany + "]";
	}
	
	public abstract int calPrice();
}
