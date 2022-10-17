package view;

import bean.Ex01ClassificationLevel;
import bean.Ex01Student;

public class Ex01StudentApp {
	public static void main(String[] args) {
		Ex01Student[] students = { new Ex01Student("102", "Nam", Ex01ClassificationLevel.C),
				new Ex01Student("103", "Bảo", Ex01ClassificationLevel.F),
				new Ex01Student("104", "Hoàng", Ex01ClassificationLevel.D),
				new Ex01Student("105", "Nguyên", Ex01ClassificationLevel.B),
				new Ex01Student("107", "Vũ", Ex01ClassificationLevel.F),
				new Ex01Student("109", "Lan", Ex01ClassificationLevel.A),
				new Ex01Student("202", "Đạt", Ex01ClassificationLevel.C),
				new Ex01Student("103", "Bảo", Ex01ClassificationLevel.F),
				new Ex01Student("107", "Vũ", Ex01ClassificationLevel.C),
				new Ex01Student("104", "Hoàng", Ex01ClassificationLevel.B) };
		
		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021 là: ");
		getStudentLevelA(students);
		System.out.println("====================================================================");
		System.out.println("Danh sách sinh viên học lại môn cấu trúc dữ liệu là: ");
		getStudentLevelF(students);

	}

	private static void getStudentLevelA(Ex01Student[] students) {
		for (Ex01Student student : students) {
			if (student.getLevel() == Ex01ClassificationLevel.A) {
				System.out.println(student);
			}
		}
	}

	private static void getStudentLevelF(Ex01Student[] students) {
		for (Ex01Student student : students) {
			if (student.getLevel() == Ex01ClassificationLevel.F) {
				System.out.println(student);
			}
		}
	}

}
