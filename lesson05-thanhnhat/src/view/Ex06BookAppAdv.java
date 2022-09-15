package view;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex06BookAppAdv {
	public static void main(String[] args) {
		
		Book[] books = initial();
		// Anonymous class => Tạo đối tượng cho interface
		BookCondition cd = new BookCondition() {
			
			@Override
			public boolean test(Book book) {
				return "Nhi Đồng".equals(book.getPublisher());
			}
		};
		
		// lambda expression
	
		Book[] booksByPublisher = findbooks(books, book -> "Nhi Đồng".equals(book.getPublisher()));
		printf(booksByPublisher);

		System.out.println("=========");
		Book[] booksByLtPrice = findbooks(books, book -> book.getPrice()<50);
		printf(booksByLtPrice);
		
	}

	private static Book[] findbooks(Book[] books, BookCondition condition) {
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
		return new Book[] { new ClassicalBook("SGK1", 44d, "Nhi Đồng", true),
				new ClassicalBook("SGK2", 65d, "Sao Mai", false), new ClassicalBook("SGK3", 12d, "Lạc Việt", true),
				new ClassicalBook("SGK4", 108d, "Nhi Đồng", true), new ReferenceBook("STK1", 66, "Nhi Đồng", 4),
				new ReferenceBook("STK2", 22, "Lạc Việt", 2), new ReferenceBook("STK3", 33, "Sao Mai", 5),
				new ReferenceBook("STK4", 45, "Nhi Đồng", 3)

		};
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
