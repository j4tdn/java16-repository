package shopping;

import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "243", "California");

		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 320);
		Item i3 = new Item("IP4", "IOS", "White", 420);
		Item i4 = new Item("IP12", "IOS", "Black", 220);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 630);

		Order o1 = new Order(c1,
				new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i4, 5), new ItemDetail(i2, 1) },
				LocalDateTime.of(2022, 8, 19, 10, 10, 10));
		Order o2 = new Order(c2, new ItemDetail[] { new ItemDetail(i3, 2), new ItemDetail(i5, 1)

		}, LocalDateTime.of(2022, 7, 19, 10, 2, 2));
		Order o3 = new Order(c2, new ItemDetail[] { new ItemDetail(i4, 1)

		}, LocalDateTime.of(2022, 8, 19, 10, 7, 32));
		
		OrderUtils dt = new OrderUtils();
		System.out.println("Order 1: " + dt.export(o1));
		System.out.println("Order 2: " + dt.export(o2));
		System.out.println("Order 3: " + dt.export(o3));
		
		
		

		// Write method export in Order class: no-parameter
		// Write method export in Another class: export(order)
	}

}
