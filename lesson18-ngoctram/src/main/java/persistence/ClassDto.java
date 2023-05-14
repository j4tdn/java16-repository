package persistence;

import java.math.BigDecimal;

public class ClassDto {
	private Integer id;
	private String name;
	private BigDecimal numStudents;
	
	public ClassDto() {
		// TODO Auto-generated constructor stub
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

	public BigDecimal getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(BigDecimal numStudents) {
		this.numStudents = numStudents;
	}

	@Override
	public String toString() {
		return "ClassDto [id=" + id + ", name=" + name + ", numStudents=" + numStudents + "]";
	}
	
}
