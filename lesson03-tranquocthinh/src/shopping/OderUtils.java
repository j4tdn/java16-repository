package shopping;

import java.time.LocalDate;
import java.time.Month;

/*
 * Utility of Oder Class
 * Normally: Utility is place where contains utility methods
 * No cares created an object 	
 */
public class OderUtils {
	
	private OderUtils() {
	}
	
	public static double export(Order order) {
		double totalOfMoney = 0;
		
		ItemDetail[] ids = order.getItemDetails();
		for(ItemDetail id:ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			if(item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				totalOfMoney += item.getCost() * quantity * 0.9;
			} else {
				totalOfMoney += item.getCost() * quantity;
			}
		}
		
		return totalOfMoney;
	}

}
