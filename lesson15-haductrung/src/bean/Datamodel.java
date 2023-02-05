package bean;

import java.util.List;

public class Datamodel {
	private  Datamodel() {
		
	}
	
	public static List<Student> getStudent(){
		return List.of(
				new Student(102130174,"Le Na",7.8,Gender.Nu),
				new Student(102130125,"Hoang Nam",8.2,Gender.Nam),
				new Student(102130176,"Van Cuong",9.8,Gender.Nam),
				new Student(102130177,"Van Cong",6.8,Gender.Nam),
				new Student(102130178,"Ngoc Nu",9.1,Gender.Nu),
				new Student(102130180,"Hoang Nhung",7.8,Gender.Nu)
				);
	}

}
