package dto;

public class ItemDto {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
//	public static final String PROP_TOTAL_OF_AMOUNT = "totalOfAmount";
	
	private Integer itId;
	private String itName;
	
	public ItemDto() {
	}
	
	public ItemDto(Integer itId, String itName) {
		this.itId = itId;
		this.itName = itName;
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

	@Override
	public String toString() {
		return " itId=" + itId + ", itName=" + itName + " ";
	}
}
