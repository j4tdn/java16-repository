package persitence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Class")
public class ClassP {
	
	public static final String GET_CLASS = "GET_CLASS";
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "teacher")
	private String teacher;
	
	
	public ClassP() {
		
	}


	public ClassP(Integer id, String name, String teacher) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
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


	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "ClassP [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}
	
	
}
