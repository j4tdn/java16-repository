package texEx05;

import java.util.Arrays;
public class BookApp { 
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] publisher = findsBook(books,"Nhi Dong");
		printf(publisher);
		System.out.println("======================");
		Book[] ltPrice = findsBook(books, 50d);
		printf(ltPrice);
		System.out.println("======================");
		Book[] classical = findsBook(books, 34, 80);
		printf(classical);
		System.out.println("======================");
		double totalOfMoney = bill(ltPrice);
		System.out.println(totalOfMoney);
		}
	private static Book[] findsBook(Book[] books, double ltPrice) {
		Book[] rs  = new Book[books.length];
		int k = 0;
		for(Book book:books) {
			if(book.getPrice() < ltPrice) {
				rs[k++] = book;
			}
		}
		return Arrays.copyOfRange(rs, 0 , k);
	}
	private static Book[] findsBook(Book[] books, String publisher) {
		Book[] rs  = new Book[books.length];
		int k = 0;
		for(Book book:books) {
			if(book.getId().startsWith("SGK") && publisher.equals(book.getPublisher())) {
				rs[k++] = book;
			}
		}
		return Arrays.copyOfRange(rs, 0 , k);
	}
	private static Book[] findsBook(Book[] books, double fromPrice, double endPrice) {
		Book[] rs = new Book[books.length];
		int k =0;
		for(Book book: books) {
			if(book.getId().startsWith("SGK")
					&& book.getPrice() >= fromPrice
					&& book.getPrice() <= endPrice) {
					rs[k++] = book;
					
			}
		}
		return Arrays.copyOfRange(rs, 0, k);
	}
	private static double bill(Book ...books) {
		double totalOfMoney = 0;
		for(Book book:books) {
			double price  = book.getPrice();
			if(book.getId().startsWith("SGK")) {
				System.out.println("old book");
				ClassicalBook cBook = (ClassicalBook)book;
				if(cBook.getStatus() == false) {
					System.out.println("--> Old Book" +price);
					price *= 0.7;
					System.out.println("new book" +price);
				}
			}
			else {
				System.out.println("--> refenceBook Book");
				System.out.println("--> Old Book" +price);
				RefrenceBook rBook = (RefrenceBook)book;
				price = price * (1+ rBook.getTax()/100);
				System.out.println("--> New Price:" +price);
			}
			totalOfMoney += price;
		}
		return totalOfMoney;
	}
	private static Book[] initial() {
		return new Book[] {
				new ClassicalBook("SGKA1", 22d, "Nhi Dong", true),
				new ClassicalBook("SGKB1", 36d, "Lac Viet",false),
				new ClassicalBook("SGKC1", 58d, "Nhi Dong",true),
				new ClassicalBook("SGKB1", 66d, "Nhi Dong",true),
				new RefrenceBook("STKR1", 66d, "Nhi Dong",5),
				new RefrenceBook("STKR2", 36d, "Sao Mai",8),
				new RefrenceBook("STKB1", 37d, "Nhi Dong",5), 
		};
	}
	private static void printf(Book[] books) {
		for(Book book: books) {
			System.out.println(book);
		}
	}
}
