package persistence;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_group")
public class ItemGroup {
	@Id
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "`DESC`")
	private String description;
	
	@OneToMany(mappedBy = "itemgroup")
	private List<Item> items;
	
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
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public ItemGroup(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

}
