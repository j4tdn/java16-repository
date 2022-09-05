package studentmanagement;

public class Student {
	int id;
	String name;
	float theoriticalPoint;
	float practicePoint;
	
	public Student() {
		
	}

	public Student(int id, String name, float theoriticalPoint, float practicePoint) {
		this.id = id;
		this.name = name;
		this.theoriticalPoint = theoriticalPoint;
		this.practicePoint = practicePoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoriticalPoint() {
		return theoriticalPoint;
	}

	public void setTheoriticalPoint(float theoriticalPoint) {
		this.theoriticalPoint = theoriticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoriticalPoint=" + theoriticalPoint + ", practicePoint="
				+ practicePoint + "]";
	}
	
	public float averagePoint() {
		return (theoriticalPoint + practicePoint) / 2;
	}


	
	
	
}
