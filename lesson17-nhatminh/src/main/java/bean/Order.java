package bean;

import java.time.LocalTime;
import java.util.List;

public class Order {
	public static final String PROP_ID = "id";
	public static final String PROP_ORDER_TIME = "orderTime";

	private Integer id;
	private LocalTime orderTime;
	private List<OrderDetail> orderDetails;

	public Order() {
		super();
	}

	public Order(Integer id, LocalTime orderTime, List<OrderDetail> orderDetails) {
		super();
		this.id = id;
		this.orderTime = orderTime;
		this.orderDetails = orderDetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderTime=" + orderTime + ", orderDetails=" + orderDetails + "]";
	}
}
