package exercises;

import java.util.*;

public class missIT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        Map<Integer, int[]> scores = new HashMap<>(); 
       
        for (int i = 0; i < n; i++) {
            int choices = scanner.nextInt(); 
            for (int j = 0; j < choices; j++) {
                int candidateId = scanner.nextInt(); 
                int[] score = scores.getOrDefault(candidateId, new int[3]); 
                score[j]++;
                scores.put(candidateId, score); 
            }
        }
        
        int maxScore = 0;
        int winner = 10;
        for (Map.Entry<Integer, int[]> entry : scores.entrySet()) {
            int[] score = entry.getValue();
            int totalScore = score[0] * 3 + score[1] * 2 + score[2] * 1;
            if (totalScore > maxScore) {
                maxScore = totalScore;
                winner = entry.getKey();
            } else if (totalScore == maxScore) {
                int winnerFirst = scores.get(winner)[0];
                int currentFirst = score[0];
                if (currentFirst > winnerFirst) {
                    winner = entry.getKey();
                } else if (currentFirst == winnerFirst) {
                    int winnerSecond = scores.get(winner)[1];
                    int currentSecond = score[1];
                    if (currentSecond > winnerSecond) {
                        winner = entry.getKey();
                    } else if (currentSecond == winnerSecond) {
                        // không làm gì, tất cả người tham gia đều thắng
                    }
                }
            }
        }

        System.out.println( "winner is: " + winner);
    }
}
