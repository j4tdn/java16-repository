package library;

public abstract class Company {
	protected String bookcode;
	protected int price;
	protected String company;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public String getBookcode() {
		return bookcode;
	}
	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Company(String bookcode, int price, String company) {
		super();
		this.bookcode = bookcode;
		this.price = price;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Company [bookcode=" + bookcode + ", price=" + price + ", company=" + company + "]";
	}
	
	void getAllCompany() {
		if(getCompany() ==  "KIMDONG") {
			System.out.println("Sach thuoc nha xuat ban Kim Dong : " + getBookcode());
		}
	}
	
	void getAllBookLessThan50() {
		if(getPrice() < 50) {
			System.out.println("Toan bo sach co gia nho hon 50 : " + getBookcode() + " gia :" + getPrice() );
		}
		
	}
	void textBooksPrice100To200() {
		if(getPrice() < 200 && getPrice() > 100 ) {
			System.out.println("tat ca cac sach giao khoa co gia hon 100 va be hon 200 : " +"[ " + getBookcode() + " ] gia " + getPrice());
			
		}
	}
	
	
	
	
	
	
	

}
