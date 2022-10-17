package ex01;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Student[] students =
			{
				new Student(102, "Nam", Enum.C),
				new Student(103, "Bảo", Enum.F),
				new Student(104, "Hoàng", Enum.D),
				new Student(105, "Nguyên", Enum.B),
				new Student(107, "Vũ", Enum.F),
				new Student(109, "Lan", Enum.A),
				new Student(202, "Đạt", Enum.C),
				new Student(103, "Bảo", Enum.F),
				new Student(107, "Vũ", Enum.C),
				new Student(104, "Hoàng", Enum.B)
			};
		
		// sinh viên điểm F đăng ký học lại
		Student[] studentF=students;
		List<Student> listF = new ArrayList<Student>();
		for(Student student:studentF) {
			if(student.getClassify()==Enum.F) {
				listF.add(student);
			}
		}
		for(Student studentf:listF) {
			System.out.println(studentf+" Đăng ký học lại");
		}
		
		
		// sinh viên điểm A	
		System.out.println("==========");
		Student[] studentA=students;
		List<Student> listA = new ArrayList<Student>();
		for(Student studenta:studentA) {
			if(studenta.getClassify()==Enum.A) {
				listA.add(studenta);
			}
		}
		for(Student studenta:listA) {
			System.out.println(studenta);
		}
	}
}
