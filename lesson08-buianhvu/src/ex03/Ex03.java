package ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		  String s = " Vũ đẹp trai quá ";
		 
		 System.out.println(unAccent(s));
	}

	public static String unAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
			
        
        return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "d");
}
}
