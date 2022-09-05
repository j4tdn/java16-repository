package ex05;

public class Demo {
	public static void main(String[] args) {
		TextBook[] tb = new TextBook[3];
		tb[0] = new TextBook("SGK00", 159, "Nhi Đồng", true);
		tb[1] = new TextBook("SGK01", 26, "Thiếu Nhi", false);
		tb[2] = new TextBook("SGK02", 38, "Nhân Trí", false);
		ReferenceBook[] rb = new ReferenceBook[2];
		rb[0] = new ReferenceBook("STK00", 97, "Nhi Đồng", 0.15);
		rb[1] = new ReferenceBook("STK01", 56, "Nhân Trí", 0.33);
		Book[] books = new Book[5];
		for (int i = 0; i < 3; i++)
			books[i] = tb[i];
		books[3] = rb[0];
		books[4] = rb[1];

		for(Book x:BookUtil.findBooksOfPublisher(books, "Nhi Đồng")) {
			if (x != null)
				System.out.println(x);
		}
		
		for(Book x:BookUtil.findBooksWithLessPrice(books, 50)) {
			if (x != null)
				System.out.println(x);
		}
		
		for(Book x : BookUtil.findTextBooksOfPrice100To200(books)) {
			if (x != null)
				System.out.println(x);
		}
		
		System.out.println(BookUtil.calculateTotalPrice((TextBook)books[1], (ReferenceBook) books[3]));
	}
}
