package dto;

public class ItemSellPriceDto extends ItemDto{
	
	public static final String PROP_ITEM_GROUP_ID = "itemGroupId";
	public static final String PROP_SELL_PRICE = "sellPrice";
	
	private Integer igId;
	private Double itSellPrice;
	
	public ItemSellPriceDto() {
	}

	public ItemSellPriceDto(Integer itId, String itName, Integer igId, Double itSellPrice) {
		super(itId, itName);
		this.igId = igId;
		this.itSellPrice = itSellPrice;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public Double getItSellPrice() {
		return itSellPrice;
	}

	public void setItSellPrice(Double itSellPrice) {
		this.itSellPrice = itSellPrice;
	}

	@Override
	public String toString() {
		return "ItemSellPriceDto [" + super.toString() + ", igId=" + igId + ", itSellPrice=" + itSellPrice
				+ "]";
	}
}
