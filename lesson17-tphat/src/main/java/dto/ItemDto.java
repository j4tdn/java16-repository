package dto;

import java.sql.Date;
import java.time.LocalDate;

public class ItemDto {
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_ORDER_DETAIL = "order_detail";

	private Integer id;
	private String name;
	private Date order_detail;

	public ItemDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemDto(Integer id, String name, Date order_detail) {
		this.id = id;
		this.name = name;
		this.order_detail = order_detail;
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

	public Date getOrder_detail() {
		return order_detail;
	}

	public void setOrder_detail(Date order_detail) {
		this.order_detail = order_detail;
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", order_detail=" + order_detail + "]";
	}

}
