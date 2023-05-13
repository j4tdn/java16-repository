package dto;

public class ItemGroupDto {

	public static final String PROP_IG_ID = "igId";
	public static final String PROP_IG_NAME = "igName";
	public static final String PROP_TOTAL_OF_ITEMS = "totalofItems";
	public static final String PROP_ITEM_DETAILS = "itemDetails";

	private Integer igId;
	private String igName;
	private Long ittalOfItems;
	private String itemDetails;

	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDto(Integer igId, String igName, Long ittalOfItems, String itemDetails) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.ittalOfItems = ittalOfItems;
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

	public Long getIttalOfItems() {
		return ittalOfItems;
	}

	public void setIttalOfItems(Long ittalOfItems) {
		this.ittalOfItems = ittalOfItems;
	}

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", ittalOfItems=" + ittalOfItems + ", itemDetails="
				+ itemDetails + "]";
	}

}
