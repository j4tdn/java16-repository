package problem01.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MissITContestApp {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		List<List<Integer>> input = getInput();	
		Map<Integer, Candidate> afterCountPoint = countPoint(input);
		
	}
	private static List<List<Integer>> getInput() {
		
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3, 6, 8, 5);
		List<Integer> line3 = Arrays.asList(2, 3, 6);
		List<List<Integer>> lines = new ArrayList<>();
		lines.add(line1);
		lines.add(line2);
		lines.add(line3);
//		int numOfJudges = Integer.parseInt(sc.nextLine());
//		List<String> list = Arrays.asList(sc.nextLine().trim().split("\\s"));
//		List<Integer> tempList = new ArrayList<>(); 
//		for(int i = 0;i<list.size();i++) {
//						tempList.add()
//		}
		return lines;
	}
	private static Map<Integer, Candidate> countPoint(List<List<Integer>> input){
		Map<Integer, Candidate> result = new TreeMap<>();
		for(int i = 1;i<input.size();i++) {
			for(int j = 1;j<input.get(i).size();j++) {
				if (result.containsKey(input.get(i).get(j))) {
					result.get(input.get(i).get(j)).setPoint(result.get(input.get(i).get(j)).getPoint()+4-j);
					if(j==1)
						result.get(input.get(i).get(j)).setFirstPos(result.get(input.get(i).get(j)).getFirstPos()+1);
					if(j==2)
						result.get(input.get(i).get(j)).setSecondPos(result.get(input.get(i).get(j)).getSecondPos()+1);
					if(j==3)
						result.get(input.get(i).get(j)).setThirdPos(result.get(input.get(i).get(j)).getThirdPos()+1);
				}
				else {
					result.put(input.get(i).get(j), new Candidate(input.get(i).get(j), 4-j,0,0,0));
					if(j==1)
						result.get(input.get(i).get(j)).setFirstPos(result.get(input.get(i).get(j)).getFirstPos()+1);
					if(j==2)
						result.get(input.get(i).get(j)).setSecondPos(result.get(input.get(i).get(j)).getSecondPos()+1);
					if(j==3)
						result.get(input.get(i).get(j)).setThirdPos(result.get(input.get(i).get(j)).getThirdPos()+1);
				}
			}
		}
		return result;
	}
	private static Map<Integer, Candidate> getWinner(Map<Integer, Candidate> pointData){
		 List<Candidate> candidates = new ArrayList<>(pointData.values());
		 candidates.sort(Comparator.comparing(Candidate::getPoint).thenComparing(Candidate::getFirstPos).thenComparing(Candidate::getSecondPos).thenComparing(Candidate::getThirdPos));
	}
}
