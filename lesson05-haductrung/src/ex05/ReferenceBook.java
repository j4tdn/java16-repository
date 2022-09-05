package ex05;

public class ReferenceBook extends Textbook {
	private String IdBook;
	private int Price;
	private String Publish;
	private double Tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}
	public ReferenceBook(String IdBook, int Price, String Publish, double Tax) {
		this.IdBook=IdBook;
		this.Price=Price;
		this.Publish=Publish;
		this.Tax=Tax;
	}
	public String getIdBook() {
		return IdBook;
	}
	public void setIdBook(String idBook) {
		IdBook = idBook;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getPublish() {
		return Publish;
	}
	public void setPublish(String publish) {
		Publish = publish;
	}
	public double getTax() {
		return Tax;
	}
	public void setTax(int tax) {
		Tax = tax;
	}
	@Override
	public String toString() {
		return "ReferenceBook [IdBook=" + IdBook + ", Price=" + Price + ", Publish=" + Publish + ", Tax=" + Tax + "]";
	}
	
}
