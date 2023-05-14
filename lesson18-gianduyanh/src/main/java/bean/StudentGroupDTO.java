package bean;

public class StudentGroupDTO {

	
	private Integer id;
	private String name;
	private String gender;
	private Integer classid;
	private Integer studentid;
	private String subject;
	private Double Score;
	
	public StudentGroupDTO() {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getClassid() {
		return classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getScore() {
		return Score;
	}

	public void setScore(Double score) {
		Score = score;
	}

	public StudentGroupDTO(Integer id, String name, String gender, Integer classid, Integer studentid, String subject,
			Double score) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.classid = classid;
		this.studentid = studentid;
		this.subject = subject;
		this.Score = score;
	}

	@Override
	public String toString() {
		return "StudentGroupDTO [id=" + id + ", name=" + name + ", gender=" + gender + ", classid=" + classid
				+ ", studentid=" + studentid + ", subject=" + subject + ", Score=" + Score + "]";
	}
	
	

}
