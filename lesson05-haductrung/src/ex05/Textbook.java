package ex05;

public class Textbook {
	private String IdBook;
	private int Price;
	private String Publish;
	private String Condition;
	
	public Textbook() {
		// TODO Auto-generated constructor stub
	}
	public Textbook(String IdBook, int Price, String Publish, String Condition) {
		this.IdBook=IdBook;
		this.Price=Price;
		this.Publish=Publish;
		this.Condition=Condition;
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
	public String getCondition() {
		return Condition;
	}
	public void setCondition(String condition) {
		Condition = condition;
	}
	@Override
	public String toString() {
		return "Textbook [IdBook=" + IdBook + ", Price=" + Price + ", Publish=" + Publish + ", Condition=" + Condition
				+ "]";
	}
	

}
