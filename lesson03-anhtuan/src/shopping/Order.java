package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderday;
	public Order() {
		
	}
	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderday) {
		
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderday = orderday;
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
	public LocalDateTime getOrderday() {
		return orderday;
	}
	public void setOrderday(LocalDateTime orderday) {
		this.orderday = orderday;
	}
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderday="
				+ orderday + "]";
	}
	
	
	

}
