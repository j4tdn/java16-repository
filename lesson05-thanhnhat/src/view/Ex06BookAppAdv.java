package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex06BookAppAdv {
	public static void main(String[] args) {
		
		Book[] books = initial();
		
		
		System.out.println("============");
		
		
		
		Book[] booksByPublisher = findBooks(books, book -> "Sao mai".equals(book.getPublisher()));
		printf(booksByPublisher);
		
		System.out.println("============");
		
		Book[] booksByLtPrice = findBooks(books, book ->book.getPrice() >50);
		printf(booksByLtPrice);
	}
	private static Book[] initial() {
		return new Book[] { new ClassicalBook("SGK1", 12d, "Nhi đồng", false),
				new ClassicalBook("SGK2", 68d, "Lạc việt", true), new ClassicalBook("SGK3", 55d, "Lạc hồng", false),
				new ClassicalBook("SGK4", 46d, "Nhi đồng", true), new ReferenceBook("STK1", 44d, "Nhi đồng", 5),
				new ReferenceBook("STK2", 61d, "Sao mai", 7), new ReferenceBook("STK3", 33d, "Lạc việt", 8) };
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
	// strategy pattern
	private static Book[] findBooks(Book[] books, BookConditon condition) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (condition.text(book)) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

//Tìm sách NXB Nhi Đồng
	private static Book[] findBooks(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
}
