package fix;

import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05 {
	public static void main(String[] args) {
		Book[] books=initial();
	}
	private static Book[] initial() {
		return new Book[] {
				new ClassicalBook("SGK123", 123D, "NHI DONG", true),
				new ClassicalBook("SGK125", 127D, "LAC HONG", false),
				new ReferenceBook("STKR1", 66, "NHI DONG", 5),
				new ReferenceBook("STKR3", 77, "LONG DONG", 8),
		};
	}

}
