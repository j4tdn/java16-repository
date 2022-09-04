package management;

import java.time.LocalDate;

public class Personnel {
	private String name;
	private LocalDate birth;
	private float salary;
	private float positionCoef;
	private int numEmp;
	private String dpmName;
	private String position;

	public Personnel() {
	}

	public Personnel(String name, LocalDate birth, String position, float salary, float positionCoef) {
		this.name = name;
		this.birth = birth;
		this.position = position;
		this.salary = salary;
		this.positionCoef = positionCoef;
	}

	public Personnel(String name, LocalDate birth, String position, float salary, int numEmp) {
		this.name = name;
		this.birth = birth;
		this.position = position;
		this.salary = salary;
		this.numEmp = numEmp;
	}

	public Personnel(String name, LocalDate birth, String position, float salary, String dpmName) {
		this.name = name;
		this.birth = birth;
		this.position = position;
		this.salary = salary;
		this.dpmName = dpmName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getPositionCoef() {
		return positionCoef;
	}

	public void setPositionCoef(float positionCoef) {
		this.positionCoef = positionCoef;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	public String getDpmName() {
		return dpmName;
	}

	public void setDpmName(String dpmName) {
		this.dpmName = dpmName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Personnel [name=" + name + ", birth=" + birth + ", salary=" + salary + ", positionCoef=" + positionCoef
				+ ", numEmp=" + numEmp + ", dpmName=" + dpmName + ", position=" + position + "]";
	}

	
}
