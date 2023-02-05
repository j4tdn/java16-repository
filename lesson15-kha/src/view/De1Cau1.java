package view;

import java.util.Arrays;
import java.util.stream.Collectors;

public class De1Cau1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};
		System.out.println("Các phần tử chỉ xuất hiện một lần duy nhất");
		Arrays.stream(arr).boxed().filter(o -> Arrays.stream(arr).boxed().filter(o1-> o == o1).count() == 1).forEach(o->System.out.print(o + " "));
		System.out.println();
		System.out.println("Các phần tử xuất nhiều hơn một lần");
		Arrays.stream(arr).boxed().filter(o -> Arrays.stream(arr).boxed().filter(o1-> o == o1).count() > 1).collect(Collectors.toSet()).forEach(o->System.out.print(o + " "));
		
	}
}
