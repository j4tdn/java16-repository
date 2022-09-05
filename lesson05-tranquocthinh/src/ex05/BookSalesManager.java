package ex05;

public class BookSalesManager {
	public static void main(String[] args) {
		Customer c1 = new Customer("id01", "Thịnh", "0123456789", "Quảng Trị");
		Customer c2 = new Customer("id02", "Thủy", "0123789789", "Huế");

		TextBook t1 = new TextBook("SGK01", 5000, "Giáo Dục", "NEW");
		TextBook t2 = new TextBook("SGK02", 50, "Nhi Đồng", "OLD");
		TextBook t3 = new TextBook("SGK03", 150, "Giáo Dục", "NEW");

		ReferenceBook r1 = new ReferenceBook("RB01", 35, "Kim Đồng", 5);
		ReferenceBook r2 = new ReferenceBook("RB02", 200, "Nhi Đồng", 10);

		Book[] books = { t1, t2, t3, r1, r2 };

		System.out.println("Toàn bộ sách thuộc nhà xuất bản nhi đồng là: ");
		BookUtils.findPublishCompany(books);
		System.out.println("===================================================================================");

		System.out.println("Toàn bộ sách có đơn giá nhỏ hơn 50 là: ");
		BookUtils.findBookLessThan50(books);
		System.out.println("===================================================================================");

		System.out.println("Toàn bộ sách giáo khoa có đơn giá từ 100 - 200 là: ");
		BookUtils.findBookPriceFrom100To200(new TextBook[] { t1, t2, t3 });

	}

}
