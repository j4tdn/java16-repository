
public class Ex04 {
	public static void Try(int k, int n, char[] arr, int[] result, boolean[] bool) {
		
		
		for (int i=0; i<n; i++) {
			if (bool[i] == false) {
				result[k] = i;
				bool[i] = true; // used
				if (k != (n-1)) {
					Try(k+1, n, arr, result, bool);
				}
				else {
					print(arr, result);
				}
				bool[i] = false;
			}
		}
	}
	public static void print(char[] arr, int[] res) {
		for (int i=0; i<arr.length; i++) {
//			System.out.print(res[i]);
			System.out.print(arr[res[i]]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String str = "xyz"; 
		int[] result = new int[str.length()];
		boolean[] bool = new boolean[str.length()] ;
		for (int i=0; i<str.length(); i++) {
			bool[i] = false; // unused
		}
		Try(0, str.length(), str.toCharArray(), result, bool);
	}
}
