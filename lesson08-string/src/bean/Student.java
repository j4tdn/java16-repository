package bean;

public class Student {
	private int MSV;
	private String Name;
	private String CL; 
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int mSV, String name, String cL) {
		super();
		MSV = mSV;
		Name = name;
		CL = cL;
	}

	public int getMSV() {
		return MSV;
	}

	public void setMSV(int mSV) {
		MSV = mSV;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCL() {
		return CL;
	}

	public void setCL(String cL) {
		CL = cL;
	}

	@Override
	public String toString() {
		return "Ex01a [MSV=" + MSV + ", Name=" + Name + ", CL=" + CL + "]";
	}
	

}
