package ex01;

import java.util.HashMap;
import java.util.Map;

public class Unique {
	public static void main(String[] args) {
        int[] N = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};

        Map<Integer, Integer> count = new HashMap<>();
        for (int i : N) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
        int[] h = {5, 7, 9, 10, 20, 9, 7, 7, 11};

        Map<Integer, Integer> count1 = new HashMap<>();
        for (int i : h) {
            if (count1.containsKey(i)) {
                count1.put(i, count1.get(i) + 1);
            } else {
                count1.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : count1.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
   
}
