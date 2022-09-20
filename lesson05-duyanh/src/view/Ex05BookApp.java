package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books  = initial();
		Book[] bookbypublisher = findBooks(books,"KIM DONG");
		printf(bookbypublisher);
		System.out.println("==========");
		Book[] bookbyprice = findBooks(books, 50);
		printf(bookbyprice);
		System.out.println("==========");
		Book[] bookbypricefromto = findBooks(books, 100, 200);
		printf(bookbypricefromto);
		System.out.println("==========");
		double totalOfmoney = bill(bookbyprice);
		System.out.println(" totalofMoney " + totalOfmoney);
		
		
		
	}
	private static double bill(Book ... books) {
		double totalOfMoney = 0 ;
		for (Book book : books) {
			double price = book.getPrice();
			if(book.getId().contains("SGK")) {
				ClassicalBook cbook = (ClassicalBook) book;
				if(cbook.isStatus() == false) {
					price *= 0.7;
				}
			}
			else {
				ReferenceBook rbook = (ReferenceBook)book;
				price *=(1 + rbook.getTax()/100);
			}
			totalOfMoney += price;
		}
		return totalOfMoney;
		
	}
	private static Book[] findBooks(Book[] books, double from, double to) {
		Book[] rs = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if(book.getPrice() < to && book.getPrice() > from && book.getId().contains("SGK")){
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
