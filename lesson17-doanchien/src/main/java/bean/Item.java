package bean;

import java.time.LocalDateTime;
import java.util.Objects;

public class Item {
public static final String PROP_ITEM = "item";
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_TIMEORDER = "timeorder";
	
	private Integer id;
	private String name;
	private LocalDateTime timeOrder;
	
	
	public Item() {
	}

	public Item(Integer id, String name) {
		
	}
	
	public Item(Integer id, String name, LocalDateTime timeOrder) {
		super();
		this.id = id;
		this.name = name;
		this.timeOrder = timeOrder;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDateTime getTimeOrder() {
		return timeOrder;
	}


	public void setTimeOrder(LocalDateTime timeOrder) {
		this.timeOrder = timeOrder;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	


	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", timeOrder=" + timeOrder + "]";
	}
	
	
	
}
