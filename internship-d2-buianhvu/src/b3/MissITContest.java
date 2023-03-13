package b3;

import java.util.*;

public class MissITContest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] votes = new int[n][3];

		for (int i = 0; i < n; i++) {
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				votes[i][j] = scanner.nextInt();
			}
		}

		Map<Integer, Integer> scores = new HashMap<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				int candidate = votes[i][j];
				if (candidate == 0) {
					break;
				}
				int points = 3 - j;
				scores.put(candidate, scores.getOrDefault(candidate, 0) + points);
			}
		}


		Collections.sort(winners);
		for (int winner : winners) {
			System.out.print(winner + " ");
		}
		scanner.close();
	}

	private static int countFirstPlaceVotes(int[][] votes, int candidate) {
	
		}
		return count;
	}
}