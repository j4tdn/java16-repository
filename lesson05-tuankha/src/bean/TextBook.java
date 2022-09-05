package bean;

public class TextBook extends Book {
	String idHead = "SGK";
	boolean status;
	
	public static boolean NEW = true;
	public static boolean OLD = true;
	
	public TextBook(String bookID, int prices, String publishers, boolean status) {
		this.bookID = bookID;
		this.prices = prices;
		this.publishers = publishers;
		this.status = status;
	}
	
	public float getPrices() {
		if(status == TextBook.OLD) {
			return (float) (this.prices - (this.prices*0.3));
		}
		return this.prices;
	}

	public String getIdHead() {
		return idHead;
	}

	public void setIdHead(String idHead) {
		this.idHead = idHead;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [idHead=" + this.idHead + ", status=" + status + ", bookID=" + bookID + ", prices=" + prices
				+ ", publishers=" + publishers + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
