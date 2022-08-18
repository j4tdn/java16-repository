package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	private int customerid;
	private ItemDetail[] items;
	private Date datetime;
	public Order(int customerid, ItemDetail[] items, Date datetime) {
		this.customerid = customerid;
		this.items = items;
		this.datetime = datetime;
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//System.out.println(dateFormat.format(date));   
		
		
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public ItemDetail[] getItemDetail() {
		return this.items;
	}
	public void addItem(ItemDetail itemid) {
		ItemDetail[] tmp = new ItemDetail[this.items.length+1];
		for (int i = 0; i < this.items.length; i++) {
			tmp[i] = this.items[i];
		}
		tmp[tmp.length-1] = itemid;
		this.items = tmp;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	
}
