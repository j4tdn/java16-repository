package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	// @Transient --> ignore mapping column
	
	/*
	 Mặc định 
	 --> khi get dữ liệu cho từng item --> tự động truy vấn lấy dữ liệu cho item_group
	 chưa biết có cần sử dụng hay không --> eager fetch
	 
	 Thay vì
	 --> Chuyển đổi từ eager fetch --> lazy fetch --> khi get data từ dòng dữ liệu của bảng
	 nhiều --> sẽ ko tự động get đối tượng của bảng 1 ra
	 --> khi nào thật sự get đối tượng từ bảng 1(itemGroup) --> truy vấn dữ liệu
	*/
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID", nullable = false)
	private ItemGroup itemGroup;
	
	// provider_id

	/**
	 * JPA/Hibernate require constructor
	 */
	public Item() {
	}
	
	public Item(Integer id, String name, String color, Double buyPrice, Double sellPrice, String material,
			ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.material = material;
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
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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
				+ sellPrice + ", material=" + material + "]";
	}
}