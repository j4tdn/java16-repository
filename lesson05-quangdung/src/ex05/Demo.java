package ex05;

public class Demo {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		TextBook tb1 = new TextBook("SGK01", 20, "Nhi Dong", "Moi");
		TextBook tb2 = new TextBook("SGK02", 30, "Nhat Dong", "Cu");
		TextBook tb3 = new TextBook("SGK03", 60, "Kim Dong", "Moi");

		ReferenceBooks rb1 = new ReferenceBooks("STK01", 20, "Nhat Dong", 20);
		ReferenceBooks rb2 = new ReferenceBooks("STK02", 30, "Nhat Dong", 20);

		book[0] = tb1;
		book[1] = tb2;
		book[2] = tb3;
		book[3] = rb1;
		book[4] = rb2;

		System.out.println("Tim sach thuoc nha xuat ban Nhi Dong");
		findPublishingCompany(book, "Nhi Dong");

		System.out.println("Bo Sach Don Gia < 50");
		findBook(book, 50);

		System.out.println("Dong Gia Cua KhacH Hang La");
		Book[] book2 = new Book[2];
		book2[0] = tb1;
		book2[1] = tb2;
		System.out.println(money(book2));
	}

	public static void findPublishingCompany(Book[] book, String n) {
		Book[] B = new Book[5];
		int i = 0;
		for (Book item : book) {
			if (item.getNhaXB() == n) {
				B[i] = item;
				i++;
			}
		}
		for (Book item : B) {
			System.out.println(item.toString());
		}
	}

	public static void findBook(Book[] book, double n) {
		Book[] B = new Book[5];
		int i = 0;
		for (Book item : book) {
			if (item.getDonGia() < n) {
				B[i] = item;
				i++;
			}
		}
		for (Book item : B) {
			System.out.println(item.toString());
		}
	}

	public static double money(Book[] book) {
		double tongtien = 0;
		for (Book item : book) {
			tongtien = tongtien + item.tinhtien();
		}
		return tongtien;
	}

}
