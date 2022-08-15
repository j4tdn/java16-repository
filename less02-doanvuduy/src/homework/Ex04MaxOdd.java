package homework;

public class Ex04MaxOdd {
public static void main(String[] args) {
	int []numbers = {5, 1, 9, 11, 20, 19, 17, 21, 30};
	System.out.println("max odd:"+findMaxOddElement(numbers));
}

private static int findMaxOddElement(int []elements) {
	int max = Integer.MIN_VALUE;
	int countOdd =0;
	for(int element:elements) {
		if(isOdd(element)&&element >max ) {
			max = element;
			countOdd++;
		}
	}
}
private static boolean isOdd(int number) {
	return number %2 !=0;
}
}
