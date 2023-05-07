package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "buy_price")
	private Double buyPrice;
	
	@Column(name = "sell_price")
	private Double sellPrice;
	
	@Column(name = "material")
	private String material;
	
	
	
	@ManyToOne
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID", nullable = false)
	private ItemGroup itemGroup;
	
	// JPA/Hibernate require constructor
	public Item() {
		
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
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", buyPrice=" + buyPrice + ", sellPrice="
				+ sellPrice + ", material=" + material + "], itemGroup = " + itemGroup;
	}
	
	
	// item_group_id
	
	// provider_id
}
