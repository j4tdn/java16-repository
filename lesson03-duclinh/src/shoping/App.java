package shoping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1"," Peter"," 123","NewYork");
		Customer c2 = new Customer("KH2"," Alice", "324", "Cali");
		
		Item i1 = new Item("IP4", "IOS", "White", 280);
		Item i2 = new Item("IP7", "IOS", "White", 480);
		Item i3 = new Item("IP7", "IOS", "Black", 480);
		Item i4 = new Item("IP12", "IOS", "White",680);
		Item i5 = new Item("IP13", "IOS", "Blue", 780);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1, 3),
				new ItemDetail(i4, 2),
				new ItemDetail(i5, 5)
				
		},LocalDateTime.of(2022, 7, 7, 10, 10, 10));
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i1, 3),
				new ItemDetail(i4, 5),
				new ItemDetail(i2, 2)
				
		},LocalDateTime.of(2022, 7, 8, 8, 10, 30));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i1, 3),
				new ItemDetail(i4, 5),
				new ItemDetail(i2, 2)
				
		},LocalDateTime.of(2022, 7, 8, 20, 30, 10));
		

		System.out.println("Order 1: "+ OrderUtils.export(o1));
		System.out.println("Order 1: "+ o2);
		System.out.println("Order 1: "+ o3);
	}
}
