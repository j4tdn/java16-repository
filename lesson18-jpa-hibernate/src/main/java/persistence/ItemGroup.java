package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *  JPA			: javax.persistence... --> type , annotation to mapping
 *  Hibernate	: org.hibernate...     --> type , method , annotation to mapping + processing
 * 
 *  Holding properties to mapping/receiving data from table item_group
 *  
 * --> Entity
 * 
 * @author chien
 *
 */
@Entity
@Table(name = "item_group")
public class ItemGroup {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESC")
	private String description;
	
	/*
	 
	 Từ @ManyToOne 	--> biết được nhiều item thuộc cùng 1 item group
	 Bên @OneToMany --> dùng mappedBy = '' để group by items theo item group
	 Giá trị của mappedBy là tên của thuộc tính đã mapping bên bảng @ManyToOne
	 Mặc định : lazy fetch
	 */
	
	@OneToMany(mappedBy = "itemGroup")
	private List<Item> items;
	
	/**
	 *  JPA/Hibernate require constructor
	 */
	
	public ItemGroup() {
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

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
