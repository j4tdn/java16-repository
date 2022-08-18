package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemdetail;
	private LocalDateTime orderdate;
	public Order(Customer customer, ItemDetail[] itemdetail, LocalDateTime orderdate) {
		super();
		this.customer = customer;
		this.itemdetail = itemdetail;
		this.orderdate = orderdate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ItemDetail[] getItemdetail() {
		return itemdetail;
	}
	public void setItemdetail(ItemDetail[] itemdetail) {
		this.itemdetail = itemdetail;
	}
	public LocalDateTime getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDateTime orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemdetail=" + Arrays.toString(itemdetail) + ", orderdate="
				+ orderdate + "]";
	}
	
	public double export() {
		double totolOfMoney = 0;
		
		ItemDetail[] ids = getItemdetail();
		
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idcost = item.getCost()*quantity;
			if(item.getCost()> 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderdate().toLocalDate())) {
				idcost *= 0.9;
			}
			totolOfMoney += idcost;
		}
		return totolOfMoney;
	}
	
	
	
	
	


}
