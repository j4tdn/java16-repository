package view;

public class Ex07DecimalTest {
	public static void main(String[] args) {
		// Tìm phân số tối giản được tạo ra từ số thập phân
		// 0.1 -> 1/10
		// 0.2 -> 2/10
		// 1.0 -> 10/10
		// 12.5 -> 125/10
		  double d = 12.5d;
			System.out.println(division(d));
			
		
	}
	public static String division(double d){
        String result="";
        String dString = Double.toString(d);        
        String[] fraction = dString.split("\\.");
        int denominator = (int)Math.pow(10, fraction[1].length());
        int numerator = Integer.parseInt(fraction[0] + "" + fraction[1]);      
        result = numerator/gcd(numerator, denominator) + "/" + denominator/gcd(numerator, denominator);
        
        return result;
    }
	private static int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
