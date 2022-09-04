package students;

public class function {
	public static void list(student... students) {
		for (student in : students) {
			if ((in.geLT() + in.getTH()) / 2 > 8.5) {
				System.out.println(in.toString());
			}
		}
	}
	
	public static void find(student... students) {
		for (student in : students) {
			if ((in.getLT() > in.getTH())) {
				System.out.println(in.toString());
			}
		}
	}
}
