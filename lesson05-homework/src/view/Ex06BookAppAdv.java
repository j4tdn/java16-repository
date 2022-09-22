package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassialBook;
import bean.ReferenceBook;

public class Ex06BookAppAdv {
public static void main(String[] args) {
	Book[] books = initial();
	
	//anonymus class ==> tạo 1 đối tượng cho interface
	BookCondition cd = new BookCondition() {
		
	};
	
	
	printf(booksByPublisher);
	System.out.println("=======");
	Book[] BookByPrice = findBook(books, 50);
	printf(booksByPublisher);
}
		
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
		
private static Book[] finBook(Book[] books,BookCondition condition) {
	Book[] result = new Book[books.length];
	int k=0;
	for(Book book :books) {
		if(condition.test(book)) {
			result[k++] = book;
		}
	}
	return Arrays.copyOfRange(result, 0, k);
}

private static Book[] initial() {
	return new Book[] { new ClassialBook("SGK", 22d, "Nhi Đồng", true),
			new ClassialBook("SGK", 36d, "Nhi Đồng", true), new ClassialBook("SGK", 18d, "Nhi Đồng", true),
			new ReferenceBook("STK", 66, "Nhi Đồng", 5), new ReferenceBook("STK", 88, "Nhi Đồng", 8), };
}

}
8
