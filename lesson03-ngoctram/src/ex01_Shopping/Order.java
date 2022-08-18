package ex01_Shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDate;
	// để lưu ngày tháng năm - gi�? phút giây thì dùng LocalDateTime
	// nếu chỉ lưu ngày tháng năm thì dùng LocalDate

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
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

	public double export() {
		double totalOfMoney = 0;

		ItemDetail[] ids = this.getItemDetails();

		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();

			double itemCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2022, 5, 5).isEqual(this.getOrderDate().toLocalDate())) {
				itemCost *= 0.9;
			}
			totalOfMoney += itemCost;
		}

		return totalOfMoney;
	}
}
