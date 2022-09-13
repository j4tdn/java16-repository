package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex06BookAppAdv {

	public static void main(String[] args) {
		Book[] books = initial();
		// anonymous class => tạo đối tượng cho interface
//		BookCondition cd = new BookCondition() {
//
//			@Override
//			public boolean test(Book book) {
//				// TODO Auto-generated method stub
//				return "Nhi Đồng".equals(book.getPublisher());
//			}
//		};
		// lambda expression

		// Book[] booksByPublisher = findBooks(books,cd);
		Book[] booksByPublisher = findBooks(books, book -> "Nhi Đồng".equals(book.getPublisher()));
		printf(booksByPublisher);
		System.out.println("=====================");
		Book[] booksByLtPrice = findBooks(books, book -> book.getPrice() < 50);
		printf(booksByLtPrice);
	}

	// stratery pattern

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
		return new Book[] { new ClassicalBook("SGK123", 123d, "Nhi Đồng", true),
				new ClassicalBook("SGK1235", 1233d, "Nhi2 Đồng", false),
				new ClassicalBook("SGK1234", 1223d, "Nhi Đồng", true), new ReferenceBook("STKR1", 66, "Nhi Đồng", 15),
				new ReferenceBook("STKR1", 26, "Nhi2 Đồng", 5), new ReferenceBook("STKR1", 36, "Nhi Đồng", 15)

		};
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
