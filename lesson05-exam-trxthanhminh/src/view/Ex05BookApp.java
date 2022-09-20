package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();

		Book[] booksByPublisher = findBooks(books, "Nhi Đồng");
		frintf(booksByPublisher);

		System.out.println("==============");
		Book[] booksByLtPrice = findBooks(books, 50);
		frintf(booksByLtPrice);

		System.out.println("==============");
		Book[] booksFromUntil = findBooks(books, 40, 80);
		frintf(booksFromUntil);

		System.out.println("==============");
		double totalOfMoney = bill(booksByLtPrice);
		System.out.println("totalOfMoney: " + totalOfMoney);
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
			} else {
				ReferenceBook rBook = (ReferenceBook) book;
				price *= (1 + rBook.getTax());
			}
			totalOfMoney += price;
		}
		return totalOfMoney;
	}

	// Tìm toạn bộ sách giáo khoa có đơn giá từ 100 đến 200
	private static Book[] findBooks(Book[] books, double priceFrom, double priceUntil) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getId().startsWith("SGK") && book.getPrice() > priceFrom && book.getPrice() < priceUntil) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
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

	// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
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
		return new Book[] { new ClassicalBook("SGKA1", 50, "Nhi Đồng", true),
				new ClassicalBook("SGKB2", 70, "Kim Đồng", false), new ClassicalBook("SGKC3", 12, "Nhi Đồng", false),
				new ReferenceBook("STKC1", 60, "Kim Đồng", 0.5), new ReferenceBook("STKN3", 120, "Nhi Đồng", 0.3) };
	}

	private static void frintf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
