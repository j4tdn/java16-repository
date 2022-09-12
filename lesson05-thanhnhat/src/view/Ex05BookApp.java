package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] booksByPublisher = findBooks(books, "Nhi đồng");
		printf(booksByPublisher);
		System.out.println("============");
		Book[] booksByLtPrice = findBooks(books, 50);
		printf(booksByLtPrice);
		System.out.println("============");
		Book[] booksFromUntil = findBooks(books, 100, 200);
		printf(booksFromUntil);
		System.out.println("============");
		double totalOfMonet = bill(booksByLtPrice);

	}

	private static double bill(Book... books) {
		double totalOfMoney = 0;
		for (Book book : books) {
			double price = book.getPrice();
			if (book.getId().startsWith("SGK")) {
				ClassicalBook cBook = (ClassicalBook) book;
				if (!cBook.isStatus()) {
					price *= 0.7;
				} else {
					ReferenceBook rBook = (ReferenceBook) book;
					price *= (1 + rBook.getTax() / 100);
				}
			}
		}
		return totalOfMoney;
	}

	// Tìm sách NXB đơn giá từ 100 đến 200
	private static Book[] findBooks(Book[] books, double priceFrom, double priceUntil) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book instanceof ClassicalBook && book.getPrice() >= priceFrom && book.getPrice() <= priceUntil) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Tìm sách NXB đơn giá nhỏ hơn 50
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
}
