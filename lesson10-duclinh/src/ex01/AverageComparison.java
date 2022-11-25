package ex01;

public class AverageComparison {
	public static void main(String[] args) {
		int []arr = { 20, 30, 60, 10, 25, 15, 40, 20 };
		Tuple rs = new Tuple();
		rs = sumOfElements(arr);
		System.out.println(rs.getFirst());
		System.out.println(rs.getSecond());
	}

	public static Tuple sumOfElements(int[] arr) {
		double sumfirst = 0, sumsecond = 0;
		int count1 = 0, count2 = 0; 
		for (int i = 0; i < arr.length; i++) {

			// Add elements in first half sum
			if (i < arr.length / 2) {			 
				sumfirst += arr[i];
				count1++;
			}

			// Add elements in the second half sum
			else {
				sumsecond += arr[i];
				count2++;
			}
		}
		sumfirst = sumfirst/count1;
		sumsecond = sumsecond/count2;
		
		return new Tuple(sumfirst,sumsecond);
	}
}
