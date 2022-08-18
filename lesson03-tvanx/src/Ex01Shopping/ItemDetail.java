package Ex01Shopping;

public class ItemDetail {
	private Item id;
	private int quantity;

	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Item id, int quantity) {
		this.id = id;
		this.quantity = quantity;
	}

	public Item getId() {
		return id;
	}

	public void setId(Item id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", quantity=" + quantity + "]";
	}

}
