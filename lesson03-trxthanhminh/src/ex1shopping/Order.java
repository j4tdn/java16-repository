package ex1shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {

	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime datetime;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime datetime) {
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.datetime = datetime;
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

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", datetime="
				+ datetime + "]";
	}

	public double export() {
		double total = 0;
		
		ItemDetail[] ids = getItemDetails();
		for (ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idPrice = item.getPrice()* quantity;
			if (item.getPrice()>650 && LocalDate.of(2022, Month.OCTOBER, 15).isEqual(getDatetime().toLocalDate())) {
				idPrice *= 0.9;

			}else {
				total += idPrice;

			}
		}
		
		return total;
	}
	
}
