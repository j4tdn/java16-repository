package shopping;

import java.time.LocalDate;

public class OrderUtils {
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			if (item.getCost() > 590 && LocalDate.of(2021, 5, 8).isEqual(order.getOrderDate().toLocalDate()))
				totalOfMoney += item.getCost() * 0.9 * quantity;
			else
				totalOfMoney += item.getCost() * quantity;
		}
		return totalOfMoney;
	}
}