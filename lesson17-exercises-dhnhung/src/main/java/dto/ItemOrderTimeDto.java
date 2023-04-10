package dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class ItemOrderTimeDto {
	public static final String PROP_ID = "itId";
	public static final String PROP_NAME = "itName";
	public static final String PROP_ORDER_TIME= "odorderTime";
	
	private Integer itId;
	private String itName;
	private LocalTime odorderTime;
	
	public ItemOrderTimeDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemOrderTimeDto(Integer itId, String itName, LocalTime odorderTime) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.odorderTime = odorderTime;
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

	public LocalTime getOdorderTime() {
		return odorderTime;
	}

	public void setOdorderTime(LocalTime odorderTime) {
		this.odorderTime = odorderTime;
	}

	public static String getPropId() {
		return PROP_ID;
	}

	public static String getPropName() {
		return PROP_NAME;
	}

	public static String getPropOrderTime() {
		return PROP_ORDER_TIME;
	}

	@Override
	public String toString() {
		return "ItemDto [itId=" + itId + ", itName=" + itName + ", odorderTime=" + odorderTime + "]";
	}
}
