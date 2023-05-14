package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "`NAME`")
	private String name;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "CLASS_ID")
	private String class_id;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClass_id() {
		return class_id;
	}

	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", gender=" + gender + ", class_id=" + class_id + "]";
	}
	
	
}
