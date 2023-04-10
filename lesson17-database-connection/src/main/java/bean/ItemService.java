package bean;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class ItemService {

	private Integer itemID;
	private String nameItem;
	private LocalTime timeorder;

	public ItemService(Integer itemID, String nameItem, LocalTime timeorder) {
		super();
		this.itemID = itemID;
		this.nameItem = nameItem;
		this.timeorder = timeorder;
	}

	

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public LocalTime getTimeorder() {
		return timeorder;
	}

	public void setTimeorder(LocalTime timeorder) {
		this.timeorder = timeorder;
	}

	@Override
	public String toString() {
		return "ItemService [itemID=" + itemID + ", nameItem=" + nameItem + ", timeorder=" + timeorder + "]";
	}

}
