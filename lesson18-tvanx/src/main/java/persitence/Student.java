package persitence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	public static final String GET_STUDENT = "GET_STUDENT";
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "gender")
	private String gender;
	
	
	public Student() {
		
	}

	public Student(Integer id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
