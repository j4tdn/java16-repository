package bean;

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
	
	// sql --> n-1 --> n has fk
	// oop --> has-a
	private ItemGroup itemGroup;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, String color, Double buyPrice, Double sellPrice, String meterial,
			ItemGroup itemGroup) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.meterial = meterial;
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

	public String getMeterial() {
		return meterial;
	}

	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", buyPrice=" + buyPrice + ", sellPrice="
				+ sellPrice + ", meterial=" + meterial + ", itemGroup=" + itemGroup + "]";
	}
	
	
}
