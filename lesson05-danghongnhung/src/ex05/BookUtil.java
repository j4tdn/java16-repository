package ex05;

import java.util.ArrayList;

public class BookUtil {
	public static void findBook(ArrayList<Book> books) {
		for (Book book : books) {
			if (book.getPublishingCompany().equals("Nhi Đồng")) {
				System.out.println(book.toString());
			}
		}

	}

	public static void priceLessThan50(ArrayList<Book> books) {
		for (Book book : books) {
			if (book.getPrice() < 50000) {
				System.out.println(book.toString());
			}
		}
	}

	public static void checkTextbookPrices(ArrayList<Book> books) {
		for (Book book : books) {
			if (book.getIdBook().contains("SGK") && book.getPrice() >= 100 &&  book.getPrice() <= 200) {
				System.out.println(book.toString());
			}
		}
	}
	
}
