package bean;

import java.util.Objects;

public class Item {
	
	public static final String PROP_ITEM = "item";
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_COLOR = "color";
	public static final String PROP_BUY_PRICE = "buyPrice";
	public static final String PROP_SELL_PRICE = "sellPrice";
	public static final String PROP_METERIAL = "meterial";	
	
	private Integer id;
	private String name;
	private String color;
	private Double buyPrice;
	private Double sellPrice;
	private String meterial;
	
	private ItemGroup itemGroup;
	
	public Item() {
	}

	public Item(Integer id, String name, String color, Double buyPrice, Double sellPrice, String material,
			ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.meterial = material;
		this.itemGroup = itemGroup;
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

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getMaterial() {
		return meterial;
	}

	public void setMaterial(String material) {
		this.meterial = material;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getItemGroup().getId());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Item)) {
			return false;
		}
		ItemGroup that = (ItemGroup)o;
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", buyPrice=" + buyPrice + ", sellPrice="
				+ sellPrice + ", material=" + meterial + ", itemGroup=" + itemGroup + "]";
	}
		
}
