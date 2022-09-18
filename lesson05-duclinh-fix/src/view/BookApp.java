package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.RefrenceBook;
public class BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] booksByPubliser = findBooks(books,"Nhi Dong");
		printf(booksByPubliser);
		System.out.println("==========================");
		Book[] booksByltPrice= findBooks(books,50);
		printf(booksByltPrice);
		System.out.println("=========================");
		Book[] booksFromUntil= findBooks(books,44, 80);
		printf(booksFromUntil);
		System.out.println("=========================");
		double totalOfMoney = bill(booksByltPrice);
		System.out.println("totalOfMoney" + totalOfMoney);
	}
	
	
	// timf toanf bo sach nho hon 50
	private static Book[] findBooks(Book[] books,double ltPrice) {
		Book[] result = new Book[books.length];
		int k  = 0;
		for(Book book : books) {
			if(book.getPrice()< ltPrice) {
				result[k++] = book;
				
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	// 100 -200 
	private static Book[] findBooks(Book[] books,double priceFrom, double priceUntil) {
		Book[] result = new Book[books.length];
		int k  = 0;
		for(Book book : books) {
			if(book.getId().startsWith("SGK")
					&& book.getPrice()>= priceFrom
					&& book.getPrice()<= priceUntil)
					{
						if(book.getPrice()>= priceFrom && book.getPrice() <priceUntil) {
							result[k++] = book;
							
						}
					}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	private static Book[] findBooks(Book[] books,String publisher) {
		Book[] result = new Book[books.length];
		int k  = 0;
		for(Book book : books) {
			if(publisher.equals(book.getPubliser())) {
				result[k++] = book;
				
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	private static double bill(Book ...books ) {
		double totalOfMoney = 0;
		for(Book book:books) {
			double price = book.getPrice();
			if(book.getId().startsWith("SGK")) {
				System.out.println("--> Classcical Book");
				ClassicalBook cBook= (ClassicalBook)book;
				if(!cBook.isStatus()) {
					System.out.println("--> Old Book" +price);
					price *= 0.7;
					System.out.println("--> New Price:" +price);
				}
			}	
			else {
				System.out.println("--> refenceBook Book");
				System.out.println("--> Old Book" +price);
				RefrenceBook rBook= (RefrenceBook)book;
				price *= (1+ rBook.getTax()/100);
				System.out.println("--> New Price:" +price);
			}
			totalOfMoney +=price;
		}
		return totalOfMoney;
	}
	
	
	private static Book[] initial(){
		return new Book[] {
				new ClassicalBook("SGKA1", 22d, "Nhi Dong", true),
				new ClassicalBook("SGKB1", 36d, "Lacj Viet",false),
				new ClassicalBook("SGKC1", 18d, "Nhi Dong",true),
				new ClassicalBook("SGKB1", 66d, "Nhi Dong",true),
				new RefrenceBook("STKR1", 66d, "Nhi Dong",5),
				new RefrenceBook("SGKR2", 36d, "Sao Mai",8),
				new RefrenceBook("SGKB1", 36d, "Nhi Dong",5),
		};
	}
	
	private static void printf(Book[] books) {
		for(Book book: books) {
			System.out.println(book);
		}
	}
}
