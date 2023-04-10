package bean;

import java.util.List;
import java.util.Objects;

public class ItemGroup {
public static final String PROP_ITEM_GROUP = "item_group";
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_DESC = "description";
	
	private Integer id;
	private String name;
	private String description;
	private List<Item> items;
	
	
	public ItemGroup() {
	}


	public ItemGroup(Integer id, String name, String description, List<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.items = items;
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroup)) {
			return false;
		}
		ItemGroup that = (ItemGroup)o;
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + ", items=" + items + "]";
	}
	
	
}
