package Ex01;

public class StudentUtil {
	public static float averagePoint(Info point) {
		return (point.getPracticePoint()+point.getTheoreticalPoint())/2;
		
	}
	public static void pointOfStudent(Info ...infos) {

		for(Info in:infos) {
			if(averagePoint(in)>=8.5) {
				System.out.println(in.toString());
			}
		}
	}
	public static void compare(Info... infos) {
		for (Info in : infos) {
			if ((in.getPracticePoint() > in.getTheoreticalPoint())) {
				System.out.println(in.toString());
			}
		}
	}
}
	
	
