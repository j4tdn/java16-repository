package ex01;

public class Student {
	private int masv;
	private  String name;
	private Enum classify;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int masv, String name, Enum classify) {
		super();
		this.masv = masv;
		this.name = name;
		this.classify = classify;
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enum getClassify() {
		return classify;
	}

	public void setClassify(Enum classify) {
		this.classify = classify;
	}

	@Override
	public String toString() {
		return "Student: masv=" + masv + ", name:" + name + ", classify:" + classify ;
	}

	
	
}
