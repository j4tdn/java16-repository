package persistence;

public class ItemGroupDTO {
	private Integer ID;
	private String NAME;
	private String Items;
	private Integer AMOUNT;

	public ItemGroupDTO() {
	}

	/**
	 * @param iD
	 * @param nAME
	 * @param aMOUNT
	 */
	
	
	public Integer getID() {
		return ID;
	}

	public ItemGroupDTO(Integer iD, String nAME, String items, Integer aMOUNT) {
		super();
		ID = iD;
		NAME = nAME;
		Items = items;
		AMOUNT = aMOUNT;
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

	public Integer getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(Integer aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public String getItems() {
		return Items;
	}

	public void setItems(String items) {
		Items = items;
	}

	@Override
	public String toString() {
		return "ItemGroupDTO [ID=" + ID + ", NAME=" + NAME + ", Items=" + Items + ", AMOUNT=" + AMOUNT + "]";
	}
	
	

	

}
