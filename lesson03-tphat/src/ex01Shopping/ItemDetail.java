package ex01Shopping;

public class ItemDetail {
	private Item item;
	private int quanlity;
	
	public ItemDetail() {
		
	}

	public ItemDetail(Item item, int quanlity) {
		this.item = item;
		this.quanlity = quanlity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuanlity() {
		return quanlity;
	}

	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}

	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", quanlity=" + quanlity + "]";
	}
	
	
	
	
}
