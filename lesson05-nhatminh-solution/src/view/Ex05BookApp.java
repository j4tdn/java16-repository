package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] booksByPublisher = findBooks(books, "Nhi Dong");
		printf(booksByPublisher);

		System.out.println("========================");
		Book[] booksByLtPrice = findBooks(books, 50);
		printf(booksByLtPrice);
		System.out.println("========================");
		Book[] booksFromUntil = findBooks(books, 100, 200);
		printf(booksFromUntil);
		System.out.println("========================");
		System.out.println("Total of Money: " + bill(booksByLtPrice));
	}

	private static double bill(Book... books) {
		double totalOfMoney = 0;
		for (Book book : books) {
			double price = book.getPrice();
			if (book.getId().startsWith("SGK")) {
				ClassicalBook cBook = (ClassicalBook) book;
				if (cBook.isStatus()) {
					price *= 0.7;
				}
			} else {
				ReferenceBook rBook = (ReferenceBook) book;
				price *= (1 + rBook.getTax() / 100);
			}
			totalOfMoney += price;
		}
		return totalOfMoney;
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

	// Tim toan bo sach thuoc nha xuat ban Nhi Dong
	private static Book[] findBooks(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			// Nen dua publisher ra truoc de tranh book.getPublisher == null
			if (publisher.equals(book.getPublisher())) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Tim toan bo sach co don gia nho hon 50
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

	// Tim toan bo sach giao khoa co don gia tu 100 - 200
	// book.getId().startWith("SGK")
	// book instanceof ClassicalBook
	// book.getClass() = ClassicalBook.class;
	private static Book[] findBooks(Book[] books, double priceFrom, double priceUntil) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getId().startsWith("SGK") && priceFrom <= book.getPrice() && priceUntil >= book.getPrice()) {
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
}
