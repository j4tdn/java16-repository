package view;

import bean.Book;
import bean.BookCondition;
import model.BookManager;

public class Ex06BookAppAdvance {
	
	static BookManager bookDB = BookManager.getInstance();
	public static void main(String[] args) {
		System.out.println("In ra toàn bộ sách thuộc nhà xuất bản Nhi Đồng : ");
		getAllBooks(book -> "Nhi Đồng".equals(book.getPublishers()));
		//
		System.out.println("============================================");
		System.out.println("In ra toàn bộ sách có đơn giá nhỏ hơn 50");
		getAllBooks(book -> book.getPrices() < 50);
		//
		System.out.println("============================================");
		System.out.println("In ra toàn bộ sách có đơn giá từ 100 đến 200");
		getAllBooks(book -> book.getPrices()<  100 && book.getPrices() > 200);
	}
	
	public static void getAllBooks(BookCondition BookC) {
		for (Book book : bookDB.getListBook()) {
			if(BookC.test(book))
				System.out.println(book.toString());
		}
	}
}
	
