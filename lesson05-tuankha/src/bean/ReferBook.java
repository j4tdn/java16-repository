package bean;

public class ReferBook extends Book{
	String idHead = "STK";
	float tax;

	public ReferBook(String bookID, int prices, String publishers, float tax) {
		this.bookID = bookID;
		this.prices = prices;
		this.publishers = publishers;
		this.tax = tax;
	}
	
	public float getPrices() {
		return this.prices * (float)(1 + this.tax/100);
	}

	public String getIdHead() {
		return idHead;
	}

	public void setIdHead(String idHead) {
		this.idHead = idHead;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferBook [idHead=" + idHead + ", tax=" + tax + ", bookID=" + bookID + ", prices=" + prices
				+ ", publishers=" + publishers + "]";
	}
	
	

	
}
