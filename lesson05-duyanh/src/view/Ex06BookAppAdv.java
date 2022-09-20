package view;

import java.util.Arrays;

import bean.Book;
import bean.BookCondition;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex06BookAppAdv {
	public static void main(String[] args) {
		Book[] books  = initial();
		
//		BookCondition cd = new BookCondition() {
//			
//			@Override
//			public boolean test(Book book) {
//				// TODO Auto-generated method stub
//				return book.getPrice() < 50;
//			}
//		};
		
		
		
		Book[] bookbypublisher = findBooks(books,book -> "KIM DONG".equals(book.getPublisher()));
		printf(bookbypublisher);
		System.out.println("==========");
		Book[] bookbyprice = findBooks(books,book -> book.getPrice() < 50);
		printf(bookbyprice);
	}
	
	private static Book[] findBooks(Book[] books, BookCondition condition) {
		Book[] rs = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if(condition.test(book)){
				rs[k++] = book;
			}
			
		}
		return Arrays.copyOfRange(rs, 0, k);
	}
	
	private static Book[] findBooks(Book[] books, String publisher) {
		Book[] rs = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if(publisher.equals(book.getPublisher())){
				rs[k++] = book;
			}
			
		}
		return Arrays.copyOfRange(rs, 0, k);
	}
	
	private static Book[] findBooks(Book[] books, double ltprice) {
		Book[] rs = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if(book.getPrice() < 50){
				rs[k++] = book;
			}
			
		}
		return Arrays.copyOfRange(rs, 0, k);
	}
	
	private static Book[] initial() {
		return new Book[] {
				new ClassicalBook("SGKA1", 40, "KIM DONG", false),
				new ClassicalBook("SGKB1", 150, "KIM DONG", false),
				new ClassicalBook("SGKK2", 120, "BAN MAI", true),
				new ClassicalBook("SGKV3", 26, "SAO VANG", true),
				
				new ReferenceBook("STKA1", 90, "KIM DONG", 5),
				new ReferenceBook("STKB2", 160, "SAO VANG", 10),
				new ReferenceBook("STKA3", 170, "KIM DONG", 7),
				
		};
		
	}
	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
			
		}
	}

}
