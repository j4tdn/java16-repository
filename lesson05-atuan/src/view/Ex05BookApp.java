package view;

import java.lang.reflect.Array;
import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] bookByPublisher = findBook(books, "Nhi Dong");
		printf(bookByPublisher);
		System.out.println("===================");
		Book[] bookByPrice = findBook(books, 50d);
		printf(bookByPrice);
		System.out.println("===================");
		Book[] bookByltPrice = findBook(books, 100d, 200d);
		printf(bookByltPrice);
		System.out.println("===================");
		double total = bill(bookByPrice);
		System.out.println(total);
	
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
	private static void printf(Book[] books) {
		for(Book book : books) {
			System.out.println(book);
		}
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
	private static Book[] findBook(Book[] books, double lprice, double tprice) {
		Book[] result = new Book[books.length];
		int k = 0;
		for(Book book: books) {
			if(book instanceof ClassicalBook && book.getPrice() > lprice && book.getPrice() < tprice ) {
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
		
	}
	private static double bill(Book...books) {
		double total = 0;
		for(Book book: books) {
			double price = book.getPrice();
			if(book instanceof ClassicalBook) {
				
				ClassicalBook cBook = (ClassicalBook)book;
				if(!cBook.isStatus()) {
					price *= 0.7; 
				}
			}else {
				ReBook rBook = (ReBook)book;
				price *= (1 + rBook.getTax()/100);
			}
			total += price;
		}
		return total;
	}
		
}


