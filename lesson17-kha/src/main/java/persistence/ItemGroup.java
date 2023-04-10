package persistence;

import java.util.List;

//Mapped with item_group tabel in database
public class ItemGroup {
	private Integer ID;
	private String NAME;
	private String DESC;

	private List<Item> items;

	public ItemGroup() {
	}

	public ItemGroup(Integer iD, String nAME, String dESC) {
		ID = iD;
		NAME = nAME;
		DESC = dESC;
	}

	public ItemGroup(Integer iD, String nAME, String dESC, List<Item> items) {
		super();
		ID = iD;
		NAME = nAME;
		DESC = dESC;
		this.items = items;
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

	public String getDESC() {
		return DESC;
	}

	public void setDESC(String dESC) {
		DESC = dESC;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [ID=" + ID + ", NAME=" + NAME + ", DESC=" + DESC + ", items=" + items + "]";
	}

}
