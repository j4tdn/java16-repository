package students;

public class function {
	public static void list(student... students) {
		for (student in : students) {
			if ((in.getScoreLT() + in.getScoreTH()) / 2 > 8.5) {
				System.out.println(in.toString());
			}
		}
	}
	
	public static void find(student... students) {
		for (student in : students) {
			if ((in.getScoreLT() > in.getScoreTH())) {
				System.out.println(in.toString());
			}
		}
	}
}
