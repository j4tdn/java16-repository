package problem04.view;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import problem04.bean.Candidate;
import problem04.utils.FileUtils;

public class Ex04MissITContestApp {
	private static final String pathname = String.join(File.separator, "data", "miss1.txt");

	public static void main(String[] args) {
		List<List<Integer>> input = getInput();
		Map<Integer, Candidate> afterCountPoint = countPoint(input);
		List<Candidate> result = getWinner(afterCountPoint);
		System.out.println("Winner is:");
		result.forEach(c -> System.out.println(c));
	}

	private static List<List<Integer>> getInput() {
		List<String> input = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		File file = new File(pathname);
		Path path = file.toPath();
		if (file.exists()) {
			input = FileUtils.readFile(path);
			for (String line : input) {
				String[] lineItems = line.split(" ");
				List<Integer> tempList = new ArrayList<>();
				for (String item : lineItems) {
					tempList.add(Integer.parseInt(item));
				}
				result.add(tempList);
			}
		} else
			System.out.println("File is not existed!");
		return result;
	}

	private static Map<Integer, Candidate> countPoint(List<List<Integer>> input) {
		Map<Integer, Candidate> result = new TreeMap<>();
		for (int i = 1; i < input.size(); i++) {
			for (int j = 1; j < input.get(i).size(); j++) {
				if (result.containsKey(input.get(i).get(j))) {
					Candidate candidate = result.get(input.get(i).get(j));
					increasePoint(candidate, j);
				} else {
					result.put(input.get(i).get(j), new Candidate(input.get(i).get(j), 0, 0, 0, 0));
					Candidate candidate = result.get(input.get(i).get(j));
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
