package bean;

public class ItemGroup {
	public static final String PROP_ITEM_GROUP = "item_group";
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_DESC = "desc";
	
	private Integer id;
	private String name;
	private String desc;
	
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(Integer id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	
	
}
