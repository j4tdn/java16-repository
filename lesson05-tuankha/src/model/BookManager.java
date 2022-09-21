package model;

import bean.Book;
import bean.ReferBook;
import bean.TextBook;

public class BookManager {
	private static BookManager instance;
	
	private Book[] listBook;
	
	private BookManager() {
		Book sgk1 = new TextBook("1", 22, "Nhi Đồng", TextBook.NEW);
		Book sgk2 = new TextBook("2", 36, "Lạc Việt", TextBook.OLD);
		Book sgk3 = new TextBook("3", 18, "Nhi Đồng", TextBook.NEW);
		Book sgk4 = new TextBook("3", 44, "Nhi Đồng", TextBook.NEW);
		
		Book stk1 = new ReferBook("1", 66, "Nhi Đồng", 5);
		Book stk2 = new ReferBook("2", 88, "Sao Mai", 8);
		Book stk4 = new ReferBook("2", 77, "Nhi Đồng", 6);
		
		listBook = new Book[]{ sgk1,sgk2, sgk3, stk1, stk2 };
		
	}
	
	public static BookManager getInstance() {
		if(instance == null) instance = new BookManager();
		return instance;
	}
	
	public Book[] getListBook() {
		return this.listBook;
	}
}
