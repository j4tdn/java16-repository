package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.User;

public class De1Cau5 {
	public static void main(String[] args) {
		String fileName = "D:\\JAVA-16\\2. JAVA\\eclipse-workspace\\lesson15-kha\\src\\student.txt";
		File file = new File(fileName);
		List<User> us = new ArrayList<User>();
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				String[] data = tmp.split(",");
				us.add(new User(data[0].strip(), data[1].strip(), Double.parseDouble(data[2].strip()), data[3].strip().equals("Nam")?true:false));
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Data read from file .");
		System.out.println();
		us.stream().forEach(System.out::println);
		
		System.out.println("1.Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng ");
		System.out.println("dần theo họ tên.");
		System.out.println();
		us.stream().sorted(Comparator.comparing(User::getDTB).thenComparing((o1,o2)->o1.getName().compareTo(o2.getName())))
					.forEach(o -> System.out.println(o.toString()));
		
		System.out.println("===================================================");
		System.out.println("2.Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8");
		System.out.println();
		List<User> getUserWithSpecialCondition = getUserWithSpecialCondition(us, o-> o.getDTB()>8);
		getUserWithSpecialCondition.stream().forEach(System.out::println);
		
		System.out.println("===================================================");
		System.out.println("3.Viết hàm tìm kiếm toàn bộ các sinh viên NỮ");
		System.out.println();
		getUserWithSpecialCondition = getUserWithSpecialCondition(us, o-> o.isGender() == false);
		getUserWithSpecialCondition.stream().forEach(System.out::println);
		
		System.out.println("===================================================");
		System.out.println("4.Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được");
		System.out.println("phân biệt với nhau thông qua MSSV");
		System.out.println();
		getUserWithSpecialCondition = getUserWithSpecialCondition(us, o -> us.stream().filter(o1 -> o1.getId().equals(o.getId())).count() == 1);
		getUserWithSpecialCondition.stream().forEach(System.out::println);
		
		
	}
	
	public static List<User> getUserWithSpecialCondition(List<User> u, Predicate<User> Condition){
		return u.stream().filter(Condition).collect(Collectors.toList());
	}
	
	
	
	
}
