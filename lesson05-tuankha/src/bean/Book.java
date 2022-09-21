package bean;

public abstract class Book {
	String bookID;
	int prices;
	String publishers;
	
	
	public String getBookID() {
		return this.bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	abstract public float getPrices();
	public void setPrices(int prices) {
		this.prices = prices;
	}
	public String getPublishers() {
		return this.publishers;
	}
	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}

	
	
	
	
}
