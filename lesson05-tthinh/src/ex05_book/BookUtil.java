package ex05_book;

public class BookUtil {
	public static void findPublishCompany(Book[] books) {
		for (Book book : books) {
			if ("Nhi Dong".equalsIgnoreCase(book.getPublishingCompany())) {
				System.out.println(book);
			}
		}
	}

	public static void findBookLessThan50(Book[] books) {
		for (Book book : books) {
			if (book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}

	public static void findBookPriceFrom100To200(Book[] books) {
		for (Book book : books) {
			if (book.getPrice() >= 100 && book.getPrice() <= 200) {
				System.out.println(book);
			}
		}
	}

}
