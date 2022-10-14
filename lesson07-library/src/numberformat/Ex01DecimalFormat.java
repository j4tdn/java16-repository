package numberformat;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Ex01DecimalFormat {
	/**
	 * #  
	 * 0  
	 * ,  
	 * .  
	 */
	
	
	private static final String PATTERN = "#.###,00";
	
	public static void main(String[] args) {
		System.out.println("long-->" + 123434545654l);
		
		System.out.println("double-->" + 1234567d);
		
		//Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat();
		String formatter = df.format(1234567.245d);
		System.out.println("formatter " + formatter);
	}
}
