package ex05;

public class Book {

	private String idbook;
	private float price;
	private String pubcompany;
	
	public Book()
	{
		
	}

	public Book(String idbook, float price, String pubcompany) {
		super();
		this.idbook = idbook;
		this.price = price;
		this.pubcompany = pubcompany;
	}

	public String getIdbook() {
		return idbook;
	}

	public void setIdbook(String idbook) {
		this.idbook = idbook;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPubcompany() {
		return pubcompany;
	}

	public void setPubcompany(String pubcompany) {
		this.pubcompany = pubcompany;
	}
	
	
}
