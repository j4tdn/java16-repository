package persistence;

public class ClassTotalAmountStudentDto {
	
	public static final String CLASS_NAME = "className";
	public static final String CLASS_TOTAL_AMOUNT_STUDENT = "totalAmountStudent";
	
	private String className;
	
	private Integer totalAmountStudent;
	
	public ClassTotalAmountStudentDto() {
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getTotalAmountStudent() {
		return totalAmountStudent;
	}

	public void setTotalAmountStudent(Integer totalAmountStudent) {
		this.totalAmountStudent = totalAmountStudent;
	}

	@Override
	public String toString() {
		return "ClassTotalAmountStudentDto [className=" + className + ", totalAmountStudent=" + totalAmountStudent
				+ "]";
	}
}
