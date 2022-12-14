package shopping;

import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {
		Customer c1 = new Customer("KH1 ", "ADAM", "123", "Newyork");
		Customer c2 = new Customer("KH2 ", "Kate", "123", "Kalifornia");
		
		Item i1 = new Item("SS10+", "android ", "Black ", 620 );
		Item i2 = new Item("SS20U", "android ", "Gren ", 840 );
		Item i3 = new Item("IP4", "IOS ", "White ", 280 );
		Item i4 = new Item("IP12", "IOS ", "Black ", 880 );
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);
		ItemDetail[] idt1 = new ItemDetail[]  { 
				new ItemDetail(i1, 3),
				new ItemDetail(i4, 5),
				new ItemDetail(i2, 1),};
		Order o1 = new Order(c1, idt1, LocalDateTime.of(2012, 5, 8, 10, 10, 10)) ;
		ItemDetail[] idt2 = new ItemDetail[]  { 
				new ItemDetail(i3, 2),
				new ItemDetail(i5, 1),
				};
		Order o2 = new Order(c2, idt2, LocalDateTime.of(2012, 5, 7, 20, 10, 12)) ;
		ItemDetail[] idt3 = new ItemDetail[]  { 
				new ItemDetail(i4, 1),
				};
		Order o3 = new Order(c2, idt3, LocalDateTime.of(2012, 5, 8, 9, 28, 32)) ;
		System.out.println("Order 1:" + o1.export());
		System.out.println("Order 2:" + o2.export());
		System.out.println("Order 3:" + o3.export());
	}

}
