package shopping;

import java.time.LocalDateTime;

import java.util.Arrays;

public class Order {//khách hàng nào?
	private Customer customer; 
	private ItemDetail[] itemDetail;//mảng Itemdetail[] 
	private LocalDateTime orderDate;//lưu ngày tháng năm

	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		this.customer = customer;
		this.itemDetail = itemDetails;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail[] itemDetail) {
		this.itemDetail = itemDetail;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}


	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + ", orderDate="
				+ orderDate + "]";
	}

}
