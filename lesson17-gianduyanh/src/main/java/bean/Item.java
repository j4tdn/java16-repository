package bean;

public class Item {
	
	private Integer itemID;
	private String name;
	private String color;
	private Integer itemgroup;
	private Integer price;
	public Item(Integer itemID, String name, String color, Integer itemgroup, Integer price) {
		
		this.itemID = itemID;
		this.name = name;
		this.color = color;
		this.itemgroup = itemgroup;
		this.price = price;
	}
	
	

	public Integer getItemID() {
		return itemID;
	}
	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getItemgroup() {
		return itemgroup;
	}
	public void setItemgroup(Integer itemgroup) {
		this.itemgroup = itemgroup;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", name=" + name + ", color=" + color + ", itemgroup=" + itemgroup
				+ ", price=" + price + "]";
	}
	
	

}
