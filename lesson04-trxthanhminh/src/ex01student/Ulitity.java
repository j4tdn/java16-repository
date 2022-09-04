package ex01student;

public class Ulitity {
	public static float averagePoint(Student std) {
		return(std.getPracticePiont()+ std.getTheoryPoint()/2);
		
	}
	public static void pointOfStudent(Student ...Students) {

		for(Student s:Students) {
			if(averagePoint(s)>=8.5) {
				System.out.println(s.toString());
			}
		}
	}
	public static void compare(Student... Students) {
		for (Student s:Students) {
			if(s.getPracticePiont() < s.getTheoryPoint()){
				System.out.println(s.toString());
			}
		}
	}
}
