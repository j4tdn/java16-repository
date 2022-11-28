import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Map<Integer, contestant> map = new HashMap<>();
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3, 6, 8, 5);
		List<Integer> line3 = Arrays.asList(2, 3, 6);
		List<List<Integer>> lines = new ArrayList<>();
		// 2
		// 3 6 5 8
		// 2 3 6
		lines.add(line1);
		lines.add(line2);
		lines.add(line3);
		for(int i = 0; i < lines.size(); i++) {
			if(i == 1) {
				map.put(i + 1, new contestant(i + 1, 3, 3, 0, 0));
			}
			
		}

		System.out.println(lines );
		
	}
	private static List<List<Integer>> get(List<List<Integer>> list){
		
		return list;
		
	}

}
