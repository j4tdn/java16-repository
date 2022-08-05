package datastrructure;

public class Ex11StringSpeedTest {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i = 1;i<=100000;i++) {
			//stack=200.000   heap=200.000
			String s1 = new String("hello");
			String s2 = new String("hello");
			
			
			//stack=200.000   heap=1
			//String s1 = "hello";
			//String s2 = "hello";
			
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " +(end -start) +"ms");
	}

}
