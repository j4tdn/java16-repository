package model;

import java.util.List;

import bean.Gender;
import bean.Student;

public class DataModel {
	public static List<Student> getStudent(){
		return List.of(
				new Student(102130174, "Le Na", 7.8, Gender.NU),
				new Student(102130125, "Hoang Nam", 8.2, Gender.NAM),
				new Student(102130176, "Van Cuong", 9.8, Gender.NAM),
				new Student(102130177, "Van Cong", 6.8, Gender.NAM),
				new Student(102130178, "Ngoc Nu", 9.1, Gender.NU),
				new Student(102130180, "Hoang Nhung", 7.8, Gender.NU));
	}
}
