import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	
	public static void main(String[] args) {
		System.out.println(StringUtils.removeAccent("Anh yêu em nhiều lắm"));
		
	}
	private class StringUtils {
		 
		private static String removeAccent(String s) {
		  
		  String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		  return pattern.matcher(temp).replaceAll("");
		 }
		}

}
