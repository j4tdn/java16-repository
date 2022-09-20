package view;

public class Ex02DivideThrows {
/**
 * Khi mot ham bi ngoai le, co 2 cach de xu ly
 * 1. bat(try/catch) loi tai ham do
 * 2. nem(throw/ throws) ngoai le de noi goi se bat, xu ly loi do
 * 
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("r1 " +devide(6, 2));
		System.out.println("r2 " +devide(5,0));
	}
	private static int devide( int a, int b) throws ArithmeticException {
		return a/b;
	}
	
	//neu cho goi k bat loi thi bi crash app
	
	//throws runtime(unchecked) --> cho goi k bat buoc xu ly
	
	//throws compile(checked) --> cho goi bat buoc xu ly

}
