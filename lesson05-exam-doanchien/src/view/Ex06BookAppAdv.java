package view;

import java.util.Arrays;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex06BookAppAdv {
	public static void main(String[] args) {
		Book[] books = initial();
		
		BookCondition condition = new BookCondition() {
			
			@Override
			public boolean test(Book book) {
				return false;
			}
		};
			
		
		Book[] booksByPublisher = findBooks(books, condition);
		printf(booksByPublisher);
		
		System.out.println("============================");
		
		Book[] booksByLessThanPrice = findBooks(books, condition);
		printf(booksByLessThanPrice);
	}
	
	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		private static Book[] findBooks(Book[] books , BookCondition condition) {
			Book[] result = new Book[books.length];
			int k = 0;
			for (Book book : books) {
				// if (book.getPrice() < lessThanPrice) 
				if(condition.test(book)) {
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
