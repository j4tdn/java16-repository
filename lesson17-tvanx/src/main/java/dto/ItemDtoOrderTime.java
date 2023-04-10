package dto;

import java.sql.Date;
import java.time.LocalTime;

public class ItemDtoOrderTime {
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_ORDER_TIME = "orderTime";
	
	private Integer id;
	private String name;
	private LocalTime orderTime;
	
	public ItemDtoOrderTime() {
		// TODO Auto-generated constructor stub
	}

	public ItemDtoOrderTime(Integer id, String name,  LocalTime orderTime) {
		this.id = id;
		this.name = name;
		this.orderTime = orderTime;
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

	public  LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime( LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "ItemDtoOrderTime [id=" + id + ", name=" + name + ", orderTime=" + orderTime + "]";
	}
	
	
	
}
