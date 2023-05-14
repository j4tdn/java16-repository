package persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "buy_price")
	private Double buyprice;
	
	@Column(name = "sell_price")
	private Double sellprice;
	
	@Column(name = "material")
	private String material;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID", nullable = false)
	private ItemGroup itemgroup;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", color=" + color + ", buyprice=" + buyprice + ", sellprice=" + sellprice
				+ ", material=" + material + ", itemgroup=" + itemgroup + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getBuyprice() {
		return buyprice;
	}

	public void setBuyprice(Double buyprice) {
		this.buyprice = buyprice;
	}

	public Double getSellprice() {
		return sellprice;
	}

	public void setSellprice(Double sellprice) {
		this.sellprice = sellprice;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public ItemGroup getItemgroup() {
		return itemgroup;
	}

	public void setItemgroup(ItemGroup itemgroup) {
		this.itemgroup = itemgroup;
	}

	public Item(Integer id, String color, Double buyprice, Double sellprice, String material, ItemGroup itemgroup) {
		super();
		this.id = id;
		this.color = color;
		this.buyprice = buyprice;
		this.sellprice = sellprice;
		this.material = material;
		this.itemgroup = itemgroup;
	}
}
