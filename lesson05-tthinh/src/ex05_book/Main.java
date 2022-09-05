package ex05_book;

public class Main {
	public static void main(String[] args) {
		TextBook tx1 = new TextBook("SGK", 100, "Kim Dong", "Moi");
		TextBook tx2 = new TextBook("SGK", 200, "Viet Nam", "Cu");
		TextBook tx3 = new TextBook("SGK", 300, "Da Nang", "Moi");
		
		ReferenceBook rf1 = new ReferenceBook("STK", 500, "Nhi Dong", 0.5);
		ReferenceBook rf2 = new ReferenceBook("STK", 600, "Nhi Dong", 0.10);
		Book[] books = {tx1,tx2,tx3,rf1,rf2};
		
		BookUtil.findPublishCompany(books);
		System.out.println("===============");
		BookUtil.findBookLessThan50(books);
		System.out.println("===============");
		BookUtil.findBookPriceFrom100To200(books);
	}
	
	
	
	
}
