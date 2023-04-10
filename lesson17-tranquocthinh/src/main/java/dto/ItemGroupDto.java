package dto;

public class ItemGroupDto {
	public static final String PROP_IG_ID = "idId";
	public static final String PROP_IG_NAME = "igName";
	public static final String PROP_ITEM_DETAIL = "itemDetails";
	public static final String PROP_TOTAL_OF_ITEMS = "totalOfItems";

	private Integer igId;
	private String igName;
	private String itemDetails;
	private Integer totalOfItemByItemGroup;

	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer igId, String igName, String itemDetails, Integer totalOfItemByItemGroup) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.itemDetails = itemDetails;
		this.totalOfItemByItemGroup = totalOfItemByItemGroup;
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

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}

	public Integer getTotalOfItemByItemGroup() {
		return totalOfItemByItemGroup;
	}

	public void setTotalOfItemByItemGroup(Integer totalOfItemByItemGroup) {
		this.totalOfItemByItemGroup = totalOfItemByItemGroup;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", itemDetails=" + itemDetails
				+ ", totalOfItemByItemGroup=" + totalOfItemByItemGroup + "]";
	}
}
