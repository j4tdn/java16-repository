package bean;

public class Student {
	private Integer Id;
	private String name;
	private Double point;
	private Enum gender;
	public Student(Integer id, String name, Double point, Enum gender) {
		super();
		Id = id;
		this.name = name;
		this.point = point;
		this.gender = gender;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPoint() {
		return point;
	}
	public void setPoint(Double point) {
		this.point = point;
	}
	public Enum getGender() {
		return gender;
	}
	public void setGender(Enum gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", point=" + point + ", gender=" + gender + "]";
	}
	
	

}
