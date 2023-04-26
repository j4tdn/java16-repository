package bean;

import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ItemGroup
 * ==================
 * Nhận dữ liệu từ table ITEM_GROUP trong database
 */
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

	public ItemGroup(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public ItemGroup(Entry<ItemGroup, List<Item>> entry) {
		ItemGroup igP = entry.getKey();
		List<Item> items = entry.getValue();
		this.id = igP.id;
		this.name = igP.name;
		this.description = igP.description;
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
		if (items == null || items.isEmpty()) {
			return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
		}
		final String itemIds = items.stream()
				.map(item -> item.getId().toString())
				.collect(Collectors.joining(", "));
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + ", itemIds=" + itemIds + "]";
	}
	
}
