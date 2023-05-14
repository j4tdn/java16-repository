package bean;

public class ItemGroup {
	
	public static final String PROP_ITEM_GROUP = "item_group";
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_DESC = "description";
	
	
	private Integer id;
	private String name;
	private String description;
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
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
	public ItemGroup(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

}
