package persistence;

import java.time.LocalTime;

public class ItemDTO {
	private Integer id;
	private String name;
	private LocalTime timeOrder;
	
	public ItemDTO(Integer id, String name, LocalTime timeOrder) {
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

	public LocalTime getTimeOrder() {
		return timeOrder;
	}

	public void setTimeOrder(LocalTime timeOrder) {
		this.timeOrder = timeOrder;
	}

	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", timeOrder=" + timeOrder + "]";
	}
	
	
	
	
}
