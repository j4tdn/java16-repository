package ex03;
import java.util.HashSet;
import java.util.Set;
public class Ex03 {

	    public static void main(String[] args) {
	        System.out.println(isHappy(52));
	        
	    }
	    public static boolean isHappy(int n) {
	        Set<Integer> seen = new HashSet<>();
	        while (n != 1 && !seen.contains(n)) {
	            seen.add(n);
	            n = getNext(n);
	        }
	        return n == 1;
	    }

	    private static int getNext(int n) {
	        int sum = 0;
	        while (n > 0) {
	            int d = n % 10;
	            sum += d * d;
	            n /= 10;
	        }
	        return sum;
	    }
	}

