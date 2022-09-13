package view;

import java.util.Arrays;

import bin.Book;
import bin.ClassicalBook;
import bin.RefrenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] boolsByPublisher = findBooks(books, "NHIDONG");
		printf(boolsByPublisher);
		
		System.out.println("====================");
		

	}
	private static double bill(Book ...books) {
		double totalOfMoney = 0;
		for(Book book: books) {
			double price = book.getPrice();
			if(book.getId().startsWith("SGK")) {
				ClassicalBook cBook =(ClassicalBook)book;
				if(!cBook.isStatus()) {
					price*=0.7;
				}
			}else {
				RefrenceBook rBook =(RefrenceBook)book;
				price*=(1+rBook.getTax()/100);
			}
			totalOfMoney +=price;
		}
		
		
		return totalOfMoney;
	}

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
		return new Book[] { new ClassicalBook("SGK123", 123, "NHIDONG", true), new RefrenceBook("STK1", 66, "SAO", 5) };
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
