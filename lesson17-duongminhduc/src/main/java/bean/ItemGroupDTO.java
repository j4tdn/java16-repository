package bean;

import java.util.List;

public class ItemGroupDTO {
	private Integer igId;
	private String igName;
	private Integer amountOfItems;
	private List<ItemDTO> items;

	public ItemGroupDTO() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDTO(Integer igId, String igName, Integer amountOfItems) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
	}

	public ItemGroupDTO(Integer igId, String igName, Integer amountOfItems, List<ItemDTO> items) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", items=" + items + ", amountOfItems="
				+ amountOfItems + "]";
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public Integer getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(Integer amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	public List<ItemDTO> getListOfItems() {
		return items;
	}

	public void setListOfItems(List<ItemDTO> items) {
		this.items = items;
	}
}
