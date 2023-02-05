package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Gender;
import bean.Students;

public class Ex05 {
	public static void main(String[] args) {
		List<Students> stu = getstudent();
		System.out.println("1: Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng\r\n"
				+ "dần theo họ tên.:");

		System.out.println();
		System.out.println("student have point better than 8");
		System.out.println(better8(stu));
		System.out.println("fint student girl");
		System.out.println(findGirlStu(stu));
		System.out.println("find unique student");
		System.out.println(uniqueStudent(stu));
	}
	
	public static List<Students> getstudent(){
		return Arrays.asList(new Students(102130174, "Le Na", 7.8, Gender.NU),
				new Students(102130125, "Hoang Nam", 8.2, Gender.NAM),
				new Students(102130176, "Van Cuong", 9.8, Gender.NAM),
				new Students(102130177, "Van Cong", 6.8, Gender.NAM),
				new Students(102130178, "Ngoc Nu", 9.1, Gender.NU),
				new Students(102130180, "Hoang Nhung", 7.8, Gender.NU));
	}
	
	//2 tim kiem cac sinh vien co diem trung binh tren 8
	public static List<Students> better8(List<Students> students){
	List<Students> result = students.stream().filter(student -> student.getPoint() > 8.0)
		.collect(Collectors.toList());
	return result;
	}
	//3 tim nu sinh nu
	private static List<Students> findGirlStu(List<Students> students){
		List<Students> result = students.stream()
				.filter(student -> student.getGentle().equals(Gender.NU))
				.collect(Collectors.toList());
		return result;
	}
	//4 tim kiem sinh vien chir xuat hien 1 lan
	private static Set<Students> uniqueStudent(List<Students> students){
		Set<Students> result = students.stream().collect(Collectors.toSet());
		return result;
	}
}
