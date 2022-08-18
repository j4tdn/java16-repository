package Ex01Shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "234", "California");

		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U+", "Android", "Green", 840);
		Item i3 = new Item("IP4", "Ios", "white", 280);
		Item i4 = new Item("IP12", "Ios", "Black", 880);
		Item i5 = new Item("Wp8", "WindownPhone", "Blue", 560);

		Order o1 = new Order(c1,
				new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i4, 5), new ItemDetail(i2, 1) },
				LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		Order o2 = new Order(c2, new ItemDetail[] { new ItemDetail(i3, 2), new ItemDetail(i5, 1) },
				LocalDateTime.of(2021, 5, 7, 10, 10, 10));
		Order o3 = new Order(c2, new ItemDetail[] { new ItemDetail(i4, 5) }, LocalDateTime.of(2021, 5, 8, 10, 10, 10));

		System.out.println("Oder1: "+o1.export());
		System.out.println("Oder2: "+o2.export());
		System.out.println("Oder3: "+o3.export());
		o1.showInfo();
		o2.showInfo();
		o3.showInfo();
	}
}
