package bean;

public class ItemGroupInsert {
	
	private Integer id;
	private String name;
	private String decs;
	public ItemGroupInsert(Integer id, String name, String decs) {
		super();
		this.id = id;
		this.name = name;
		this.decs = decs;
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
	public String getDecs() {
		return decs;
	}
	public void setDecs(String decs) {
		this.decs = decs;
	}
	@Override
	public String toString() {
		return "ItemGroupInsert [id=" + id + ", name=" + name + ", decs=" + decs + "]";
	}
	
	
	
	

}
