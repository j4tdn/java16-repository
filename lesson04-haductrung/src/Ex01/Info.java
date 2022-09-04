package Ex01;

public class Info {
	
	private int IdStudent;
	private String FullName;
	private float TheoreticalPoint;
	private float PracticePoint;
	
	public Info() {

	}
	public Info(int IdStudent, String FullName, float TheoreticalPoint, float PracticePoint ) {
		this.IdStudent=IdStudent;
		this.FullName=FullName;
		this.TheoreticalPoint=TheoreticalPoint;
		this.PracticePoint=PracticePoint;
		
	}
	public int getIdStudent() {
		return IdStudent;
	}
	
	public void setIdStudent(int idStudent) {
		IdStudent = idStudent;
	}
	
	public String getFullName() {
		return FullName;
	}
	
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	
	public float getTheoreticalPoint() {
		return TheoreticalPoint;
	}
	
	public void setTheoreticalPoint(float theoreticalPoint) {
		TheoreticalPoint = theoreticalPoint;
	}
	
	public float getPracticePoint() {
		return PracticePoint;
	}
	
	public void setPracticePoint(float practicePoint) {
		PracticePoint = practicePoint;
	}
	
	
	@Override
	public String toString() {
		return "Info [IdStudent=" + IdStudent + ", FullName=" + FullName + ", TheoreticalPoint=" + TheoreticalPoint
				+ ", PracticePoint=" + PracticePoint + "]";
	}
	
	

}
