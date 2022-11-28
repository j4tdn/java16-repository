package view;

import java.util.Arrays;
import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex06BookAppdv {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] bookByPublisher = findBook(books, "Nhi Đồng");
		printf(bookByPublisher);

		System.out.println("=========================================");
		Book[] bookByLtPrice = findBook(books, 50);
		printf(bookByLtPrice);
	}
	public static Book[] initial() {
		return new Book[] { new ClassicalBook("SGKA1", 22d, "Nhi Đồng", true),
				new ClassicalBook("SGKB2", 36d, "Lạc Việt", false), new ClassicalBook("SGKC3", 18d, "Nhi Đồng", true),
				new ClassicalBook("SGKD4", 44d, "Nhi Đồng", true), new ReferenceBook("STKR1", 66, "Nhi Đồng", 5),
				new ReferenceBook("STKR2", 88, "Kim Đồng", 8), new ReferenceBook("STKR3", 77, "Nhi Đồng", 5),

		};

	}

	// Sachs thuộc nhà xuất bản nhi đồng
	public static Book[] findBook(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
				result[k++] = book;
			}

		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	public static Book[] findBook(Book[] books, double ltPrice) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() < ltPrice) {
				result[k++] = book;
			}

		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	public static void printf(Book[] books) {
		for (Book book : books)
			System.out.println(book);
	}
}
