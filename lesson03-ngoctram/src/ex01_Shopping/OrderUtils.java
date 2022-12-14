package ex01_Shopping;

import java.time.LocalDate;

/*
 * Utility of Order Class 
 * Normally: Utility is the place where utility methods are
 * It doesn't care any created objects of the class
 */
public class OrderUtils {
	private OrderUtils() {
		
	}
	
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			if (item.getCost() > 590 && LocalDate.of(2022, 5, 5).isEqual(order.getOrderDate().toLocalDate()))
				totalOfMoney += item.getCost() * 0.9 * quantity;
			else
				totalOfMoney += item.getCost() * quantity;
		}
		return totalOfMoney;
	}
}
