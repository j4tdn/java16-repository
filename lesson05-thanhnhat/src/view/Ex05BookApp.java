package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] booksByPublisher = findbooks(books, "Nhi Đồng");
		printf(booksByPublisher);

		System.out.println("=========");
		Book[] booksByLtPrice = findbooks(books, 50);
		printf(booksByLtPrice);
		
		System.out.println("=========");
		Book[] booksFromUntil = findbooks(books, 100,200);
		printf(booksFromUntil);
		
		System.out.println("=========");
		double totalOfMoney = bill(booksByLtPrice);
		System.out.println(totalOfMoney);
	}
	// bill
	private static double bill(Book ...books) {
		double totalOfMoney = 0;
		for (Book book:books) {
			double price = book.getPrice();
			if (book.getId().startsWith("SGK")) {
				ClassicalBook cBook = (ClassicalBook)book;
				if (cBook.isStatus()) {
					price*=0.7;
				}
			} else {
				ReferenceBook rBook = (ReferenceBook)book;
				price*=(1+rBook.getTax()/100);
			}
			totalOfMoney += price;
		}
		
		return totalOfMoney;
	}
	
	// Tìm toàn bộ sách có đơn giá nhỏ hơn 200 và lớn hơn 100
	// book instanceof ClassicalBook
	// book.getClass()==ClassicalBook.class
	
	private static Book[] findbooks(Book[] books, double priceFrom, double priceUntil) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getId().startsWith("SGK") && book.getPrice() >= priceFrom && book.getPrice() <= priceUntil) {
				result[k++] = book;
			}
		}

		return Arrays.copyOfRange(result, 0, k);
	}
// Tìm toàn bộ sách có giá nhỏ hơn 50
	private static Book[] findbooks(Book[] books, double ltPice) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() < ltPice) {
				result[k++] = book;
			}
		}

		return Arrays.copyOfRange(result, 0, k);
	}
// Tìm toàn bộ sách thuộc NXB Nhi Đồng
	private static Book[] findbooks(Book[] books, String publisher) {
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
