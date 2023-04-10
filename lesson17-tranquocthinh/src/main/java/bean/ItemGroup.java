package bean;

public class ItemGroup {
	public static final String PROP_ITEM_GROUP = "item_group";

	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_DESC = "description";

	private Integer id;
	private String name;
	private String description;

	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public static String getPROP_ID() {
		return PROP_ID;
	}

	public static void setPROP_ID(String pROP_ID) {
		PROP_ID = pROP_ID;
	}

	public static String getPROP_NAME() {
		return PROP_NAME;
	}

	public static void setPROP_NAME(String pROP_NAME) {
		PROP_NAME = pROP_NAME;
	}

	public static String getPROP_DESC() {
		return PROP_DESC;
	}

	public static void setPROP_DESC(String pROP_DESC) {
		PROP_DESC = pROP_DESC;
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

	public static String getPropItemGroup() {
		return PROP_ITEM_GROUP;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}
