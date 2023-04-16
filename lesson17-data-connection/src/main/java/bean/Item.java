package bean;

import java.util.Objects;

public class Item {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_COLOR = "color";
	public static final String PROP_SELLPRICE = "sellPrice";
	public static final String PROP_BUYPRICE = "buyPrice";
	public static final String PROP_MATERIAL = "material";
	
	public static final String PROP_ITEM = "item";
	
	private Integer id;
	private String name;
	private String color;
	private Double sellPrice;
	private Double buyPrice;
	private String material;
	private ItemGroup ig;
	
	// SQL => n - 1
	// OOP => has-a
	
	// Class N {
	// -- it's properties
	// -- Mapping Parent Object
	// }
	
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, String color, Double sellPrice, Double buyPrice, String material,
			ItemGroup ig) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.sellPrice = sellPrice;
		this.buyPrice = buyPrice;
		this.material = material;
		this.ig = ig;
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

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public ItemGroup getIg() {
		return ig;
	}

	public void setIg(ItemGroup ig) {
		this.ig = ig;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", sellPrice=" + sellPrice + ", buyPrice="
				+ buyPrice + ", material=" + material + ", ig=" + ig + "]";
	}
}
