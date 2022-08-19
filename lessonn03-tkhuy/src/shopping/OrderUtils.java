package shopping;

import java.time.LocalDate;
import java.time.Month;

/*
 * Utility of  Order class: truyền tham số, dựa vào tham số sử lý tính toán không phụ thuộc vào đối tượng đang gọi
 * Normally: Utility is place where contain utility methods
 * No cares created class's object
 */
public class OrderUtils {
	private OrderUtils() {
	}
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids =  order.getItemDetails();
		for(ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idcost =  item.getCost() * quantity;
			if(item.getCost() > 590 && LocalDate.of(2022, Month.AUGUST, 15).isEqual(order.getOrderDate().toLocalDate())) {
				totalOfMoney *=  0.9;
			}
			totalOfMoney += idcost;
		}
		return totalOfMoney;
	}
	
	
	
	public static void print(Order order) {
		System.out.println("BILL");
		System.out.println("Customer: " +order.getCustomer().getName());
		ItemDetail[] ids =  order.getItemDetails();
		for(ItemDetail id: ids) {
			Item item = id.getItem();
			System.out.println("Item: " + item.getId());
			System.out.println("Quantity: " +id.getQuantity());
		}
		System.out.println("Total of money: " + export(order));
		System.out.println("Datetime: " +order.getOrderDate());
	}
	


}
