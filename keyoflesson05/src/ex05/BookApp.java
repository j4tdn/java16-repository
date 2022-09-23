package ex05;

import java.util.Arrays;

import bean.ClassicalBook;

public class BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book boolsByPublisher;
	}

	private static Book[] findBooks(Book[] books, String publisher) {
		Book[] result = new Book[book.length];
		int k = 0;
		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	private static Book[] initial() {
		return new Book[] { 
				new ClassicalBook("SGKA1", 22d, "Nhi Dong", true),
				new ClassicalBook("SGKB2", 16d, "Nhi Dong", true), 
				new ClassicalBook("SGKC3", 11d, "Lac Viet", false),
				new ClassicalBook("SGKD4", 24d, "Nhi Dong", true), 
				new ReferenceBook("STKE1", 44, "Nhi Dong", 5),
				new ReferenceBook("STKR2", 15, "Sao Mai", 8), 
				new ReferenceBook("STKT3", 66, "Nhi Dong", 5),

		};
	}

	private static void printf(Book[] books) {
		for (Book book : books)
			System.out.println(book);
	}
}
