package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex06BookAppAdv {
	// Strategy Design Pattern
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] booksByPublisher = findBooks(books, book -> "Sao Mai".equals(book.getPublisher()));
		printf(booksByPublisher);

		System.out.println("========================");
		Book[] booksByLtPrice = findBooks(books, book -> book.getPrice() < 50);
		printf(booksByLtPrice);
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
		return new Book[] { new ClassicalBook("SGKA1", 123d, "Nhi Dong", true),
				new ClassicalBook("SGKB2", 36d, "Lac Viet", false), new ClassicalBook("SGKC3", 18d, "Nhi Dong", true),
				new ClassicalBook("SGKD4", 44d, "Nhi Dong", true), new ReferenceBook("STKR1", 66, "Nhi Dong", 5),
				new ReferenceBook("STKR2", 88, "Sao Mai", 8), new ReferenceBook("STKR3", 77, "Nhi Dong", 5), };
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
