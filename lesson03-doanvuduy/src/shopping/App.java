package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "243", "California");

		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 840);
		Item i3 = new Item("IP4", "IOS", "White", 280);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP*", "Windowphone", "Blue", 560);

		Order o1 = new Order(c1,
				new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i4, 5), new ItemDetail(i2, 1) },
				LocalDateTime.of(2022, 8, 19, 10, 10, 10));
		
		Order o2 = new Order(c1,
				new ItemDetail[] { new ItemDetail(i1, 4), new ItemDetail(i3, 5), new ItemDetail(i2, 1) },
				LocalDateTime.of(2022, 8, 20, 12, 10, 10));
		
		Order o3 = new Order(c1,
				new ItemDetail[] { new ItemDetail(i1, 4), new ItemDetail(i2, 2), new ItemDetail(i2, 1) },
				LocalDateTime.of(2022, 8, 21, 11, 10, 10));
		
		System.out.println("Order 1: "+o1.export());
		System.out.println("Order 2: "+o2.export());
		System.out.println("Order 3: "+o3.export());
	}
}
