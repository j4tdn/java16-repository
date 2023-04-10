package dto;

public class ItemGroupDto {
	
	public static final String PROP_IG_ID = "idId";
	public static final String PROP_IG_NAME = "igName";
	public static final String PROP_TOTAL_OF_ITEMS = "totalOfItems";
	public static final String PROP_ITEM_DETAIL = "itemDetails";
	
	private Integer igId;
	private String igName;
	private Long totalOfItemByItemGroup;
	private String itemDetails;

	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer igId, String igName, Long totalOfItemByItemGroup, String itemDetails) {
		this.igId = igId;
		this.igName = igName;
		this.totalOfItemByItemGroup = totalOfItemByItemGroup;
		this.itemDetails = itemDetails;
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

	public Long getTotalOfItemByItemGroup() {
		return totalOfItemByItemGroup;
	}

	public void setTotalOfItemByItemGroup(Long totalOfItemByItemGroup) {
		this.totalOfItemByItemGroup = totalOfItemByItemGroup;
	}

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", totalOfItemByItemGroup="
				+ totalOfItemByItemGroup + ", itemDetails=" + itemDetails + "]";
	}
}
