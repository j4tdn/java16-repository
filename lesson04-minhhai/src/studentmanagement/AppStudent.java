package studentmanagement;
 

public class AppStudent {
	public static void main(String[] args) {
		StudentDetail sv1 = new StudentDetail(106170011, "Tran Van Minh", (float) 7.5, 7);
		StudentDetail sv2 = new StudentDetail(106170056, "Nguyen Van Viet", (float) 8.2, 9);
		StudentDetail sv3 = new StudentDetail();
		StudentUltils.studentInput(sv3);
		
		StudentDetail[] students = { sv1, sv2, sv3 };

		StudentUltils.isGoodPoint(students);

		StudentUltils. isTheoryBetter(students);
	}

	
}
