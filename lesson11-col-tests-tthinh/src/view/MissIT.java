package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissIT {
	public static void main(String[] args) {
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3, 6, 8, 5);
		List<Integer> line3 = Arrays.asList(2, 3, 6);
		List<List<Integer>> lines = new ArrayList<>();
		lines.add(line1);
		lines.add(line2);
		lines.add(line3);
		
	}
}
