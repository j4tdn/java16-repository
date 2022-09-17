package view;

public class Ex07DecimalTest {
	public static void main(String[] args) {
		// Tìm phân số tối giản được tạo ra từ số thập phân
		// 0.1 -> 1/10
		// 0.2 -> 2/10
		// 1.0 -> 10/10
		// 12.5 -> 125/10
		  double d = 0.05d;
			System.out.println(division(d));
			
			System.out.println(glc(int denominator, int numerator));
	}
	public static String division(double d){
        String result="";
        String dString = Double.toString(d);        
        String[] fraction = dString.split("\\.");

        int denominator = (int)Math.pow(10, fraction[1].length());
        int numerator = Integer.parseInt(fraction[0] + "" + fraction[1]);
       
        result = numerator + "/" + denominator;
        
        return result;
    }
	private static String glc(int denominator, int numerator) {
	 while (denominator != numerator) {
			if (denominator > numerator) {
				denominator = denominator - numerator;
			} else {
				numerator = numerator - denominator;
			}
		} 
     for (int i = 2; i <= 9; i++) {
    	if (denominator % i == 0 && numerator  % i == 0) {
    		denominator = denominator/i;
    		numerator = numerator/i;
    	}
     }
     return numerator + "/" + denominator;
	}
}
