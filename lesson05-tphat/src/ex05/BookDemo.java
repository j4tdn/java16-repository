package ex05;

public class BookDemo {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		TextBook gk1 = new TextBook("SGK1", 80d, "Nhi Dong", "Moi");
		TextBook gk2 = new TextBook("SGK2", 60d, "Thang Long", "Cu");
		TextBook gk3 = new TextBook("SGK3", 70d, "Kim Dong", "Moi");

		ReferenceBook tk1 = new ReferenceBook("STK1", 50d, "Nhi Dong", 20);
		ReferenceBook tk2 = new ReferenceBook("STK2", 40d, "Van Vu", 20);
		
		
		System.out.println("===== Bo Sach Thuoc Nha Xuat Ban Nhi Dong =======");
		searchNXB(book, "Nhi Dong");

		System.out.println("===== Bo Sach Don Gia < 50 =======");
		searchBook(book, 50d);

		System.out.println("===== Dong Gia Cua KhacH Hang La =======");
		Book[] books = new Book[2];
		books[0] = gk1;
		books[1] = gk2;
		System.out.println(intoMoney(books));
	}

	public static void searchNXB(Book[] book, String n) {
		Book[] items = new Book[5];
		int i = 0;
		for (Book item : book) {
			if (item.getPublishing() == n) {
				items[i] = item;
				i++;
			}
		}
		for (Book item : items) {
			System.out.println(item.toString());
		}
	}

	public static void searchBook(Book[] book, double n) {
		Book[] B = new Book[5];
		int i = 0;
		for (Book item : book) {
			if (item.getCost() < n) {
				B[i] = item;
				i++;
			}
		}
		for (Book item : B) {
			System.out.println(item.toString());
		}
	}

	public static double intoMoney(Book[] sach) {
		double sumMoney = 0;
		for (Book item : sach) {
			sumMoney = sumMoney + item.intoMoney();
		}
		return sumMoney;
	}

}
