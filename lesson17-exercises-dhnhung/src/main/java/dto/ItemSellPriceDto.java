package dto;

public class ItemSellPriceDto {
	public static final String PROP_ID = "itId";
	public static final String PROP_NAME = "itName";
	public static final String PROP_COLOR = "color";
	public static final String PROP_GROUP_ID = "igId";
	public static final String PROP_SELL_PRICE = "maxSellPrice";
	
	private Integer itId;
	private String itName;
	private String color;
	private Integer igId;
	private Double mamaxSellPrice;
	
	public ItemSellPriceDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemSellPriceDto(Integer itId, String itName, String color, Integer igId, Double maxSellPrice) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.color = color;
		this.igId = igId;
		this.mamaxSellPrice = maxSellPrice;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public Double getmaxSellPrice() {
		return mamaxSellPrice;
	}

	public void setmaxSellPrice(Double maxSellPrice) {
		this.mamaxSellPrice = maxSellPrice;
	}

	public static String getPropId() {
		return PROP_ID;
	}

	public static String getPropName() {
		return PROP_NAME;
	}

	public static String getPropColor() {
		return PROP_COLOR;
	}

	public static String getPropGroupId() {
		return PROP_GROUP_ID;
	}

	public static String getPropmaxSellPrice() {
		return PROP_SELL_PRICE;
	}

	@Override
	public String toString() {
		return "ItemSellPriceDto [itId=" + itId + ", itName=" + itName + ", color=" + color + ", igId=" + igId
				+ ", maxSellPrice=" + mamaxSellPrice + "]";
	}
	
	
	

}
