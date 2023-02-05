package bean;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate; // Import the Scanner class to read text files

public class Ex05 {
	public static void main(String[] args) {
		List<Students> listStudent = new ArrayList<>();
		try {
			File myObj = new File("C:\\Users\\84932\\Desktop\\Student.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] string = data.split(",");
				Students std1 = new Students(Integer.parseInt(string[0]), string[1], Double.parseDouble(string[2]),
						string[3]);
				listStudent.add(std1);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		List<Students> std1 = new ArrayList<>();
		//1 Sort
//		std1 = listStudent.stream().sorted(
//				Comparator.comparing(Students::getPoint).thenComparing(Students::getName, Comparator.reverseOrder()))
//				.toList();
		listStudent.stream().sorted(
				Comparator.comparing(Students::getPoint).thenComparing(Students::getName, Comparator.reverseOrder()))
				.forEach(o -> System.out.println(o));
		;
		System.out.println("====Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8====");
		listStudent.stream().filter(o -> ( o.getPoint() > 8)).forEach(o -> System.out.println(o));
		System.out.println("====Viết hàm tìm kiếm toàn bộ các sinh viên NỮ===");
		listStudent.stream().filter(o -> o.getGender().equals(" Nu")).forEach(o -> System.out.println(o));
		System.out.println("===Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV==");
		listStudent.stream().filter(distinctByKey( o -> o.getId())).forEach(o -> System.out.println(o));

	}
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Set<Object> set = new HashSet<>();
        return t -> set.add(keyExtractor.apply(t)) == true;
	}
}