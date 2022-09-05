package problem05.bookmanagement;

import problem05.dto.Book;
import problem05.dto.Customer;

public class BookManagementDemo {
	public static void main(String[] args) {
		Book[] books = BookManagementUtils.bookCustomFactory();
		Customer cus = BookManagementUtils.customerFactory();

		// DEMO
		Book[] books1 = BookManagementUtils.getPublisherKimDong(books);
		System.out.println("Sach cua nxb Kim Dong");
		for (Book b : books1)
			System.out.println(b);
		Book[] books2 = BookManagementUtils.getPriceLowerthan50(books);
		System.out.println("Sach co gia nho hon 50");
		for (Book b : books2)
			System.out.println(b);
		Book[] books3 = BookManagementUtils.getPricefrom100to200(books);
		System.out.println("Sach co gia nam giua 100 va 200");
		for (Book b : books3)
			System.out.println(b);
		BookManagementUtils.getPayment(cus, books3);
	}
}
