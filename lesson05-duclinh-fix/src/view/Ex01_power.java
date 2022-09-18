package view;
import static java.lang.Math.*;

public class Ex01_power {
	public static void main(String[] args) {
		System.out.println(check(8,2));
		
	}
	private static boolean check(double a, double b) {
		return b > a ? power(b,a) : power(a,b); 
	}
	
	private static boolean power(double a, double b){
		double rs = Math.log(a) / Math.log(b);
		return Math.ceil(rs) == Math.floor(rs);
		
	}
}
