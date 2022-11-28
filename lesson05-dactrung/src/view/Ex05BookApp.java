package view;

import java.util.Arrays;
import bean.Book;
import bean.ClassicalBook;
import bean.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = initial();
		Book[] bookByPublisher = findBook(books, "Nhi Đồng");
		printf(bookByPublisher);

		System.out.println("=========================================");
		Book[] bookByLtPrice = findBook(books, 50);
		printf(bookByLtPrice);

		System.out.println("=========================================");
		Book[] bookByPrice = findBook(books, 100, 200);
		printf(bookByPrice);
		
		System.out.println("=========================================");
		double totalOfMoney = bill(bookByLtPrice);
		System.out.println(totalOfMoney);

	}

	public static Book[] initial() {
		return new Book[] { new ClassicalBook("SGKA1", 22d, "Nhi Đồng", true),
				new ClassicalBook("SGKB2", 36d, "Lạc Việt", false), new ClassicalBook("SGKC3", 18d, "Nhi Đồng", true),
				new ClassicalBook("SGKD4", 44d, "Nhi Đồng", true), new ReferenceBook("STKR1", 66, "Nhi Đồng", 5),
				new ReferenceBook("STKR2", 88, "Kim Đồng", 8), new ReferenceBook("STKR3", 77, "Nhi Đồng", 5),

		};

	}

	// Sachs thuộc nhà xuất bản nhi đồng
	public static Book[] findBook(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
				result[k++] = book;
			}

		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Sách < 50
	public static Book[] findBook(Book[] books, double ltPrice) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getPrice() < ltPrice) {
				result[k++] = book;
			}

		}
		return Arrays.copyOfRange(result, 0, k);
	}

	// Sách 100-200
	// book.getId().startsWith("SGK")
	// book instanceof ClassicalBook
	public static Book[] findBook(Book[] books, double pricarFrom, double PriceUtil) {
		Book[] result = new Book[books.length];
		int k = 0;
		for (Book book : books) {
			if (book.getClass() == ClassicalBook.class && book.getPrice() >= pricarFrom
					&& book.getPrice() <= PriceUtil) {
				result[k++] = book;
			}

		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	//bill
	private static double bill(Book...books) {
		double totalOfMoney = 0;
		for(Book book: books) {
			double price = book.getPrice();
			if(book.getId().startsWith("SGK")){
				System.out.println("--> ClassicalBook " + book.getId());
				System.out.println("--> Price: " + price);
				ClassicalBook cBook = (ClassicalBook)book;
				if(!cBook.isStatus()) {
					price *= 0.7;
					System.out.println("--> Reduce Price: " + price);
				}
			}else {
				System.out.println("--> Reference Book " + book.getId());
				System.out.println("--> Price: " + price);
				ReferenceBook rBook = (ReferenceBook)book;
				price *= (1+rBook.getTax())/100;
				System.out.println("--> Reduce Price: " + price);
			}
			totalOfMoney += price;
		}
		return totalOfMoney;
	}

	public static void printf(Book[] books) {
		for (Book book : books)
			System.out.println(book);
	}
}
