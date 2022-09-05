package ex05;

public class App {
	public static void main(String[] args) {
		TextBook t1 = new TextBook("111", 100, "GD", "new");
		TextBook t2 = new TextBook("112", 120, "GD", "new");
		TextBook t3 = new TextBook("113", 130, "GD", "new");
		
		ReferenceBook r1 = new ReferenceBook("10", 30, "ND", 2);
		ReferenceBook r2 = new ReferenceBook("15", 70, "ND", 3);
		
		Father[] book = {t1,t2,t3,r1,r2};
		search(book);
		search1(book);
		search2(book);
	}
	private static void search(Father...fathers) {
		for(Father s: fathers) {
			if(s.getPublishingCompany() == "ND") {
				System.out.println(s.toString());
			}
				
		}
	}
	private static void search1(Father...fathers) {
		for(Father s: fathers) {
			if(s.getPrice() < 50) {
				System.out.println(s.toString());
			}
				
		}
	}
	private static void search2(Father...fathers) {
		for(Father s: fathers) {
			if(s.getPublishingCompany() == "SGK" ) {
				if(100<s.getPrice()) {
					if(s.getPrice()<200) {
						System.out.println(s.toString());
					}
					
				}
				
			}
				
		}
	}
	private static int sum(Father...fathers) {
		int sum =0;
		return sum;
	}
	

}
