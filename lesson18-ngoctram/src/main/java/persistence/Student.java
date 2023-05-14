package persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id", referencedColumnName = "id", nullable = false)
	private Class sClass;

	
	public Student() {

	}

	public Student(Integer id, String name, String gender, Class sClass) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.sClass = sClass;
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

	public Class getsClass() {
		return sClass;
	}

	public void setsClass(Class sClass) {
		this.sClass = sClass;
	}

	@Override
	public String toString() {
//		if (sClass != null) {
//			return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", sClass=" + sClass + "]";
//		}
		return "Student [id=" + id + ", name=" + name + ", gender=" +  gender  + "]";
	}
	
	
}
