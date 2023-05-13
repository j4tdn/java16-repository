package persistence;

import java.util.List;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * JPA: javax.persistence... --> type, annotation to mapping
 * Hibernate: org.hibernate...-> type, method, annotation to mapping + processing data
 * Holding properties to mapping/receiving data from table item_group
 */
@Entity
@Table(name = "item_group")
public class ItemGroup {
	@Id                 //KHÓA CHÍNH
	@Column(name = "ID")//MAPPING VỚI COLUMN ID TRONG BẢNG ITEM_GROUP
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "`DESC`")
	private String description;

	/*
	 * từ @ManyToOne --> biết được nhiều item thuộc cùng 1 itemGroup
	 * bên @OneToMany --> dùng mappeBy = "" để group bt items theo item_group
	 * Giá trị mappedBy là tên của thuộc tính đã mapping bên bảng @ManyToOne
	 * 
	 * Mặc định: lazy fetch
	 */
	
	@OneToMany(mappedBy = "itemGroup" ) 
	private List<Item> items; //vì 1 itemGroup có nhiều item
	
    public ItemGroup() {
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
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public static ItemGroup toEntity(String line) {
		String[] tokens = line.split(", ");
		ItemGroup ig = null;
		if(tokens.length == 3) {
			ig = new ItemGroup();
			ig.setId(Integer.parseInt(tokens[0]));
			ig.setName((tokens[1]));
			ig.setDescription((tokens[2]));
		}
		return ig;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
    

}
