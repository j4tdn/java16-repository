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
		
		System.out.println("============================");
		
		Book[] booksByLessThanPrice = findBooks(books, 50);
		printf(booksByLessThanPrice);
		
		System.out.println("============================");
		
		Book[] booksFromUntil = findBooks(books, 40 , 80);
		printf(booksFromUntil);
		
		System.out.println("============================");
		double totalOfMoney = bill(booksByLessThanPrice);
		System.out.println("totalOfMoney: " +totalOfMoney);
	}
	
	private static double bill(Book ...books) {
		double totalOfMoney = 0;
		for (Book book : books) {
			double price = book.getPrice();		
			if(book.getId().startsWith("SGK")) {
				System.out.println("--> Classical Book " + book.getId());
				System.out.println("--> Price: " + price);
				ClassicalBook cBook = (ClassicalBook) book;
				if(!cBook.isStatus()) {
					price *=0.7;
					System.out.println("--> Reduce Price: " + price);
				} 
			} else {
				System.out.println("--> Reference Book " + book.getId());
				System.out.println("--> Price: " + price);
				ReferenceBook rBook = (ReferenceBook) book;
				price *= (1+rBook.getTax()/100);
				System.out.println("--> Reduce Price: " + price);
			}
			totalOfMoney += price;
		}
		
		return totalOfMoney;
	}
	
	// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
	private static Book[] findBooks(Book[] books , double priceFrom ,double priceUntil) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getId().startsWith("SGK")
					&& book.getPrice() >= priceFrom 
					&& book.getPrice() <= priceUntil) {
					result[k++] = book; 
				}
			
		}
		return Arrays.copyOfRange(result,0,k);
 	}	
	
	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	private static Book[] findBooks(Book[] books , double lessThanPrice) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() < lessThanPrice) {
				result[k++] = book; 
			}
		}
		return Arrays.copyOfRange(result,0,k);
 	}
	
	
	// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
	private static Book[] findBooks(Book[] books , String publisher) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
				result[k++] = book; 
			}
		}
		return Arrays.copyOfRange(result,0,k);
 	}
	
	private static Book[] initial() {
		return new Book[] {
			new ClassicalBook("SGKA1", 22d, "Nhi Dong", true),
			new ClassicalBook("SGKB2", 36d, "Lac Viet", false),
			new ClassicalBook("SGKC3", 18d, "Nhi Dong", true),
			new ClassicalBook("SGKD4", 44d, "Nhi Dong", true),
			new ReferenceBook("STKR1", 66, "Nhi Dong", 5),
			new ReferenceBook("STKR2", 88, "Sao Mai", 8),
			new ReferenceBook("STKR3", 77, "Nhi Dong", 5),
		};
	}
	
	private static void printf(Book[] books) {
		for (Book book: books) {
			System.out.println(book);
		}
	}
}
