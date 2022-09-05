package ex05;

public abstract class Book {
	private String id;
	private double cost;
	private String publishing;

	public Book() {

	}

	public Book(String id, double cost, String publishing) {
		this.id = id;
		this.cost = cost;
		this.publishing = publishing;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", cost=" + cost + ", publisher=" + publishing + "]";
	}

	protected abstract double intoMoney();

}
