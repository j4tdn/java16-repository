package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class Class {
	
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "`NAME`")
	private String name;
	
	@Column(name = "TEACHER")
	private String teacher;

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

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}
	
	
}
