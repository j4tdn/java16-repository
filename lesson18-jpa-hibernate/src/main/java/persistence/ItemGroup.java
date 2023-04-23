package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * JPA: javax.persistence .... --> type , annotation to mapping 
 * Hibernate : org.hibernate .... --> type , method , annotation to mapping + proper
 * 
 * 
 * 
 * Holding properties to mapping. rêcicing data from table from item_group
 * 
 * --> Entity 
 * 
 * 
 */
@Entity
@Table( name = "item_group")
public class ItemGroup {
	
	@Id
	@Column(name ="ID")
	
	private Integer id;
	
	@Column(name ="name")
	
	private String name ;
	
	@Column(name ="DESCRIPTION")
	private String description;
	
	/*
	 * JPA/hibernate require constructor 
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

	public ItemGroup(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
