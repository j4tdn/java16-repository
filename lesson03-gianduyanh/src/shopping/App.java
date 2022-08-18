package shopping;

import java.time.LocalDateTime;
import shopping.Order;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adem","123","NewYork");
		Customer c2 = new Customer("KH2", "LISA","231","Paris");
		
		Item it1 = new Item("IPX", "IOS", "SILVER", 620);
		Item it2 = new Item("IP12", "IOS", "BLACK", 270); 
		Item it3 = new Item("IP11PRO", "IOS", "GREEN", 120); 
		Item it4 = new Item("SS22UTRA", "ANDROID", "BLUE", 820); 
		Item it5 = new Item("SS22UTRAPLUS", "ANDROID", "red", 220); 
		
		Order or1 = new Order(c1,new ItemDetail[] { 
						new ItemDetail(it1, 3),
						new ItemDetail(it2, 5), 
						new ItemDetail(it4, 1),

				}, LocalDateTime.of(2022, 8, 17, 3, 30, 20));
		
		Order or2 = new Order(c2,new ItemDetail[] { 
				new ItemDetail(it1, 3),
				
				new ItemDetail(it4, 3),

		}, LocalDateTime.of(2022, 8, 20, 4, 30, 20));
		
		Order or3 = new Order(c2,new ItemDetail[] { 
				new ItemDetail(it1, 3),
				

		}, LocalDateTime.of(2022, 8, 22, 4, 50, 20));
		OrderUtils ou1 = new OrderUtils();
		System.out.println("Oder1 : " + ou1.export(or1));
		System.out.println("Oder2 : " + ou1.export(or2));
		System.out.println("Oder3 : " + ou1.export(or3));
		
		
		
	}

}
