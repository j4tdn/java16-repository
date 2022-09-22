package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassialBook;
import bean.ReferenceBook;

public class BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] booksByPublisher = findBook(books, "Nhi Đồng");
		printf(booksByPublisher);
		System.out.println("=======");
		Book[] BookByPrice = findBook(books, 50);
		printf(booksByPublisher);
	}

	//
	private static Book[] findBook(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// tim toan bo sach co don gia < 50
	private static Book[] findBook(Book[] books, double ltPrice) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() < ltPrice) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// tim toan bo sach co don gia tu 100 den 200
	private static Book[] findBook(Book[] books, double priceFrom, double priceUntil) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() >= priceFrom && book.getPrice() <= priceUntil) {
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
				System.out.println("-->ClassialBook");
				ClassialBook cBook = (ClassialBook) book;
				if (!cBook.isStatus()) {
					System.out.println("-->Old Book" + price);
					price *= 0.7;
					System.out.println("-->New Price" + price);
				}
			} else {
				ReferenceBook rBook = (ReferenceBook) book;
				price *= (1 + rBook.getTax() / 100);
			}
			totalOfMoney += price;
		}
		return totalOfMoney;
	}

	private static Book[] initial() {
		return new Book[] { new ClassialBook("SGK", 22d, "Nhi Đồng", true),
				new ClassialBook("SGK", 36d, "Nhi Đồng", true), new ClassialBook("SGK", 18d, "Nhi Đồng", true),
				new ReferenceBook("STK", 66, "Nhi Đồng", 5), new ReferenceBook("STK", 88, "Nhi Đồng", 8), };
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
