package dto;

public class ItemGroupDto {
	public static String PROP_IG_ID = "id";
	public static String PROP_IG_NAME = "name";
	public static String PROP_TOTAL_OF_ITEMS = "TotalOfItems";
	public static String PROP_ITEMS_DETAIL = "items";
	
	private Integer igID;
	private String igName;
	private int	totalOfItems;
	private String itemsDetails;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer igID, String igName, int totalOfItems, String itemsDetails) {
		this.igID = igID;
		this.igName = igName;
		this.totalOfItems = totalOfItems;
		this.itemsDetails = itemsDetails;
	}

	public Integer getIgID() {
		return igID;
	}

	public void setIgID(Integer igID) {
		this.igID = igID;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public int getTotalOfItems() {
		return totalOfItems;
	}

	public void setTotalOfItems(int totalOfItems) {
		this.totalOfItems = totalOfItems;
	}

	public String getItemsDetails() {
		return itemsDetails;
	}

	public void setItemsDetails(String itemsDetails) {
		this.itemsDetails = itemsDetails;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igID=" + igID + ", igName=" + igName + ", totalOfItems=" + totalOfItems
				+ ", itemsDetails=" + itemsDetails + "]";
	}
}
