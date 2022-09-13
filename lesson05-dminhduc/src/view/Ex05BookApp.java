package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {

	public static void main(String[] args) {
		Book[] books = initial();
		Book[] booksByPublisher = findBooks(books, "Nhi Đồng");
		printf(booksByPublisher);
		System.out.println("=====================");
		Book[] booksByLtPrice = findBooks(books, 50);
		printf(booksByLtPrice);
		System.out.println("=====================");
		Book[] booksByPrice = findBooks(books, 100, 200);
		printf(booksByPrice);
		System.out.println("=====================");
		double toltalOfMoney = bill(booksByLtPrice);
		System.out.println(toltalOfMoney);

	}
	// Mua sách giáo khoa và tham khảo
	private static double bill(Book ...books)
	{
		double totalOfMoney = 0;
		
		for(Book book : books)
		{
			double price = book.getPrice();
			if(book.getId().startsWith("SGK"))
			{
				
				ClassicalBook cBook = (ClassicalBook) book;
				if(!cBook.isStatus())
				{
					
					price *= 0.7;
					
				}
			}
			else
			{
				ReferenceBook rBook = (ReferenceBook) book;
				price *= (1 + rBook.getTax()/100);
			}
			totalOfMoney += price;
		}
		
		return totalOfMoney;
	}
	// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
	private static Book[] findBooks(Book[] books, double priceFrom, double priceUntil) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
		
			//  C1: book.getId().startsWith("SGK")
			//  C2: book instanceof ClassicalBook
			//  C3: book.getClass() == ClassicalBook
				if (book.getId().startsWith("SGK") && book.getPrice() >= priceFrom && book.getPrice() <= priceUntil) {
					result[k++] = book;
				}
			
		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Tìm toàn bộ sách có đơn giá bé hơn 50
	private static Book[] findBooks(Book[] books, double lessThanPrice) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() < lessThanPrice) {
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

	private static Book[] initial() {
		return new Book[] { new ClassicalBook("SGK123", 123d, "Nhi Đồng", true),
				new ClassicalBook("SGK1235", 1233d, "Nhi2 Đồng", false),
				new ClassicalBook("SGK1234", 1223d, "Nhi Đồng", true), new ReferenceBook("STKR1", 66, "Nhi Đồng", 15),
				new ReferenceBook("STKR1", 26, "Nhi2 Đồng", 5), new ReferenceBook("STKR1", 36, "Nhi Đồng", 15)

		};
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
