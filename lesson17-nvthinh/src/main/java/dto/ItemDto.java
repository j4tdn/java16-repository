package dto;

import java.time.LocalTime;

public class ItemDto {
	private Integer id;
	private String name;	
	private Integer amount;
	private LocalTime deliveryTime;
	public ItemDto() {
	}
	
	public ItemDto(Integer id, String name, LocalTime deliveryTime) {
		this.id = id;
		this.name = name;
		this.deliveryTime = deliveryTime;
	}

	public ItemDto(Integer id, String name, Integer amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalTime getDeliveryDate() {
		return deliveryTime;
	}
	public void setDeliveryDate(LocalTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Integer getamount() {
		return amount;
	}

	public void setamount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "\nItemDto [id=" + id + ", name=" + name + ", amount=" + amount + ", deliveryTime=" + deliveryTime + "]";
	}
	
	
}