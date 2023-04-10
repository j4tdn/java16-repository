package bean;

public class ItemGroup {
	private Integer id;
	private String name;
	private String description;
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_DESC = "decrection";
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemGroup(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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
	
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
