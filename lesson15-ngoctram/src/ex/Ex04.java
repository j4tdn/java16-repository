package ex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Candidate;
import bean.GiamKhao;

public class Ex04 {
	private static String pathname = "text\\data\\miss.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(pathname);
		if (file.exists()) {
			List<String> lines = Files.readAllLines(file.toPath());
			int numberOfGiamKhao = Integer.parseInt(lines.get(0).trim());

			List<GiamKhao> giamkhaos = new ArrayList<GiamKhao>();
			List<Candidate> candidates = new ArrayList<Candidate>();

			for (int i = 1; i <= numberOfGiamKhao; i++) {
				String[] lineElements = lines.get(i).split("\\s");
				int numberOfCandidates = Integer.parseInt(lineElements[0]);
				List<Integer> candidateIds = new ArrayList<Integer>();
				for (int j = 1; j <= numberOfCandidates; j++) {
					candidateIds.add(Integer.parseInt(lineElements[j]));
					int cId = Integer.parseInt(lineElements[j]);
					Candidate candidate = getCandidateById(candidates, cId);
					if (candidate == null) {
						candidate = new Candidate(cId);
						if (j == 1) {
							candidate.setFirst(1);
							candidate.setTotalMark(3);
						}

						if (j == 2) {
							candidate.setSecond(1);
							candidate.setTotalMark(2);
						}

						if (j == 3) {
							candidate.setThird(1);
							candidate.setTotalMark(1);
						}
						candidates.add(candidate);
					} else {
						if (j == 1) {
							int first = candidate.getFirst() + 1;
							candidate.setFirst(first);
							int totalMark = candidate.getTotalMark() + 3;
							candidate.setTotalMark(totalMark);
						}

						if (j == 2) {
							int second = candidate.getSecond() + 1;
							candidate.setSecond(second);
							int totalMark = candidate.getTotalMark() + 2;
							candidate.setTotalMark(totalMark);
						}

						if (j == 3) {
							int third = candidate.getThird() + 1;
							candidate.setSecond(third);
							int totalMark = candidate.getTotalMark() + 1;
							candidate.setTotalMark(totalMark);
						}
					}
				}
				giamkhaos.add(new GiamKhao(numberOfCandidates, candidateIds));
			}
			;

			candidates.sort(Comparator.comparing(Candidate::getTotalMark).thenComparing(Candidate::getFirst)
					.thenComparing(Candidate::getSecond).thenComparing(Candidate::getThird));

			System.out.println("Candidates are: ");
			printList(candidates);

			List<Candidate> winners = new ArrayList<Candidate>();
			Candidate c = candidates.get(candidates.size() - 1);
			winners.add(c);
			for (int i = candidates.size() - 2; i >= 0; i--) {
				c = candidates.get(i);
				if (c.getTotalMark() != candidates.get(i+1).getTotalMark()) break;
				else if (c.getFirst() != candidates.get(i+1).getFirst()) break;
				else if (c.getSecond() != candidates.get(i+1).getSecond()) break;
				else {
					winners.add(c);
				}
			}
			System.out.println("===================\nWinners are : ");
			printList(winners);
		}
	}
	
	private static Candidate getCandidateById(List<Candidate> candidates, int id) {
		for (Candidate c : candidates) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}
	
	private static <T> void printList(List<T> list) {
		for(T t : list) {
			System.out.println(t);
		}
	}
}
