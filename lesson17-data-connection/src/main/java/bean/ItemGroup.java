package bean;

import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ItemGroup
 * 
 * @author jasmine Nhan du lieu tu ITEM_GROUP table trong db
 */

public class ItemGroup {
	public static String PROP_ITEM_GROUP = "item_group";

	public static String PROP_ID = "igId";
	public static String PROP_NAME = "igName";
	public static String PROP_DESC = "igDesc";

	private Integer id;
	private String name;
	private String description;
	private List<Item> items;

	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public ItemGroup(ItemGroup igP, List<Item> items) {
		this(igP.id, igP.name, igP.description);
		this.items = items;
	}
	
	public ItemGroup(Entry<ItemGroup, List<Item>> e) {
		this(e.getKey().getId(), e.getKey().getName(), e.getKey().getDescription());
		this.items = e.getValue();
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
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemGroup other = (ItemGroup) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		if (items == null || items.isEmpty()) {
			return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
		} 
		final String itemIds = items.stream().map(item -> item.getId().toString()).collect(Collectors.joining(","));
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + ", items=" + itemIds + "]";
	}

}
