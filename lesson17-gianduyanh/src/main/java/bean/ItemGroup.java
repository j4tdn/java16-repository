package bean;

import java.util.List;

public class ItemGroup {
	
	
	private Integer idgroup;
	private String namegroup;
	private String items;
	private Integer amout;
	public ItemGroup(Integer idgroup, String namegroup, String items, Integer amout) {
		super();
		this.idgroup = idgroup;
		this.namegroup = namegroup;
		this.items = items;
		this.amout = amout;
	}
	public Integer getIdgroup() {
		return idgroup;
	}
	public void setIdgroup(Integer idgroup) {
		this.idgroup = idgroup;
	}
	public String getNamegroup() {
		return namegroup;
	}
	public void setNamegroup(String namegroup) {
		this.namegroup = namegroup;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public Integer getAmout() {
		return amout;
	}
	public void setAmout(Integer amout) {
		this.amout = amout;
	}
	@Override
	public String toString() {
		return "ItemGroup [idgroup=" + idgroup + ", namegroup=" + namegroup + ", items=" + items + ", amout=" + amout
				+ "]";
	}
	
	
	
	

	

}
