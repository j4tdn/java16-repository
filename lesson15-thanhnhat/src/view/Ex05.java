package view;

import java.io.File;
import java.util.List;

import bean.FileUtils;
import bean.Students;

public class Ex05 {
	private static String pathname = "text\\data\\student.txt";

	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of("102130174, Le Na, 7.8, Nu", "102130125, Hoang Nam, 8.2, Nam",
				"102130176, Van Cuong, 9.8, Nam", "102130177, Van Cong, 6.8, Nam", "102130178, Ngoc Nu, 9.1, Nu",
				"102130180, Hoang Nhung, 7.8, Nu");
		FileUtils.writeLine(file, lines);
		List<String> list = FileUtils.read(file);
		
	}
	// Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên
	

}
