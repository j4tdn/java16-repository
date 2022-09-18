package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {
	// instanceof
	// book.getId().startWith("SGK");
	// book.getClass() = ClassicalBook.class;

	public static void main(String[] args) {
		Book[] books = initial();

		Book[] booksByPublisher = findBooks(books, "Nhi Đồng");
		printf(booksByPublisher);

		System.out.println("------------------------");
		Book[] booksByPrice = findBooks(books, 50);
		printf(booksByPrice);

		System.out.println("------------------------");
		Book[] booksByPriceFromTo = findBooks(books, 100, 200);
		printf(booksByPriceFromTo);

	}

	// 1. Tìm toàn bộ sách thuộc NXB Nhi Đồng
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

	// 2. Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	private static Book[] findBooks(Book[] books, double ltPrice) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() < ltPrice) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// 3. Tìm toàn bộ sách có đơn giá nhỏ từ 100 đến 200
	private static Book[] findBooks(Book[] books, double priceFrom, double priceTo) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() >= priceFrom && book.getPrice() <= priceTo) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	private static double bill(Book... books) {
		double totalOfMoney = 0;
		for (Book book : books) {
			double price = book.getPrice();
			if (book.getId().startsWith("SGK")) {
				ClassicalBook cBook = (ClassicalBook) book;
				if (!cBook.isStatus()) {
					price *= 0.7;
				}
			}
			if (book.getId().startsWith("STK")) {
				ReferenceBook rBook = (ReferenceBook) book;
				price *= (1 + rBook.getTax());
			}
			totalOfMoney += price;
		}
		return totalOfMoney;
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
