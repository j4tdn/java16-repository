package view;

public class Ex02StringName {
	public static void main(String[] args) {
		
		String s = "tRan xuAN tHanH mINh";
		System.out.println("Input: " + s);
		
		while(true) {
			if (s.matches(".*[^\\p{L}\\s].*"))
				System.out.println("Please try again !");
			else
				break;
		}
		
		System.out.println("Output: " + getRightName(s));
	}
	
	private static String getRightName(String s) {
		String result = "";
		String[] arrays = s.trim().toLowerCase().split("\\s+");
		for (String array:arrays) {
			array = array.substring(0,1).toUpperCase() + array.substring(1);
			result += " " + array;
		}
		return result;
	
	}
}
