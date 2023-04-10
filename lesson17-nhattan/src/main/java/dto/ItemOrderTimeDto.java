package dto;

import java.time.LocalTime;

public class ItemOrderTimeDto extends ItemDto{
	
	public static final String PROP_ORDER_TIME = "orderTime";
	
	private LocalTime orderTime;
	
	public ItemOrderTimeDto() {
	}

	public ItemOrderTimeDto(Integer itId, String itName, LocalTime orderTime) {
		super(itId, itName);
		this.orderTime = orderTime;
	}
	
	public LocalTime getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "ItemOrderTimeDto [" + super.toString() + ", orderTime=" + orderTime + "]";
	}
	
	
}
