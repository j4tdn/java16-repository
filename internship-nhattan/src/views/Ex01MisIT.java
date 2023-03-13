package views;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Contestant;
import utils.FileUtils;

public class Ex01MisIT {
	private static final String pathname = "text\\mistIT.txt";
	
	public static void main(String[] args) {
		
		List<List<Integer>> lines = getIntegersOfLines(pathname);
		
		Map<Integer, Contestant> map = new HashMap<>();
		for (int i = 1; i < lines.size(); i++) {
			List<Integer> line = lines.get(i);
			for (int rank = 1; rank < line.size(); rank++) {
				int id = line.get(rank);
				
				putContestant(id, rank, map);
			}
		}
		
		
		Set<Entry<Integer, Contestant>> set = map.entrySet();
		List<Entry<Integer, Contestant>> list = new ArrayList<>(set);
		
		// winner.isEmpty() = false;
		Contestant winner = list.get(0).getValue();
		for (int i = 1; i < list.size(); i++) {
			Entry<Integer, Contestant> entry = list.get(i);
			Contestant contestant = entry.getValue();
			if (contestant.compareTo(winner) > 0) {
				winner = contestant;
			}
		}
		
		for (Entry<Integer, Contestant> entry : list) {
			Contestant contestant = entry.getValue();
			if (contestant.compareTo(winner) == 0) {
				System.out.println("Winner: " + contestant);
			}
		}
	}
	
	private static List<List<Integer>> getIntegersOfLines(String pathname) {
		File file = new File(pathname);
		
		List<String> lines = FileUtils.read(file);
		lines.forEach(System.out::println);
		
		List<List<Integer>> result = new ArrayList<>();
		for (String line : lines) {
			List<Integer> numbersInLine = convert(line);
			result.add(numbersInLine);
		}
		
		return result;
	}
	
	private static List<Integer> convert(String s){
		return Stream.of(s.split("\\s"))
					.map(Integer::parseInt)
					.collect(Collectors.toList());
	}
	
	private static void putContestant(int id, int rank, Map<Integer, Contestant> map) {
		Contestant mem;
		int point = 4 - rank;
		
		if (map.containsKey(id)) {
			mem = map.get(id);
		} else {
			mem = new Contestant();
			mem.setId(id);
		}
		
		point += mem.getPoint();
		mem.setPoint(point);
		
		switch (rank) {
		case 1: {
			mem.setFirst(mem.getFirst() + 1);
			break;
		}
		case 2: {
			mem.setSecond(mem.getSecond() + 1);
			break;
		}
		case 3: {
			mem.setThird(mem.getThird() + 1);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + rank);
		}
		
		map.put(id, mem);
	}
}
