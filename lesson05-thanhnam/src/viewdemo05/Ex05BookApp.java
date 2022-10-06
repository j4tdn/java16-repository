package viewdemo05;

import demo05.Book;
import demo05.ClassicalBook;
import demo05.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
	}
	
	//Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
	private static Book[] findBooks(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		
	}
	
	private static Book[] initial() {
		return new Book[] {
				new ClassicalBook("SGK1","Nhi Dong", true , 123d),
				new ClassicalBook("SGK2","Nhi Dong", false, 124d),
				new ClassicalBook("SGK3","Nhi Dong", true, 125d),
				new ReferenceBook("STK1", 222d, "Thanh Nam", 5),
				new ReferenceBook("STK2", 223d, "Thanh Nam", 6),
				new ReferenceBook("STK3", 224d, "Thanh Nam", 7),
		};
}
}
