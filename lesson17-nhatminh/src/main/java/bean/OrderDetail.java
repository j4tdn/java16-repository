package bean;

public class OrderDetail {
	public static final String PROP_ITEM = "item";
	public static final String PROP_ORDER = "order";
	public static final String PROP_AMOUNT = "amount";

	private Order order;
	private Item item;
	private Integer amount;

	public OrderDetail() {
	}

	public OrderDetail(Order order, Item item, Integer amount) {
		this.order = order;
		this.item = item;
		this.amount = amount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderDetail [order=" + order + ", item=" + item + ", amount=" + amount + "]";
	}
}
