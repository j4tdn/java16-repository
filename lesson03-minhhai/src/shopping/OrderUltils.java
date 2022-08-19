package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUltils {
	public static double export(Order order) {
		double totalOfMoney = 0;

		ItemDetail[] ids = order.getItemDetail();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(20022, Month.AUGUST, 19).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9; 
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
}
