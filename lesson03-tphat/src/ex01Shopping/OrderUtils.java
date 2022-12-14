package ex01Shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {

	public static double export(Order order) {
		double totolOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuanlity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2022, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost = idCost * 0.9;
			}
			totolOfMoney = totolOfMoney + idCost;
			
		}

		return totolOfMoney;
	}
	
}
