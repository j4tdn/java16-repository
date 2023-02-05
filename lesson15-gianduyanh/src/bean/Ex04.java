package bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Point;

public class Ex04 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Point> listResult = new ArrayList<Point>();
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] judge = line.split(" ");
			int length = Integer.parseInt(judge[0]);
			for (int j = 1; j <= length; j++) {
				int id = Integer.parseInt(judge[j]);
				Point tmp = new Point(id);

				if (listResult.contains(tmp)) {
					int index = listResult.indexOf(tmp);
					tmp = listResult.get(index);
					tmp.setPoint(tmp.getPoint() + (3 - j + 1));
					Map<Integer, Integer> loca = tmp.getStt();

					if (loca.containsKey(j)) {
						loca.put(j, loca.get(j) + 1);
					} else {
						loca.put(j, 1);
					}

					tmp.setStt(loca);
					listResult.set(index, tmp);
				} else {
					tmp.setPoint((3 - j + 1));
					tmp.getStt().put(j, 1);
					listResult.add(tmp);
				}
			}
		}
		
		
		listResult.sort(Comparator.comparing(Point::getPoint, Comparator.reverseOrder()).thenComparing(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				Map<Integer, Integer> map1 = o1.getStt();
				Map<Integer, Integer> map2 = o2.getStt();
				int sum1 = map1.values().stream().mapToInt(Integer::intValue).sum();
				int sum2 = map1.values().stream().mapToInt(Integer::intValue).sum();
				return sum1-sum2;
			}
		}));
	
		int MaxPoint = listResult.get(0).getPoint();
		System.out.println("max point: " + MaxPoint);
		listResult = listResult.stream().filter(o -> o.getPoint() == MaxPoint).collect(Collectors.toList());
		List<Integer> result = listResult.stream().map(Point::getId).collect(Collectors.toList());
		result.forEach(s -> System.out.print(s + " "));
	}
}