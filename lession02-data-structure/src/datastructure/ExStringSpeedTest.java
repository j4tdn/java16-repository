package datastructure;

public class ExStringSpeedTest {
	private static final int COUNT = 100000;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 1; i<= COUNT; i++) {
			
		
		   //String s1 = new String("hello");
		   // String s2 = new String("hello");
		    
		    String s1 = "hello";
		    String s2 = "hello";
	}
	   long end = System.currentTimeMillis();
	System.out.println("duration: " + (end - start) +" mil");

	}

}