package bean;

public class ItemGroup {
	
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_DESC = "description";
	
	private int id;
	private String name;
	private String description;
	
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}	

	public ItemGroup(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
