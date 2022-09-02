package student;

public class Utils {

	public static void list(Information... informations) {
		for (Information in : informations) {
			if ((in.getScoreLT() + in.getScoreTH()) / 2 > 8.5) {
				System.out.println(in.toString());
			}
		}
	}
	
	public static void find(Information... informations) {
		for (Information in : informations) {
			if ((in.getScoreLT() > in.getScoreTH())) {
				System.out.println(in.toString());
			}
		}
	}

}
