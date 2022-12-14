package ex1_shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		/* C1: KH1, Adam, 123, NewYorrk
		C2: Kh2, Kate, 243, California
		i1: SS10+, Android, Black, 620
		i2: SS20U, Android, Green, 840
		i3: IP8, IOS, White, 280
		i4: IP12, IOS, Blue, 5600
		i5: MI, Android, Black, 550*/ 
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYorrk");
		Customer c2 = new Customer("KH2", "Kate", "243", "California");
		
		Item i1 = new Item("SS10", "Android", "Black", 200);
		Item i2 = new Item("SS20U", "Android", "Green", 800);
		Item i3 = new Item("IP8", "IOS", "White", 250);
		Item i4 = new Item("IP12", "IOS", "Blue", 300);
		Item i5 = new Item("MI", "Android", "Black", 550);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1, 3),
				new ItemDetail(i4, 5),
				new ItemDetail(i2, 2)
		}, LocalDateTime.of(2022, 8, 15, 10, 24, 50));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3, 3),
				new ItemDetail(i5, 2)
		}, LocalDateTime.of(2022, 8, 18, 12, 24, 00));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i5, 1)
		}, LocalDateTime.of(2022, 8, 19, 13, 00, 00));
		
		System.out.println("Order 1: "+  OrderUtils.export(o1));
		System.out.println("Order 2: "+  OrderUtils.export(o2));
		System.out.println("Order 3: "+  OrderUtils.export(o3));
		System.out.println("=========================================");
		OrderUtils.print(o1);
		System.out.println("=========================================");

		OrderUtils.print(o2);
		System.out.println("=========================================");

		OrderUtils.print(o3);
		System.out.println("=========================================");


		
		//write method export in Order class: no-parameter
		//write method export in Another class: export(Order)
		
	}

}
