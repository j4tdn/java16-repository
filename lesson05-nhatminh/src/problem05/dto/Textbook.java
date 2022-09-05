package problem05.dto;

public class Textbook extends Book {
	boolean status;

	public Textbook() {
		super();
	}

	public Textbook(String id, Double price, String publisher, boolean status) {
		super(id, price, publisher);
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		if (status == true)
			return "Textbook [id=" + id + ", price=" + price + ", publisher=" + publisher + ", status=new]";
		else
			return "Textbook [id=" + id + ", price=" + price + ", publisher=" + publisher + ", status=old]";
	}

}
