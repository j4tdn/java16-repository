package bai5;

public class ReferenceBook extends Book{
	private int id;
	private double price;
	private String pushCompany;
	private String vat;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(int id, double price, String pushCompany, String vat) {
		super();
		this.id = id;
		this.price = price;
		this.pushCompany = pushCompany;
		this.vat = vat;
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

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	@Override
	public String toString() {
		return "ReferenceBook [id=" + id + ", price=" + price + ", pushCompany=" + pushCompany + ", vat=" + vat + "]";
	}

	@Override
	public int calPrice() {
		
		return (0);
	}
	
	
}
