package ex05;

public class Father {
	private String id;
	private int price;
	private String publishingCompany;
	
	public Father() {
		
	}

	public Father(String id, int price, String publishingCompany) {
		super();
		this.id = id;
		this.price = price;
		this.publishingCompany = publishingCompany;
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

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	@Override
	public String toString() {
		return "Father [id=" + id + ", price=" + price + ", publishingCompany=" + publishingCompany + "]";
	}
	

}
