package problem03;

public class Ex03GetTrimRevertedString {
	public static void main(String[] args) {
		String str = "  Free code    Camp!   ";
		System.out.println(getTrimRevertedString(str));
	}

	private static String getTrimRevertedString(String str) {
		String result = "";
		str = str.replaceAll("\\s+", " ").trim();
		String[] strList = str.split(" ");
		for (int i = 0; i < strList.length; i++)
			strList[i] = new StringBuilder(strList[i]).reverse().toString();
		for (String string : strList)
			result = result + string + " ";
		return result;
	}
}
