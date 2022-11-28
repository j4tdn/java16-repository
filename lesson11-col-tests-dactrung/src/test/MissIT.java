package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissIT {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3, 6, 8, 5);
		List<Integer> line3 = Arrays.asList(2, 3, 6);
		list.add(line1);
		list.add(line2);
		list.add(line3);
		System.out.println(list.toString());
		
	}
}
