
package dto;


import bean.ItemGroup;

public class ItemDtoByIG {
	private Integer id;
	private String name;
	private String color;
	private ItemGroup itemGroup; //mapping 1-n
	private double sellprice;
	public ItemDtoByIG() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemDtoByIG(Integer id, String name, String color, ItemGroup itemGroup, double sellprice) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.itemGroup = itemGroup;
		this.sellprice = sellprice;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ItemGroup getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}
	public double getsellprice() {
		return sellprice;
	}
	public void setsellprice(double sellprice) {
		this.sellprice = sellprice;
	}

	@Override
	public String toString() {
		return "\nItemDtoByIG [id=" + id + ", name=" + name + ", color=" + color + ", itemGroup=" + itemGroup
				+ ", sellprice=" + sellprice + "]";
	}
	
	
}