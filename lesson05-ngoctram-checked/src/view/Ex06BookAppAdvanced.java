package view;

import java.util.Arrays;

import bean.Book;
import bean.BookCondition;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex06BookAppAdvanced {
	public static void main(String[] args) {
		Book[] books = initial();

		// lambda expression (parameter) -> { /*code block*/}
		Book[] booksByPublisher = findBooks(books, book -> "Sao Mai".equals(book.getPublisher()));
		printf(booksByPublisher);

		System.out.println("------------------------");
		Book[] booksByPrice = findBooks(books, book -> book.getPrice() < 50);
		printf(booksByPrice);

	}

	private static Book[] findBooks(Book[] books, BookCondition condition) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (condition.test(book)) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	private static Book[] initial() {
		return new Book[] { new ClassicalBook("SGK01", 23d, "Nhi Đồng", true),
				new ClassicalBook("SGK02", 37d, "Lạc Việt", false), new ClassicalBook("SGK03", 49d, "Nhi Đồng", false),
				new ReferenceBook("STK01", 66d, "Sao Mai"), new ReferenceBook("STK02", 159d, "Sao Mai"),
				new ReferenceBook("STK03", 39d, "Nhi Đồng"), };
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
