package view;

import java.util.Arrays;

import bean.Book;

public class Ex06BookAppAdv {
	public static void main(String[] args) {
		Book[] books = initial();

		Book[] booksByPublisher = findBooks(books, "Nhi Đồng");
		frintf(booksByPublisher);

		System.out.println("==============");
		Book[] booksByLtPrice = findBooks(books, 50);
		frintf(booksByLtPrice);
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
}
