package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Addam", "123", "Newyork");//2 đối tượng customer
		Customer c2 = new Customer("KH2", "Kate", "243", "California");

		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 840);
		Item i3 = new Item("IP4", "IOS", "White", 280);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP8", "Windowphone", "Blue", 560);

		Order o1 = new Order(c1, new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i4, 5), new ItemDetail(i2, 1)

		}, LocalDateTime.of(2022, 19, 8, 8, 30, 21));
		
		Order o2 = new Order(c2, new ItemDetail[] { new ItemDetail(i3, 2), new ItemDetail(i5, 1)

		}, LocalDateTime.of(2022, 19, 8, 13, 56, 34));
		
		Order o3 = new Order(c2, new ItemDetail[] { new ItemDetail(i1, 2)

		}, LocalDateTime.of(2022, 20, 8, 17, 45, 7));
		
		System.out.println("Order 1: " + OrderUltils.export(o1));
		System.out.println("Order 2: " + OrderUltils.export(o2));
		System.out.println("Order 3: " + OrderUltils.export(o3));
	}

}
//hàm không quan tâm đến đối tượng nó đang gọi, gọi đối tượng nào cũng cho 1 kết quả--> static
//hàm mỗi đối tượng gọi cho 1 kết quả khác nhau và phụ thuộc vào các thuộc tính bên trong đối tượng--> hàm đó phụ thuộc vào đối tượng--> non-static