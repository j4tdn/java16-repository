package bean;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ItemGroup
 * ========================
 * Nhận dữ liệu 
 */

public class ItemGroup {
	
	public static final String PROP_ITEM_GROUP = "item_group";
	
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_DESC = "description";
	
	private Integer id;
	private String name;
	private String description;
	private List<Item> items;
	
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name, String decscription) {
		this.id = id;
		this.name = name;
		this.description = decscription;
	}
	
	public ItemGroup(ItemGroup itemGroup, List<Item> items) {
		this.id = itemGroup.id;
		this.name = itemGroup.name;
		this.description = itemGroup.description;
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

	public String getDecscription() {
		return description;
	}

	public void setDecscription(String decscription) {
		this.description = decscription;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroup)) {
			return false;
		}
		ItemGroup that = (ItemGroup) o;
		return this.getId() .equals(that.getId());
	}


	@Override
	public String toString() {
		if (items == null || items.isEmpty()) {
			return "ItemGroup [id=" + id + ", name=" + name + ", decscription=" + description + "]";
		}
		
		final String itemIds = items.stream()
				.map(Item::getId)
				.map(t -> t.toString())
				.collect(Collectors.joining(","));
		return "ItemGroup [id=" + id + ", name=" + name + ", decscription=" + description + ", itemIds=" + itemIds + "]";
	}
}
