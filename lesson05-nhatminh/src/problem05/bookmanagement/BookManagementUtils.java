package problem05.bookmanagement;

import java.util.Vector;

import problem05.dto.Book;
import problem05.dto.Customer;
import problem05.dto.ReferenceBook;
import problem05.dto.Textbook;

public class BookManagementUtils {
	public static int bookRefId = 1;
	public static int bookTextId = 1;
	public static int cusId = 1;

	public static Book[] bookCustomFactory() {
		Book[] books = new Book[5];
		books[1] = new Textbook(getIdSGK(), 150.0, "Kim Dong", true);
		books[2] = new Textbook(getIdSGK(), 123.0, "Kim Nhung", true);
		books[3] = new Textbook(getIdSGK(), 200.0, "Thanh Nien", true);
		books[4] = new ReferenceBook(getIdSGK(), 40.0, "Kim Dong", 0.1);
		books[5] = new ReferenceBook(getIdSGK(), 320.0, "ABC", 0.1);
		return books;
	}

	public static String getIdSGK() {
		String idSGK = String.valueOf(bookRefId);
		bookRefId++;
		return "SGK" + idSGK;
	}

	public static String getIdSTK() {
		String idSTK = String.valueOf(bookRefId);
		bookTextId++;
		return "STK" + idSTK;
	}

	public static Customer customerFactory() {
		String id = String.valueOf(cusId);
		cusId++;
		String str = "CUS" + id;
		return new Customer(str, "Nguyen Van A", "0123456789", "123 Hoang Dieu");
	}

	public static Book[] getPublisherKimDong(Book[] books) {
		Vector<Book> vt = new Vector<Book>();
		for (Book b : books)
			if (b.getPublisher().equals("Kim Dong"))
				vt.add(b);
		Book[] results = new Book[vt.size()];
		for (int i = 0; i < vt.size(); i++)
			results[i] = vt.get(i);
		return results;
	}

	public static Book[] getPriceLowerthan50(Book[] books) {
		Vector<Book> vt = new Vector<Book>();
		for (Book b : books)
			if (b.getPrice() < 50)
				vt.add(b);
		Book[] results = new Book[vt.size()];
		for (int i = 0; i < vt.size(); i++)
			results[i] = vt.get(i);
		return results;
	}

	public static Book[] getPricefrom100to200(Book[] books) {
		Vector<Book> vt = new Vector<Book>();
		for (Book b : books)
			if (b.getPrice() >= 100 && b.getPrice() <= 200)
				vt.add(b);
		Book[] results = new Book[vt.size()];
		for (int i = 0; i < vt.size(); i++)
			results[i] = vt.get(i);
		return results;
	}

	public static void getPayment(Customer cus, Book[] books) {
		Double total = 0.0;
		for (Book book : books) {
			if (book instanceof Textbook) {
				if (((Textbook) book).getStatus() == false) {
					total += book.getPrice() * 0.3;
				} else
					total += book.getPrice();
			} else
				total += book.getPrice() * (1 + ((ReferenceBook) book).getTax());
		}
		System.out.println("Payment:");
		System.out.println("\t+Cus: " + cus.getName());
		System.out.println("\t+Total: " + total);
	}
}
