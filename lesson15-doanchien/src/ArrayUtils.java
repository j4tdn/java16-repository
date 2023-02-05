import java.util.Arrays;

public class ArrayUtils {
	private ArrayUtils(){
		
	}
	
	public static void printf(String prefix ,int[] input) {
		System.out.println(prefix + " --> " +Arrays.toString(input));
	}
	
	public static void printf(String prefix ,String[] input) {
		System.out.println(prefix + " --> " +Arrays.toString(input));
	}
	
}
