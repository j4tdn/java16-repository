package dto;

public class ItemGroupDto {
	private Integer id;
	private String name;
	private String desc;
	
	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemGroupDto(Integer id, String name, String desc, Integer quantity) {
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
	public String getdesc() {
		return desc;
	}
	public void setdesc(String desc) {
		this.desc = desc;
	}
	

	@Override
	public String toString() {
		return "\nItemGroupDto [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	
	
}