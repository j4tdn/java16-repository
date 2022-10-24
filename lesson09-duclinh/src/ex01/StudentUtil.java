package ex01;

import java.util.Arrays;

import ex01.Student.Classification;

public class StudentUtil {

	public static void main(String[] args) {
		Student[] students = init();
		Student[] stdA = findsStudentRankA(students, "A");
		printf(stdA);
		Student[] stdF = findsStudentRankAgain(students, "F");
		printf(stdF);
	}

	private static Student[] findsStudentRankA(Student[] students, String rank) {
		Student[] rs = new Student[students.length];
		int k = 0;
		for (Student student : students) {
			if (student.getClassification() == Classification.A) {
				rs[k++] = student;
			}
		}
		return Arrays.copyOfRange(rs, 0, k);
	}

	private static Student[] findsStudentRankAgain(Student students[], String rank) {
		Student[] rs  = new Student[students.length];
		int k =	0;
		for(int i=0; i < students.length-1;i++){
	        for(int j = 0; j < i; j++){
	            if(students[i].getId() == students[j].getId()){	 
	            	rs[k++] = students[i];
	            }
	        }
	    }
			 	
		return Arrays.copyOfRange(rs, 0, k);
	}

	private static Student[] init() {
		return new Student[] { new Student(102, "Nam", Classification.C), new Student(103, "Bảo", Classification.F),
				new Student(104, "Hoàng", Classification.D), new Student(105, "Nguyên", Classification.B),
				new Student(107, "Vũ", Classification.F), new Student(109, "Lan", Classification.A),
				new Student(202, "Đạt", Classification.C), new Student(103, "Bảo", Classification.F),
				new Student(107, "Vũ", Classification.C), new Student(104, "Hoàng", Classification.B) };
	}

	private static void printf(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
			System.out.println("=======================");
		}
	}

}
