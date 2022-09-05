package ex05;

public class TkBook extends Book{
	
	int tax;

	public TkBook() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public TkBook(String idbook, int price, String nxb,int tax) {
		this.idbook = idbook;
		this.price = price;
		this.nxb = nxb;
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "TkBook [tax=" + tax + ", idbook=" + idbook + ", price=" + price + ", nxb=" + nxb + "]";
	}
	
	

}
