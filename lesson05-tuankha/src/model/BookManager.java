package model;

import bean.Book;
import bean.ReferBook;
import bean.TextBook;

public class BookManager {
	private static BookManager instance;
	
	private Book[] listBook;
	
	private BookManager() {
		Book sgk1 = new TextBook("1", 100, "Nhi Đồng", false);
		Book sgk2 = new TextBook("2", 50, "Nhi Đồng", false);
		Book sgk3 = new TextBook("3", 50, "Kim Đồng", false);
		
		Book stk1 = new ReferBook("1", 20, "Nhi Đồng", 3);
		Book stk2 = new ReferBook("2", 40, "Kim Đồng", 1);
		
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
