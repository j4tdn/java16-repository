package ex01StudentManagement;

public class Ultility {
	private Ultility() {
		
	}
	static double sum(Student students) {
		float x;
		x =  ((students.getPracticepoint() + students.getTheoreticalpoint())) / 2;
		
		return x;
		
	}

}
