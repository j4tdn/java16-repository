package shoping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils() {

	}

	public static double export(Order order) {
		double totolOfMoney = 0;

		ItemDetail[] ids = order.getItemDetails();
//		for(int i = 0 ; i < ids.length;i++) {
//			ItemDetail id = ids[i];
//		}

		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2022, Month.JULY, 7).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totolOfMoney += idCost;
		}
		return totolOfMoney;
	}
}
