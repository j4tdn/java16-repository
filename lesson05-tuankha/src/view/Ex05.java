

package view;

import bean.Book;
import bean.Customer;
import bean.ReferBook;
import bean.TextBook;
import model.BookManager;
import model.CustomerUtils;

public class Ex05 {
	static BookManager bookDB = BookManager.getInstance();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		System.out.println("In ra toàn bộ sách thuộc nhà xuất bản Nhi Đồng : ");
		getAllNhiDongPublishers();
		//
		System.out.println("============================================");
		System.out.println("In ra toàn bộ sách có đơn giá nhỏ hơn 50");
		getAllPricesMinThanN(50);
		//
		System.out.println("============================================");
		System.out.println("In ra toàn bộ sách có đơn giá từ 100 đến 200");
		getAllPricesInRange(100, 200);
		//
		System.out.println("============================================");
		System.out.println("Giả lập khách hàng mua sách");
		Customer cs1 = new Customer(1, "NVA", "1234545", "K123/44");
		Customer cs2 = new Customer(2, "NVB", "1234545", "K123/44");
		Customer cs3 = new Customer(3, "NVC", "1234545", "K123/44");
		
		CustomerUtils bill1 = new CustomerUtils(cs1.getId(), new Book[] {bookDB.getListBook()[0], bookDB.getListBook()[3]});
		CustomerUtils bill2 = new CustomerUtils(cs2.getId(), new Book[] {bookDB.getListBook()[1], bookDB.getListBook()[4]});
		CustomerUtils bill3 = new CustomerUtils(cs3.getId(), new Book[] {bookDB.getListBook()[2], bookDB.getListBook()[3]});
		
		System.out.println("id cumtomer :" + bill1.getCustomerId() +" || Total : " + bill1.printBill());
		System.out.println("id cumtomer :" + bill2.getCustomerId() +" || Total : " + bill2.printBill());
		System.out.println("id cumtomer :" + bill3.getCustomerId() +" || Total : " + bill3.printBill());
	
	
	
	}
	
	
	
	
	public static void getAllNhiDongPublishers() {
		for (Book book : bookDB.getListBook()) {
			if(book.getPublishers().equals("Nhi Đồng"))
				System.out.println(book.toString());

		}
	}

	public static void getAllPricesMinThanN(int n) {
		for (Book book : bookDB.getListBook()) {
			if(book.getPrices() < n)
				System.out.println(book.toString());
		}
	}
	
	public static void getAllPricesInRange(int from, int to) {
		for (Book book : bookDB.getListBook()) {
			if(book.getPrices() >= from && book.getPrices() <= to)
				System.out.println(book.toString());
		}
	}
	
	
}
