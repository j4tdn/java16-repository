package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	public static List<Student> getStudent() {
		List<Student> students = new ArrayList<>();
		return Arrays.asList(
		new Student(102130174,"Le Na", 7.8, "NU"),
		new Student(102130125,"Hoang Nam", 7.8, "NAM"),
		new Student(102130176,"Van Cuong", 7.8, "NAM"),
		new Student(102130177,"Van Cong", 7.8, "NAM"),
		new Student(102130178,"Ngoc Nu", 7.8, "NU"),
		new Student(102130180,"Hoang Nhung", 7.8, "NU"));

		

	}
}
