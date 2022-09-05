package ex05;

public class BookUtil {
	private BookUtil() {

	}

	public static Book[] findBooksOfPublisher(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int j = 0 ;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublisher() == publisher) {
				result[j] = books[i];
				j++;
			}
		}
		return result;
	}
	
	public static Book[] findBooksWithLessPrice(Book[] books, int price) {
		Book[] result = new Book[books.length];
		int j = 0 ;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPrice() < price) {
				result[j] = books[i];
				j++;
			}
		}
		return result;
	}
	
	public static Book[] findTextBooksOfPrice100To200(Book[] books) {
		Book[] result = new Book[3];
		int j = 0 ;
		for (int i = 0; i < 3; i++) {
			if (books[i].getPrice() >= 100 && books[i].getPrice() <= 200 ) {
					result[j] = (Book) books[i];
					j++;
				}
			}
		return result;
	}
	
	public static float calculateTotalPrice(TextBook tb, ReferenceBook rb) {
		float tbPrice = tb.getPrice();
		if (!tb.getState()) tbPrice *= 0.7;
		float rbPrice = (float) (rb.getPrice() * (1 + rb.getTax()));
		return tbPrice + rbPrice;
	}
}
