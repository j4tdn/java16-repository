package homework;

public class Ex05 {
	public static void main(String[] args) {
		String str1 = "ABCEDEABC";
		String str2 = "ABCEDCBBCK";
		System.out.println(isShowString(str1, str2));
	}

	private static String isShowString(String str1, String str2) {
		String result = "";
		for(int i=0; i<str1.length(); i++) {
			for(int j=i+1; j<str1.length(); j++) {
				if(str2.contains(str1.substring(i,j))) {
					if(result.length() < str1.substring(i, j).length()) {
						result = str1.substring(i, j);
					}
				}
			}
		}
		return result;
	}
}
