package ex01;

import java.util.*;

public class MissIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<Integer, Integer> scores = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int[] selections = new int[3];

            for (int j = 0; j < 3; j++) {
                selections[j] = scanner.nextInt();
                int candidate = scanner.nextInt();

                scores.put(candidate, scores.getOrDefault(candidate, 0) + (3 - j));
            }
        }

        List<Integer> winners = new ArrayList<>();
        int maxScore = Collections.max(scores.values());

        for (int candidate : scores.keySet()) {
            if (scores.get(candidate) == maxScore) {
                winners.add(candidate);
            }
        }

 
    }
}

