package ex1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int Id;
	private String name;
	private Xl xl;
	enum Xl{
		A,B,C,D,E,F;
	}
	
	public Student(int id, String name,String xl) {
		Id = id;
		this.name = name;
		this.xl = Xl.valueOf(xl);
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public Xl getXl() {
		return xl;
	}

	public void setXl(Xl xl) {
		this.xl = xl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static ArrayList<Student> getStudents(Student[] student, Xl xl) {
		ArrayList<Student> std = new ArrayList<Student>();
		Xl xl1 = xl;
		for (Student s : student) {
			if(s.getXl().equals(xl1)) {
				std.add(s);
			}
		}
		return std;
		
	}

	public static void main(String[] args) {
		
		Student[] students =
		{
		new Student(102, "Nam", "A"),
		new Student(103, "Bảo", "F"),
		new Student(104, "Hoàng", "D"),
		new Student(105, "Nguyên", "B"),
		new Student(107, "Vũ", "F"),
		new Student(109, "Lan", "A"),
		new Student(202, "Đạt", "C"),
		new Student(103, "Bảo", "F"),
		new Student(107, "Vũ", "C"),
		new Student(104, "Hoàng", "B")
		};
		ArrayList<Student> student1 = new ArrayList<Student>();
		 student1 = getStudents(students, Xl.A);
		 System.out.println("Các học sinh đạt loại A :");
		for (Student s : student1) {
			System.out.println(s.getName());
			System.out.println(s.getXl());
			
		}
		System.out.println("=========================");
		System.out.println("Các học sinh bị loại F phải học lại :");
		ArrayList<Student> student2 = new ArrayList<Student>();
		 student2 = getStudents(students, Xl.F);
		
		for (Student s : student2) {
			System.out.println(s.getName());
			System.out.println(s.getXl());
			
		}
		
		
	}
}
