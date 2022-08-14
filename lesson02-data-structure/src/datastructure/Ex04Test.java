package datastructure;

public class Ex04Test {
    public static void main(String[] args) {
    	int a = 12;
    	update(a);
    	System.out.println("a3: " + a);
	}
    private static void update(int a) {
    	System.out.println("a1: " +a);
    	a = 99;
    	System.out.println("a2: " + a);
    }
}
