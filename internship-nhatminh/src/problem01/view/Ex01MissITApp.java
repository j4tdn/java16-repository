package problem01.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import problem01.bean.Candidate;

public class Ex01MissITApp {

	public static void main(String[] args) {
		List<List<Integer>> input = getInput();
		Map<Integer, Candidate> afterCountPoint = countPoint(input);
		List<Candidate> result = getWinner(afterCountPoint);
		System.out.println("Winner is:");
		result.forEach(c -> System.out.println(c));
	}

	private static List<List<Integer>> getInput() {
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3, 3, 2, 1);
		List<Integer> line3 = Arrays.asList(3, 2, 3, 1);
		List<List<Integer>> lines = new ArrayList<>();
		lines.add(line1);
		lines.add(line2);
		lines.add(line3);
		return lines;
	}

	private static Map<Integer, Candidate> countPoint(List<List<Integer>> input) {
		Map<Integer, Candidate> result = new TreeMap<>();
		for (int i = 1; i < input.size(); i++) {
			for (int j = 1; j < input.get(i).size(); j++) {
				int candidateId = input.get(i).get(j);
				if (result.containsKey(candidateId)) {
					Candidate candidate = result.get(candidateId);
					increasePoint(candidate, j);
				} else {
					result.put(candidateId, new Candidate(candidateId, 0, 0, 0, 0));
					Candidate candidate = result.get(candidateId);
					increasePoint(candidate, j);
				}
			}
		}
		return result;
	}

	private static void increasePoint(Candidate candidate, int posIndex) {
		candidate.setPoint(candidate.getPoint() + 4 - posIndex);
		if (posIndex == 1)
			candidate.setFirstPos(candidate.getFirstPos() + 1);
		if (posIndex == 2)
			candidate.setSecondPos(candidate.getSecondPos() + 1);
		if (posIndex == 3)
			candidate.setThirdPos(candidate.getThirdPos() + 1);
	}

	private static List<Candidate> getWinner(Map<Integer, Candidate> pointData) {
		List<Candidate> candidates = new ArrayList<>(pointData.values());
		candidates.sort(Comparator.comparing(Candidate::getPoint).thenComparing(Candidate::getFirstPos)
				.thenComparing(Candidate::getSecondPos).thenComparing(Candidate::getThirdPos));
		List<Candidate> result = new ArrayList<>();
		for (int i = candidates.size() - 1; i >= 0; i--)
			if (candidates.get(candidates.size() - 1).equals(candidates.get(i)))
				result.add(candidates.get(i));
		return result;
	}
}
