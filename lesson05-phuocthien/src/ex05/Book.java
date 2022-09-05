package ex05;

public class Book {
	String idbook;
	int price;
	String nxb;
	public Book() {
		
	}
	public Book(String idbook, int price, String nxb) {
		super();
		this.idbook = idbook;
		this.price = price;
		this.nxb = nxb;
	}
	public String getIdbook() {
		return idbook;
	}
	public void setIdbook(String idbook) {
		this.idbook = idbook;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNxb() {
		return nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	

}
