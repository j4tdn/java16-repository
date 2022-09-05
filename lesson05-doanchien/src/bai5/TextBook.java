package bai5;

public class TextBook extends Book{
	private int id;
	private double price;
	private String pushCompany;
	private String status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(int id, double price, String pushCompany, String status) {
		super();
		this.id = id;
		this.price = price;
		this.pushCompany = pushCompany;
		this.status = status;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + id + ", price=" + price + ", pushCompany=" + pushCompany + ", status=" + status + "]";
	}

	@Override
	public int calPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
