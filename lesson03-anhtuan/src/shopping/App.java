package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		
	
	Customer c1= new Customer("KH1", "Adam", "123", "NewYork");
	Customer c2= new Customer("KH2", "Kate", "243", "California");
	
	
	Item i1= new Item("SS10+", "Androi", "Black", 620);
	Item i2= new Item("SS20U", "Androi", "Green", 840);
	Item i3= new Item("Ip4", "Ios", "White", 280);
	Item i4= new Item("Ip12", "Ios", "Black", 880);
	Item i5= new Item("WP8", "WindownPhone", "Blue", 560);
	
	ItemDetail[] ids1 = new ItemDetail[] {
			new ItemDetail(i1, 3), 
			new ItemDetail(i4, 5), 
			new ItemDetail(i2, 1)		
	};
	Order o1 = new Order(c1, ids1 , LocalDateTime.of(2022, 8, 17, 10, 10, 30));
	
	
	ItemDetail[] ids2 = new ItemDetail[] {
			new ItemDetail(i3, 2), 
			new ItemDetail(i5, 1), 			
	};
	Order o2 = new Order(c1, ids2 , LocalDateTime.of(2022, 8, 17, 20, 12, 22));
	
	
	ItemDetail[] ids3 = new ItemDetail[] {
			new ItemDetail(i4, 1),
	};
	Order o3 = new Order(c2, ids3 , LocalDateTime.of(2022, 8, 17, 21, 9, 32));
	
	
	 System.out.println("o1= " + OrderUtils.export(o1));
	 System.out.println("o2= " + OrderUtils.export(o2));
	 System.out.println("o3= " + OrderUtils.export(o3));
}

}
