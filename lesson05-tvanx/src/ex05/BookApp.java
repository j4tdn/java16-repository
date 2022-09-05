package ex05;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK001",20000,"Nhi Đồng","new");
		TextBook tb2 = new TextBook("SGK001",30000,"Nhi Đồng","new");
		TextBook tb3 = new TextBook("SGK001",20000,"Sao Mai","new");
		
		ReferenceBook rb1 = new ReferenceBook("STK001", 20000, "Nhi Đồng", 1.2);
		ReferenceBook rb2 = new ReferenceBook("STK001", 30000, "Sao Mai", 1.3);
		
		Book[] list = {tb1,tb2,tb3,rb1,rb2};
		
	}
	
	private static void findProducer(Book B) {
		for(Book i : B) {
			if(i.getProducer()=="Nhi Đồng") {
				System.out.println(i);
			}
		}
	}
	private static void findprice50(Book B) {
		for(Book i : B) {
			if(i.getPrice()<50) {
				System.out.println(i);
			}
		}
	}
	private static void findpricein100to200(Book B) {
		for(Book i : B) {
			if(i.getPrice()>100 && i.getPrice()<200) {
				System.out.println(i);
			}
		}
	}
}
