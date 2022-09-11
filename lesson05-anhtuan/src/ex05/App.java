package ex05;

public class App {
	public static void main(String[] args) {
		TextBook tb[] = new TextBook[3];
		tb[0] = new TextBook("SGK", 100, "GD", "new");
		tb[1] = new TextBook("SGK", 120, "GD", "new");
		tb[2] = new TextBook("SGK", 130, "GD", "old");
		
		ReferenceBook rb[] = new ReferenceBook[2];
		rb[0] = new ReferenceBook("TK", 30, "ND", 2);
		rb[1] = new ReferenceBook("TK", 70, "ND", 3);
		
		
		Father[] book = new Father[5];
		for(int i = 0; i < 3; i++) {
			book[i] = tb[i];
			book[3] = rb[0];
			book[4] = rb[1];
		}
		for(int i = 0;i< book.length; i++) {
			System.out.println("===" + book[i]);
		}
		
		System.out.println("syso");
		search(book);
		System.out.println("syso1");
		search1(book);
		System.out.println("syso2");
		search2(book);
		sum1(tb);
		System.out.println(sum1(tb[1]) + sum2(rb[1]));
		
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
			if(s.getId() == "SGK" ) {
				if(100<s.getPrice()) {
					if(s.getPrice()<200) {
						System.out.println(s.toString());
					}
					
				}
				
			}
				
		}
	}
	private static double sum1(TextBook...textBooks) {
		double s = 0;
		for(TextBook i: textBooks) {
			if(i.getStatus() == "old") {
				s = (i.getPrice() * 0.3);
			}
			else {
				s = i.getPrice();
			}
		}
		return s;
	}
	private static double sum2(ReferenceBook...referenceBooks) {
		double s =0;
		for(ReferenceBook i : referenceBooks) {
			s = i.getPrice()*(1 +i.getTax());
		}
		return s;
	}
	
	
	
	

}
