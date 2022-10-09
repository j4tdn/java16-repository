package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {

    private static final String PATTERN = "#,###.00";
    public static void main(String[] args) {
        System.out.println("long --> " + 1231231321231232331l);
        System.out.println("double --> + 1111111d");
        
        Locale.setDefault(new Locale("da", "dk"));
        DecimalFormat df = new DecimalFormat(PATTERN);
        String formatted = df.format(1111111111111.258d);
        System.out.println("formatted: " + formatted);
        
    }
}
