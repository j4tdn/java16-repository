package ex05;

import java.util.ArrayList;

public class BookManagement {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		Textbook tb1 = new Textbook("SGK01", 40000, "Kim Đồng", "mới");
		Textbook tb2 = new Textbook("SGK02", 40000, "Nhi Đồng", "cũ");
		Textbook tb3 = new Textbook("SGK03", 120000, "Nhi Đồng", "mới");
		ReferenceBooks rb1 = new ReferenceBooks("STk01", 40000, "Kim Đồng", 3);
		ReferenceBooks rb2 = new ReferenceBooks("STk01", 90000, "Nhi Đồng", 5);
		books.add(tb1);
		books.add(tb2);
		books.add(tb3);
		books.add(rb1);
		books.add(rb1);
		for (Book book : books) {
			System.out.println(book.toString());
		}

		System.out.println("1. All books belong to the publisher Nhi Đồng");
		BookUtil.findBook(books);

		System.out.println("===============================================");
		System.out.println("2. Books cost less than 50");
		BookUtil.priceLessThan50(books);
		
		System.out.println("===============================================");
		System.out.println("3. Textbook have cost 100-200");
		BookUtil.checkTextbookPrices(books);
	}

	

}
