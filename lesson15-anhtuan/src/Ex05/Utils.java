package Ex05;

import java.util.List;

public class Utils {
	public static List<Student> student(){
		return List.of(
				new Student(102130174, "Le Na", 7.8, Gender.FEMALE),
				new Student(102130125, "Hoang Nam", 8.2, Gender.MALE),
				new Student(102130176, "Van Cuong", 9.8, Gender.MALE),
				new Student(102130177, "Van Cong", 6.8, Gender.MALE),
				new Student(102130178, "Ngoc Nu", 9.1, Gender.FEMALE),
				new Student(102130180, "Hoang Nhung", 7.8, Gender.FEMALE));
	}

}
