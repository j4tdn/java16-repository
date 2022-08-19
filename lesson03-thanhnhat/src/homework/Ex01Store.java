package homework;

import java.time.LocalDateTime;

public class Ex01Store {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "243", "California");

		Item i1 = new Item("SSA10", "Android", "Blue", 620);
		Item i2 = new Item("SS11+", "Android", "Black", 840);
		Item i3 = new Item("IP6s", "IOS", "Gold", 280);
		Item i4 = new Item("IP11", "IOS", "Black", 880);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);

		Order o1 = new Order(c1,
				new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i4, 5), new ItemDetail(i2, 1) },
				LocalDateTime.of(2022, 8, 18, 4, 0));
		Order o2 = new Order(c2,
				new ItemDetail[] { new ItemDetail(i3, 2), new ItemDetail(i5, 1), new ItemDetail(i2, 1) },
				LocalDateTime.of(2022, 8, 17, 20, 20));
		Order o3 = new Order(c2, new ItemDetail[] { new ItemDetail(i4, 1) }, LocalDateTime.of(2022, 8, 18, 9, 10));
		System.out.println("Order 1: " + o1.export());
		System.out.println("Order 2: " + o2.export());
		System.out.println("Order 3: " + o3.export());

	}

}
