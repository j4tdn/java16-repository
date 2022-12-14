package ex1shopping;

import java.time.LocalDateTime;

public class Ex01shopping {
	public static void main(String[] args) {
		
		
		Customer c1 = new Customer("Kh1","Min","0786351432","QNam");
		Customer c2 = new Customer("Kh2","Ca","0589232123","QNgai");

		Item i1 = new Item("IP11","Ios","Purple",520);
		Item i2 = new Item("IP12","Ios","Blue",770);
		Item i3 = new Item("SSZF","Android","Gold",780);
		Item i4 = new Item("SSNote8","Android","White",650);
		
		ItemDetail[] ids1 ={new ItemDetail(i1,2), new ItemDetail(i2,1),new ItemDetail(i3,1)};
		
		Order o1 = new Order(c1,ids1 , LocalDateTime.of(2022, 8, 12, 10, 00, 20));
		
		ItemDetail[] ids2 ={new ItemDetail(i2,2),new ItemDetail(i3,2),new ItemDetail(i4,1)};
		
		Order o2 = new Order(c2, ids2, LocalDateTime.of(2022, 8, 16, 17, 40, 20));
		
		ItemDetail[] ids3 = {new ItemDetail(i3,3)};
		
		Order o3 = new Order(c1,ids3 , LocalDateTime.of(2022, 8, 20, 20, 30, 19));
		
		System.out.println("Customer 1: " + c1);
		System.out.println(ids1[0]);
		System.out.println(ids1[1]);
		System.out.println(ids1[2]);
		System.out.println("Total : " + o1.export());
		
		System.out.println("Customer 2: " + c2);
		System.out.println(ids2[0]);
		System.out.println(ids2[1]);
		System.out.println(ids2[2]);
		System.out.println("Order 2: " + o2.export());
		
		System.out.println("Customer 1: " + c1);
		System.out.println(ids3[0]);
		System.out.println("Order 3: " + o3.export()); 

	}
}
