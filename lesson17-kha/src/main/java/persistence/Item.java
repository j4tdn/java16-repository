package persistence;

public class Item {
	private Integer ID;
	private String NAME;
	private String COLOR;
	private Double SELL_PRICE;
	private Integer itemGroup;

	public Item() {
	}

	public Item(Integer iD, String nAME, String cOLOR, Double sELL_PRICE, Integer itemGroup) {
		super();
		ID = iD;
		NAME = nAME;
		COLOR = cOLOR;
		SELL_PRICE = sELL_PRICE;
		this.itemGroup = itemGroup;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getCOLOR() {
		return COLOR;
	}

	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}

	public Double getSELL_PRICE() {
		return SELL_PRICE;
	}

	public void setSELL_PRICE(Double sELL_PRICE) {
		SELL_PRICE = sELL_PRICE;
	}

	public Integer getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(Integer itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return "Item [ID=" + ID + ", NAME=" + NAME + ", COLOR=" + COLOR + ", SELL_PRICE=" + SELL_PRICE + ", itemGroup="
				+ itemGroup + "]";
	}
	
	

	

}
