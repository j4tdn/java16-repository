package ex05;

public class GkBook extends Book {
	String status;
	public GkBook() {
		
	}

	public GkBook(String idbook, int price, String nxb,String status) {
		//super();
		this.idbook = idbook;
		this.price = price;
		this.nxb = nxb;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "GkBook [status=" + status + ", idbook=" + idbook + ", price=" + price + ", nxb=" + nxb + "]";
	}
	
	
	
	

}
