package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReBook;

public class Ex06BookAppAdv {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] bookByPublisher = findBook(books, "Nhi Dong");
		printf(bookByPublisher);
		System.out.println("===================");
		Book[] bookByPrice = findBook(books, 50d);
		printf(bookByPrice);
	}
	private static Book[] initial() {
		return new Book[] {
				 new ClassicalBook("SGK",11d,"Nhi Dong", true),
				 new ClassicalBook("SGK",150d,"Lac Viet", false),
				 new ClassicalBook("SGK",170d,"Nhi Dong", false),
				 new ClassicalBook("SGK",19d,"Nhi Dong", false),
				 new ReBook("STK",150d,"Nhi Dong", 5),
				 new ReBook("STK",77d,"Sao Mai", 8),
				 new ReBook("STK",66d,"Nhi Dong", 5)
				 };
				
		}
	private static void printf(Book[] books) {
		for(Book book : books) {
			System.out.println(book);
		}
	}
	private static Book[] findBook(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int k = 0;
		for(Book book:books) {
			if(publisher.equals(book.getPublisher())) {
				result[k++] = book;
			}
			
		}
		return Arrays.copyOfRange(result, 0, k);
		
	}
	private static Book[] findBook(Book[] books, double price) {
		Book[] result = new Book[books.length];
		int k = 0;
		for(Book book: books) {
			if(book.getPrice() < price) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
		
	}

}
