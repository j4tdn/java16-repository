package shopping;

import java.time.LocalDate;
import java.time.Month;

/*
 * OrderUltils: lớp tiện ích là các lớp chứa hàm tiện ích
 * là hàm cho mình truyền tham số xong dựa vào tham số để tính toán
 */

public class OrderUltils {
	
	private OrderUltils() {// cấm không cho tạo đối tượng ra

	}
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
