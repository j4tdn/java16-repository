package dto;

public class ItemSoldDto {
	
	public static final String PROP_ID = "itId";
	public static final String PROP_NAME = "itName";
	public static final String PROP_AMOUNT_SOLD = "amountSold";
	
	private Integer itId;
	private String itName;
	private Integer amountSold;
	
	public ItemSoldDto() {
	}
	
	public ItemSoldDto(Integer itId, String itName, Integer amount) {
		this.itId = itId;
		this.itName = itName;
		this.amountSold = amount;
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

	public Integer getAmount() {
		return amountSold;
	}

	public void setAmount(Integer amount) {
		this.amountSold = amount;
	}

	@Override
	public String toString() {
		return "ItemDto [itId=" + itId + ", itName=" + itName + ", amount=" + amountSold + "]";
	}

	
}
