package bean;

public class Item {
	public static final String PROP_ITEM = "item";

	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";

	private Integer id;
	private String name;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

}
