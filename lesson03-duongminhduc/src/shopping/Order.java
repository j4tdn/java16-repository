package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {

	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDate;

	public Order() {

	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		super();
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDate="
				+ orderDate + "]";
	}

//	public double export() {
//		// TODO Auto-generated method stub
//		double totolOfMoney = 0;
//
//		ItemDetail[] ids = getItemDetails();
//
//		// for each
//		for (ItemDetail id : ids) {
//
//			Item item = id.getItem();
//			int quantity = id.getQuantity();
//			
//	
//			if(LocalDate.of(2022, Month.AUGUST, 19).isEqual(getOrderDate().toLocalDate()))
//			{
//				totolOfMoney += item.getCost() * quantity * 0.9;
//			}
//			else
//			{
//				totolOfMoney += item.getCost() * quantity;
//			}
//			
//		}
//
//		return totolOfMoney;
//	}

}
