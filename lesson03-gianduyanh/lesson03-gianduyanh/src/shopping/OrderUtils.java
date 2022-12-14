package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	public double export(Order order) {
		double totolOfMoney = 0;
		
		ItemDetail[] ids = order.getItemdetail();
		
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idcost = item.getCost()*quantity;
			if(item.getCost()> 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderdate().toLocalDate())) {
				idcost *= 0.9;
			}
			totolOfMoney += idcost;
		}
		return totolOfMoney;
	}

}
