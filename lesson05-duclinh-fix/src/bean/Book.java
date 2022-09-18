package bean;

public class Book {
	private String id;
	private double price;
	private String publiser;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String id, double price, String publiser) {
		super();
		this.id = id;
		this.price = price;
		this.publiser = publiser;
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
	public String getPubliser() {
		return publiser;
	}
	public void setPubliser(String publiser) {
		this.publiser = publiser;
	}
	@Override
	public String toString() {
		return id + ", " + price +", " +publiser;
	}
	
}
